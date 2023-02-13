package com.improve10x.logicalproblems.minutestoseconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.logicalproblems.databinding.ActivityMinutesToSecondsBinding;

public class MinutesToSecondsActivity extends AppCompatActivity implements MinsToSecondsView {

    private ActivityMinutesToSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMinutesToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Minutes to Seconds");
        handleConvertSeconds();
    }

    @Override
    public void handleConvertSeconds() {
        binding.convertSecondsBtn.setOnClickListener(v -> {
            String minutes = binding.minutesTxt.getText().toString();
            int seconds = new MinsToSecondsControllerImpl().convertMinsToSeconds(minutes);
            showSeconds(String.valueOf(seconds));
        });
    }

    @Override
    public void showSeconds(String seconds) {
        Toast.makeText(this, seconds, Toast.LENGTH_LONG).show();
    }
}