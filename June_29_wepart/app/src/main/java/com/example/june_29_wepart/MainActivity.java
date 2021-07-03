package com.example.june_29_we part;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mtvDummy;
    private Button mBtnchangeText;
    private Button mbtnTwo;
    private Button mbtnThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Dipu","onCreate");
        mBtnchangeText=findViewById(R.id.btnChangetext);
        mtvDummy=findViewById(R.id.tvDummy);

        mBtnchangeText.setOnClickListener(this);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Dipu","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Dipu","Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Dipu","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Dipu","onPause");
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Dipu","onSaveInstanceState");
        outState.putString("Key", (String) mtvDummy.getText());

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Dipu","onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Dipu","onRestoreInstanceState");
        String data=savedInstanceState.getString("Key");
        mtvDummy.setText(data);
    }


    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.btnChangetext:

                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.tvDummy:
                Toast.makeText(MainActivity.this,mtvDummy.getText(), Toast.LENGTH_SHORT).show();

        }
    }
}