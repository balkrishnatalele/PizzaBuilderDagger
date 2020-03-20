package com.talele.pizzabuilderdagger.pizza.ingredients

import android.util.Log
import javax.inject.Inject

class SugarAndSalt @Inject constructor()
{
    init {
        Log.d("MSG","Add Salt and sugar as per taste!")
    }
}