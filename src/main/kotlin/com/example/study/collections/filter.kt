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

    // first,last
    val first = numbers.first()
    val last = numbers.last()
    println(first)
    println(last)

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }
    println(firstEven)
    println(lastOdd)

    // firstOrNull,lastOrNull
    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val firstNull = empty.firstOrNull()
    val lastNull = empty.lastOrNull()
    println(firstNull)
    println(lastNull)

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.firstOrNull { it.startsWith('z') }
    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }
    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)

    // count
    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }
    println(totalCount)
    println(evenCount)
}