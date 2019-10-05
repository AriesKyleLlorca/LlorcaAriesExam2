package com.llorca.llorcaariesexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    CheckBox chSchool1, chSchool2, chSchool3, chSchool4,
            chSchool5, chSchool6, chSchool7, chSchool8;
    EditText usercomment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chSchool1 = findViewById(R.id.checkBox1);
        chSchool2 = findViewById(R.id.checkBox2);
        chSchool3 = findViewById(R.id.checkBox3);
        chSchool4 = findViewById(R.id.checkBox4);
        chSchool5 = findViewById(R.id.checkBox5);
        chSchool6 = findViewById(R.id.checkBox6);
        chSchool7 = findViewById(R.id.checkBox7);
        chSchool8 = findViewById(R.id.checkBox8);
        usercomment = findViewById(R.id.editTextComment);
    }
    public void saveData(View v) throws IOException {
        String skul1 = chSchool1.getText().toString() + "_";
        String skul2 = chSchool2.getText().toString()+ "_";
        String skul3 = chSchool3.getText().toString()+ "_";
        String skul4 = chSchool4.getText().toString()+ "_";
        String skul5 = chSchool5.getText().toString()+ "_";
        String skul6 = chSchool6.getText().toString()+ "_";
        String skul7 = chSchool7.getText().toString()+ "_";
        String skul8 = chSchool8.getText().toString()+ "_";
        String comment = usercomment.getText().toString()+ "_";
        String FILENAME = "data1.txt";
        FileOutputStream fosWriter = null;
        fosWriter = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        boolean isChecked1 = ((CheckBox) findViewById(R.id.checkBox1)).isChecked();
        boolean isChecked2 = ((CheckBox) findViewById(R.id.checkBox2)).isChecked();
        boolean isChecked3 = ((CheckBox) findViewById(R.id.checkBox3)).isChecked();
        boolean isChecked4 = ((CheckBox) findViewById(R.id.checkBox4)).isChecked();
        boolean isChecked5 = ((CheckBox) findViewById(R.id.checkBox5)).isChecked();
        boolean isChecked6 = ((CheckBox) findViewById(R.id.checkBox6)).isChecked();
        boolean isChecked7 = ((CheckBox) findViewById(R.id.checkBox7)).isChecked();
        boolean isChecked8 = ((CheckBox) findViewById(R.id.checkBox8)).isChecked();
        if (isChecked1 = true){
            fosWriter.write(skul1.getBytes());
        }
        if (isChecked2 = true){
            fosWriter.write(skul2.getBytes());
        }
        if (isChecked3 = true){
            fosWriter.write(skul3.getBytes());
        }
        if (isChecked4 = true){
            fosWriter.write(skul4.getBytes());
        }
        if (isChecked5 = true){
            fosWriter.write(skul5.getBytes());
        }
        if (isChecked6 = true){
            fosWriter.write(skul6.getBytes());
        }
        if (isChecked7 = true){
            fosWriter.write(skul7.getBytes());
        }
        if (isChecked8 = true){
            fosWriter.write(skul8.getBytes());
        }
        fosWriter.write(comment.getBytes());
        fosWriter.close();
        Toast.makeText(this, "Data Saved...", Toast.LENGTH_LONG).show();
    }
    public void next(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
