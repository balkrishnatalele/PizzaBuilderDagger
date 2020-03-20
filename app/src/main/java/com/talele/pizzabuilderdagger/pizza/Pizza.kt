package com.talele.pizzabuilderdagger.pizza

import android.util.Log
import com.talele.pizzabuilderdagger.pizza.interfacewithbind.Toppings
import javax.inject.Inject
// 2 - Constructor inject with Component and Provider
class Pizza @Inject constructor(pizzaBase : PizzaBase, toppings: Toppings)
{
    private var pizzaBase : PizzaBase
    private var toppings : Toppings   // initially topping was simple class - later we will chnage it to interface to see bind
    init {
        this.pizzaBase = pizzaBase
        this.toppings = toppings
    }
// 4 - Method injection. This is how we inject Method
    @Inject
    fun enableTheTaseofSpice(secretIngredient: SecretIngredient) {
        secretIngredient.addSectreIngredient(this)
    }

    fun getPizza()
    {
        //Log.d("MSG","Adding topping on the dove= "+this.toppings.fillPizzaWithToppings())
        toppings.specialToppings()
        Log.d("MSG","Grab a hot Pizza!!!")
    }
}