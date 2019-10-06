package com.xeniac.harrypotterstory.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.database.DataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.ViewHolder> {

    //    public static final String ITEM_KEY = "item_key";
    private List<DataItemChapters> mItems;
    private Context mContext;
    private DataSource mDataSource;

    public FavoritesAdapter(Context context, List<DataItemChapters> items) {
        this.mContext = context;
        this.mItems = items;
        mDataSource = new DataSource(mContext);
        mDataSource.open();
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

        holder.numberTV.setText(item.getNumber());
        holder.numberTV.setText(item.getNumber());
        holder.titleTV.setText(item.getTitle());
        holder.bookTV.setText(item.getBookTitle());

        if (item.isFavorite()) {
            holder.bookmarkBlueIB.setVisibility(View.VISIBLE);
            holder.bookmarkGrayIB.setVisibility(View.GONE);
        }

        holder.bookmarkBlueIB.setOnClickListener(v -> {
            item.setFavorite(false);
            mDataSource.updateFavorite(item);
            holder.bookmarkBlueIB.setVisibility(View.GONE);
            holder.bookmarkGrayIB.setVisibility(View.VISIBLE);
            try {
                mItems.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, getItemCount());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        holder.listLL.setOnClickListener(v -> {
            Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(mContext, ChaptersActivity.class);
//            intent.putExtra(ITEM_KEY, item);
//            mContext.startActivity(intent);
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
        ImageButton bookmarkGrayIB;
        ImageButton bookmarkBlueIB;

        ViewHolder(View itemView) {
            super(itemView);

            listLL = itemView.findViewById(R.id.ll_list_favorites);
            numberTV = itemView.findViewById(R.id.tv_list_favorites_number);
            titleTV = itemView.findViewById(R.id.tv_list_favorites_title);
            bookTV = itemView.findViewById(R.id.tv_list_favorites_book);
            bookmarkGrayIB = itemView.findViewById(R.id.ib_list_favorites_bookmark_gray);
            bookmarkBlueIB = itemView.findViewById(R.id.ib_list_favorites_bookmark_blue);

            mView = itemView;
        }
    }
}