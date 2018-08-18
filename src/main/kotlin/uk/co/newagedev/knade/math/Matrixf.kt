package uk.co.newagedev.knade.math

import kotlin.math.cos
import kotlin.math.sin

data class Mat2f(var m00: Float = 1.0f, var m01: Float = 0.0f, var m10: Float = 0.0f, var m11: Float = 1.0f): Mat<Mat2f, Vec2f, Float> {
    inline var r0: Vec2f
        get() = Vec2f(m00, m10)
        set(value) { m00 = value.x; m10 = value.y }

    inline var r1: Vec2f
        get() = Vec2f(m01, m11)
        set(value) { m01 = value.x; m11 = value.y }

    inline var c0: Vec2f
        get() = Vec2f(m00, m01)
        set(value) { m00 = value.x; m01 = value.y }

    inline var c1: Vec2f
        get() = Vec2f(m10, m11)
        set(value) { m10 = value.x; m11 = value.y }

    override fun plus(mat: Mat2f): Mat2f {
        val matOut = Mat2f()

        matOut.r0 = r0 + mat.r0
        matOut.r1 = r1 + mat.r1

        return matOut
    }

    override fun minus(mat: Mat2f): Mat2f {
        val matOut = Mat2f()

        matOut.r0 = r0 - mat.r0
        matOut.r1 = r1 - mat.r1

        return matOut
    }

    override fun times(mat: Mat2f): Mat2f {
        val matOut = Mat2f()

        matOut.m00 = r0 dot mat.c0
        matOut.m10 = r0 dot mat.c1

        matOut.m01 = r1 dot mat.c0
        matOut.m11 = r1 dot mat.c1

        return matOut
    }

    override fun times(vec: Vec2f): Vec2f {
        val vecOut = Vec2f(0.0f)

        vecOut.x = r0 dot vec
        vecOut.y = r1 dot vec

        return vecOut
    }

    override fun times(sca: Float): Mat2f {
        val matOut = Mat2f()

        matOut.r0 = r0 * sca
        matOut.r1 = r1 * sca

        return matOut
    }

    override fun div(sca: Float): Mat2f {
        val matOut = Mat2f()

        matOut.r0 = r0 / sca
        matOut.r1 = r1 / sca

        return matOut
    }

    companion object {
        fun identity(): Mat2f {
            return Mat2f()
        }
    }
}

data class Mat3f(var m00: Float = 1.0f, var m01: Float = 0.0f, var m02: Float = 0.0f, var m10: Float = 0.0f, var m11: Float = 1.0f, var m12: Float = 0.0f, var m20: Float = 0.0f, var m21: Float = 0.0f, var m22: Float = 1.0f): Mat<Mat3f, Vec3f, Float> {
    inline var translation: Vec3f
        get() = Vec3f(m20, m21, m22)
        set(value) { m20 = value.x; m21 = value.y; m22 = value.z }

    inline var r0: Vec3f
        get() = Vec3f(m00, m10, m20)
        set(value) { m00 = value.x; m10 = value.y; m20 = value.z }

    inline var r1: Vec3f
        get() = Vec3f(m01, m11, m21)
        set(value) { m01 = value.x; m11 = value.y; m21 = value.z }

    inline var r2: Vec3f
        get() = Vec3f(m02, m12, m22)
        set(value) { m02 = value.x; m12 = value.y; m22 = value.z }

    inline var c0: Vec3f
        get() = Vec3f(m00, m01, m02)
        set(value) { m00 = value.x; m01 = value.y; m02 = value.z }

    inline var c1: Vec3f
        get() = Vec3f(m10, m11, m12)
        set(value) { m10 = value.x; m11 = value.y; m12 = value.z }

    inline var c2: Vec3f
        get() = Vec3f(m20, m21, m22)
        set(value) { m20 = value.x; m21 = value.y; m22 = value.z }

    fun translate(vec: Vec3f): Mat3f {
        translation += vec
        return this
    }

    override fun plus(mat: Mat3f): Mat3f {
        val matOut = Mat3f()

        matOut.r0 = r0 + mat.r0
        matOut.r1 = r1 + mat.r1
        matOut.r2 = r2 + mat.r2

        return matOut
    }

    override fun minus(mat: Mat3f): Mat3f {
        val matOut = Mat3f()

        matOut.r0 = r0 - mat.r0
        matOut.r1 = r1 - mat.r1
        matOut.r2 = r2 - mat.r2

        return matOut
    }

    override fun times(mat: Mat3f): Mat3f {
        val matOut = Mat3f()

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

    override fun times(vec: Vec3f): Vec3f {
        val vecOut = Vec3f()

        vecOut.x = r0 dot vec
        vecOut.y = r1 dot vec
        vecOut.z = r2 dot vec

        return vecOut
    }

    override fun times(sca: Float): Mat3f {
        val matOut = Mat3f()

        matOut.r0 = r0 * sca
        matOut.r1 = r1 * sca
        matOut.r2 = r2 * sca

        return matOut
    }

    override fun div(sca: Float): Mat3f {
        val matOut = Mat3f()

        matOut.r0 = r0 / sca
        matOut.r1 = r1 / sca
        matOut.r2 = r2 / sca

        return matOut
    }

    fun rotate(angleInDegrees: Float, vec: Vec3f): Mat3f {
        val mat = Mat3f.rotation(angleInDegrees, vec)

        return mat * this
    }

    companion object {
        fun identity(): Mat3f {
            return Mat3f()
        }

        fun translation(vec: Vec3f): Mat3f {
            return Mat3f(m20 = vec.x, m21 = vec.y, m22 = vec.z)
        }

        fun rotation(angleInDegrees: Float, vec: Vec3f): Mat3f {
            val c = cos(angleInDegrees.toRadians())
            val s = sin(angleInDegrees.toRadians())

            var mat = Mat3f()

            if (vec.x != 0.0f) {
                mat *= vec.x * Mat3f(m11 = c, m21 = -s, m12 = s, m22 = c)
            }

            if (vec.y != 0.0f) {
                mat *= vec.y * Mat3f(m00 = c, m20 = s, m02 = -s, m22 = c)
            }

            if (vec.z != 0.0f) {
                mat *= vec.z * Mat3f(m00 = c, m10 = -s, m01 = s, m11 = c)
            }

            return mat
        }
    }
}

data class Mat4f(var m00: Float = 1.0f, var m01: Float = 0.0f, var m02: Float = 0.0f, var m03: Float = 0.0f, var m10: Float = 0.0f, var m11: Float = 1.0f, var m12: Float = 0.0f, var m13: Float = 0.0f, var m20: Float = 0.0f, var m21: Float = 0.0f, var m22: Float = 1.0f, var m23: Float = 0.0f, var m30: Float = 0.0f, var m31: Float = 0.0f, var m32: Float = 0.0f, var m33: Float = 1.0f): Mat<Mat4f, Vec4f, Float> {
    inline var translation: Vec4f
        get() = Vec4f(m30, m31, m32, m33)
        set(value) { m30 = value.x; m31 = value.y; m32 = value.z; m33 = value.w }

    inline var r0: Vec4f
        get() = Vec4f(m00, m10, m20, m30)
        set(value) { m00 = value.x; m10 = value.y; m20 = value.z; m30 = value.w }

    inline var r1: Vec4f
        get() = Vec4f(m01, m11, m21, m31)
        set(value) { m01 = value.x; m11 = value.y; m21 = value.z; m31 = value.w }

    inline var r2: Vec4f
        get() = Vec4f(m02, m12, m22, m32)
        set(value) { m02 = value.x; m12 = value.y; m22 = value.z; m32 = value.w }

    inline var r3: Vec4f
        get() = Vec4f(m03, m13, m23, m33)
        set(value) { m03 = value.x; m13 = value.y; m23 = value.z; m33 = value.w }

    inline var c0: Vec4f
        get() = Vec4f(m00, m01, m02, m03)
        set(value) { m00 = value.x; m01 = value.y; m02 = value.z; m03 = value.w }

    inline var c1: Vec4f
        get() = Vec4f(m10, m11, m12, m13)
        set(value) { m10 = value.x; m11 = value.y; m12 = value.z; m13 = value.w }

    inline var c2: Vec4f
        get() = Vec4f(m20, m21, m22, m23)
        set(value) { m20 = value.x; m21 = value.y; m22 = value.z; m23 = value.w }

    inline var c3: Vec4f
        get() = Vec4f(m30, m31, m32, m33)
        set(value) { m30 = value.x; m31 = value.y; m32 = value.z; m33 = value.w }

    fun translate(vec: Vec4f): Mat4f {
        translation += vec
        return this
    }

    override fun plus(mat: Mat4f): Mat4f {
        val matOut = Mat4f()

        matOut.r0 = r0 + mat.r0
        matOut.r1 = r1 + mat.r1
        matOut.r2 = r2 + mat.r2
        matOut.r3 = r3 + mat.r3

        return matOut
    }

    override fun minus(mat: Mat4f): Mat4f {
        val matOut = Mat4f()

        matOut.r0 = r0 - mat.r0
        matOut.r1 = r1 - mat.r1
        matOut.r2 = r2 - mat.r2
        matOut.r3 = r3 - mat.r3

        return matOut
    }

    override fun times(mat: Mat4f): Mat4f {
        val matOut = Mat4f()

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

    override fun times(vec: Vec4f): Vec4f {
        val vecOut = Vec4f()

        vecOut.x = r0 dot vec
        vecOut.y = r1 dot vec
        vecOut.z = r2 dot vec
        vecOut.w = r3 dot vec

        return vecOut
    }

    override fun times(sca: Float): Mat4f {
        val matOut = Mat4f()

        matOut.r0 = r0 * sca
        matOut.r1 = r1 * sca
        matOut.r2 = r2 * sca
        matOut.r3 = r3 * sca

        return matOut
    }

    override fun div(sca: Float): Mat4f {
        val matOut = Mat4f()

        matOut.r0 = r0 / sca
        matOut.r1 = r1 / sca
        matOut.r2 = r2 / sca
        matOut.r3 = r3 / sca

        return matOut
    }

    fun rotate(angleInDegrees: Float, vec: Vec3f): Mat4f {
        val mat = Mat4f.rotation(angleInDegrees, vec)

        return mat * this
    }

    companion object {
        fun identity(): Mat4f {
            return Mat4f()
        }

        fun translation(vec: Vec4f): Mat4f {
            return Mat4f(m30 = vec.x, m31 = vec.y, m32 = vec.z, m33 = vec.w)
        }

        fun rotation(angleInDegrees: Float, vec: Vec3f): Mat4f {
            val c = cos(angleInDegrees.toRadians())
            val s = sin(angleInDegrees.toRadians())

            var mat = Mat4f()

            if (vec.x != 0.0f) {
                mat *= vec.x * Mat4f(m11 = c, m21 = -s, m12 = s, m22 = c)
            }

            if (vec.y != 0.0f) {
                mat *= vec.y * Mat4f(m00 = c, m20 = s, m02 = -s, m22 = c)
            }

            if (vec.z != 0.0f) {
                mat *= vec.z * Mat4f(m00 = c, m10 = -s, m01 = s, m11 = c)
            }

            return mat
        }
    }
}
