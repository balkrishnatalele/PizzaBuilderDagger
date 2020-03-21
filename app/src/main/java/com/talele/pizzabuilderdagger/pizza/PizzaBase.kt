package com.talele.pizzabuilderdagger.pizza

import android.util.Log
import com.talele.pizzabuilderdagger.pizza.ingredients.*
import javax.inject.Inject

class PizzaBase @Inject constructor(flour : Flour, yest : Yest,
                                    sugarAndSalt: SugarAndSalt, oilAndWater: OilAndWater)
{
    private var flour : Flour
    private var yest: Yest
    private var sugarAndSalt : SugarAndSalt
    private var oilAndWater : OilAndWater
    init {
        Log.d("MSG","Preparing Pizza base")
        this.flour = flour
        this.yest = yest
        this.sugarAndSalt = sugarAndSalt
        this.oilAndWater = oilAndWater
        this.makeDove()
    }

    fun makeDove()
    {
        Log.d("MSG","Preapering Dove with = "+flour.getFlour()+ " And = "+ yest.getYest())
    }
}
