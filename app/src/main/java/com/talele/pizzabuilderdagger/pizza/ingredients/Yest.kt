package com.talele.pizzabuilderdagger.pizza.ingredients

import android.util.Log
import javax.inject.Inject

class Yest @Inject constructor()
{
  init {
      Log.d("MSG","Here for yest")
  }

    fun getYest() : String{
        return "Yest from west"
    }
}