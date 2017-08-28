package com.example.vinay.adamyachetana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class Main5Activity extends AppCompatActivity {

    private RadioGroup radioGroup,radioGroup1,radioGroup2, radioGroup3,radioGroup4,radioGroup5;
    private RadioButton answer1A, answer1B, answer1C, answer2A,answer2B,answer2C, answer3A, answer3B, answer3C, answer4A, answer4B, answer4C, answer5A, answer5B, answer5C, answer6A, answer6B, answer6C;
    private Button button;
    String ans1,ans2,ans3,ans4,ans5,ans6,log;
    //private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Bundle bundle = getIntent().getExtras();
        log = bundle.getString("log");
        Toast.makeText(this,log,Toast.LENGTH_SHORT);
        //textView.setText(log);

        radioGroup = (RadioGroup) findViewById(R.id.answer1);
        radioGroup1 = (RadioGroup)findViewById(R.id.answer2);
        radioGroup2 = (RadioGroup)findViewById(R.id.answer3);
        radioGroup3 = (RadioGroup)findViewById(R.id.answer4);
        radioGroup4 = (RadioGroup)findViewById(R.id.answer5);
        radioGroup5 = (RadioGroup)findViewById(R.id.answer6);

        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.answer1A) {
                    Toast.makeText(getApplicationContext(), "choice: 1a",
                            Toast.LENGTH_SHORT).show();
                    //ans1="2";
                } else if(checkedId == R.id.answer1B) {
                    Toast.makeText(getApplicationContext(), "choice: 1b",
                            Toast.LENGTH_SHORT).show();
                    //ans1="5";
                } else {
                    //Toast.makeText(getApplicationContext(), "choice: 1c",
                    //Toast.LENGTH_SHORT).show();
                    //ans1="9";
                }
            }

        });
        radioGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.answer2A) {
                    Toast.makeText(getApplicationContext(), "choice: 2a",
                            Toast.LENGTH_SHORT).show();
                    //ans2="6";
                } else if(checkedId == R.id.answer2B) {
                    Toast.makeText(getApplicationContext(), "choice: 2b",
                            Toast.LENGTH_SHORT).show();
                    //ans2="4";
                } else {
                    Toast.makeText(getApplicationContext(), "choice: 2c",
                            Toast.LENGTH_SHORT).show();
                    //ans2="1";
                }
            }

        });
        radioGroup2.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.answer3A) {
                    Toast.makeText(getApplicationContext(), "choice: 3a",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.answer3B) {
                    Toast.makeText(getApplicationContext(), "choice: 3b",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: 3c",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });
        radioGroup3.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.answer4A) {
                    Toast.makeText(getApplicationContext(), "choice: 4a",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.answer4B) {
                    Toast.makeText(getApplicationContext(), "choice: 4b",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: 4c",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });
        radioGroup4.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.answer5A) {
                    Toast.makeText(getApplicationContext(), "choice: 5a",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.answer5B) {
                    Toast.makeText(getApplicationContext(), "choice: 5b",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: 5c",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });
        radioGroup5.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.answer6A) {
                    Toast.makeText(getApplicationContext(), "choice: 6a",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.answer6B) {
                    Toast.makeText(getApplicationContext(), "choice: 6b",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: 6c",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });


        answer1A = (RadioButton) findViewById(R.id.answer1A);
        answer1B = (RadioButton) findViewById(R.id.answer1B);
        answer1C = (RadioButton) findViewById(R.id.answer1C);
        answer2A = (RadioButton) findViewById(R.id.answer2A);
        answer2B = (RadioButton) findViewById(R.id.answer2B);
        answer2C = (RadioButton) findViewById(R.id.answer2C);
        answer3A = (RadioButton) findViewById(R.id.answer3A);
        answer3B = (RadioButton) findViewById(R.id.answer3B);
        answer3C = (RadioButton) findViewById(R.id.answer3C);
        answer4A = (RadioButton) findViewById(R.id.answer4A);
        answer4B = (RadioButton) findViewById(R.id.answer4B);
        answer4C = (RadioButton) findViewById(R.id.answer4C);
        answer5A = (RadioButton) findViewById(R.id.answer5A);
        answer5B = (RadioButton) findViewById(R.id.answer5B);
        answer5C = (RadioButton) findViewById(R.id.answer5C);
        answer6A = (RadioButton) findViewById(R.id.answer6A);
        answer6B = (RadioButton) findViewById(R.id.answer6B);
        answer6C = (RadioButton) findViewById(R.id.answer6C);
        //textView = (TextView) findViewById(R.id.text);

        button = (Button)findViewById(R.id.submit);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                int selectedId2 = radioGroup2.getCheckedRadioButtonId();
                int selectedId3 = radioGroup3.getCheckedRadioButtonId();
                int selectedId4 = radioGroup4.getCheckedRadioButtonId();
                int selectedId5 = radioGroup5.getCheckedRadioButtonId();


                // find which radioButton is checked by id
                if(selectedId == answer1A.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 1a",
                      //      Toast.LENGTH_SHORT).show();
                    ans1 = "2";
                    //textView.setText("You chose 'Sound' option");
                } if(selectedId == answer1B.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 1b",
                      //      Toast.LENGTH_SHORT).show();
                    ans1 = "5";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId == answer1C.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 1c",
                      //      Toast.LENGTH_SHORT).show();
                    ans1 = "9";
                    //textView.setText("You chose 'Sound' option");
                } if(selectedId1 == answer2A.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 2a",
                      //      Toast.LENGTH_SHORT).show();
                    ans2 = "2";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId1 == answer2B.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 2b",
                      //      Toast.LENGTH_SHORT).show();
                    ans2 = "5";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId1 == answer2C.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 2c",
                      //      Toast.LENGTH_SHORT).show();
                    ans2 = "9";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId2 == answer3A.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 3a",
                      //      Toast.LENGTH_SHORT).show();
                    ans3 = "1";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId2 == answer3B.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 3b",
                      //      Toast.LENGTH_SHORT).show();
                    ans3 = "2";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId2 == answer3C.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 3c",
                      //      Toast.LENGTH_SHORT).show();
                    ans3 = "3";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId3 == answer4A.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 4a",
                      //      Toast.LENGTH_SHORT).show();
                    ans4 = "1";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId3 == answer4B.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 4b",
                      //      Toast.LENGTH_SHORT).show();
                    ans4 = "2";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId3 == answer4C.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 4c",
                      //      Toast.LENGTH_SHORT).show();
                    ans4 = "3";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId4 == answer5A.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 5a",
                      //      Toast.LENGTH_SHORT).show();
                    ans5 = "1";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId4 == answer5B.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 5b",
                      //      Toast.LENGTH_SHORT).show();
                    ans5 = "2";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId4 == answer5C.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 5c",
                      //      Toast.LENGTH_SHORT).show();
                    ans5 = "3";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId5 == answer6A.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 6a",
                      //      Toast.LENGTH_SHORT).show();
                    ans6 = "1";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId5 == answer6B.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 6b",
                      //      Toast.LENGTH_SHORT).show();
                    ans6 = "2";
                    //textView.setText("You chose 'Vibration' option");
                } if(selectedId5 == answer6C.getId()) {
                    //Toast.makeText(getApplicationContext(), "choice: 6c",
                      //      Toast.LENGTH_SHORT).show();
                    ans6 = "3";
                    //textView.setText("You chose 'Vibration' option");
                }
                Intent intent = new Intent(Main5Activity.this, Main3Activity.class);
                String fin = log+"ans1="+ans1+"&&ans2="+ans2+"&&ans3="+ans3+"&&ans4="+ans4+"&&ans5="+ans5+"&&ans6="+ans6;
                Toast.makeText(getApplicationContext(),fin,Toast.LENGTH_LONG).show();
                intent.putExtra("fin",fin);
                startActivity(intent);

            }
        });
    }

}