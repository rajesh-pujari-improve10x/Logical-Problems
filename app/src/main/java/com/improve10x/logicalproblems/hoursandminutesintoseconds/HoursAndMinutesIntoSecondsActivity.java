package com.improve10x.logicalproblems.hoursandminutesintoseconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.logicalproblems.R;
import com.improve10x.logicalproblems.databinding.ActivityHoursAndMinutesIntoSecondsBinding;

public class HoursAndMinutesIntoSecondsActivity extends AppCompatActivity implements HrsAndMinsToSecondsView {

    private ActivityHoursAndMinutesIntoSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHoursAndMinutesIntoSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleHrsAndMinsToSec();
    }

    @Override
    public void handleHrsAndMinsToSec() {
        binding.hrsAndMinsToSecBtn.setOnClickListener(v -> {
            String hrs = binding.hrsTxt.getText().toString();
            String mins = binding.minsTxt.getText().toString();
            int seconds = 0;
            try {
                seconds = new HrsAndMinsToSecondsControllerImpl().convertHrsAndMinsToSeconds(hrs, mins);
                showSeconds(String.valueOf(seconds));
            } catch (Exception e) {
                e.printStackTrace();
                showSeconds("Invalid Input");
            }
        });
    }

    @Override
    public void showSeconds(String seconds) {
        Toast.makeText(this, seconds + " Seconds", Toast.LENGTH_LONG).show();
    }
}