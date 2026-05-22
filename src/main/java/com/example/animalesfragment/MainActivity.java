package com.example.animalesfragment;
/// LUIS RICARDO VEGA HERNANDEZ
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    String[] animales = {
            "Gato",
            "Perro",
            "Vaca"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listaAnimales);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,
                        animales
                );

        lista.setAdapter(adapter);

        lista.setOnItemClickListener((parent, view, position, id) -> {

            Fragment fragment = null;

            switch(position){

                case 0:
                    fragment = new GatoFragment();
                    break;

                case 1:
                    fragment = new PerroFragment();
                    break;

                case 2:
                    fragment = new VacaFragment();
                    break;
            }

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(
                            R.id.contenedorFragment,
                            fragment
                    )
                    .commit();
        });
    }
}

/// LUIS RICARDO VEGA HERNANDEZ
