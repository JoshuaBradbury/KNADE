package uk.co.newagedev.knade.math

import kotlin.math.sqrt

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

data class Vec2f(var x: Float, var y: Float): Vec<Vec2f, Float> {
    constructor(n: Float = 0.0f): this(n, n)

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }

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

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }
    inline var b: Float get() = z; set(value) { z = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }
    inline var p: Float get() = z; set(value) { z = value }

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

    inline var r: Float get() = x; set(value) { x = value }
    inline var g: Float get() = y; set(value) { y = value }
    inline var b: Float get() = z; set(value) { z = value }
    inline var a: Float get() = w; set(value) { w = value }

    inline var s: Float get() = x; set(value) { x = value }
    inline var t: Float get() = y; set(value) { y = value }
    inline var p: Float get() = z; set(value) { z = value }
    inline var q: Float get() = w; set(value) { w = value }

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

data class Vec2d(var x: Double, var y: Double): Vec<Vec2d, Double> {
    constructor(n: Double = 0.0): this(n, n)

    inline var r: Double get() = x; set(value) { x = value }
    inline var g: Double get() = y; set(value) { y = value }

    inline var s: Double get() = x; set(value) { x = value }
    inline var t: Double get() = y; set(value) { y = value }

    override fun plus(vec: Vec2d) = Vec2d(x + vec.x, y + vec.y)
    override fun minus(vec: Vec2d) = Vec2d(x - vec.x, y - vec.y)
    override fun times(sca: Double) = Vec2d(x * sca, y * sca)
    override fun div(sca: Double) = Vec2d(x / sca, y / sca)

    override fun toArray() = arrayOf(x, y)
    override fun toList() = listOf(x, y)
    override fun toMutableList() = mutableListOf(x, y)
    override fun toArrayList() = arrayListOf(x, y)

    override fun norm() = Vec2d(x / len(), y / len())
    override fun len() = sqrt(x * x + y * y)
    override fun dot(vec: Vec2d) = vec.x * x + vec.y * y
}

data class Vec3d constructor(var x: Double, var y: Double, var z: Double): Vec<Vec3d, Double> {
    constructor(n: Double = 0.0): this(n, n, n)
    constructor(vec: Vec2d, z: Double = 0.0): this(vec.x, vec.y, z)
    constructor(x: Double, vec: Vec2d): this(x, vec.x, vec.y)

    inline var r: Double get() = x; set(value) { x = value }
    inline var g: Double get() = y; set(value) { y = value }
    inline var b: Double get() = z; set(value) { z = value }

    inline var s: Double get() = x; set(value) { x = value }
    inline var t: Double get() = y; set(value) { y = value }
    inline var p: Double get() = z; set(value) { z = value }

    override fun plus(vec: Vec3d) = Vec3d(x + vec.x, y + vec.y, z + vec.z)
    override fun minus(vec: Vec3d) = Vec3d(x - vec.x, y - vec.y, z - vec.z)
    override fun times(sca: Double) = Vec3d(x * sca, y * sca, z * sca)
    override fun div(sca: Double) = Vec3d(x / sca, y / sca, z / sca)

    override fun toArray() = arrayOf(x, y, z)
    override fun toList() = listOf(x, y, z)
    override fun toMutableList() = mutableListOf(x, y, z)
    override fun toArrayList() = arrayListOf(x, y, z)

    override fun norm() = Vec3d(x / len(), y / len(), z / len())
    override fun len() = sqrt(x * x + y * y + z * z)
    override fun dot(vec: Vec3d) = vec.x * x + vec.y * y + vec.z * z

    infix fun cross(vec: Vec3d) = Vec3d(y * vec.z - z * vec.y, z * vec.x - x * vec.z, x * vec.y - y * vec.x)
}

data class Vec4d(var x: Double, var y: Double, var z: Double, var w: Double): Vec<Vec4d, Double> {
    constructor(n: Double = 0.0): this(n, n, n, n)
    constructor(vec: Vec3d, w: Double = 0.0): this(vec.x, vec.y, vec.z, w)
    constructor(x: Double, vec: Vec3d): this(x, vec.x, vec.y, vec.z)
    constructor(vec: Vec2d, z: Double = 0.0, w: Double = 0.0): this(vec.x, vec.y, z, w)
    constructor(x: Double, vec: Vec2d, w: Double = 0.0): this(x, vec.x, vec.y, w)
    constructor(x: Double, y: Double, vec: Vec2d): this(x, y, vec.x, vec.y)

    inline var r: Double get() = x; set(value) { x = value }
    inline var g: Double get() = y; set(value) { y = value }
    inline var b: Double get() = z; set(value) { z = value }
    inline var a: Double get() = w; set(value) { w = value }

    inline var s: Double get() = x; set(value) { x = value }
    inline var t: Double get() = y; set(value) { y = value }
    inline var p: Double get() = z; set(value) { z = value }
    inline var q: Double get() = w; set(value) { w = value }

    override fun plus(vec: Vec4d) = Vec4d(x + vec.x, y + vec.y, z + vec.z, w + vec.w)
    override fun minus(vec: Vec4d) = Vec4d(x - vec.x, y - vec.y, z - vec.z, w - vec.w)
    override fun times(sca: Double) = Vec4d(x * sca, y * sca, z * sca, w * sca)
    override fun div(sca: Double) = Vec4d(x / sca, y / sca, z / sca, w / sca)

    override fun toArray() = arrayOf(x, y, z, w)
    override fun toList() = listOf(x, y, z, w)
    override fun toMutableList() = mutableListOf(x, y, z, w)
    override fun toArrayList() = arrayListOf(x, y, z, w)

    override fun norm() = Vec4d(x / len(), y / len(), z / len(), w / len())
    override fun len() = sqrt(x * x + y * y + z * z + w * w)
    override fun dot(vec: Vec4d) = vec.x * x + vec.y * y + vec.z * z + vec.w * w
}

data class Vec2i(var x: Int, var y: Int): Vec<Vec2i, Int> {
    constructor(n: Int = 0): this(n, n)

    inline var r: Int get() = x; set(value) { x = value }
    inline var g: Int get() = y; set(value) { y = value }

    inline var s: Int get() = x; set(value) { x = value }
    inline var t: Int get() = y; set(value) { y = value }

    override fun plus(vec: Vec2i) = Vec2i(x + vec.x, y + vec.y)
    override fun minus(vec: Vec2i) = Vec2i(x - vec.x, y - vec.y)
    override fun times(sca: Int) = Vec2i(x * sca, y * sca)
    override fun div(sca: Int) = Vec2i(x / sca, y / sca)

    override fun toArray() = arrayOf(x, y)
    override fun toList() = listOf(x, y)
    override fun toMutableList() = mutableListOf(x, y)
    override fun toArrayList() = arrayListOf(x, y)

    override fun norm() = Vec2i(x / len(), y / len())
    override fun len() = sqrt((x * x + y * y).toDouble()).toInt()
    override fun dot(vec: Vec2i) = vec.x * x + vec.y * y
}

data class Vec3i constructor(var x: Int, var y: Int, var z: Int): Vec<Vec3i, Int> {
    constructor(n: Int = 0): this(n, n, n)
    constructor(vec: Vec2i, z: Int = 0): this(vec.x, vec.y, z)
    constructor(x: Int, vec: Vec2i): this(x, vec.x, vec.y)

    inline var r: Int get() = x; set(value) { x = value }
    inline var g: Int get() = y; set(value) { y = value }
    inline var b: Int get() = z; set(value) { z = value }

    inline var s: Int get() = x; set(value) { x = value }
    inline var t: Int get() = y; set(value) { y = value }
    inline var p: Int get() = z; set(value) { z = value }

    override fun plus(vec: Vec3i) = Vec3i(x + vec.x, y + vec.y, z + vec.z)
    override fun minus(vec: Vec3i) = Vec3i(x - vec.x, y - vec.y, z - vec.z)
    override fun times(sca: Int) = Vec3i(x * sca, y * sca, z * sca)
    override fun div(sca: Int) = Vec3i(x / sca, y / sca, z / sca)

    override fun toArray() = arrayOf(x, y, z)
    override fun toList() = listOf(x, y, z)
    override fun toMutableList() = mutableListOf(x, y, z)
    override fun toArrayList() = arrayListOf(x, y, z)

    override fun norm() = Vec3i(x / len(), y / len(), z / len())
    override fun len() = sqrt((x * x + y * y + z * z).toDouble()).toInt()
    override fun dot(vec: Vec3i) = vec.x * x + vec.y * y + vec.z * z

    infix fun cross(vec: Vec3i) = Vec3i(y * vec.z - z * vec.y, z * vec.x - x * vec.z, x * vec.y - y * vec.x)
}

data class Vec4i(var x: Int, var y: Int, var z: Int, var w: Int): Vec<Vec4i, Int> {
    constructor(n: Int = 0): this(n, n, n, n)
    constructor(vec: Vec3i, w: Int = 0): this(vec.x, vec.y, vec.z, w)
    constructor(x: Int, vec: Vec3i): this(x, vec.x, vec.y, vec.z)
    constructor(vec: Vec2i, z: Int = 0, w: Int = 0): this(vec.x, vec.y, z, w)
    constructor(x: Int, vec: Vec2i, w: Int = 0): this(x, vec.x, vec.y, w)
    constructor(x: Int, y: Int, vec: Vec2i): this(x, y, vec.x, vec.y)

    inline var r: Int get() = x; set(value) { x = value }
    inline var g: Int get() = y; set(value) { y = value }
    inline var b: Int get() = z; set(value) { z = value }
    inline var a: Int get() = w; set(value) { w = value }

    inline var s: Int get() = x; set(value) { x = value }
    inline var t: Int get() = y; set(value) { y = value }
    inline var p: Int get() = z; set(value) { z = value }
    inline var q: Int get() = w; set(value) { w = value }

    override fun plus(vec: Vec4i) = Vec4i(x + vec.x, y + vec.y, z + vec.z, w + vec.w)
    override fun minus(vec: Vec4i) = Vec4i(x - vec.x, y - vec.y, z - vec.z, w - vec.w)
    override fun times(sca: Int) = Vec4i(x * sca, y * sca, z * sca, w * sca)
    override fun div(sca: Int) = Vec4i(x / sca, y / sca, z / sca, w / sca)

    override fun toArray() = arrayOf(x, y, z, w)
    override fun toList() = listOf(x, y, z, w)
    override fun toMutableList() = mutableListOf(x, y, z, w)
    override fun toArrayList() = arrayListOf(x, y, z, w)

    override fun norm() = Vec4i(x / len(), y / len(), z / len(), w / len())
    override fun len() = sqrt((x * x + y * y + z * z + w * w).toDouble()).toInt()
    override fun dot(vec: Vec4i) = vec.x * x + vec.y * y + vec.z * z + vec.w * w
}