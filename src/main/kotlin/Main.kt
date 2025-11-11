package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//personlaized greeting
fun main() {
    val name = "Arin"
    println("Enter your name: ")

    val color = "Blue"
    println("Enter your favorite color: ")

    println("Hello $name! I see your favorite color is $color.")

    //Age in a Decade
    val age = 25
    println("Enter your current age: ")

    val futureAge = age + 10
    println("In 10 years, you will be $futureAge years old.")

    //Even or Odd
    val number = 7
    println("Enter a number: ")

    val result = if (number % 2 == 0) "even" else "odd"
    println("The number $number is $result.")

    //String Reverser
    val input = "Kotlin is fun"
    println("Enter a string: ")

    val reversed = input.reversed()
    println("Reversed string: $reversed")

    //The Classic FizzBuzz
    println("Starting FizzBuzz from 1 to 100:")

    for (i in 1..100) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }

    //Sum of Numbers
    val n = 10
    println("Enter a number: ")

    if (n >= 1) {
        var sum = 0
        for (i in 1..n) {
            sum += i
        }
        println("The sum of numbers from 1 to $n is $sum.")
    } else {
        println("Invalid input. Please enter a positive integer.")
    }
}
















