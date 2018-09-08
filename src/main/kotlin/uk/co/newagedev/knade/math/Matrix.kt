package uk.co.newagedev.knade.math

internal interface Mat<M: Mat<M, V, T>, V: Vec<V, T>, T: Number> {
    operator fun plus(mat: M): M
    operator fun minus(mat: M): M
    operator fun times(mat: M): M
    operator fun times(vec: V): V
    operator fun times(sca: T): M
    operator fun div(sca: T): M
}
