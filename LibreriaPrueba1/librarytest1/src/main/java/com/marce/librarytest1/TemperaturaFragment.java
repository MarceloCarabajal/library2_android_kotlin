package com.marce.librarytest1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TemperaturaFragment extends Fragment {
    private Button mCalcular;
    private EditText mTemperatura;

    public TemperaturaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_temperatura, container, false);
        mCalcular = v.findViewById(R.id.resultado);
        mTemperatura = v.findViewById(R.id.temperatura);
        mCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double temperatura = Double.parseDouble(mTemperatura.getText().toString());
                mTemperatura.setText(Double.toString((temperatura*9/5)+32));
            }
        });
        return v;
    }
}