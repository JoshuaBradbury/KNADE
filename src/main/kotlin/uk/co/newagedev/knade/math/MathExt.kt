package uk.co.newagedev.knade.math

import kotlin.math.PI

fun Float.toRadians(): Float {
    return this * PI.toFloat() / 180.0f
}

fun Double.toRadians(): Double {
    return this * PI / 180.0
}

operator fun Float.times(mat: Mat2f): Mat2f {
    return mat * this
}

operator fun Float.times(mat: Mat3f): Mat3f {
    return mat * this
}

operator fun Float.times(mat: Mat4f): Mat4f {
    return mat * this
}

operator fun Double.times(mat: Mat2d): Mat2d {
    return mat * this
}

operator fun Double.times(mat: Mat3d): Mat3d {
    return mat * this
}

operator fun Double.times(mat: Mat4d): Mat4d {
    return mat * this
}
