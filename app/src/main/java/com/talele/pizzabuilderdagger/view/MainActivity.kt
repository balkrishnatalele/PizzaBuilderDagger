package com.talele.pizzabuilderdagger.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talele.pizzabuilderdagger.R
import com.talele.pizzabuilderdagger.di.component.DaggerPizzaComponent
import com.talele.pizzabuilderdagger.di.component.PizzaComponent
import com.talele.pizzabuilderdagger.pizza.Pizza
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
@Inject
lateinit var pizza : Pizza                      // 3 - Filed injection. This is called filed injection : we need to add inject(MainActivity) in PizzaComponent to work it properly
//lateinit var pizzaNoFiledInjection : Pizza    // Without filed injection
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pizzaComponent: PizzaComponent = DaggerPizzaComponent.create()
        pizzaComponent.inject(this)
      //  pizzaNoFiledInjection = pizzaComponent.getPizza()
      //  pizzaNoFiledInjection.getPizza()
        pizza.getPizza()
    }
}
