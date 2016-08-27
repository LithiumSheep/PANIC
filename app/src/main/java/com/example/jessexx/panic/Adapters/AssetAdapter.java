package com.example.jessexx.panic.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jessexx.panic.Activities.AssetDetailActivity;
import com.example.jessexx.panic.Models.Asset;
import com.example.jessexx.panic.Models.Home;
import com.example.jessexx.panic.Models.Vehicle;
import com.example.jessexx.panic.R;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;

import java.util.ArrayList;

public class AssetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context mContext;
    ArrayList<Asset> mList;

    public AssetAdapter(Context context, ArrayList<Asset> list) {
        mList = list;
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_home, parent, false);
        ViewHolderItem vh = new ViewHolderItem(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolderItem vh = (ViewHolderItem) holder;
        final Asset asset = mList.get(position);

        vh.tv_asset_value.setText("$" + asset.getValue());
        vh.tv_asset_type.setText(asset.getName());

        switch  (asset.getCategory()) {
            case HOME:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_home)
                        .colorRes(R.color.purple)
                        .actionBarSize());
                // set location on card
                break;
            case VEHICLE:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_car)
                        .colorRes(R.color.cyan)
                        .actionBarSize());
                // set make and model on card
                break;
            case BANK:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_bank)
                        .colorRes(R.color.grey)
                        .actionBarSize());
                // set institution name on card
                break;
            case OTHER:
                vh.iv_asset_icon.setImageDrawable(new IconDrawable(mContext, FontAwesomeIcons.fa_gamepad)
                        .colorRes(R.color.orange)
                        .actionBarSize());
                break;
            default:
                Log.d("error", "something went wrong, the asset CATEGORY was unset");
                break;
        }

        vh.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, AssetDetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("name", asset.getName());
                bundle.putString("description", asset.getDescription());

                switch (asset.getCategory()) {
                    case HOME:
                        Home mHome = (Home) asset;
                        bundle.putString("location", mHome.getLocation());
                        break;
                    case VEHICLE:
                        Vehicle mVehicle = (Vehicle) asset;
                        bundle.putString("location", mVehicle.getLocation());
                        bundle.putInt("year", mVehicle.getYear());
                        //need CONDITION
                        break;
                    default:
                        break;
                }

                intent.putExtras(bundle);
                mContext.startActivity(intent);
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
