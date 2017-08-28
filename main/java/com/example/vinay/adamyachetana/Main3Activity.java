package com.example.vinay.adamyachetana;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {
    String fin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle = getIntent().getExtras();
        fin = bundle.getString("fin");
    }
    public void subform(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(fin));
        startActivity(i);
    }

}
