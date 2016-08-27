package com.example.jessexx.panic.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jessexx.panic.Models.Asset;
import com.example.jessexx.panic.R;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;

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
        Asset asset = mList.get(position);

        vh.tv_asset_value.setText("$" + asset.getValue());
        vh.tv_asset_type.setText(asset.getName());

        switch  (asset.getCategory()) {
            case HOME:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_home).actionBarSize());
                break;
            case VEHICLE:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_car).actionBarSize());
                break;
            case BANK:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_bank).actionBarSize());
                break;
            case OTHER:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_gamepad).actionBarSize());
                break;
            default:
                break;
        }

        vh.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Go to detail Screen", Toast.LENGTH_SHORT).show();
            }
        });
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
