package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> myPokemons = new ArrayList<>();

        Pokemon p1 = new Pokemon("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        Pokemon p2 = new Pokemon("Clefable",R.drawable.clefable,70,73,483);
        Pokemon p3 = new Pokemon("Nidoqueen",R.drawable.nidoqueen,92,87,505);
        Pokemon p4 = new Pokemon("Charmeleon",R.drawable.charmeleon,64,58,405);
        Pokemon p5 = new Pokemon("Golbat",R.drawable.golbat,80,70,455);

        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);
        myPokemons.add(p5);

        RecyclerView rv = findViewById(R.id.RecyclerView);

        //to organize the recyclerView in the xml
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        //

        PokemonAdapter adapter=new PokemonAdapter(myPokemons,this);
        rv.setAdapter(adapter);

    }


}