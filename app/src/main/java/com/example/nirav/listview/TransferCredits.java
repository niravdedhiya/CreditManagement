package com.example.nirav.listview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TransferCredits extends AppCompatActivity {

    Button button;
    DataBase mydb;

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    ViewUsers vw;
    public  String l;
    public String youEdit,b,u;
    public int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_credits);

        button1 = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button3);
        button3 = (Button) findViewById(R.id.button4);
        button4 = (Button) findViewById(R.id.button5);
        button5 = (Button) findViewById(R.id.button6);
        button6 = (Button) findViewById(R.id.button7);
        button7 = (Button) findViewById(R.id.button8);
        button8 = (Button) findViewById(R.id.button9);
        button9 = (Button) findViewById(R.id.button10);
        button10 = (Button) findViewById(R.id.button11);
        vw = new ViewUsers();

        mydb=new DataBase(this);

        if (vw.k == "USER 1") { n=0;
            u="1";
            button1.setEnabled(false);
            button1.setBackgroundColor(Color.DKGRAY);
        } else if (vw.k == "USER 2") { n=1;
            u="2";
            button2.setEnabled(false);
            button2.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 3") {n=2;
            u="3";
            button3.setEnabled(false);
            button3.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 4") {  n=3;
            u="4";
            button4.setEnabled(false);
            button4.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 5") {  n=4;
            u="5";
            button5.setEnabled(false);
            button5.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 6") {   n=5;
            u="6";
            button6.setEnabled(false);
            button6.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 7") {   n=6;
            u="7";
            button7.setEnabled(false);
            button7.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 8") {   n=7;
            u="8";
            button8.setEnabled(false);
            button8.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 9") {   n=8;
            u="9";
            button9.setEnabled(false);
            button9.setBackgroundColor(Color.DKGRAY);

        } else if (vw.k == "USER 10") {    n=9;
            u="10";
            button10.setEnabled(false);
            button10.setBackgroundColor(Color.DKGRAY);

        }
        message1();
    }

    public void message1() {
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 1";
                        b="1";



                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);



                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(0);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();


                            }
                        });
                        builder.show();
                    }
                });
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 2";  b="2";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(1);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();




                            }
                        });
                        builder.show();
                    }
                });
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 3";

                        b="3";




                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(2);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();




                            }
                        });
                        builder.show();
                    }
                });
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 4";  b="4";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(3);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();








                            }
                        });
                        builder.show();
                    }
                });
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 5"; b="5";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(4);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();






                            }
                        });
                        builder.show();
                    }
                });
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 6";  b="6";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(5);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();








                            }
                        });
                        builder.show();
                    }
                });
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 7";   b="7";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(6);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();







                            }
                        });
                        builder.show();
                    }
                });
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 8";   b="8";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(7);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();









                            }
                        });
                        builder.show();
                    }
                });
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 9";   b="9";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(8);
                                long new_credit=Long.parseLong(edittext.getText().toString())+Long.parseLong(res.getString(4));
                                String h=String.valueOf(new_credit);
                                boolean isUpdate = mydb.updateData(b,h);
                                res.moveToPosition(n);
                                long new_credit1=Long.parseLong(res.getString(4))-Long.parseLong(edittext.getText().toString());
                                String h1=String.valueOf(new_credit1);
                                boolean isUpdate1 = mydb.updateData(u,h1);



                                if(isInserted == true&&isUpdate == true&& isUpdate1==true)
                                {
                                    Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                    Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                    startActivity(i1);
                                }
                                else
                                    Toast.makeText(TransferCredits.this,"Data not Inserted",Toast.LENGTH_LONG).show();







                            }
                        });
                        builder.show();
                    }
                });
        button10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l = "USER 10";   b="10";
                        AlertDialog.Builder builder = new AlertDialog.Builder(TransferCredits.this);
                        builder.setCancelable(true);
                        builder.setTitle("CREDITS");
                        builder.setMessage("Enter the credit amount");
                        final EditText edittext = new EditText(TransferCredits.this);
                        builder.setView(edittext);

                        builder.setPositiveButton("Transfer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                boolean isInserted = mydb.insertData2(vw.k,edittext.getText().toString(),l);


                                final Cursor res = mydb.getAllData();
                                res.moveToPosition(9);

                                if(Long.parseLong(edittext.getText().toString())>Long.parseLong(res.getString(4))){
                                    Toast.makeText(TransferCredits.this,"Insufficient credit",Toast.LENGTH_LONG).show();
                                }
                                else {
                                    long new_credit = Long.parseLong(edittext.getText().toString()) + Long.parseLong(res.getString(4));
                                    String h = String.valueOf(new_credit);
                                    boolean isUpdate = mydb.updateData(b, h);
                                    res.moveToPosition(n);
                                    long new_credit1 = Long.parseLong(res.getString(4)) - Long.parseLong(edittext.getText().toString());
                                    String h1 = String.valueOf(new_credit1);
                                    boolean isUpdate1 = mydb.updateData(u, h1);


                                    if (isInserted == true && isUpdate == true && isUpdate1 == true) {
                                        Toast.makeText(TransferCredits.this, "Credits are transferred", Toast.LENGTH_LONG).show();
                                        Intent i1 = new Intent(TransferCredits.this, ViewUsers.class);
                                        startActivity(i1);
                                    } else
                                        Toast.makeText(TransferCredits.this, "Data not Inserted", Toast.LENGTH_LONG).show();


                                }


                            }
                        });
                        builder.show();
                    }
                });
    }





}



