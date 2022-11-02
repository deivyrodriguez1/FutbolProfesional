package com.example.futbolprofesional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView equipos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        equipos = findViewById(R.id.todos_equipos);

        String[] misEquipos;
        misEquipos = getResources().getStringArray(R.array.equipos);

        ArrayAdapter cargadorEquipos;
        cargadorEquipos = new ArrayAdapter(this, R.layout.equipo, misEquipos);

        //Asociar el listView al adaptador
        equipos.setAdapter(cargadorEquipos);

        //Definir nuestro adaptador como un listener
        equipos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String nombreEquipo;
        nombreEquipo = ((TextView) view).getText().toString();

        //Toast.makeText(getBaseContext(), nombreEquipo, Toast.LENGTH_LONG).show();

        Snackbar.make(findViewById(R.id.todos_equipos), nombreEquipo, Snackbar.LENGTH_LONG).show();
    }
}