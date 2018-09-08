package uk.co.newagedev.knade.math

import kotlin.math.sqrt

data class Vec2d(var x: Double, var y: Double): Vec<Vec2d, Double> {
    constructor(n: Double = 0.0): this(n, n)

    var r: Double get() = x; set(value) { x = value }
    var g: Double get() = y; set(value) { y = value }

    var s: Double get() = x; set(value) { x = value }
    var t: Double get() = y; set(value) { y = value }

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

    var r: Double get() = x; set(value) { x = value }
    var g: Double get() = y; set(value) { y = value }
    var b: Double get() = z; set(value) { z = value }

    var s: Double get() = x; set(value) { x = value }
    var t: Double get() = y; set(value) { y = value }
    var p: Double get() = z; set(value) { z = value }

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

    var r: Double get() = x; set(value) { x = value }
    var g: Double get() = y; set(value) { y = value }
    var b: Double get() = z; set(value) { z = value }
    var a: Double get() = w; set(value) { w = value }

    var s: Double get() = x; set(value) { x = value }
    var t: Double get() = y; set(value) { y = value }
    var p: Double get() = z; set(value) { z = value }
    var q: Double get() = w; set(value) { w = value }

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