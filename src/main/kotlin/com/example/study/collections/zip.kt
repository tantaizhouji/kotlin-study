package com.example.study.collections

fun main() {
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)
    val resultPairs = A zip B
    val resultReduce = A.zip(B) { a, b -> "$a$b" }
    val result = B zip A
    val reduce = B.zip(A) { a, b -> "$a$b" }
    println(resultPairs)
    println(resultReduce)
    println(result)
    println(reduce)

    // getOrElse
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })

    map["x"] = 3
    println(map.getOrElse("x") { 1 })
    map["x"] = null
    println(map.getOrElse("x") { 1 })
}