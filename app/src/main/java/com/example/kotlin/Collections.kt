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
}