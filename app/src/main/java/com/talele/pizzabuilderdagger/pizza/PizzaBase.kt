package com.talele.pizzabuilderdagger.pizza

import android.util.Log
import com.talele.pizzabuilderdagger.pizza.ingredients.Flour
import com.talele.pizzabuilderdagger.pizza.ingredients.SugarAndSalt
import com.talele.pizzabuilderdagger.pizza.ingredients.Yest
import javax.inject.Inject

class PizzaBase @Inject constructor(flour : Flour, yest : Yest, sugarAndSalt: SugarAndSalt)
{
    private var flour : Flour
    private var yest: Yest
    private var sugarAndSalt : SugarAndSalt
    init {
        Log.d("MSG","Preparing Pizza base")
        this.flour = flour
        this.yest = yest
        this.sugarAndSalt = sugarAndSalt
        this.makeDove()
    }

    fun makeDove()
    {
        Log.d("MSG","Preapering Dove with = "+flour.getFlour()+ " And = "+ yest.getYest())
    }
}