package com.example.kotlin

class Motor()

class Contact(val id: Int,var email: String)

fun main() {
    val contact = Contact(1,"ijal@gmail.com")

    //prints the value of the property: email
    println(contact.email)

    //updates the value of the property: email
    contact.email = "lita@gmail.com"

    //prints the new value of the property: email
    println(contact.email)
}