package com.example.smarthousewearos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.smarthousewearos.databinding.ActivityDeviceBinding;

public class DeviceActivity extends Activity {

    private ActivityDeviceBinding binding;
    LinearLayout lightLay;
    LinearLayout thermoLay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDeviceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        lightLay = findViewById(R.id.lightLay);
        thermoLay = findViewById(R.id.thermoLay);

        lightLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DeviceActivity.this, LightActivity.class));
            }
        });

        thermoLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DeviceActivity.this, ThermoActivity.class));
            }
        });
    }
}