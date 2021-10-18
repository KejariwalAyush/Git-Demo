package com.example.linking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class BankDetail extends AppCompatActivity {
    EditText bank,branch,account,cifc,accname;
    ArrayList<String> bd=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_detail);
    }

    public void display(View view) {
        bank=findViewById(R.id.bank);
        branch=findViewById(R.id.branch);
        accname=findViewById(R.id.accname);
        account=findViewById(R.id.account);
        cifc=findViewById(R.id.cifc);
        bd.add(bank.getText().toString());
        bd.add(branch.getText().toString());
        bd.add(account.getText().toString());
        bd.add(cifc.getText().toString());
        bd.add(accname.getText().toString());

        Intent bankIntent = new Intent(BankDetail.this,display.class);
        bankIntent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        bankIntent.putExtra("bd",bd);


        Bundle b=getIntent().getExtras();
        bankIntent.putExtra("pd",b.getStringArrayList("pd"));
       bankIntent.putExtra("ad",b.getStringArrayList("ad"));



        startActivity(bankIntent);

    }
}