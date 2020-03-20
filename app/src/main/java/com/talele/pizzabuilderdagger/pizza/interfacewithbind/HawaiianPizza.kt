package com.talele.pizzabuilderdagger.pizza.interfacewithbind

import android.util.Log
import javax.inject.Inject

class HawaiianPizza @Inject constructor(): Toppings
{
    override fun specialToppings()
    {
        Log.d("MSG","HawaiianPizza toppings")
    }
}