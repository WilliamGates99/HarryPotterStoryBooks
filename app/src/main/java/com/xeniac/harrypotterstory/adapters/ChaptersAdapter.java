package com.xeniac.harrypotterstory.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xeniac.harrypotterstory.BooksActivity;
import com.xeniac.harrypotterstory.PagesActivity;
import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;

public class ChaptersAdapter extends RecyclerView.Adapter<ChaptersAdapter.ViewHolder> {

    public static final String ITEM_KEY = "item_key";
    private List<DataItemChapters> mItems;
    private Context mContext;
    private ChaptersDataSource chaptersDataSource;

    public ChaptersAdapter(Context context, List<DataItemChapters> items) {
        this.mContext = context;
        this.mItems = items;
        chaptersDataSource = new ChaptersDataSource(mContext);
        chaptersDataSource.open();
    }

    @NonNull
    @Override
    public ChaptersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                         int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.list_item_chapters, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItemChapters item = mItems.get(position);

        holder.numberTV.setText(String.valueOf(item.getNumber()));
        holder.titleTV.setText(item.getTitle());
        holder.pageNumberTV.setText(String.valueOf(item.getPages()));
        holder.progressBar.setProgress(
                (int) ((float) item.getReadScroll() * 100 / item.getTotalScroll()));

        if (item.isReleased()) {
            holder.listLL.setClickable(true);
            holder.listLL.setFocusable(true);
            holder.soonTV.setVisibility(View.GONE);

            if (item.isFavorite()) {
                holder.bookmarkBlueIB.setVisibility(View.VISIBLE);
                holder.bookmarkGrayIB.setVisibility(View.GONE);
            } else {
                holder.bookmarkBlueIB.setVisibility(View.GONE);
                holder.bookmarkGrayIB.setVisibility(View.VISIBLE);
            }

            holder.bookmarkBlueIB.setOnClickListener(v -> {
                item.setFavorite(false);
                chaptersDataSource.updateChapters(item);
                holder.bookmarkBlueIB.setVisibility(View.GONE);
                holder.bookmarkGrayIB.setVisibility(View.VISIBLE);
            });

            holder.bookmarkGrayIB.setOnClickListener(v -> {
                item.setFavorite(true);
                chaptersDataSource.updateChapters(item);
                holder.bookmarkBlueIB.setVisibility(View.VISIBLE);
                holder.bookmarkGrayIB.setVisibility(View.GONE);
            });

            holder.listLL.setOnClickListener(v -> {
                SharedPreferences.Editor editor = mContext.getSharedPreferences(
                        BooksActivity.READING_CHECK, Context.MODE_PRIVATE).edit();
                editor.putInt(BooksActivity.READING_CHECK_KEY, item.getId()).apply();

                Intent intent = new Intent(mContext, PagesActivity.class);
                intent.putExtra(ITEM_KEY, item);
                mContext.startActivity(intent);
            });
        } else {
            holder.listLL.setClickable(false);
            holder.listLL.setFocusable(false);
            holder.soonTV.setVisibility(View.VISIBLE);
            holder.bookmarkBlueIB.setVisibility(View.GONE);
            holder.bookmarkGrayIB.setVisibility(View.GONE);

            holder.dividerLL.setAlpha(0.25f);
            holder.numberTV.setAlpha(0.25f);
            holder.titleTV.setAlpha(0.25f);
            holder.pageNumberTV.setAlpha(0.25f);
            holder.pageConstantTV.setAlpha(0.25f);
            holder.progressBar.setAlpha(0.25f);
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        LinearLayout listLL;
        LinearLayout dividerLL;
        TextView numberTV;
        TextView titleTV;
        TextView pageNumberTV;
        TextView pageConstantTV;
        TextView soonTV;
        ImageButton bookmarkGrayIB;
        ImageButton bookmarkBlueIB;
        ProgressBar progressBar;

        ViewHolder(View itemView) {
            super(itemView);

            listLL = itemView.findViewById(R.id.ll_list_chapters);
            dividerLL = itemView.findViewById(R.id.ll_list_chapters_divider);
            numberTV = itemView.findViewById(R.id.tv_list_chapters_number);
            titleTV = itemView.findViewById(R.id.tv_list_chapters_title);
            pageNumberTV = itemView.findViewById(R.id.tv_list_chapters_page_number);
            pageConstantTV = itemView.findViewById(R.id.tv_list_chapters_page_constant);
            soonTV = itemView.findViewById(R.id.tv_list_chapters_soon);
            bookmarkGrayIB = itemView.findViewById(R.id.ib_list_chapters_bookmark_gray);
            bookmarkBlueIB = itemView.findViewById(R.id.ib_list_chapters_bookmark_blue);
            progressBar = itemView.findViewById(R.id.pb_list_chapters_number);

            mView = itemView;
        }
    }
}