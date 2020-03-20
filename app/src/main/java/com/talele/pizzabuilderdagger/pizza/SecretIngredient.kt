package com.talele.pizzabuilderdagger.pizza

import android.util.Log
import javax.inject.Inject

class SecretIngredient @Inject constructor()
{
    fun addSectreIngredient(pizza : Pizza?) {
        Log.d("MSG", "Secret spice added to pizza")
    }
}