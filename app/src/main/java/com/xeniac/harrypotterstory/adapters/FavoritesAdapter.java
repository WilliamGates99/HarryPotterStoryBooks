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
import com.xeniac.harrypotterstory.FavoritesActivity;
import com.xeniac.harrypotterstory.PagesActivity;
import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.ViewHolder> {

    private final List<DataItemChapters> mItems;
    private final Context mContext;
    private final BooksDataSource booksDataSource;
    private final ChaptersDataSource chaptersDataSource;

    public FavoritesAdapter(Context context, List<DataItemChapters> items) {
        this.mContext = context;
        this.mItems = items;
        booksDataSource = new BooksDataSource(mContext);
        booksDataSource.open();
        chaptersDataSource = new ChaptersDataSource(mContext);
        chaptersDataSource.open();
    }

    @NonNull
    @Override
    public FavoritesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                          int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.list_item_favorites, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItemChapters item = mItems.get(position);

        holder.numberTV.setText(String.valueOf(item.getNumber()));
        holder.titleTV.setText(item.getTitle());
        holder.bookTV.setText(booksDataSource.getBookTitle(item.getBookId()));
        holder.progressBar.setProgress(
                (int) ((float) item.getReadScroll() * 100 / item.getTotalScroll()));

        holder.bookmarkBlueIB.setOnClickListener(v -> {
            item.setFavorite(false);
            chaptersDataSource.updateChapters(item);
            try {
                mItems.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, getItemCount());

                if (mItems.isEmpty()) {
                    ((FavoritesActivity) mContext).onResume();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        holder.listLL.setOnClickListener(v -> {
            SharedPreferences.Editor editor = mContext.getSharedPreferences(
                    BooksActivity.READING_CHECK, Context.MODE_PRIVATE).edit();
            editor.putInt(BooksActivity.READING_CHECK_KEY, item.getId()).apply();

            Intent intent = new Intent(mContext, PagesActivity.class);
            intent.putExtra(ChaptersAdapter.ITEM_KEY, item.getId());
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
        TextView bookTV;
        ImageButton bookmarkBlueIB;
        ProgressBar progressBar;

        ViewHolder(View itemView) {
            super(itemView);

            listLL = itemView.findViewById(R.id.ll_list_favorites);
            numberTV = itemView.findViewById(R.id.tv_list_favorites_number);
            titleTV = itemView.findViewById(R.id.tv_list_favorites_title);
            bookTV = itemView.findViewById(R.id.tv_list_favorites_book);
            bookmarkBlueIB = itemView.findViewById(R.id.ib_list_favorites_bookmark_blue);
            progressBar = itemView.findViewById(R.id.pb_list_favorites_number);

            mView = itemView;
        }
    }
}