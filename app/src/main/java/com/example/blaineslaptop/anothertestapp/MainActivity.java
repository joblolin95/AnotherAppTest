package com.example.blaineslaptop.anothertestapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ARTICLE = "com.example.blaineslaptop.anothertestapp.EXTRA_ARTICLE";
    String uri;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtOne = (TextView) findViewById(R.id.titleOne);
        TextView txtTwo = (TextView) findViewById(R.id.titleTwo);

        //Will original web pages be modified for viewing on tablet?

        // Text or Image would be pulled from DB(?)
        txtOne.setText("He Cares");
        txtTwo.setText("Smiles");

        txtOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Uri would be pulled in from DB
                uri = "file:///android_asset/He Cares.html";
                Intent intent = new Intent(getApplicationContext(), ArticleActivity.class);
                intent.putExtra(EXTRA_ARTICLE, uri);
                startActivity(intent);

            }
        });

        txtTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Uri would be pulled in from DB
                uri = "file:///android_asset/smiles.html";
                Intent intent = new Intent(getApplicationContext(), ArticleActivity.class);
                intent.putExtra(EXTRA_ARTICLE, uri);
                startActivity(intent);

            }
        });
    }
}
