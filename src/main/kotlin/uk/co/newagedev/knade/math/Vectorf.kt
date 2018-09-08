package uk.co.newagedev.knade.math

import kotlin.math.sqrt

data class Vec2f(var x: Float, var y: Float): Vec<Vec2f, Float> {
    constructor(n: Float = 0.0f): this(n, n)

    var r: Float get() = x; set(value) { x = value }
    var g: Float get() = y; set(value) { y = value }

    var s: Float get() = x; set(value) { x = value }
    var t: Float get() = y; set(value) { y = value }

    override fun plus(vec: Vec2f) = Vec2f(x + vec.x, y + vec.y)
    override fun minus(vec: Vec2f) = Vec2f(x - vec.x, y - vec.y)
    override fun times(sca: Float) = Vec2f(x * sca, y * sca)
    override fun div(sca: Float) = Vec2f(x / sca, y / sca)

    override fun toArray() = arrayOf(x, y)
    override fun toList() = listOf(x, y)
    override fun toMutableList() = mutableListOf(x, y)
    override fun toArrayList() = arrayListOf(x, y)

    override fun norm() = Vec2f(x / len(), y / len())
    override fun len() = sqrt(x * x + y * y)
    override fun dot(vec: Vec2f) = vec.x * x + vec.y * y
}

data class Vec3f constructor(var x: Float, var y: Float, var z: Float): Vec<Vec3f, Float> {
    constructor(n: Float = 0.0f): this(n, n, n)
    constructor(vec: Vec2f, z: Float = 0.0f): this(vec.x, vec.y, z)
    constructor(x: Float, vec: Vec2f): this(x, vec.x, vec.y)

    var r: Float get() = x; set(value) { x = value }
    var g: Float get() = y; set(value) { y = value }
    var b: Float get() = z; set(value) { z = value }

    var s: Float get() = x; set(value) { x = value }
    var t: Float get() = y; set(value) { y = value }
    var p: Float get() = z; set(value) { z = value }

    override fun plus(vec: Vec3f) = Vec3f(x + vec.x, y + vec.y, z + vec.z)
    override fun minus(vec: Vec3f) = Vec3f(x - vec.x, y - vec.y, z - vec.z)
    override fun times(sca: Float) = Vec3f(x * sca, y * sca, z * sca)
    override fun div(sca: Float) = Vec3f(x / sca, y / sca, z / sca)

    override fun toArray() = arrayOf(x, y, z)
    override fun toList() = listOf(x, y, z)
    override fun toMutableList() = mutableListOf(x, y, z)
    override fun toArrayList() = arrayListOf(x, y, z)

    override fun norm() = Vec3f(x / len(), y / len(), z / len())
    override fun len() = sqrt(x * x + y * y + z * z)
    override fun dot(vec: Vec3f) = vec.x * x + vec.y * y + vec.z * z

    infix fun cross(vec: Vec3f) = Vec3f(y * vec.z - z * vec.y, z * vec.x - x * vec.z, x * vec.y - y * vec.x)
}

data class Vec4f(var x: Float, var y: Float, var z: Float, var w: Float): Vec<Vec4f, Float> {
    constructor(n: Float = 0.0f): this(n, n, n, n)
    constructor(vec: Vec3f, w: Float = 0.0f): this(vec.x, vec.y, vec.z, w)
    constructor(x: Float, vec: Vec3f): this(x, vec.x, vec.y, vec.z)
    constructor(vec: Vec2f, z: Float = 0.0f, w: Float = 0.0f): this(vec.x, vec.y, z, w)
    constructor(x: Float, vec: Vec2f, w: Float = 0.0f): this(x, vec.x, vec.y, w)
    constructor(x: Float, y: Float, vec: Vec2f): this(x, y, vec.x, vec.y)

    var r: Float get() = x; set(value) { x = value }
    var g: Float get() = y; set(value) { y = value }
    var b: Float get() = z; set(value) { z = value }
    var a: Float get() = w; set(value) { w = value }

    var s: Float get() = x; set(value) { x = value }
    var t: Float get() = y; set(value) { y = value }
    var p: Float get() = z; set(value) { z = value }
    var q: Float get() = w; set(value) { w = value }

    override fun plus(vec: Vec4f) = Vec4f(x + vec.x, y + vec.y, z + vec.z, w + vec.w)
    override fun minus(vec: Vec4f) = Vec4f(x - vec.x, y - vec.y, z - vec.z, w - vec.w)
    override fun times(sca: Float) = Vec4f(x * sca, y * sca, z * sca, w * sca)
    override fun div(sca: Float) = Vec4f(x / sca, y / sca, z / sca, w / sca)

    override fun toArray() = arrayOf(x, y, z, w)
    override fun toList() = listOf(x, y, z, w)
    override fun toMutableList() = mutableListOf(x, y, z, w)
    override fun toArrayList() = arrayListOf(x, y, z, w)

    override fun norm() = Vec4f(x / len(), y / len(), z / len(), w / len())
    override fun len() = sqrt(x * x + y * y + z * z + w * w)
    override fun dot(vec: Vec4f) = vec.x * x + vec.y * y + vec.z * z + vec.w * w
}