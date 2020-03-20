package com.talele.pizzabuilderdagger.di.component

import com.talele.pizzabuilderdagger.di.module.HawaiianPizzaModule
import com.talele.pizzabuilderdagger.di.module.PizzaBaseModule
import com.talele.pizzabuilderdagger.pizza.Pizza
import com.talele.pizzabuilderdagger.view.MainActivity
import dagger.Component

@Component( modules = [PizzaBaseModule::class, HawaiianPizzaModule::class])
interface PizzaComponent
{
    fun getPizza() : Pizza
    fun inject(target : MainActivity)
}