package com.example.julian.userform;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtFirstName;
    private TextView txtLastName;
    private TextView txtPLZ;
    private TextView txtStreet;
    private TextView txtTown;
    private Button btnSend;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtFirstName = findViewById(R.id.txtFirstname);
        this.txtLastName = findViewById(R.id.txtLastname);
        this.txtPLZ = findViewById(R.id.txtPLZ);
        this.txtStreet = findViewById(R.id.txtStreet);
        this.txtTown = findViewById(R.id.txtTown);
        this.btnSend = findViewById(R.id.btnSend);

        this.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = String.format("Name: %s %s \n PLZ: %s \n Ort: %s \n Straße: %s", txtFirstName.getText(), txtLastName.getText(), txtPLZ.getText(), txtTown.getText(), txtStreet.getText());
                Log.i(TAG, info);
            }
        });

    }
}
