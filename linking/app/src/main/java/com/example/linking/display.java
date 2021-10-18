package com.example.linking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView display;
        display=findViewById(R.id.display);
        ArrayList<String> ad=new ArrayList<>();
        ArrayList<String> pd=new ArrayList<>();
        ArrayList<String> bd=new ArrayList<>();
        Bundle b=getIntent().getExtras();
       // ad=b.getStringArrayList("ad");
        //pd=b.getStringArrayList("pd");
      //  bd=b.getStringArrayList("bd");
        ad=getIntent().getExtras().getStringArrayList("ad");
        pd=getIntent().getExtras().getStringArrayList("pd");
        bd=getIntent().getExtras().getStringArrayList("bd");

        String s="address detail:-"+ad.get(0)+"\n"+ad.get(1)+"\n"+ad.get(2)+"\n"+ad.get(3)+"\n"
               +"personal detail:-"+pd.get(0)+"\n"+pd.get(1)+"\n"+pd.get(2)+"\n"+pd.get(3)+"\n"+pd.get(4)+"\n"
              +"bank detail:-"+bd.get(0)+"\n"+bd.get(1)+"\n"+bd.get(2)+"\n"+bd.get(3)+"\n"+bd.get(4)+"\n";

        display.setText(s);

    }
}