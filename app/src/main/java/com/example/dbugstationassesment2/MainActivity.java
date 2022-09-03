package com.example.dbugstationassesment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.dbugstationassesment2.adapters.ImageAdapter;
import com.example.dbugstationassesment2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ImageAdapter imageAdapter;

    int[] images = {R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r,
            R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        imageAdapter = new ImageAdapter(images);
        binding.rvId.setLayoutManager(new GridLayoutManager(this, 2,
                GridLayoutManager.HORIZONTAL, false));
        binding.rvId.setAdapter(imageAdapter);

    }
}