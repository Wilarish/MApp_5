package com.example.myapp_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class State_adapter extends ArrayAdapter<State> {
    private LayoutInflater inflater;
    private int layout;
    private List<State> states;

    public  State_adapter(Context context, int resource, List<State> states){
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertview, ViewGroup parent){
        View view = inflater.inflate(this.layout, parent,false);

        ImageView flagView = (ImageView) view.findViewById(R.id.flag);
        TextView nameView = (TextView) view.findViewById(R.id.text_name);
        TextView capitalView = (TextView) view.findViewById(R.id.text_capital);

        State state = states.get(position);

        flagView.setImageResource(state.getFlagRes());
        nameView.setText(state.getName());
        capitalView.setText(state.getWork());

        return view;
    }
}
