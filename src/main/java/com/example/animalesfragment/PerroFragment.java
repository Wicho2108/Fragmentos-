package com.example.animalesfragment;
/// LUIS RICARDO VEGA HERNANDEZ
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PerroFragment extends Fragment {

    public PerroFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(
                R.layout.fragment_perro,
                container,
                false
        );
    }
}