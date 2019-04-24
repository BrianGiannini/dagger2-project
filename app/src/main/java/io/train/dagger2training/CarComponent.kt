package io.train.dagger2training

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}