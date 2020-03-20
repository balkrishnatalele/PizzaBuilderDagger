package com.talele.pizzabuilderdagger.di.module

import com.talele.pizzabuilderdagger.pizza.interfacewithbind.HawaiianPizza
import com.talele.pizzabuilderdagger.pizza.interfacewithbind.Toppings
import dagger.Binds
import dagger.Module

@Module
/*class HawaiianPizzaModule
{
    @Provides  ///=======this to be changed to binds
    fun provideToppings(hawaiianPizza: HawaiianPizza): Toppings {
        return hawaiianPizza
    }
}*/
//Changing the above to below for binding purpose
//5. Binding interface. This is how we change to binding interface

abstract class HawaiianPizzaModule
{
    @Binds
    abstract fun  bindToppings(hawaiianPizza: HawaiianPizza) : Toppings
}

