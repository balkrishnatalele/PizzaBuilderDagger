package com.talele.pizzabuilderdagger.pizza.ingredients

import android.util.Log
import javax.inject.Inject

class Flour @Inject constructor()
{
  init {
      Log.d("MSG","Grab the best quality Flour")
  }
    fun getFlour(): String{
        return "Wheat Flour"
    }
}