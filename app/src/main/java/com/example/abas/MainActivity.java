package com.example.abas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.abas.Fragment.EmAltaFragment;
import com.example.abas.Fragment.HomeFragment;
import com.example.abas.Fragment.InscricoesFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.viewPagerTab);
        viewPager = findViewById(R.id.viewPager);

        //Diminuindo a sombra do ActionBar
        getSupportActionBar().setElevation(0);

        // Configurar o Adapter para as abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("home", HomeFragment.class)
                        .add("Inscrições", InscricoesFragment.class)
                        .add("Em Alta", EmAltaFragment.class).create());

        // Configurando o ViewPage - área de conteúdo
        viewPager.setAdapter(adapter);

        // Configurando a abas com o nosso próprio viewPage - área de abas
        smartTabLayout.setViewPager(viewPager);
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
*
* Vamos configurar o Adapter para as abas. O método with() recebe o contexto do layout. O método add()
* adiciona as abas, ele recebe como parametro o nome da aba e o fragment que vai ser carregado ao clicar
* na aba. Entretanto, vamos criar primeiro os Fragments para as abas.
*
* Vamos diminuir a elevação da sombra no actionBar, para isso vamos utilizar o método getSupportActionBar() e
* o método setElevation.
* */