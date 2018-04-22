package uk.co.newagedev.knade.math

sealed class Vecf<T> {
    abstract operator fun plus(vec: T): T
    abstract operator fun minus(vec: T): T
    abstract operator fun times(sca: Float): T
    abstract operator fun div(sca: Float): T

    abstract operator fun rangeTo(vec: T)
    abstract operator fun contains(sca: Float): Boolean

    // Normalise
    abstract operator fun not(): Vecf<T>
    // Length
    abstract operator fun invoke(): Vecf<T>

    abstract infix fun dot(vec: T): Float
}

data class Vec2f(var x: Float, var y: Float) {
    constructor(n: Float): this(n, n)

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }
}

data class Vec3f constructor(var x: Float, var y: Float, var z: Float) {
    constructor(n: Float): this(n, n, n)
    constructor(vec: Vec2f, z: Float): this(vec.x, vec.y, z)
    constructor(x: Float, vec: Vec2f): this(x, vec.x, vec.y)

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }
    inline var b: Float get() = z; set(value) { z = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }
    inline var p: Float get() = z; set(value) { z = value }
}

data class Vec4f(var x: Float, var y: Float, var z: Float, var w: Float) {
    constructor(n: Float): this(n, n, n, n)
    constructor(vec: Vec3f, w: Float): this(vec.x, vec.y, vec.z, w)
    constructor(x: Float, vec: Vec3f): this(x, vec.x, vec.y, vec.z)
    constructor(vec: Vec2f, z: Float, w: Float): this(vec.x, vec.y, z, w)
    constructor(x: Float, vec: Vec2f, w: Float): this(x, vec.x, vec.y, w)
    constructor(x: Float, y: Float, vec: Vec2f): this(x, y, vec.x, vec.y)

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }
    inline var b: Float get() = z; set(value) { z = value }
    inline var a: Float get() = w; set(value) { w = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }
    inline var p: Float get() = z; set(value) { z = value }
    inline var q: Float get() = w; set(value) { w = value }
}