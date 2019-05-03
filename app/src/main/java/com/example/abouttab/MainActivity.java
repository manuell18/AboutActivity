package com.example.abouttab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    private void addListenerOnButton() {

        imgButton = (ImageButton) findViewById
                (R.id.facebook);

        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.facebook.com.";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
    }


    private void addListenerOnButton1() {


        imgButton = (ImageButton) findViewById
                (R.id.twitter);
        addListenerOnButton();

        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.twitter.com.";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }



    private void addListenerOnButton3() {

        imgButton = (ImageButton) findViewById
                (R.id.gmail);

        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://google.gmail.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
