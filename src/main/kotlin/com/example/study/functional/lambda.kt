package com.example.study.functional

fun main() {
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }

    val upperCase2: (String) -> String = { str -> str.uppercase() }

    val upperCase3 = { str: String -> str.uppercase() }

    // 编译器自动推断不了入参类型
//    val upperCase4 = { str -> str.uppercase() }

    val upperCase5: (String) -> String = { it.uppercase() }

    val upperCase6: (String) -> String = String::toUpperCase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}