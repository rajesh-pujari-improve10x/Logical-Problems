package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityMainBinding;
import com.improve10x.logicalproblems.hoursandminutesintoseconds.HoursAndMinutesIntoSecondsActivity;
import com.improve10x.logicalproblems.minutestoseconds.MinutesToSecondsActivity;
import com.improve10x.logicalproblems.namegreeting.NameGreetingActivity;
import com.improve10x.logicalproblems.twomaketen.TwoMakeTenActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleMinsToSec();
        handleHrsAndMinsIntoSec();
        handleNameGreeting();
        handleTwoMakeTen();
    }

    private void handleMinsToSec() {
        binding.minsToSecondsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MinutesToSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void handleHrsAndMinsIntoSec() {
        binding.hrsAndMinsIntoSecBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, HoursAndMinutesIntoSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void handleNameGreeting() {
        binding.nameGreetingBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NameGreetingActivity.class);
            startActivity(intent);
        });
    }

    private void handleTwoMakeTen() {
        binding.twoMakeTenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TwoMakeTenActivity.class);
            startActivity(intent);
        });
    }
}