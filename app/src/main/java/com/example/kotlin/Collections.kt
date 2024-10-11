package com.example.kotlin

//List adalah kumpulan data yang disusun secara berurutan dari
//List bersifat ordered , artinya data yang di masukkan akan memiliki posisi sesuai urutan
//List bersifat muteable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat di ubah
//list read only menggunakan listof
// list muteable menggunakan muteablelistof

fun ContohList() {
    println("=== List ===")

    //list read only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //list muteable
    val shape: MutableList<String> = mutableListOf("circle","square","triangle")
    println(shape)

    shape.add("circle")
    println(shape)

    shape.remove("circle")
    println(shape)

    shape[0] = "oval"
    println(shape)

    val shapeLocked: List<String> = shape
    println(shapeLocked)
}

//set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik tidak ad duplikasi
//set berisifat unordered artinya data yang dimasukkan tidak memiliki posisi tertentu
//set bersifat muteable dan read only ,artinya data yang di masukkan dapat diubah dan tidak dapat diubah
//set read only menggunakan setOf
//set muteable menggunakan muteablesetof

fun ContohSet(){
    println()
    println("=== Set ===")

    //set read-only
    val readOnlyAbjad = setOf("A","B","C")
    println(readOnlyAbjad)


}