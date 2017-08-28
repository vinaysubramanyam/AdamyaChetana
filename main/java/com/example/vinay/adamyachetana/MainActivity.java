package com.example.vinay.adamyachetana;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
//import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message)
        startActivity(intent);
    }
    public void about(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.adamyachetana.org/"));
        startActivity(i);
    }
}
