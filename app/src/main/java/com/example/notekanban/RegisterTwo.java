package com.example.notekanban;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.notekanban.Model.DataBaseHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RegisterTwo extends AppCompatActivity {

    ImageView ivPhoto;
    Button btnAddPhoto, btnNext;
    DataBaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_two);

        dbHelper = new DataBaseHelper(this);

        ivPhoto = findViewById(R.id.iv_photo);
        btnAddPhoto = findViewById(R.id.btn_add_photo);
        btnNext = findViewById(R.id.btn_next);

        btnAddPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File folder = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
                FileInputStream fis = new FileInputStream(folder);
                byte[] image = new byte[fis.available()];
                fis.read(image);
                ContentValues values = new ContentValues();
                values.put("photo", image);
                }
            });

    }
}
