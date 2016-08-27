package com.example.jessexx.panic.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jessexx.panic.Models.Asset;
import com.example.jessexx.panic.R;

import java.util.List;

public class AssetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context mContext;
    List<Asset> mList;

    public AssetAdapter(Context context, List<Asset> list) {
        mList = list;
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolderItem vh = (ViewHolderItem) holder;

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ViewHolderItem extends RecyclerView.ViewHolder {
        CardView cv;
        TextView tv_asset_value;
        TextView tv_asset_type;
        ImageView iv_asset_icon;

        public ViewHolderItem(View itemView) {
            super(itemView);

            cv = (CardView) itemView.findViewById(R.id.card_view);
            tv_asset_value = (TextView) itemView.findViewById(R.id.asset_value);
            tv_asset_type = (TextView) itemView.findViewById(R.id.asset_type);
            iv_asset_icon = (ImageView) itemView.findViewById(R.id.asset_icon);
        }
    }
}
