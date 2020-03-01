package com.example.notekanban;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.notekanban.Model.DataBaseHelper;

public class RegisterOne extends AppCompatActivity {

    DataBaseHelper dbHelper;
    EditText edt_username, edt_password, edt_nophone;
    Button btnRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_one);

        dbHelper = new DataBaseHelper(this);

        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
        edt_nophone = findViewById(R.id.edt_nophone);
        btnRegist = findViewById(R.id.btn_daftar);

        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into account values( null, '" +
                        edt_username.getText().toString()+"','"+
                        edt_password.getText().toString()+"','"+
                        edt_nophone.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();

                Intent gotoregister2 = new Intent(RegisterOne.this, RegisterTwo.class);
                startActivity(gotoregister2);
            }
        });
    }
}
