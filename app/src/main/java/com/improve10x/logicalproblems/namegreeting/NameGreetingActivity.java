package com.improve10x.logicalproblems.namegreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.logicalproblems.databinding.ActivityNameGreetingActivityBinding;

public class NameGreetingActivity extends AppCompatActivity implements NameGreetingView{

    private ActivityNameGreetingActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNameGreetingActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleClick();
    }

    @Override
    public void handleClick() {
        binding.clickBtn.setOnClickListener(v -> {
            String name = binding.textTxt.getText().toString();
            String helloName = new NameGreetingControllerImpl().strNameGreeting(name);
            showString(helloName);
        });
    }

    @Override
    public void showString(String name) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
    }
}