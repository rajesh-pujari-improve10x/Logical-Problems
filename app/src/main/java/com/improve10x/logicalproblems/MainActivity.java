package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityMainBinding;
import com.improve10x.logicalproblems.minutestoseconds.MinutesToSecondsActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleMinsToSec();
    }

    private void handleMinsToSec() {
        binding.minsToSecondsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MinutesToSecondsActivity.class);
            startActivity(intent);
        });
    }
}