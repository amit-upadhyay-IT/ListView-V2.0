package com.aupadhyay.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aupadhyay on 7/18/16.
 */
public class PersonAdapter extends ArrayAdapter<PersonBean> {

    Context context;
    int resource;
    ArrayList<PersonBean> personList;

    public PersonAdapter(Context context, int resource, ArrayList<PersonBean> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        personList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View myView = null;

        myView = LayoutInflater.from(context).inflate(resource, parent, false);
        ImageView icon = (ImageView) myView.findViewById(R.id.imageView);
        TextView name = (TextView) myView.findViewById(R.id.nameTextView);
        TextView phone = (TextView) myView.findViewById(R.id.phoneTextView);

        PersonBean personBean = personList.get(position);

        icon.setImageResource(personBean.getIcon());
        name.setText(personBean.getName());
        phone.setText(personBean.getPhone());

        return myView;
    }
}
