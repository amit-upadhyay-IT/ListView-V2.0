package com.aupadhyay.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aupadhyay on 7/18/16.
 */
public class PersonBaseAdapter extends BaseAdapter {

    Context context;
    int resource;
    ArrayList<PersonBean> personList;

    public PersonBaseAdapter(Context context, int resource, ArrayList<PersonBean> object)
    {
        this.context = context;
        this.resource = resource;
        personList = object;
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(resource, viewGroup, false);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView name = (TextView) view.findViewById(R.id.nameTextView);
        TextView phone = (TextView) view.findViewById(R.id.phoneTextView);

        PersonBean pb = personList.get(i);

        icon.setImageResource(pb.getIcon());
        name.setText(pb.getName());
        phone.setText(pb.getPhone());

        return view;
    }
}
