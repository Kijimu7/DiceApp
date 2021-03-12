package com.shunzi.diceapp

class Dice {
    var sides = 6

    fun roll(){
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}