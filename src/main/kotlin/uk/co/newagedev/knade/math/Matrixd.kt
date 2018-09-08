package uk.co.newagedev.knade.math

import kotlin.math.cos
import kotlin.math.sin

data class Mat2d(var m00: Double = 1.0, var m01: Double = 0.0, var m10: Double = 0.0, var m11: Double = 1.0): Mat<Mat2d, Vec2d, Double> {
    var r0: Vec2d
        get() = Vec2d(m00, m10)
        set(value) { m00 = value.x; m10 = value.y }

    var r1: Vec2d
        get() = Vec2d(m01, m11)
        set(value) { m01 = value.x; m11 = value.y }

    var c0: Vec2d
        get() = Vec2d(m00, m01)
        set(value) { m00 = value.x; m01 = value.y }

    var c1: Vec2d
        get() = Vec2d(m10, m11)
        set(value) { m10 = value.x; m11 = value.y }

    override fun plus(mat: Mat2d): Mat2d {
        val matOut = Mat2d()

        matOut.r0 = r0 + mat.r0
        matOut.r1 = r1 + mat.r1

        return matOut
    }

    override fun minus(mat: Mat2d): Mat2d {
        val matOut = Mat2d()

        matOut.r0 = r0 - mat.r0
        matOut.r1 = r1 - mat.r1

        return matOut
    }

    override fun times(mat: Mat2d): Mat2d {
        val matOut = Mat2d()

        matOut.m00 = r0 dot mat.c0
        matOut.m10 = r0 dot mat.c1

        matOut.m01 = r1 dot mat.c0
        matOut.m11 = r1 dot mat.c1

        return matOut
    }

    override fun times(vec: Vec2d): Vec2d {
        val vecOut = Vec2d()

        vecOut.x = r0 dot vec
        vecOut.y = r1 dot vec

        return vecOut
    }

    override fun times(sca: Double): Mat2d {
        val matOut = Mat2d()

        matOut.r0 = r0 * sca
        matOut.r1 = r1 * sca

        return matOut
    }

    override fun div(sca: Double): Mat2d {
        val matOut = Mat2d()

        matOut.r0 = r0 / sca
        matOut.r1 = r1 / sca

        return matOut
    }

    companion object {
        fun identity(): Mat2d {
            return Mat2d()
        }
    }
}

data class Mat3d(var m00: Double = 1.0, var m01: Double = 0.0, var m02: Double = 0.0, var m10: Double = 0.0, var m11: Double = 1.0, var m12: Double = 0.0, var m20: Double = 0.0, var m21: Double = 0.0, var m22: Double = 1.0): Mat<Mat3d, Vec3d, Double> {
    var translation: Vec3d
        get() = Vec3d(m20, m21, m22)
        set(value) { m20 = value.x; m21 = value.y; m22 = value.z }

    var r0: Vec3d
        get() = Vec3d(m00, m10, m20)
        set(value) { m00 = value.x; m10 = value.y; m20 = value.z }

    var r1: Vec3d
        get() = Vec3d(m01, m11, m21)
        set(value) { m01 = value.x; m11 = value.y; m21 = value.z }

    var r2: Vec3d
        get() = Vec3d(m02, m12, m22)
        set(value) { m02 = value.x; m12 = value.y; m22 = value.z }

    var c0: Vec3d
        get() = Vec3d(m00, m01, m02)
        set(value) { m00 = value.x; m01 = value.y; m02 = value.z }

    var c1: Vec3d
        get() = Vec3d(m10, m11, m12)
        set(value) { m10 = value.x; m11 = value.y; m12 = value.z }

    var c2: Vec3d
        get() = Vec3d(m20, m21, m22)
        set(value) { m20 = value.x; m21 = value.y; m22 = value.z }

    fun translate(vec: Vec3d): Mat3d {
        translation += vec
        return this
    }

    override fun plus(mat: Mat3d): Mat3d {
        val matOut = Mat3d()

        matOut.r0 = r0 + mat.r0
        matOut.r1 = r1 + mat.r1
        matOut.r2 = r2 + mat.r2

        return matOut
    }

    override fun minus(mat: Mat3d): Mat3d {
        val matOut = Mat3d()

        matOut.r0 = r0 - mat.r0
        matOut.r1 = r1 - mat.r1
        matOut.r2 = r2 - mat.r2

        return matOut
    }

    override fun times(mat: Mat3d): Mat3d {
        val matOut = Mat3d()

        matOut.m00 = r0 dot mat.c0
        matOut.m01 = r1 dot mat.c0
        matOut.m02 = r2 dot mat.c0

        matOut.m10 = r0 dot mat.c1
        matOut.m11 = r1 dot mat.c1
        matOut.m12 = r2 dot mat.c1

        matOut.m20 = r0 dot mat.c2
        matOut.m21 = r1 dot mat.c2
        matOut.m22 = r2 dot mat.c2

        return matOut
    }

    override fun times(vec: Vec3d): Vec3d {
        val vecOut = Vec3d()

        vecOut.x = r0 dot vec
        vecOut.y = r1 dot vec
        vecOut.z = r2 dot vec

        return vecOut
    }

    override fun times(sca: Double): Mat3d {
        val matOut = Mat3d()

        matOut.r0 = r0 * sca
        matOut.r1 = r1 * sca
        matOut.r2 = r2 * sca

        return matOut
    }

    override fun div(sca: Double): Mat3d {
        val matOut = Mat3d()

        matOut.r0 = r0 / sca
        matOut.r1 = r1 / sca
        matOut.r2 = r2 / sca

        return matOut
    }

    fun rotate(angleInDegrees: Double, vec: Vec3d): Mat3d {
        val mat = Mat3d.rotation(angleInDegrees, vec)

        return mat * this
    }

    companion object {
        fun identity(): Mat3d {
            return Mat3d()
        }

        fun translation(vec: Vec3d): Mat3d {
            return Mat3d(m20 = vec.x, m21 = vec.y, m22 = vec.z)
        }

        fun rotation(angleInDegrees: Double, vec: Vec3d): Mat3d {
            val c = cos(angleInDegrees.toRadians())
            val s = sin(angleInDegrees.toRadians())

            var mat = Mat3d()

            if (vec.x != 0.0) {
                mat *= vec.x * Mat3d(m11 = c, m21 = -s, m12 = s, m22 = c)
            }

            if (vec.y != 0.0) {
                mat *= vec.y * Mat3d(m00 = c, m20 = s, m02 = -s, m22 = c)
            }

            if (vec.z != 0.0) {
                mat *= vec.z * Mat3d(m00 = c, m10 = -s, m01 = s, m11 = c)
            }

            return mat
        }
    }
}

data class Mat4d(var m00: Double = 1.0, var m01: Double = 0.0, var m02: Double = 0.0, var m03: Double = 0.0, var m10: Double = 0.0, var m11: Double = 1.0, var m12: Double = 0.0, var m13: Double = 0.0, var m20: Double = 0.0, var m21: Double = 0.0, var m22: Double = 1.0, var m23: Double = 0.0, var m30: Double = 0.0, var m31: Double = 0.0, var m32: Double = 0.0, var m33: Double = 1.0): Mat<Mat4d, Vec4d, Double> {
    var translation: Vec4d
        get() = Vec4d(m30, m31, m32, m33)
        set(value) {
            m30 = value.x; m31 = value.y; m32 = value.z; m33 = value.w
        }

    var r0: Vec4d
        get() = Vec4d(m00, m10, m20, m30)
        set(value) {
            m00 = value.x; m10 = value.y; m20 = value.z; m30 = value.w
        }

    var r1: Vec4d
        get() = Vec4d(m01, m11, m21, m31)
        set(value) {
            m01 = value.x; m11 = value.y; m21 = value.z; m31 = value.w
        }

    var r2: Vec4d
        get() = Vec4d(m02, m12, m22, m32)
        set(value) {
            m02 = value.x; m12 = value.y; m22 = value.z; m32 = value.w
        }

    var r3: Vec4d
        get() = Vec4d(m03, m13, m23, m33)
        set(value) {
            m03 = value.x; m13 = value.y; m23 = value.z; m33 = value.w
        }

    var c0: Vec4d
        get() = Vec4d(m00, m01, m02, m03)
        set(value) {
            m00 = value.x; m01 = value.y; m02 = value.z; m03 = value.w
        }

    var c1: Vec4d
        get() = Vec4d(m10, m11, m12, m13)
        set(value) {
            m10 = value.x; m11 = value.y; m12 = value.z; m13 = value.w
        }

    var c2: Vec4d
        get() = Vec4d(m20, m21, m22, m23)
        set(value) {
            m20 = value.x; m21 = value.y; m22 = value.z; m23 = value.w
        }

    var c3: Vec4d
        get() = Vec4d(m30, m31, m32, m33)
        set(value) {
            m30 = value.x; m31 = value.y; m32 = value.z; m33 = value.w
        }

    fun translate(vec: Vec4d): Mat4d {
        translation += vec
        return this
    }

    override fun plus(mat: Mat4d): Mat4d {
        val matOut = Mat4d()

        matOut.r0 = r0 + mat.r0
        matOut.r1 = r1 + mat.r1
        matOut.r2 = r2 + mat.r2
        matOut.r3 = r3 + mat.r3

        return matOut
    }

    override fun minus(mat: Mat4d): Mat4d {
        val matOut = Mat4d()

        matOut.r0 = r0 - mat.r0
        matOut.r1 = r1 - mat.r1
        matOut.r2 = r2 - mat.r2
        matOut.r3 = r3 - mat.r3

        return matOut
    }

    override fun times(mat: Mat4d): Mat4d {
        val matOut = Mat4d()

        matOut.m00 = r0 dot mat.c0
        matOut.m01 = r1 dot mat.c0
        matOut.m02 = r2 dot mat.c0
        matOut.m03 = r3 dot mat.c0

        matOut.m10 = r0 dot mat.c1
        matOut.m11 = r1 dot mat.c1
        matOut.m12 = r2 dot mat.c1
        matOut.m13 = r3 dot mat.c1

        matOut.m20 = r0 dot mat.c2
        matOut.m21 = r1 dot mat.c2
        matOut.m22 = r2 dot mat.c2
        matOut.m23 = r3 dot mat.c2

        matOut.m30 = r0 dot mat.c3
        matOut.m31 = r1 dot mat.c3
        matOut.m32 = r2 dot mat.c3
        matOut.m33 = r3 dot mat.c3

        return matOut
    }

    override fun times(vec: Vec4d): Vec4d {
        val vecOut = Vec4d()

        vecOut.x = r0 dot vec
        vecOut.y = r1 dot vec
        vecOut.z = r2 dot vec
        vecOut.w = r3 dot vec

        return vecOut
    }

    override fun times(sca: Double): Mat4d {
        val matOut = Mat4d()

        matOut.r0 = r0 * sca
        matOut.r1 = r1 * sca
        matOut.r2 = r2 * sca
        matOut.r3 = r3 * sca

        return matOut
    }

    override fun div(sca: Double): Mat4d {
        val matOut = Mat4d()

        matOut.r0 = r0 / sca
        matOut.r1 = r1 / sca
        matOut.r2 = r2 / sca
        matOut.r3 = r3 / sca

        return matOut
    }

    fun rotate(angleInDegrees: Double, vec: Vec3d): Mat4d {
        val mat = Mat4d.rotation(angleInDegrees, vec)

        return mat * this
    }

    companion object {
        fun identity(): Mat4d {
            return Mat4d()
        }

        fun translation(vec: Vec4d): Mat4d {
            return Mat4d(m30 = vec.x, m31 = vec.y, m32 = vec.z, m33 = vec.w)
        }

        fun rotation(angleInDegrees: Double, vec: Vec3d): Mat4d {
            val c = cos(angleInDegrees.toRadians())
            val s = sin(angleInDegrees.toRadians())

            var mat = Mat4d()

            if (vec.x != 0.0) {
                mat *= vec.x * Mat4d(m11 = c, m21 = -s, m12 = s, m22 = c)
            }

            if (vec.y != 0.0) {
                mat *= vec.y * Mat4d(m00 = c, m20 = s, m02 = -s, m22 = c)
            }

            if (vec.z != 0.0) {
                mat *= vec.z * Mat4d(m00 = c, m10 = -s, m01 = s, m11 = c)
            }

            return mat
        }
    }
}