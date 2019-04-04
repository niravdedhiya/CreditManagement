package com.example.nirav.listview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewUsers extends AppCompatActivity {

    Button button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
    DataBase myDb;
    public static   String k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button10=(Button)findViewById(R.id.button10);
        button11=(Button)findViewById(R.id.button11);


        myDb = new DataBase(this);
        viewAll();


    }

    public void viewAll() {

        final Cursor res = myDb.getAllData();
        if (res.getCount() == 0) {
            // show message
            showMessage("Error", "Nothing found");
            return;
        }

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        StringBuffer buffer = new StringBuffer();
                        k = "USER 1";
                        res.moveToPosition(0);
                        buffer.append("Id :" + res.getString(0) + "\n");
                        buffer.append("Name :" + res.getString(1) + "\n");
                        buffer.append("Surname :" + res.getString(2) + "\n");
                        buffer.append("Email id :" + res.getString(3) + "\n");
                        buffer.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage(k, buffer.toString());

                    }
                });

        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(1);
                        k = "USER 2";
                        StringBuffer buffer1 = new StringBuffer();
                        buffer1.append("Id :" + res.getString(0) + "\n");
                        buffer1.append("Name :" + res.getString(1) + "\n");
                        buffer1.append("Surname :" + res.getString(2) + "\n");
                        buffer1.append("Email id :" + res.getString(3) + "\n");
                        buffer1.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage( k,buffer1.toString());

                    }
                });

        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(2);
                        StringBuffer buffer2 = new StringBuffer();
                        k = "USER 3";
                        buffer2.append("Id :" + res.getString(0) + "\n");
                        buffer2.append("Name :" + res.getString(1) + "\n");
                        buffer2.append("Surname :" + res.getString(2) + "\n");
                        buffer2.append("Email id :" + res.getString(3) + "\n");
                        buffer2.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage( k,buffer2.toString());

                    }
                });

        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(3);
                        StringBuffer buffer3 = new StringBuffer();
                        k = "USER 4";
                        buffer3.append("Id :" + res.getString(0) + "\n");
                        buffer3.append("Name :" + res.getString(1) + "\n");
                        buffer3.append("Surname :" + res.getString(2) + "\n");
                        buffer3.append("Email id :" + res.getString(3) + "\n");
                        buffer3.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage(k,buffer3.toString());

                    }
                });

        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(4);
                        StringBuffer buffer4 = new StringBuffer();
                        k = "USER 5";
                        buffer4.append("Id :" + res.getString(0) + "\n");
                        buffer4.append("Name :" + res.getString(1) + "\n");
                        buffer4.append("Surname :" + res.getString(2) + "\n");
                        buffer4.append("Email id :" + res.getString(3) + "\n");
                        buffer4.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage(k, buffer4.toString());

                    }
                });

        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(5);
                        StringBuffer buffer5 = new StringBuffer();
                        k = "USER 6";

                        buffer5.append("Id :" + res.getString(0) + "\n");
                        buffer5.append("Name :" + res.getString(1) + "\n");
                        buffer5.append("Surname :" + res.getString(2) + "\n");
                        buffer5.append("Email id :" + res.getString(3) + "\n");
                        buffer5.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage( k,buffer5.toString());

                    }
                });

        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(6);
                        StringBuffer buffer6 = new StringBuffer();
                        k = "USER 7";
                        buffer6.append("Id :" + res.getString(0) + "\n");
                        buffer6.append("Name :" + res.getString(1) + "\n");
                        buffer6.append("Surname :" + res.getString(2) + "\n");
                        buffer6.append("Email id :" + res.getString(3) + "\n");
                        buffer6.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage(k,buffer6.toString());

                    }
                });

        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(7);
                        StringBuffer buffer7 = new StringBuffer();
                        k = "USER 8";
                        buffer7.append("Id :" + res.getString(0) + "\n");
                        buffer7.append("Name :" + res.getString(1) + "\n");
                        buffer7.append("Surname :" + res.getString(2) + "\n");
                        buffer7.append("Email id :" + res.getString(3) + "\n");
                        buffer7.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage(k,buffer7.toString());

                    }
                });

        button10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(8);
                        StringBuffer buffer8 = new StringBuffer();
                        k = "USER 9";
                        buffer8.append("Id :" + res.getString(0) + "\n");
                        buffer8.append("Name :" + res.getString(1) + "\n");
                        buffer8.append("Surname :" + res.getString(2) + "\n");
                        buffer8.append("Email id :" + res.getString(3) + "\n");
                        buffer8.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage( k,buffer8.toString());

                    }
                });

        button11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res.moveToPosition(9);
                        StringBuffer buffer9 = new StringBuffer();
                        k = "USER 10";
                        buffer9.append("Id :" + res.getString(0) + "\n");
                        buffer9.append("Name :" + res.getString(1) + "\n");
                        buffer9.append("Surname :" + res.getString(2) + "\n");
                        buffer9.append("Email id :" + res.getString(3) + "\n");
                        buffer9.append("Credits:" + res.getString(4) + "\n\n");


                        // Show all data
                        showMessage(k, buffer9.toString());

                    }
                });
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);




        builder.setPositiveButton("Transfer Credits", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {


                //OR


                Intent i1 = new Intent(getApplicationContext(), TransferCredits.class);
                startActivity(i1);


            }
        });
        builder.show();

    }


}
