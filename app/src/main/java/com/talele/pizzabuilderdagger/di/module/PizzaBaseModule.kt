package com.talele.pizzabuilderdagger.di.module

import com.talele.pizzabuilderdagger.pizza.*
import com.talele.pizzabuilderdagger.pizza.ingredients.Flour
import com.talele.pizzabuilderdagger.pizza.ingredients.OilAndWater
import com.talele.pizzabuilderdagger.pizza.ingredients.SugarAndSalt
import com.talele.pizzabuilderdagger.pizza.ingredients.Yest
import dagger.Module
import dagger.Provides

@Module
class PizzaBaseModule
{
    @Provides
    fun provideFlour() : Flour
    {
        return Flour()
    }

    @Provides
    fun provideOilAndWater() : OilAndWater
    {
        return OilAndWater()
    }

    @Provides
    fun provideYest() : Yest
    {
        return Yest()
    }
    @Provides
    fun provideSugarAndSalt() : SugarAndSalt
    {
        return SugarAndSalt()
    }
    @Provides
    fun providePizzaBase(flour: Flour, sugarAndSalt: SugarAndSalt, yest: Yest, oilAndWater: OilAndWater): PizzaBase {
        return PizzaBase(flour,yest,sugarAndSalt, oilAndWater)
    }
}