package com.example.abas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.viewPagerTab);
        viewPager = findViewById(R.id.viewPager);
    }
}

/*
*  Vamos utilizar as bibliotecas do SmartTabLayout para criar as abas para o nosso projeto. No gitHub
* existe uma pequena documentação exemplificando e explicando as possibilidades de layouts com
* utilização de abas - link abaixo
*
* https://github.com/ogaclejapan/SmartTabLayout/tree/master/demo
*
* Vamos criar referencias para os componentes SmartTabLayout e PageView no MainActivity.java
* */