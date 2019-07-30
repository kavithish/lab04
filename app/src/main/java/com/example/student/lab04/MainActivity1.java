package com.example.student.lab04;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

//        Context context = getApplicationContext();
//        CharSequence text = "Hello Toast !";
//        int duration = Toast.LENGTH_LONG;
//
//        Toast toast = Toast.makeText(context,text,duration);
//        toast.setGravity(Gravity.TOP,0,0);
//        toast.show();

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.layout1,(ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.textView2);
        text.setText("This is a custom Toast ");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
