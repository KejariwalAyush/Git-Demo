package com.example.linking;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class PersonalDetail extends AppCompatActivity {

    EditText name,email,contact,age,nation;
    ArrayList<String> pd=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detail);
    }

    public void addresspage(View view) {
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);
        age=findViewById(R.id.age);
        nation=findViewById(R.id.nation);
        pd.add(name.getText().toString());
        pd.add(email.getText().toString());
        pd.add(contact.getText().toString());
        pd.add(age.getText().toString());
        pd.add(nation.getText().toString());
        Intent personalIntent = new Intent(PersonalDetail.this,AddressDetail.class);
        personalIntent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        personalIntent.putExtra("pd",pd);
//        personalIntent.putExtra("email",email.getText().toString());
//        personalIntent.putExtra("contact",contact.getText().toString());
//        personalIntent.putExtra("age",age.getText().toString());
//        personalIntent.putExtra("nation",nation.getText().toString());
        startActivity(personalIntent);
    }
}