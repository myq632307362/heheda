package com.example.yuekaokk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    private TextView Text;
    private ImageView Image;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initView();

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        url = intent.getStringExtra("url");
        Text.setText(title);
        Picasso.with(DetailsActivity.this).load(url).into(Image);


    }

    private void initView() {
        Text = (TextView) findViewById(R.id.Text);
        Image = (ImageView) findViewById(R.id.Image);
    }
}
