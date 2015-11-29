package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.test_key_storage.R;

/**
 * Created by aambros on 27.11.15.
 */
public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button openButton = (Button) findViewById(R.id.button);
        openButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MyPDFActivity.startMyPDFActivity(MainActivity.this);
            }
        });
    }
}
