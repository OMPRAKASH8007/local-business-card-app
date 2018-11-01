package com.example.mycompany.pvrcinema;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public String pvrPatna="pvr cinema gravity mall patna";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void locate(View v)
    {
        Uri mapUri=Uri.parse("geo:0,0?q="+Uri.encode(pvrPatna));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,mapUri);
        startActivity(mapIntent);
    }
    public void call(View v)
    {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:09155915508"));
        startActivity(callIntent);
    }
    public void web(View v)
    {
        String url= "https://www.pvrcinemas.com/";
        Intent webIntent= new Intent(Intent.ACTION_VIEW);
        webIntent.setData(Uri.parse(url));
        startActivity(webIntent);
    }
}
