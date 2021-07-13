package com.example.study.collections

data class Person(val name: String, val city: String, val phone: String)

fun main() {
    val people = listOf(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)
    val peopleCities = people.groupBy(Person::city, Person::name)
    val lastPersonCity = people.associateBy(Person::city, Person::name)
    println(phoneBook)
    println(cityBook)
    println(cityBook)
    println(peopleCities)
    println(lastPersonCity)

    // partition
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }
    println(evenOdd)
    println(positives)
    println(negatives)

    // flatMap
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatten()
    println(mapBag)
    println(flatMapBag)

    // minOrNull,maxOrNull
    val sums = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)
    println("Numbers: $sums, min = ${sums.minOrNull()} max = ${sums.maxOrNull()}")
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")
}