package com.chandracorp.intellifarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SelectcropActivity extends AppCompatActivity {
    private ImageView previouslyHighlightedImageView;
    Button nextScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectcrop);
        nextScreen = findViewById(R.id.nextCrop);
        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectcropActivity.this,MainActivity.class));
                finish();
            }
        });
    }

    public void highlightCrop(View view) {
        // Reset previously highlighted ImageView
        if (previouslyHighlightedImageView != null) {
            previouslyHighlightedImageView.setBackgroundColor(Color.TRANSPARENT);
        }

        // Highlight the clicked ImageView
        ImageView imageView = (ImageView) view;
        imageView.setBackgroundResource(R.drawable.roundbox);

        // Store the currently highlighted ImageView for future reference
        previouslyHighlightedImageView = imageView;
    }

}