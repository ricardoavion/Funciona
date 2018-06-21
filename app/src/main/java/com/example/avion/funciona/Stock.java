package com.example.avion.funciona;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.avion.funciona.Adapters.StockAdapter;
import com.example.avion.funciona.Entities.Item;

import java.util.ArrayList;

public class Stock extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        ArrayList<Item> item_list = new ArrayList<Item>();
        item_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "$50.00", R.drawable.chikorita));
        item_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        item_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));
        item_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "50.00", R.drawable.chikorita));
        item_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        item_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));

        RecyclerView contenedor = (RecyclerView) findViewById(R.id.recycler_stock);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new StockAdapter(item_list));
        contenedor.setLayoutManager(layout);

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent stock_intent = new Intent(Stock.this, AddItemStock.class);
                    startActivity(stock_intent);
                }
            });
        }
    }


