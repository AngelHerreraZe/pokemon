package com.example.objetos

import android.annotation.SuppressLint
import android.widget.Toast
import android.widget.Toast.makeText
import com.example.objetos.MainActivity.Companion.maincontext

open class Pokemon (protected var name:String = "pok",
                    protected var attackPower:Float = 30f,
                    protected var life: Float = 100f): thanks(){

    @SuppressLint("NotConstructor")
    fun Pokemon (n:String, aP: Float){
        this.name = n
        this.attackPower = aP
        this.life = 100f
        this.sayHi()
    }

    internal fun getName():String {return this.name}
    internal fun getAttackPower():Float {return this.attackPower}
    internal fun getLife():Float {return this.life}
    internal fun setLife(l: Float){this.life = l}

    fun sayHi() { makeText(maincontext, "Hola!!! Soy $name", Toast.LENGTH_LONG).show() }

    fun cure(){this.life = 100f}
    fun evolve (n: String){
        this.name = n
        this.attackPower *= 1.20f
        this.sayHi()
    }
    open fun attack(){ makeText(maincontext, "Al ataque", Toast.LENGTH_LONG).show() }
}

class Waterpokemon(n:String = "pok", aP: Float = 30f, l:Float = 100f): Pokemon(n, aP, l){
    private var maxResistence: Int = 500
    private var submergedTime: Int = 0

    //public var life: Float = 100f

    @SuppressLint("NotConstructor")
    fun Waterpokemon(n: String, aP: Float, mR: Int){
        this.name = n
        this.attackPower = aP
        this.life = 100f
        this.maxResistence = mR
        this.sayHi()

    }
    fun breathe() { this.submergedTime = 0 }
    fun immers() { this.submergedTime++ }

    override fun attack() {
        makeText(maincontext, "Ataque de chorro", Toast.LENGTH_LONG).show()
        super.attack()
    }
}

class Firepokemon(n: String = "pok", aP: Float = 30f, l: Float = 100f): Pokemon(n, aP, l){
    private var ballTemperature: Int = 90
    @SuppressLint("NotConstructor")
    fun Firepokemon(n: String, aP: Float, bT: Int){
        this.name = n
        this.attackPower = aP
        this.life = 100f
        this.ballTemperature = bT
        this.sayHi()
    }

    override fun attack() {
        makeText(maincontext, "Bola de fuego", Toast.LENGTH_LONG).show()
        super.attack()
    }
}

class Earthpokemon(n: String = "pok", aP: Float = 30f, l:Float = 100f): Pokemon(n, aP, l){
    private var depth: Int = 150

    @SuppressLint("NotConstructor")
    fun Earthpokemon(n: String, aP : Float, d: Int){
        this.name = n
        this.attackPower = aP
        this.life = 100f
        this.depth = d
        this.sayHi()
    }

    fun digTunnel (){
        Toast.makeText(maincontext, "Cabaré un tunnel de ${this.depth}m de profundidad",Toast.LENGTH_LONG).show()
    }

    override fun attack() {
        super.attack()
    }
}

abstract class thanks(){
    fun thanksCure(){ Toast.makeText(maincontext,"Gracias por curarme!", Toast.LENGTH_LONG).show()}
}