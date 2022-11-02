package com.example.futbolprofesional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InfoEquipo extends AppCompatActivity {

    WebView paginaEquipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_equipo);
        paginaEquipo = findViewById(R.id.paginaEquipo);

        String url = "";
        paginaEquipo.setWebViewClient(new WebViewClient());
        paginaEquipo.loadUrl(url);

    }
}