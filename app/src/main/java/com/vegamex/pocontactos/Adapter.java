package com.vegamex.pocontactos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    ArrayList<Contact> arrayList;
    Context context;

    public Adapter(ArrayList<Contact> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            LayoutInflater li =
                    (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.item_contact, null);
        }

        TextView user = (TextView)view.findViewById(R.id.itemUser);
        TextView email = (TextView)view.findViewById(R.id.itemEmail);

        user.setText(arrayList.get(i).getUser());
        email.setText(arrayList.get(i).getEmail());

        return view;
    }
}
