package com.example.linking;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddressDetail extends AppCompatActivity {
    EditText state,distict,pin,landmark;
    ArrayList<String> ad=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_detail);


    }

    public void bankpage(View view) {
        state=findViewById(R.id.state);
        distict=findViewById(R.id.distict);
        pin=findViewById(R.id.pin);
        landmark=findViewById(R.id.landmark);
        ad.add(state.getText().toString());
        ad.add(distict.getText().toString());
        ad.add(pin.getText().toString());
        ad.add(landmark.getText().toString());
        Intent addressIntent = new Intent(AddressDetail.this,BankDetail.class);
       addressIntent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        
        addressIntent.putExtra("ad",ad);


        Bundle b=getIntent().getExtras();
        addressIntent.putExtra("pd",b.getStringArrayList("pd"));



        startActivity(addressIntent);
    }
}