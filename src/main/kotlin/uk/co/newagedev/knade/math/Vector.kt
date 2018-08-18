package uk.co.newagedev.knade.math

interface Vec<V, T> {
    operator fun plus(vec: V): V
    operator fun minus(vec: V): V
    operator fun times(sca: T): V
    operator fun div(sca: T): V

    fun norm(): V
    fun len(): T
    infix fun dot(vec: V): T

    fun toArray(): Array<T>
    fun toList(): List<T>
    fun toMutableList(): MutableList<T>
    fun toArrayList(): ArrayList<T>
}