package com.example.vinay.adamyachetana;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    EditText name,phone,email;
    Button b1;
    String n,p,e,log;
    int duration = Toast.LENGTH_SHORT;
    CharSequence text = "Please fill required fields!";
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    //public void Sub(View view) {


    public void Sub(View v) {
        b1 = (Button)findViewById(R.id.button2);
        name = (EditText)findViewById(R.id.editText);
        phone = (EditText)findViewById(R.id.editText2);
        email = (EditText)findViewById(R.id.editText3);
        Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message)
        n=name.getText().toString();
        p=phone.getText().toString();
        e=email.getText().toString();

        if(n.isEmpty()||p.isEmpty()){
            //startActivity(intent);
            Toast.makeText(context,text,duration).show();
        }
        else {
            log = "http://192.168.0.1/index.php?name="+n+"&&phone="+p+"&&email="+e;
            //Toast.makeText(context,log,duration).show();
            intent.putExtra("log",log);
            startActivity(intent);
        }
    }

}
