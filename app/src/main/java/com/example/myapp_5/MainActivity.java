package com.example.myapp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetInitialDate();

        countriesList= findViewById(R.id.counterList);

        State_adapter stateAdapter = new State_adapter(this,R.layout.state_layout,states);
        countriesList.setAdapter(stateAdapter);
    }

    private void SetInitialDate(){
        states.add(new State("Denji","Demon slayer", R.drawable.chainsaw_man));
        states.add(new State("Lith Verhen","Supreme Magus", R.drawable.supreme_magus_2));
    }
}