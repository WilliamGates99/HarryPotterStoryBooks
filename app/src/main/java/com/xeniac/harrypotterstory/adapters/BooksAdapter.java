package com.xeniac.harrypotterstory.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xeniac.harrypotterstory.ChaptersActivity;
import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemBooks;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {

    public static final String ITEM_KEY = "item_key";
    private List<DataItemBooks> mItems;
    private Context mContext;

    public BooksAdapter(Context context, List<DataItemBooks> items) {
        this.mContext = context;
        this.mItems = items;
    }

    @NonNull
    @Override
    public BooksAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                      int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.list_item_books, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItemBooks item = mItems.get(position);

        holder.titleTV.setText(item.getTitle());
        holder.gistTV.setText(item.getGist());
        try {
            String imageFile = item.getImage();
            InputStream inputStream = mContext.getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            holder.coverIV.setImageDrawable(drawable);
            holder.coverIV.setClipToOutline(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        holder.listRL.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, ChaptersActivity.class);
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
        RelativeLayout listRL;
        ImageView coverIV;
        TextView titleTV;
        TextView gistTV;

        ViewHolder(View itemView) {
            super(itemView);

            listRL = itemView.findViewById(R.id.rl_list_books);
            coverIV = itemView.findViewById(R.id.iv_list_books_cover);
            titleTV = itemView.findViewById(R.id.tv_list_books_title);
            gistTV = itemView.findViewById(R.id.tv_list_books_gist);

            mView = itemView;
        }
    }
}