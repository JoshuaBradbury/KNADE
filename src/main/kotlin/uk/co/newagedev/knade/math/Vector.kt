package uk.co.newagedev.knade.math

import kotlin.math.sqrt

sealed class Vecf<T> {
    abstract operator fun plus(vec: T): T
    abstract operator fun minus(vec: T): T
    abstract operator fun times(sca: Float): T
    abstract operator fun div(sca: Float): T

    abstract fun norm(): T
    abstract fun len(): Float
    abstract infix fun dot(vec: T): Float
}

data class Vec2f(var x: Float, var y: Float): Vecf<Vec2f>() {
    constructor(n: Float): this(n, n)

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }

    override fun plus(vec: Vec2f): Vec2f {
        return Vec2f(x + vec.x, y + vec.y)
    }

    override fun minus(vec: Vec2f): Vec2f {
        return Vec2f(x - vec.x, y - vec.y)
    }

    override fun times(sca: Float): Vec2f {
        return Vec2f(x * sca, y * sca)
    }

    override fun div(sca: Float): Vec2f {
        return Vec2f(x / sca, y / sca)
    }

    override fun norm(): Vec2f {
        val l = len()
        return Vec2f(x / l, y / l)
    }

    override fun len(): Float {
        return sqrt(x * x + y * y)
    }

    override fun dot(vec: Vec2f): Float {
        return vec.x * x + vec.y * y
    }
}

data class Vec3f constructor(var x: Float, var y: Float, var z: Float):Vecf<Vec3f>() {
    constructor(n: Float): this(n, n, n)
    constructor(vec: Vec2f, z: Float): this(vec.x, vec.y, z)
    constructor(x: Float, vec: Vec2f): this(x, vec.x, vec.y)

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }
    inline var b: Float get() = z; set(value) { z = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }
    inline var p: Float get() = z; set(value) { z = value }

    override fun plus(vec: Vec3f): Vec3f {
        return Vec3f(x + vec.x, y + vec.y, z + vec.z)
    }

    override fun minus(vec: Vec3f): Vec3f {
        return Vec3f(x - vec.x, y - vec.y, z - vec.z)
    }

    override fun times(sca: Float): Vec3f {
        return Vec3f(x * sca, y * sca, z * sca)
    }

    override fun div(sca: Float): Vec3f {
        return Vec3f(x / sca, y / sca, z / sca)
    }

    override fun norm(): Vec3f {
        val l = len()
        return Vec3f(x / l, y / l, z / l)
    }

    override fun len(): Float {
        return sqrt(x * x + y * y + z * z)
    }

    override fun dot(vec: Vec3f): Float {
        return vec.x * x + vec.y * y + vec.z * z
    }
}

data class Vec4f(var x: Float, var y: Float, var z: Float, var w: Float): Vecf<Vec4f>() {
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

    override fun plus(vec: Vec4f): Vec4f {
        return Vec4f(x + vec.x, y + vec.y, z + vec.z, w + vec.w)
    }

    override fun minus(vec: Vec4f): Vec4f {
        return Vec4f(x - vec.x, y - vec.y, z - vec.z, w - vec.w)
    }

    override fun times(sca: Float): Vec4f {
        return Vec4f(x * sca, y * sca, z * sca, w * sca)
    }

    override fun div(sca: Float): Vec4f {
        return Vec4f(x / sca, y / sca, z / sca, w / sca)
    }

    override fun norm(): Vec4f {
        val l = len()
        return Vec4f(x / l, y / l, z / l, w / l)
    }

    override fun len(): Float {
        return sqrt(x * x + y * y + z * z + w * w)
    }

    override fun dot(vec: Vec4f): Float {
        return vec.x * x + vec.y * y + vec.z * z + vec.w * w
    }
}