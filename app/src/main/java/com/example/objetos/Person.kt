package com.example.objetos

import android.annotation.SuppressLint

open class Person(var name: String = "Anonimo", var passport: String? = null): thanks() {
    var alive: Boolean = true

    @SuppressLint("NotConstructor")
    fun Person(){
        name = "Angel"
        passport = "W987654"
    }

    fun die(){alive = false}
}

class AthLete (name: String, passport: String?, var sport: String): Person(name, passport)