package uk.co.newagedev.knade.math

import kotlin.math.sqrt

data class Vec2i(var x: Int, var y: Int): Vec<Vec2i, Int> {
    constructor(n: Int = 0): this(n, n)

    var r: Int get() = x; set(value) { x = value }
    var g: Int get() = y; set(value) { y = value }

    var s: Int get() = x; set(value) { x = value }
    var t: Int get() = y; set(value) { y = value }

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

    var r: Int get() = x; set(value) { x = value }
    var g: Int get() = y; set(value) { y = value }
    var b: Int get() = z; set(value) { z = value }

    var s: Int get() = x; set(value) { x = value }
    var t: Int get() = y; set(value) { y = value }
    var p: Int get() = z; set(value) { z = value }

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

    var r: Int get() = x; set(value) { x = value }
    var g: Int get() = y; set(value) { y = value }
    var b: Int get() = z; set(value) { z = value }
    var a: Int get() = w; set(value) { w = value }

    var s: Int get() = x; set(value) { x = value }
    var t: Int get() = y; set(value) { y = value }
    var p: Int get() = z; set(value) { z = value }
    var q: Int get() = w; set(value) { w = value }

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