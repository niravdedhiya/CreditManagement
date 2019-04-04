package com.example.nirav.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DataBase myDatabase;

    public void btn1(View v){
        Intent i = new Intent(getApplicationContext(),ViewUsers.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabase= new DataBase(this);

        addUsers();


    }

    public void addUsers()
    {
        boolean isInserted1 = myDatabase.insertData("Nirav","Dedhiya","nirav@abc.com","2000");
        boolean isInserted2 = myDatabase.insertData("Jay","Rawal","jay@abc.com","500");
        boolean isInserted3 = myDatabase.insertData("Shahil","Patel","Shahil@abc.com","430");
        boolean isInserted4 = myDatabase.insertData("Dishant","Bhandari","db@abc.com","5700");
        boolean isInserted5 = myDatabase.insertData("Mitesh","Nahar","mintu@abc.com","3000");
        boolean isInserted6 = myDatabase.insertData("Neel","Shah","neel@abc.com","67");
        boolean isInserted7 = myDatabase.insertData("Punit","Patel","punit@xyz.com","740");
        boolean isInserted8 = myDatabase.insertData("Aakash","Poikavila","ak@xyz.com","400");
        boolean isInserted9 = myDatabase.insertData("Harsh","Popat","harsh@abc.com","1290");
        boolean isInserted10 = myDatabase.insertData("Anuj","Shrivastav","anuj@xyz.com","788");


        if(isInserted1 == true && isInserted2 == true && isInserted3 == true &&isInserted4 == true &&isInserted5 == true &&isInserted6 == true &&isInserted7 == true &&
                isInserted8 == true &&isInserted9 == true &&isInserted10 == true )
            return;
        else
            Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
    }
}
