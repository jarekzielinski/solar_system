package com.pl.solarsystem.ui.planet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pl.solarsystem.R;

public class PlanetFragment extends Fragment {

    private PlanetVewModel planetVewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        planetVewModel =
                ViewModelProviders.of(this).get(PlanetVewModel.class);
        View root = inflater.inflate(R.layout.fragment_planet, container, false);
        final TextView textView = root.findViewById(R.id.text_planet);
        planetVewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}