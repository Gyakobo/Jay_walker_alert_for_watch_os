package com.example.jay_walker_alert_for_watch_os;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jay_walker_alert_for_watch_os.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Example comment
        // Another example comment

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}