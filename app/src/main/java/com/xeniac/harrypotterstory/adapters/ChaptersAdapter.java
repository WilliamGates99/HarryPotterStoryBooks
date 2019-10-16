package com.xeniac.harrypotterstory.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xeniac.harrypotterstory.PagesActivity;
import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.database.DataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;

public class ChaptersAdapter extends RecyclerView.Adapter<ChaptersAdapter.ViewHolder> {

    public static final String ITEM_KEY = "item_key";
    private List<DataItemChapters> mItems;
    private Context mContext;
    private DataSource mDataSource;

    public ChaptersAdapter(Context context, List<DataItemChapters> items) {
        this.mContext = context;
        this.mItems = items;
        mDataSource = new DataSource(mContext);
        mDataSource.open();
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

        holder.numberTV.setText(item.getNumber());
        holder.titleTV.setText(item.getTitle());
        holder.pageTV.setText(item.getPage());

        if (item.isFavorite()) {
            holder.bookmarkBlueIB.setVisibility(View.VISIBLE);
            holder.bookmarkGrayIB.setVisibility(View.GONE);
        } else {
            holder.bookmarkBlueIB.setVisibility(View.GONE);
            holder.bookmarkGrayIB.setVisibility(View.VISIBLE);
        }

        holder.bookmarkBlueIB.setOnClickListener(v -> {
            item.setFavorite(false);
            mDataSource.updateFavorite(item);
            holder.bookmarkBlueIB.setVisibility(View.GONE);
            holder.bookmarkGrayIB.setVisibility(View.VISIBLE);
        });

        holder.bookmarkGrayIB.setOnClickListener(v -> {
            item.setFavorite(true);
            mDataSource.updateFavorite(item);
            holder.bookmarkBlueIB.setVisibility(View.VISIBLE);
            holder.bookmarkGrayIB.setVisibility(View.GONE);
        });

        holder.listLL.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, PagesActivity.class);
            intent.putExtra(ITEM_KEY, item);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        LinearLayout listLL;
        TextView numberTV;
        TextView titleTV;
        TextView pageTV;
        ImageButton bookmarkGrayIB;
        ImageButton bookmarkBlueIB;

        ViewHolder(View itemView) {
            super(itemView);

            listLL = itemView.findViewById(R.id.ll_list_chapters);
            numberTV = itemView.findViewById(R.id.tv_list_chapters_number);
            titleTV = itemView.findViewById(R.id.tv_list_chapters_title);
            pageTV = itemView.findViewById(R.id.tv_list_chapters_page);
            bookmarkGrayIB = itemView.findViewById(R.id.ib_list_chapters_bookmark_gray);
            bookmarkBlueIB = itemView.findViewById(R.id.ib_list_chapters_bookmark_blue);

            mView = itemView;
        }
    }
}