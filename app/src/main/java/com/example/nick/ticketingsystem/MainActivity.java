package com.example.nick.ticketingsystem;

import android.content.ClipData;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{
    //probably could have done with loop, but too lazy
    private Button A1;
    private Button A2;
    private Button A3;
    private Button A4;
    private Button A5;
    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private Button B5;
    private Button C1;
    private Button C2;
    private Button C3;
    private Button C4;
    private Button C5;
    private Button D1;
    private Button D2;
    private Button D3;
    private Button D4;
    private Button D5;
    private Button E1;
    private Button E2;
    private Button E3;
    private Button E4;
    private Button E5;

    private ArrayList<Button> buttonList = new ArrayList<>(Arrays.asList(A1, A2, A3, A4, A5, B1, B2, B3, B4, B5, C1, C2, C3, C4, C5, D1, D2, D3, D4, D5, E1, E2, E3, E4, E5));


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.A1 = (Button)this.findViewById(R.id.A1);
        this.A2 = (Button)this.findViewById(R.id.A2);
        this.A3 = (Button)this.findViewById(R.id.A3);
        this.A4 = (Button)this.findViewById(R.id.A4);
        this.A5 = (Button)this.findViewById(R.id.A5);
        this.B1 = (Button)this.findViewById(R.id.B1);
        this.B2 = (Button)this.findViewById(R.id.B2);
        this.B3 = (Button)this.findViewById(R.id.B3);
        this.B4 = (Button)this.findViewById(R.id.B4);
        this.B5 = (Button)this.findViewById(R.id.B5);
        this.C1 = (Button)this.findViewById(R.id.C1);
        this.C2 = (Button)this.findViewById(R.id.C2);
        this.C3 = (Button)this.findViewById(R.id.C3);
        this.C4 = (Button)this.findViewById(R.id.C4);
        this.C5 = (Button)this.findViewById(R.id.C5);
        this.D1 = (Button)this.findViewById(R.id.D1);
        this.D2 = (Button)this.findViewById(R.id.D2);
        this.D3 = (Button)this.findViewById(R.id.D3);
        this.D4 = (Button)this.findViewById(R.id.D4);
        this.D5 = (Button)this.findViewById(R.id.D5);
        this.E1 = (Button)this.findViewById(R.id.E1);
        this.E2 = (Button)this.findViewById(R.id.E2);
        this.E3 = (Button)this.findViewById(R.id.E3);
        this.E4 = (Button)this.findViewById(R.id.E4);
        this.E5 = (Button)this.findViewById(R.id.E5);

    }

    public void onClick (View sender)
    {
        switch(sender.getId())
        {
            case R.id.A1:
                A1.setBackgroundColor(Color.RED);
                break;
            case R.id.A2:
                A2.setBackgroundColor(Color.RED);
                break;
            case R.id.A3:
                A3.setBackgroundColor(Color.RED);
                break;
            case R.id.A4:
                A4.setBackgroundColor(Color.RED);
                break;
            case R.id.A5:
                A5.setBackgroundColor(Color.RED);
                break;
            case R.id.B1:
                B1.setBackgroundColor(Color.RED);
                break;
            case R.id.B2:
                B2.setBackgroundColor(Color.RED);
                break;
            case R.id.B3:
                B3.setBackgroundColor(Color.RED);
                break;
            case R.id.B4:
                B4.setBackgroundColor(Color.RED);
                break;
            case R.id.B5:
                B5.setBackgroundColor(Color.RED);
                break;
            case R.id.C1:
                C1.setBackgroundColor(Color.RED);
                break;
            case R.id.C2:
                C2.setBackgroundColor(Color.RED);
                break;
            case R.id.C3:
                C3.setBackgroundColor(Color.RED);
                break;
            case R.id.C4:
                C4.setBackgroundColor(Color.RED);
                break;
            case R.id.C5:
                C5.setBackgroundColor(Color.RED);
                break;
            case R.id.D1:
                D1.setBackgroundColor(Color.RED);
                break;
            case R.id.D2:
                D2.setBackgroundColor(Color.RED);
                break;
            case R.id.D3:
                D3.setBackgroundColor(Color.RED);
                break;
            case R.id.D4:
                D4.setBackgroundColor(Color.RED);
                break;
            case R.id.D5:
                D5.setBackgroundColor(Color.RED);
                break;
            case R.id.E1:
                E1.setBackgroundColor(Color.RED);
                break;
            case R.id.E2:
                E2.setBackgroundColor(Color.RED);
                break;
            case R.id.E3:
                E3.setBackgroundColor(Color.RED);
                break;
            case R.id.E4:
                E4.setBackgroundColor(Color.RED);
                break;
            case R.id.E5:
                E5.setBackgroundColor(Color.RED);
                break;

            default:
                break;


        }
    }




}