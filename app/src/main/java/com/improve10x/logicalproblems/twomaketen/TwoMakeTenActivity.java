package com.improve10x.logicalproblems.twomaketen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.logicalproblems.databinding.ActivityTwoMakeTenBinding;

public class TwoMakeTenActivity extends AppCompatActivity implements TwoMakeTenView {

    private ActivityTwoMakeTenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwoMakeTenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleResult();
    }

    @Override
    public void handleResult() {
        binding.resultBtn.setOnClickListener(v -> {
            String mText = binding.mTxt.getText().toString();
            String nText = binding.nTxt.getText().toString();
            boolean isTwoMakeTen = false;
            try {
                isTwoMakeTen = new TwoMakeTenControllerImpl().isMakeTen(mText, nText);
                showResult(String.valueOf(isTwoMakeTen));
            } catch (Exception e) {
                e.printStackTrace();
                showResult("Invalid Input");
            }
        });
    }

    @Override
    public void showResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}