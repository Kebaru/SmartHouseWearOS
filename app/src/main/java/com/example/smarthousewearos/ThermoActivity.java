package com.example.smarthousewearos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.smarthousewearos.databinding.ActivityLightBinding;
import com.example.smarthousewearos.databinding.ActivityThermoBinding;

public class ThermoActivity extends Activity {

    private ActivityThermoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermo);

        binding = ActivityThermoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}