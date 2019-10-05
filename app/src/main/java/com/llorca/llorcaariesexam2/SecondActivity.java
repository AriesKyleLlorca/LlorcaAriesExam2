package com.llorca.llorcaariesexam2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FileInputStream fin = null;
        try {
            fin = openFileInput("data1.txt");
            int token;
            String temp = "";
            while((token = fin.read()) != -1 ){
                temp = temp + ((char) token);
            }
            fin.close();
            try{
                String[] list = temp.split("_");
                ((TextView) (findViewById(R.id.textView1))).setText(list[0]);
                ((TextView) (findViewById(R.id.textView2))).setText(list[1]);
                ((TextView) (findViewById(R.id.textView3))).setText(list[2]);
                ((TextView) (findViewById(R.id.textView4))).setText(list[3]);
                ((TextView) (findViewById(R.id.textView5))).setText(list[4]);
                ((TextView) (findViewById(R.id.textView6))).setText(list[5]);
                ((TextView) (findViewById(R.id.textView7))).setText(list[6]);
                ((TextView) (findViewById(R.id.textView8))).setText(list[7]);
                ((TextView) (findViewById(R.id.textView9))).setText(list[8]);
            } catch (Exception e){
                Log.d("error", "empty strings");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void send(View v){
        Toast.makeText(this, "Request Sent..", Toast.LENGTH_LONG).show();
    }
    public void previous(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
