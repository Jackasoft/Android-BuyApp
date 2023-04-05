package com.example.buym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView cardViewHome, cardViewDelivery, cardViewOrders, cardViewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewHome = (CardView) findViewById(R.id.home);
        cardViewDelivery = (CardView) findViewById(R.id.delivery);
        cardViewOrders = (CardView) findViewById(R.id.orders);
        cardViewAccount = (CardView) findViewById(R.id.account);

        cardViewHome.setOnClickListener(this);
        cardViewDelivery.setOnClickListener(this);
        cardViewOrders.setOnClickListener(this);
        cardViewAccount.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.home:
                i = new Intent(this,Home.class);
                startActivity(i);
                break;
            case R.id.delivery:
                i = new Intent(this,Delivery.class);
                startActivity(i);
                break;
            case R.id.orders:
                i = new Intent(this,Orders.class);
                startActivity(i);
                break;
            case R.id.account:
                i = new Intent(this,Account.class);
                startActivity(i);
                break;
        }

    }
}