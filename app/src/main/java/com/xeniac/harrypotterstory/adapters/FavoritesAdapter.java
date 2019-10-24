package com.xeniac.harrypotterstory.adapters;

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
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.ViewHolder> {

    private List<DataItemChapters> mItems;
    private Context mContext;
    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;

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

        holder.bookmarkBlueIB.setOnClickListener(v -> {
            item.setFavorite(false);
            chaptersDataSource.updateFavorite(item);
            try {
                mItems.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, getItemCount());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        holder.listLL.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, PagesActivity.class);
            intent.putExtra(ChaptersAdapter.ITEM_KEY, item);
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

        ViewHolder(View itemView) {
            super(itemView);

            listLL = itemView.findViewById(R.id.ll_list_favorites);
            numberTV = itemView.findViewById(R.id.tv_list_favorites_number);
            titleTV = itemView.findViewById(R.id.tv_list_favorites_title);
            bookTV = itemView.findViewById(R.id.tv_list_favorites_book);
            bookmarkBlueIB = itemView.findViewById(R.id.ib_list_favorites_bookmark_blue);

            mView = itemView;
        }
    }
}