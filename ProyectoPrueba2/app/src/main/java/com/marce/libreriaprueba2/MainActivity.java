package com.marce.libreriaprueba2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.marce.librarytest1.TemperaturaFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager mManager;
    private TemperaturaFragment mFragment;
    private FragmentTransaction mTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mManager = getSupportFragmentManager();
        mFragment = new TemperaturaFragment();
        mTransaction = mManager.beginTransaction();
        mTransaction.replace(R.id.fragment, mFragment);
        mTransaction.commit();
    }
}