package com.tunebrains.jitpackaar.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.tunebrains.libwrapper.Wrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view = findViewById(R.id.text);
        view.setText(Wrapper.wrap());
    }
}
