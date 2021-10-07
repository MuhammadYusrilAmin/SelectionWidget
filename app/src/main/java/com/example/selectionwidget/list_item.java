package com.example.selectionwidget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class list_item extends BaseAdapter {
    private Context context;
    private List<alamat> alamats;

    private static class ViewHolder {
        TextView Daerah;
        TextView Kota;
        TextView Provinsi;
    }

    public list_item(Activity activity, List<alamat> alamats) {
        this.context = activity.getBaseContext();
        this.alamats = alamats;
    }

    @Override
    public int getCount() {
        return alamats.size();
    }

    @Override
    public Object getItem(int id) {
        return alamats.get(id);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int pos, View v, ViewGroup vGroup) {
        // TODO Auto-generated method stub

        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (v == null) {
            holder = new ViewHolder();

            v = inflater.inflate(R.layout.list_item, vGroup, false);

            holder.Daerah = v.findViewById(R.id.alamat);
            holder.Kota = v.findViewById(R.id.kota);
            holder.Provinsi = v.findViewById(R.id.provinsi);

            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }

        alamat p = alamats.get(pos);

        holder.Daerah.setText(p.getDaerah());
        holder.Kota.setText(p.getKota());
        holder.Provinsi.setText(p.getProvinsi());


        return v;
    }
}
