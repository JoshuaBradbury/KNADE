package uk.co.newagedev.knade.math

import kotlin.math.cos
import kotlin.math.sin
import kotlin.test.*

class MatrixfTest {

    @Test
    fun createMat2fWithSpecificValues() {
        val mat = Mat2f(7.5f, 6.2f, -11.2f, 5.1f)

        assertEquals(7.5f, mat.m00)
        assertEquals(6.2f, mat.m01)

        assertEquals(-11.2f, mat.m10)
        assertEquals(5.1f, mat.m11)

        val mat2 = Mat2f()

        assertEquals(1.0f, mat2.m00)
        assertEquals(0.0f, mat2.m01)

        assertEquals(0.0f, mat2.m10)
        assertEquals(1.0f, mat2.m11)

        mat2.m00 = 7.5f
        mat2.m01 = 6.2f

        mat2.m10 = -11.2f
        mat2.m11 = 5.1f

        assertEquals(7.5f, mat2.m00)
        assertEquals(6.2f, mat2.m01)

        assertEquals(-11.2f, mat2.m10)
        assertEquals(5.1f, mat2.m11)

        mat2.c0 = Vec2f(6.2f, 7.5f)
        mat2.c1 = Vec2f(5.1f, -11.2f)

        assertEquals(6.2f, mat2.m00)
        assertEquals(7.5f, mat2.m01)

        assertEquals(5.1f, mat2.m10)
        assertEquals(-11.2f, mat2.m11)
    }

    @Test
    fun createMat3fWithSpecificValues() {
        val mat = Mat3f(7.5f, 6.2f, 4.5f, -11.2f, 5.1f, -9.1f, 8.52f, 16.2f, 3.33f)

        assertEquals(7.5f, mat.m00)
        assertEquals(6.2f, mat.m01)
        assertEquals(4.5f, mat.m02)

        assertEquals(-11.2f, mat.m10)
        assertEquals(5.1f, mat.m11)
        assertEquals(-9.1f, mat.m12)

        assertEquals(8.52f, mat.m20)
        assertEquals(16.2f, mat.m21)
        assertEquals(3.33f, mat.m22)

        val mat2 = Mat3f()

        assertEquals(1.0f, mat2.m00)
        assertEquals(0.0f, mat2.m01)
        assertEquals(0.0f, mat2.m02)

        assertEquals(0.0f, mat2.m10)
        assertEquals(1.0f, mat2.m11)
        assertEquals(0.0f, mat2.m12)

        assertEquals(0.0f, mat2.m20)
        assertEquals(0.0f, mat2.m21)
        assertEquals(1.0f, mat2.m22)

        mat2.m00 = 7.5f
        mat2.m01 = 6.2f
        mat2.m02 = 4.5f

        mat2.m10 = -11.2f
        mat2.m11 = 5.1f
        mat2.m12 = -9.1f

        mat2.m20 = 8.52f
        mat2.m21 = 16.2f
        mat2.m22 = 3.33f

        assertEquals(7.5f, mat2.m00)
        assertEquals(6.2f, mat2.m01)
        assertEquals(4.5f, mat2.m02)

        assertEquals(-11.2f, mat2.m10)
        assertEquals(5.1f, mat2.m11)
        assertEquals(-9.1f, mat2.m12)

        assertEquals(8.52f, mat2.m20)
        assertEquals(16.2f, mat2.m21)
        assertEquals(3.33f, mat2.m22)

        mat2.c0 = Vec3f(4.5f, 6.2f, 7.5f)
        mat2.c1 = Vec3f(-9.1f, 5.1f, -11.2f)
        mat2.c2 = Vec3f(3.33f, 16.2f, 8.52f)

        assertEquals(7.5f, mat2.m02)
        assertEquals(6.2f, mat2.m01)
        assertEquals(4.5f, mat2.m00)

        assertEquals(-11.2f, mat2.m12)
        assertEquals(5.1f, mat2.m11)
        assertEquals(-9.1f, mat2.m10)

        assertEquals(8.52f, mat2.m22)
        assertEquals(16.2f, mat2.m21)
        assertEquals(3.33f, mat2.m20)
    }

    @Test
    fun createMat4fWithSpecificValues() {
        val mat = Mat4f(7.5f, 6.2f, 4.5f, 12.3f, -11.2f, 5.1f, -9.1f, 7f, 8.52f, 16.2f, 3.33f, 12.23f, 17f, 15f, -120f, -60.5f)

        assertEquals(7.5f, mat.m00)
        assertEquals(6.2f, mat.m01)
        assertEquals(4.5f, mat.m02)
        assertEquals(12.3f, mat.m03)

        assertEquals(-11.2f, mat.m10)
        assertEquals(5.1f, mat.m11)
        assertEquals(-9.1f, mat.m12)
        assertEquals(7f, mat.m13)

        assertEquals(8.52f, mat.m20)
        assertEquals(16.2f, mat.m21)
        assertEquals(3.33f, mat.m22)
        assertEquals(12.23f, mat.m23)

        assertEquals(17f, mat.m30)
        assertEquals(15f, mat.m31)
        assertEquals(-120f, mat.m32)
        assertEquals(-60.5f, mat.m33)

        val mat2 = Mat4f()

        assertEquals(1.0f, mat2.m00)
        assertEquals(0.0f, mat2.m01)
        assertEquals(0.0f, mat2.m02)
        assertEquals(0.0f, mat2.m03)

        assertEquals(0.0f, mat2.m10)
        assertEquals(1.0f, mat2.m11)
        assertEquals(0.0f, mat2.m12)
        assertEquals(0.0f, mat2.m13)

        assertEquals(0.0f, mat2.m20)
        assertEquals(0.0f, mat2.m21)
        assertEquals(1.0f, mat2.m22)
        assertEquals(0.0f, mat2.m23)

        assertEquals(0.0f, mat2.m30)
        assertEquals(0.0f, mat2.m31)
        assertEquals(0.0f, mat2.m32)
        assertEquals(1.0f, mat2.m33)

        mat2.m00 = 7.5f
        mat2.m01 = 6.2f
        mat2.m02 = 4.5f
        mat2.m03 = 12.3f

        mat2.m10 = -11.2f
        mat2.m11 = 5.1f
        mat2.m12 = -9.1f
        mat2.m13 = 7f

        mat2.m20 = 8.52f
        mat2.m21 = 16.2f
        mat2.m22 = 3.33f
        mat2.m23 = 12.23f

        mat2.m30 = 17f
        mat2.m31 = 15f
        mat2.m32 = -120f
        mat2.m33 = -60.5f

        assertEquals(7.5f, mat2.m00)
        assertEquals(6.2f, mat2.m01)
        assertEquals(4.5f, mat2.m02)
        assertEquals(12.3f, mat2.m03)

        assertEquals(-11.2f, mat2.m10)
        assertEquals(5.1f, mat2.m11)
        assertEquals(-9.1f, mat2.m12)
        assertEquals(7f, mat2.m13)

        assertEquals(8.52f, mat2.m20)
        assertEquals(16.2f, mat2.m21)
        assertEquals(3.33f, mat2.m22)
        assertEquals(12.23f, mat2.m23)

        assertEquals(17f, mat2.m30)
        assertEquals(15f, mat2.m31)
        assertEquals(-120f, mat2.m32)
        assertEquals(-60.5f, mat2.m33)

        mat2.c0 = Vec4f(12.3f, 4.5f, 6.2f, 7.5f)
        mat2.c1 = Vec4f(7f, -9.1f, 5.1f, -11.2f)
        mat2.c2 = Vec4f(12.23f, 3.33f, 16.2f, 8.52f)
        mat2.c3 = Vec4f(-60.5f, -120f, 15f, 17f)

        assertEquals(7.5f, mat2.m03)
        assertEquals(6.2f, mat2.m02)
        assertEquals(4.5f, mat2.m01)
        assertEquals(12.3f, mat2.m00)

        assertEquals(-11.2f, mat2.m13)
        assertEquals(5.1f, mat2.m12)
        assertEquals(-9.1f, mat2.m11)
        assertEquals(7f, mat2.m10)

        assertEquals(8.52f, mat2.m23)
        assertEquals(16.2f, mat2.m22)
        assertEquals(3.33f, mat2.m21)
        assertEquals(12.23f, mat2.m20)

        assertEquals(17f, mat2.m33)
        assertEquals(15f, mat2.m32)
        assertEquals(-120f, mat2.m31)
        assertEquals(-60.5f, mat2.m30)
    }

    @Test
    fun readMat2fValuesUsingRowAndColumns() {
        val mat = Mat2f(7.5f, 6.2f, -11.2f, 5.1f)
        val r0 = Vec2f(7.5f, -11.2f)
        val r1 = Vec2f(6.2f, 5.1f)
        val c0 = Vec2f(7.5f, 6.2f)
        val c1 = Vec2f(-11.2f, 5.1f)

        assertEquals(r0, mat.r0)
        assertEquals(r1, mat.r1)

        assertEquals(c0, mat.c0)
        assertEquals(c1, mat.c1)
    }

    @Test
    fun readMat3fValuesUsingRowAndColumns() {
        val mat = Mat3f(7.5f, 6.2f, 4.5f, -11.2f, 5.1f, -9.1f, 8.52f, 16.2f, 3.33f)
        val r0 = Vec3f(7.5f, -11.2f, 8.52f)
        val r1 = Vec3f(6.2f, 5.1f, 16.2f)
        val r2 = Vec3f(4.5f, -9.1f, 3.33f)
        val c0 = Vec3f(7.5f, 6.2f, 4.5f)
        val c1 = Vec3f(-11.2f, 5.1f, -9.1f)
        val c2 = Vec3f(8.52f, 16.2f, 3.33f)

        assertEquals(r0, mat.r0)
        assertEquals(r1, mat.r1)
        assertEquals(r2, mat.r2)

        assertEquals(c0, mat.c0)
        assertEquals(c1, mat.c1)
        assertEquals(c2, mat.c2)
    }

    @Test
    fun readMat4fValuesUsingRowAndColumns() {
        val mat = Mat4f(7.5f, 6.2f, 4.5f, 12.3f, -11.2f, 5.1f, -9.1f, 7f, 8.52f, 16.2f, 3.33f, 12.23f, 17f, 15f, -120f, -60.5f)
        val r0 = Vec4f(7.5f, -11.2f, 8.52f, 17f)
        val r1 = Vec4f(6.2f, 5.1f, 16.2f, 15f)
        val r2 = Vec4f(4.5f, -9.1f, 3.33f, -120f)
        val r3 = Vec4f(12.3f, 7f, 12.23f, -60.5f)
        val c0 = Vec4f(7.5f, 6.2f, 4.5f, 12.3f)
        val c1 = Vec4f(-11.2f, 5.1f, -9.1f, 7f)
        val c2 = Vec4f(8.52f, 16.2f, 3.33f, 12.23f)
        val c3 = Vec4f(17f, 15f, -120f, -60.5f)

        assertEquals(r0, mat.r0)
        assertEquals(r1, mat.r1)
        assertEquals(r2, mat.r2)
        assertEquals(r3, mat.r3)

        assertEquals(c0, mat.c0)
        assertEquals(c1, mat.c1)
        assertEquals(c2, mat.c2)
        assertEquals(c3, mat.c3)
    }

    @Test
    fun mat2fEqualsMat2f() {
        val mat = Mat2f(1.0f, 2.0f, 3.0f, 4.0f)
        val mat2 = Mat2f(2.0f)
        val mat3 = Mat2f()
        val mat4 = Mat2f(1.0f, 2.0f)
        val mat5: Any = Mat3f()
        val mat6 = Mat2f(1.0f, 2.0f, 3.0f)

        assertEquals(mat, mat)
        assertNotEquals(mat, mat2)
        assertNotEquals(mat, mat3)
        assertNotEquals(mat, mat4)
        assertNotEquals(mat, mat5)
        assertNotEquals(mat, mat6)

        assertNotNull(mat.hashCode())

        assertEquals(mat.m00, mat.component1())
        assertEquals(mat.m01, mat.component2())
        assertEquals(mat.m10, mat.component3())
        assertEquals(mat.m11, mat.component4())
    }

    @Test
    fun mat3fEqualsMat3f() {
        val mat = Mat3f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)
        val mat2 = Mat3f(2.0f)
        val mat3 = Mat3f()
        val mat4 = Mat3f(1.0f, 2.0f)
        val mat5: Any = Mat2f()
        val mat6 = Mat3f(1.0f, 2.0f, 3.0f)
        val mat7 = Mat3f(1.0f, 2.0f, 3.0f, 4.0f)
        val mat8 = Mat3f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
        val mat9 = Mat3f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f)
        val mat10 = Mat3f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f)
        val mat11 = Mat3f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f)

        assertEquals(mat, mat)
        assertNotEquals(mat, mat2)
        assertNotEquals(mat, mat3)
        assertNotEquals(mat, mat4)
        assertNotEquals(mat, mat5)
        assertNotEquals(mat, mat6)
        assertNotEquals(mat, mat7)
        assertNotEquals(mat, mat8)
        assertNotEquals(mat, mat9)
        assertNotEquals(mat, mat10)
        assertNotEquals(mat, mat11)

        assertNotNull(mat.hashCode())

        assertEquals(mat.m00, mat.component1())
        assertEquals(mat.m01, mat.component2())
        assertEquals(mat.m02, mat.component3())

        assertEquals(mat.m10, mat.component4())
        assertEquals(mat.m11, mat.component5())
        assertEquals(mat.m12, mat.component6())

        assertEquals(mat.m20, mat.component7())
        assertEquals(mat.m21, mat.component8())
        assertEquals(mat.m22, mat.component9())
    }

    @Test
    fun mat4fEqualsMat4f() {
        val mat = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f, 11.0f, 12.0f, 13.0f, 14.0f, 15.0f, 16.0f)
        val mat2 = Mat4f(2.0f)
        val mat3 = Mat4f()
        val mat4 = Mat4f(1.0f, 2.0f)
        val mat5: Any = Mat3f()
        val mat6 = Mat4f(1.0f, 2.0f, 3.0f)
        val mat7 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f)
        val mat8 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
        val mat9 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f)
        val mat10 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f)
        val mat11 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f)
        val mat12 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f)
        val mat13 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f)
        val mat14 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f, 11.0f)
        val mat15 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f, 11.0f, 12.0f)
        val mat16 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f, 11.0f, 12.0f, 13.0f)
        val mat17 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f, 11.0f, 12.0f, 13.0f, 14.0f)
        val mat18 = Mat4f(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f, 11.0f, 12.0f, 13.0f, 14.0f, 15.0f)

        assertEquals(mat, mat)
        assertNotEquals(mat, mat2)
        assertNotEquals(mat, mat3)
        assertNotEquals(mat, mat4)
        assertNotEquals(mat, mat5)
        assertNotEquals(mat, mat6)
        assertNotEquals(mat, mat7)
        assertNotEquals(mat, mat8)
        assertNotEquals(mat, mat9)
        assertNotEquals(mat, mat10)
        assertNotEquals(mat, mat11)
        assertNotEquals(mat, mat12)
        assertNotEquals(mat, mat13)
        assertNotEquals(mat, mat14)
        assertNotEquals(mat, mat15)
        assertNotEquals(mat, mat16)
        assertNotEquals(mat, mat17)
        assertNotEquals(mat, mat18)

        assertNotNull(mat.hashCode())

        assertEquals(mat.m00, mat.component1())
        assertEquals(mat.m01, mat.component2())
        assertEquals(mat.m02, mat.component3())
        assertEquals(mat.m03, mat.component4())

        assertEquals(mat.m10, mat.component5())
        assertEquals(mat.m11, mat.component6())
        assertEquals(mat.m12, mat.component7())
        assertEquals(mat.m13, mat.component8())

        assertEquals(mat.m20, mat.component9())
        assertEquals(mat.m21, mat.component10())
        assertEquals(mat.m22, mat.component11())
        assertEquals(mat.m23, mat.component12())

        assertEquals(mat.m30, mat.component13())
        assertEquals(mat.m31, mat.component14())
        assertEquals(mat.m32, mat.component15())
        assertEquals(mat.m33, mat.component16())
    }

    @Test
    fun mat2fToString() {
        assertEquals("Mat2f(m00=1.0, m01=0.0, m10=0.0, m11=1.0)", Mat2f().toString())
    }

    @Test
    fun mat3fToString() {
        assertEquals("Mat3f(m00=1.0, m01=0.0, m02=0.0, m10=0.0, m11=1.0, m12=0.0, m20=0.0, m21=0.0, m22=1.0)", Mat3f().toString())
    }

    @Test
    fun mat4fToString() {
        assertEquals("Mat4f(m00=1.0, m01=0.0, m02=0.0, m03=0.0, m10=0.0, m11=1.0, m12=0.0, m13=0.0, m20=0.0, m21=0.0, m22=1.0, m23=0.0, m30=0.0, m31=0.0, m32=0.0, m33=1.0)", Mat4f().toString())
    }

    @Test
    fun mat2fCopy() {
        val mat = Mat2f()
        assertEquals(mat.copy(), mat)
    }

    @Test
    fun mat3fCopy() {
        val mat = Mat3f()
        assertEquals(mat.copy(), mat)
    }

    @Test
    fun mat4fCopy() {
        val mat = Mat4f()
        assertEquals(mat.copy(), mat)
    }

    @Test
    fun mat2fTimesMat2f() {
        val mat  = Mat2f( 5.0f,  2.0f,  1.0f,  3.0f)
        val mat2 = Mat2f( 1.0f,  2.0f,  3.0f,  4.0f)
        val mat3 = Mat2f( 7.0f,  8.0f, 19.0f, 18.0f)
        val mat4 = Mat2f(11.0f, 18.0f, 10.0f, 14.0f)
        val mat5 = Mat2f()

        assertEquals(mat3, mat  * mat2)
        assertEquals(mat4, mat2 *  mat)
        assertEquals(mat2, mat2 * mat5)
    }

    @Test
    fun mat3fTimesMat3f() {
        val mat  = Mat3f( 5.0f,  2.0f,   1.0f,  3.0f,  7.0f,   1.0f,   2.5f,   6.5f,  -8.0f)
        val mat2 = Mat3f( 1.0f,  2.0f,   3.0f,  4.0f,  5.0f,   6.0f,   7.0f,   8.0f,   9.0f)
        val mat3 = Mat3f(18.5f, 35.5f, -21.0f, 50.0f, 82.0f, -39.0f,  81.5f, 128.5f, -57.0f)
        val mat4 = Mat3f(20.0f, 28.0f,  36.0f, 38.0f, 49.0f,  60.0f, -27.5f, -26.5f, -25.5f)
        val mat5 = Mat3f()

        assertEquals(mat3, mat  * mat2)
        assertEquals(mat4, mat2 *  mat)
        assertEquals(mat2, mat2 * mat5)
    }

    @Test
    fun mat4fTimesMat4f() {
        val mat  = Mat4f( 5.0f,  2.0f,   1.0f,  3.0f,   7.0f,   1.0f,   2.5f,   6.5f,  -8.0f,   7.0f, -5.0f,   1.0f,   2.0f,  4.5f,  3.0f,   2.5f)
        val mat2 = Mat4f( 1.0f,  2.0f,   3.0f,  4.0f,   5.0f,   6.0f,   7.0f,   8.0f,   9.0f, -10.0f, -5.0f,   2.0f,   3.5f,  1.5f,  6.0f,   9.0f)
        val mat3 = Mat4f( 3.0f, 43.0f,   3.0f, 29.0f,  27.0f, 101.0f,   9.0f,  81.0f,  19.0f, -18.0f, 15.0f, -38.0f,  -2.0f, 91.0f, 4.25f, 48.75f)
        val mat4 = Mat4f(34.5f, 16.5f,  42.0f, 65.0f, 57.25f,  4.75f,  54.5f,  99.5f, -14.5f,  77.5f, 56.0f,  23.0f, 60.25f, 4.75f, 37.5f,  72.5f)
        val mat5 = Mat4f()

        assertEquals(mat3,  mat * mat2)
        assertEquals(mat4, mat2 *  mat)
        assertEquals(mat2, mat2 * mat5)
    }

    @Test
    fun mat2fTimesVec2f() {
        val mat  = Mat2f(5.0f, 2.0f, 1.0f, 3.0f)
        val vec  = Vec2f(  3.0f,  4.0f)
        val vec2 = Vec2f( 19.0f, 18.0f)

        assertEquals(vec2, mat * vec)
    }

    @Test
    fun mat3fTimesVec3f() {
        val mat  = Mat3f(5.0f, 2.0f, 1.0f, 3.0f, 7.0f, 1.0f, 2.5f, 6.5f, -8.0f)
        val vec  = Vec3f(  7.0f,   8.0f,   9.0f)
        val vec2 = Vec3f( 81.5f, 128.5f, -57.0f)

        assertEquals(vec2, mat * vec)
    }

    @Test
    fun mat4fTimesVec4f() {
        val mat  = Mat4f(5.0f, 2.0f, 1.0f, 3.0f, 7.0f, 1.0f, 2.5f, 6.5f, -8.0f, 7.0f, -5.0f, 1.0f, 2.0f, 4.5f, 3.0f, 2.5f)
        val vec  = Vec4f( 3.5f,  1.5f,  6.0f,   9.0f)
        val vec2 = Vec4f(-2.0f, 91.0f, 4.25f, 48.75f)

        assertEquals(vec2, mat * vec)
    }

    @Test
    fun mat2fTimesFloat() {
        val mat  = Mat2f( 5.0f, 2.0f, 1.0f, 3.0f)
        val mat2 = Mat2f(10.0f, 4.0f, 2.0f, 6.0f)
        val mat3 = Mat2f(15.0f, 6.0f, 3.0f, 9.0f)

        assertEquals(mat2, mat * 2.0f)
        assertEquals(mat3, 3.0f * mat)
    }

    @Test
    fun mat3fTimesFloat() {
        val mat  = Mat3f( 5.0f, 2.0f, 1.0f, 3.0f,  7.0f, 1.0f, 2.5f,  6.5f,  -8.0f)
        val mat2 = Mat3f(10.0f, 4.0f, 2.0f, 6.0f, 14.0f, 2.0f, 5.0f, 13.0f, -16.0f)
        val mat3 = Mat3f(15.0f, 6.0f, 3.0f, 9.0f, 21.0f, 3.0f, 7.5f, 19.5f, -24.0f)

        assertEquals(mat2, mat * 2.0f)
        assertEquals(mat3, 3.0f * mat)
    }

    @Test
    fun mat4fTimesFloat() {
        val mat  = Mat4f( 5.0f, 2.0f, 1.0f, 3.0f,  7.0f, 1.0f, 2.5f,  6.5f,  -8.0f,  7.0f,  -5.0f, 1.0f, 2.0f,  4.5f, 3.0f, 2.5f)
        val mat2 = Mat4f(10.0f, 4.0f, 2.0f, 6.0f, 14.0f, 2.0f, 5.0f, 13.0f, -16.0f, 14.0f, -10.0f, 2.0f, 4.0f,  9.0f, 6.0f, 5.0f)
        val mat3 = Mat4f(15.0f, 6.0f, 3.0f, 9.0f, 21.0f, 3.0f, 7.5f, 19.5f, -24.0f, 21.0f, -15.0f, 3.0f, 6.0f, 13.5f, 9.0f, 7.5f)

        assertEquals(mat2, mat * 2.0f)
        assertEquals(mat3, 3.0f * mat)
    }

    @Test
    fun mat2fDivFloat() {
        val mat  = Mat2f( 5.0f, 2.0f, 1.0f, 3.0f)
        val mat2 = Mat2f(10.0f, 4.0f, 2.0f, 6.0f)

        assertEquals(mat, mat2 / 2.0f)
    }

    @Test
    fun mat3fDivFloat() {
        val mat  = Mat3f( 5.0f, 2.0f, 1.0f, 3.0f,  7.0f, 1.0f, 2.5f,  6.5f,  -8.0f)
        val mat2 = Mat3f(10.0f, 4.0f, 2.0f, 6.0f, 14.0f, 2.0f, 5.0f, 13.0f, -16.0f)

        assertEquals(mat, mat2 / 2.0f)
    }

    @Test
    fun mat4fDivFloat() {
        val mat  = Mat4f( 5.0f, 2.0f, 1.0f, 3.0f,  7.0f, 1.0f, 2.5f,  6.5f,  -8.0f,  7.0f,  -5.0f, 1.0f, 2.0f,  4.5f, 3.0f, 2.5f)
        val mat2 = Mat4f(10.0f, 4.0f, 2.0f, 6.0f, 14.0f, 2.0f, 5.0f, 13.0f, -16.0f, 14.0f, -10.0f, 2.0f, 4.0f,  9.0f, 6.0f, 5.0f)

        assertEquals(mat, mat2 / 2.0f)
    }

    @Test
    fun mat2fPlusMat2f() {
        val mat  = Mat2f( 5.0f,  2.0f,  1.0f,  3.0f)
        val mat2 = Mat2f( 7.0f, -5.0f, 16.0f,  7.0f)
        val mat3 = Mat2f(12.0f, -3.0f, 17.0f, 10.0f)

        assertEquals(mat3, mat + mat2)
    }

    @Test
    fun mat3fPlusMat3f() {
        val mat  = Mat3f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,  3.6f, 2.1f, 1.5f)
        val mat2 = Mat3f( 7.0f, -5.0f, 16.0f,  7.0f,  3.4f,  -8.0f,  9.0f, 1.0f, 2.2f)
        val mat3 = Mat3f(12.0f, -3.0f, 17.0f, 10.0f, 19.6f, -13.0f, 12.6f, 3.1f, 3.7f)

        assertEquals(mat3, mat + mat2)
    }

    @Test
    fun mat4fPlusMat4f() {
        val mat  = Mat4f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,  3.6f, 2.1f, 1.5f, 2.1f, -17.0f,   6.6f,  3.4f, 2.0f,  5.0f,  9.1f)
        val mat2 = Mat4f( 7.0f, -5.0f, 16.0f,  7.0f,  3.4f,  -8.0f,  9.0f, 1.0f, 2.2f, 3.4f,   4.4f, -10.0f, 12.0f, 5.0f, 14.0f,  3.5f)
        val mat3 = Mat4f(12.0f, -3.0f, 17.0f, 10.0f, 19.6f, -13.0f, 12.6f, 3.1f, 3.7f, 5.5f, -12.6f,  -3.4f, 15.4f, 7.0f, 19.0f, 12.6f)

        assertEquals(mat3, mat + mat2)
    }

    @Test
    fun mat2fMinusMat2f() {
        val mat  = Mat2f( 5.0f,  2.0f,  1.0f,  3.0f)
        val mat2 = Mat2f( 7.0f, -5.0f, 16.0f,  7.0f)
        val mat3 = Mat2f(12.0f, -3.0f, 17.0f, 10.0f)

        assertEquals(mat, mat3 - mat2)
    }

    @Test
    fun mat3fMinusMat3f() {
        val mat  = Mat3f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,  3.5f, 2.1f, 1.5f)
        val mat2 = Mat3f( 7.0f, -5.0f, 16.0f,  7.0f,  3.4f,  -8.0f,  9.0f, 1.0f, 2.2f)
        val mat3 = Mat3f(12.0f, -3.0f, 17.0f, 10.0f, 19.6f, -13.0f, 12.5f, 3.1f, 3.7f)

        assertEquals(mat, mat3 - mat2)
    }

    @Test
    fun mat4fMinusMat4f() {
        val mat  = Mat4f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,  3.5f, 2.1f, 1.5f, 2.1f, -17.0f,   6.6f,  3.5f, 2.0f,  5.0f,  9.1f)
        val mat2 = Mat4f( 7.0f, -5.0f, 16.0f,  7.0f,  3.4f,  -8.0f,  9.0f, 1.0f, 2.2f, 3.4f,   4.4f, -10.0f, 12.0f, 5.0f, 14.0f,  3.5f)
        val mat3 = Mat4f(12.0f, -3.0f, 17.0f, 10.0f, 19.6f, -13.0f, 12.5f, 3.1f, 3.7f, 5.5f, -12.6f,  -3.4f, 15.5f, 7.0f, 19.0f, 12.6f)

        assertEquals(mat, mat3 - mat2)
    }

    @Test
    fun mat3fGetAndSetTranslation() {
        val mat  = Mat3f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,   3.5f,  2.1f, 1.5f)
        val mat2 = Mat3f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,  15.5f, -2.7f, 4.0f)

        val vec  = Vec3f( 3.5f,  2.1f, 1.5f)
        val vec2 = Vec3f(15.5f, -2.7f, 4.0f)
        val vec3 = Vec3f(20.5f, -4.7f, 5.0f)

        assertEquals(mat.translation, vec)

        mat.translation = vec2

        assertEquals(mat.translation, vec2)
        assertEquals(mat, mat2)

        mat.translate(Vec3f(5.0f, -2.0f, 1.0f))

        assertEquals(mat.translation, vec3)
    }

    @Test
    fun mat4fGetAndSetTranslation() {
        val mat  = Mat4f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,  3.5f, 2.1f, 1.5f, 2.1f, -17.0f, 6.6f,  3.5f,  2.0f, 5.0f,  9.1f)
        val mat2 = Mat4f( 5.0f,  2.0f,  1.0f,  3.0f, 16.2f,  -5.0f,  3.5f, 2.1f, 1.5f, 2.1f, -17.0f, 6.6f, 15.5f, -2.7f, 4.0f, 16.5f)

        val vec  = Vec4f(3.5f,   2.0f, 5.0f,  9.1f)
        val vec2 = Vec4f(15.5f, -2.7f, 4.0f, 16.5f)
        val vec3 = Vec4f(20.5f, -4.7f, 5.0f, 17.0f)

        assertEquals(mat.translation, vec)

        mat.translation = vec2

        assertEquals(mat.translation, vec2)
        assertEquals(mat, mat2)

        mat.translate(Vec4f(5.0f, -2.0f, 1.0f, 0.5f))

        assertEquals(mat.translation, vec3)
    }

    @Test
    fun mat2fGetIdentity() {
        val mat  = Mat2f(1.0f, 0.0f, 0.0f, 1.0f)
        val mat2 = Mat2f.identity()

        assertEquals(mat, mat2)
    }

    @Test
    fun mat3fGetIdentity() {
        val mat  = Mat3f(1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f)
        val mat2 = Mat3f.identity()

        assertEquals(mat, mat2)
    }

    @Test
    fun mat4fGetIdentity() {
        val mat  = Mat4f(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f)
        val mat2 = Mat4f.identity()

        assertEquals(mat, mat2)
    }

    @Test
    fun mat3fGetTranslation() {
        val vec = Vec3f(-5.0f, 2.0f, 3.0f)
        val mat = Mat3f.translation(vec)

        assertEquals(vec, mat.translation)
    }

    @Test
    fun mat4fGetTranslation() {
        val vec = Vec4f(-5.0f, 2.0f, 3.0f, 7.5f)
        val mat = Mat4f.translation(vec)

        assertEquals(vec, mat.translation)
    }

    @Test
    fun mat3fGetRotation() {
        val c = cos(90.0f.toRadians())
        val s = sin(90.0f.toRadians())

        val mat = Mat3f.translation(Vec3f(5.0f, 4.0f, 2.0f))
        val mat2 = Mat3f.rotation(90.0f, Vec3f(0.0f, 0.0f, 1.0f))
        val mat3 = Mat3f(c, s, 0.0f, -s, c, 0.0f, 0.0f, 0.0f, 1.0f)

        assertEquals(mat3, mat2)

        val mat4 = mat.rotate(90.0f, Vec3f(0.0f, 0.0f, 1.0f))

        assertEquals(Vec3f(-4.0f, 5.0f, 2.0f), mat4.translation)

        val mat5 = Mat3f.rotation(90.0f, Vec3f(0.0f, 1.0f, 0.0f))
        val mat6 = Mat3f(c, 0.0f, -s, 0.0f, 1.0f, 0.0f, s, 0.0f, c)

        assertEquals(mat6, mat5)

        val mat7 = Mat3f.rotation(90.0f, Vec3f(1.0f, 0.0f, 0.0f))
        val mat8 = Mat3f(1.0f, 0.0f, 0.0f, 0.0f, c, s, 0.0f, -s, c)

        assertEquals(mat8, mat7)
    }

    @Test
    fun mat4fGetRotation() {
        val c = cos(90.0f.toRadians())
        val s = sin(90.0f.toRadians())

        val mat = Mat4f.translation(Vec4f(5.0f, 4.0f, 2.0f, 3.0f))
        val mat2 = Mat4f.rotation(90.0f, Vec3f(0.0f, 0.0f, 1.0f))
        val mat3 = Mat4f(c, s, 0.0f, 0.0f, -s, c, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f)

        assertEquals(mat3, mat2)

        val mat4 = mat.rotate(90.0f, Vec3f(0.0f, 0.0f, 1.0f))

        assertEquals(Vec4f(-4.0f, 5.0f, 2.0f, 3.0f), mat4.translation)

        val mat5 = Mat4f.rotation(90.0f, Vec3f(0.0f, 1.0f, 0.0f))
        val mat6 = Mat4f(c, 0.0f, -s, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, s, 0.0f, c, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f)

        assertEquals(mat6, mat5)

        val mat7 = Mat4f.rotation(90.0f, Vec3f(1.0f, 0.0f, 0.0f))
        val mat8 = Mat4f(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, c, s, 0.0f, 0.0f, -s, c, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f)

        assertEquals(mat8, mat7)
    }
}