package com.example.study.collections

import kotlin.math.abs

fun main() {
    val shuffled = listOf(5, 4, 2, 3, 1, -10)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { abs(it) }
    println("natural: $natural")
    println("inverted: $inverted")
    println("descending: $descending")
    println("descendingBy: $descendingBy")

    // map element access
    val map = mapOf("key" to 42)
    val value1 = map["key"]
    val value2 = map["key2"]
    val value3: Int = map.getValue("key")
    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")
    println("value1: $value1")
    println("value2: $value2")
    println("value3: $value3")
    println("value4: $value4")

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
}