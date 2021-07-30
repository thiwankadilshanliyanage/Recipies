package com.example.sqlitesmallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    EditText title_input2, author_input2, pages_input2;
    Button update_button;

    String id, title, author, pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        title_input2 = findViewById(R.id.title_input2);
        author_input2 = findViewById(R.id.author2);
        pages_input2 = findViewById(R.id.pages2);
        update_button = findViewById(R.id.update);
        //first we call this
        getAndSetIntentData();
        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //And only then we call this
                SqliteDatabaseHelper myDB = new SqliteDatabaseHelper(UpdateActivity.this);
                myDB.updateData(id, title, author, pages);
            }
        });


    }
    void getAndSetIntentData(){
        if(getIntent().hasExtra("id") && getIntent().hasExtra("title") && getIntent().hasExtra("author") && getIntent().hasExtra("pages")){
           //Getting Data from Intent
            id = getIntent().getStringExtra("id");
            title = getIntent().getStringExtra("title");
            author = getIntent().getStringExtra("author");
            pages = getIntent().getStringExtra("pages");

            //setting  Intent data
            title_input2.setText(title);
            author_input2.setText(author);
            pages_input2.setText(pages);


        }else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }
}