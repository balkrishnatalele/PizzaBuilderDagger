package com.talele.pizzabuilderdagger.pizza.interfacewithbind

import android.util.Log
import javax.inject.Inject
//2 - Constructor inject with Component and Provider
/*class Toppings @Inject constructor()
{
    init {
        Log.d("MSG","Her for toppings")
    }
    fun fillPizzaWithToppings() : String{
        return "Cheese Tomato Chillies saus"
    }
}
 */

interface Toppings
{
    fun specialToppings()
}