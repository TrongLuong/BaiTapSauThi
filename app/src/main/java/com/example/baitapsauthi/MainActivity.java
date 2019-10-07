package com.example.baitapsauthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int[] arriconweb = {
            R.drawable.yb,R.drawable.roxlex,R.drawable.zingmp3,
            R.drawable.nhaccuaui,R.drawable.casio,R.drawable.facebook,
            R.drawable.ip,R.drawable.twitte,R.drawable.tgdd,
            R.drawable.alibaba,R.drawable.amazon,R.drawable.lazda,
            };
    String[] linkweb = {"https://www.youtube.com/","https://www.rolex.com/", "https://zingmp3.vn",
            "https://www.nhaccuatui.com", "https://www.casio-vietnam.com","https://www.facebook.com/",
            "https://www.apple.com/iphone/","https://twitter.com/?lang=vi","https://www.thegioididong.com/"
           ,"https://www.alibaba.com","https://www.amazon.com","https://www.lazada.vn/"

    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView =findViewById(R.id.gridView);
        CustomGridAdapter gridAdapter = new CustomGridAdapter(this, arriconweb);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(linkweb[position]));
                        startActivity(intent);
                }


        });



    }

}
