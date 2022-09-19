package com.test.daowah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    CardView cardview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardview=findViewById(R.id.quran);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Quran.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.hadis);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Hadis.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.allahname);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,AllahName.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.fatwah);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Fatwah.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.dua);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Dua.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.videos);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Videos.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.post);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Post.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.wallpaper);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Wallpaper.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.pdf);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Books.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.links);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,SocialLinks.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.recite);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Recitation.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.song);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,IslamicSong.class);
                startActivity(intent);
            }
        });

        cardview=findViewById(R.id.course);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Course.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.blood);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Blood.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.credits);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,PagesLink.class);
                startActivity(intent);
            }
        });
        cardview=findViewById(R.id.feedback);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,question.class);
                startActivity(intent);
            }
        });
    }

}