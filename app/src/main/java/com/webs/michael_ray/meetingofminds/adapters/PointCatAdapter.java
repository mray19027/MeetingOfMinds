package com.webs.michael_ray.meetingofminds.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.webs.michael_ray.meetingofminds.R;
import com.webs.michael_ray.meetingofminds.logic.Point;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by mray on 30/09/14.
 */
public class PointCatAdapter extends ArrayAdapter<Point> {
    Context context;
    int layoutResourceId;
    ArrayList<Point> data = null;
    DecimalFormat df = new DecimalFormat("0.00");

    public PointCatAdapter(Context context, int layoutResourceId, ArrayList<Point> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        PointCatHolder holder = null;

        if (row==null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new PointCatHolder();
            holder.img_icon = (ImageView)row.findViewById(R.id.img_icon_catmain);
            holder.txt_cat = (TextView)row.findViewById(R.id.txt_cat_catmain);

            row.setTag(holder);
        } else {
            holder = (PointCatHolder)row.getTag();
        }
        Point point = data.get(position);
        holder.img_icon.setImageResource(point.getIcon());
        holder.txt_cat.setText(point.getCat());
        return row;
    }

    static class PointCatHolder {
        ImageView img_icon;
        TextView txt_cat;
    }
}