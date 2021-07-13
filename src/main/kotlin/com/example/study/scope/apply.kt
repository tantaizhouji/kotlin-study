package com.example.study.scope

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) = println("A new person ${p.name} was created.")

fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)

    val tom = Person("Tom", 20, "IOS developer")
        .also { writeCreationLog(it) }
}
   