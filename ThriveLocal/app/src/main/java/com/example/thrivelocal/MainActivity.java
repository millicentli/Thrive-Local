package com.example.thrivelocal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scanner scan = null;
        try {
            scan = new Scanner(new InputStreamReader(getAssets().open("ListofGoodsExcel.csv")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        scan.useDelimiter("[,\n]");

    }
}
