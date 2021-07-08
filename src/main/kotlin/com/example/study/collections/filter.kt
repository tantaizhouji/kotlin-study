package com.example.study.collections

fun main() {
    // filter
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }
    println(positives)
    println(negatives)

    // map
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }
    println(doubled)
    println(tripled)

    // any
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }
    println(anyNegative)
    println(anyGT6)

    // all
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    println(allEven)
    println(allLess6)

    // none
    val allNone = numbers.none { it % 2 == 1 }
    val noneGT6 = numbers.none { it > 6 }
    println(allNone)
    println(noneGT6)
}