package com.xeniac.harrypotterstorybooks.adapters;

import android.content.Context;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.List;

public class PagesAdapter extends RecyclerView.Adapter<PagesAdapter.ViewHolder> {

    public static float CURRENT_TEXT_SIZE;
    public static byte FONT_SIZE_COUNTER = 0;
    public static byte FONT_SIZE_CHANGER = 0;

    private final List<DataItemPages> mItems;
    private final Context mContext;

    public PagesAdapter(Context context, List<DataItemPages> items) {
        this.mContext = context;
        this.mItems = items;
    }

    @NonNull
    @Override
    public PagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                      int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.list_item_pages, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItemPages item = mItems.get(position);

        holder.numberTV.setText(String.valueOf(item.getNumber()));
        holder.textTV.setText(Html.fromHtml(mContext.getString(item.getText())));

        switch (FONT_SIZE_CHANGER) {
            case 1:
                holder.textTV.setTextSize(TypedValue.COMPLEX_UNIT_PX, CURRENT_TEXT_SIZE + 3.0f);
                break;
            case -1:
                holder.textTV.setTextSize(TypedValue.COMPLEX_UNIT_PX, CURRENT_TEXT_SIZE - 3.0f);
                break;
        }

        if (item.equals(mItems.get(mItems.size() - 1))) {
            CURRENT_TEXT_SIZE = holder.textTV.getTextSize();
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        TextView numberTV;
        TextView textTV;

        ViewHolder(View itemView) {
            super(itemView);

            numberTV = itemView.findViewById(R.id.tv_list_pages_number);
            textTV = itemView.findViewById(R.id.tv_list_pages_text);

            mView = itemView;
        }
    }
}