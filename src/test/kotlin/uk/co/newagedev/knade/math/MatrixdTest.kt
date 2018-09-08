package uk.co.newagedev.knade.math

import kotlin.math.cos
import kotlin.math.sin
import kotlin.test.*

class MatrixdTest {

    @Test
    fun createMat2dWithSpecificValues() {
        val mat = Mat2d(7.5, 6.2, -11.2, 5.1)

        assertEquals(7.5, mat.m00)
        assertEquals(6.2, mat.m01)

        assertEquals(-11.2, mat.m10)
        assertEquals(5.1, mat.m11)

        val mat2 = Mat2d()

        assertEquals(1.0, mat2.m00)
        assertEquals(0.0, mat2.m01)

        assertEquals(0.0, mat2.m10)
        assertEquals(1.0, mat2.m11)

        mat2.m00 = 7.5
        mat2.m01 = 6.2

        mat2.m10 = -11.2
        mat2.m11 = 5.1

        assertEquals(7.5, mat2.m00)
        assertEquals(6.2, mat2.m01)

        assertEquals(-11.2, mat2.m10)
        assertEquals(5.1, mat2.m11)

        mat2.c0 = Vec2d(6.2, 7.5)
        mat2.c1 = Vec2d(5.1, -11.2)

        assertEquals(7.5, mat2.m01)
        assertEquals(6.2, mat2.m00)

        assertEquals(-11.2, mat2.m11)
        assertEquals(5.1, mat2.m10)
    }

    @Test
    fun createMat3dWithSpecificValues() {
        val mat = Mat3d(7.5, 6.2, 4.5, -11.2, 5.1, -9.1, 8.52, 16.2, 3.33)

        assertEquals(7.5, mat.m00)
        assertEquals(6.2, mat.m01)
        assertEquals(4.5, mat.m02)

        assertEquals(-11.2, mat.m10)
        assertEquals(5.1, mat.m11)
        assertEquals(-9.1, mat.m12)

        assertEquals(8.52, mat.m20)
        assertEquals(16.2, mat.m21)
        assertEquals(3.33, mat.m22)

        val mat2 = Mat3d()

        assertEquals(1.0, mat2.m00)
        assertEquals(0.0, mat2.m01)
        assertEquals(0.0, mat2.m02)

        assertEquals(0.0, mat2.m10)
        assertEquals(1.0, mat2.m11)
        assertEquals(0.0, mat2.m12)

        assertEquals(0.0, mat2.m20)
        assertEquals(0.0, mat2.m21)
        assertEquals(1.0, mat2.m22)

        mat2.m00 = 7.5
        mat2.m01 = 6.2
        mat2.m02 = 4.5

        mat2.m10 = -11.2
        mat2.m11 = 5.1
        mat2.m12 = -9.1

        mat2.m20 = 8.52
        mat2.m21 = 16.2
        mat2.m22 = 3.33

        assertEquals(7.5, mat2.m00)
        assertEquals(6.2, mat2.m01)
        assertEquals(4.5, mat2.m02)

        assertEquals(-11.2, mat2.m10)
        assertEquals(5.1, mat2.m11)
        assertEquals(-9.1, mat2.m12)

        assertEquals(8.52, mat2.m20)
        assertEquals(16.2, mat2.m21)
        assertEquals(3.33, mat2.m22)

        mat2.c0 = Vec3d(4.5, 6.2, 7.5)
        mat2.c1 = Vec3d(-9.1, 5.1, -11.2)
        mat2.c2 = Vec3d(3.33, 16.2, 8.52)

        assertEquals(7.5, mat2.m02)
        assertEquals(6.2, mat2.m01)
        assertEquals(4.5, mat2.m00)

        assertEquals(-11.2, mat2.m12)
        assertEquals(5.1, mat2.m11)
        assertEquals(-9.1, mat2.m10)

        assertEquals(8.52, mat2.m22)
        assertEquals(16.2, mat2.m21)
        assertEquals(3.33, mat2.m20)
    }

    @Test
    fun createMat4dWithSpecificValues() {
        val mat = Mat4d(7.5, 6.2, 4.5, 12.3, -11.2, 5.1, -9.1, 7.0, 8.52, 16.2, 3.33, 12.23, 17.0, 15.0, -120.0, -60.5)

        assertEquals(7.5, mat.m00)
        assertEquals(6.2, mat.m01)
        assertEquals(4.5, mat.m02)
        assertEquals(12.3, mat.m03)

        assertEquals(-11.2, mat.m10)
        assertEquals(5.1, mat.m11)
        assertEquals(-9.1, mat.m12)
        assertEquals(7.0, mat.m13)

        assertEquals(8.52, mat.m20)
        assertEquals(16.2, mat.m21)
        assertEquals(3.33, mat.m22)
        assertEquals(12.23, mat.m23)

        assertEquals(17.0, mat.m30)
        assertEquals(15.0, mat.m31)
        assertEquals(-120.0, mat.m32)
        assertEquals(-60.5, mat.m33)

        val mat2 = Mat4d()

        assertEquals(1.0, mat2.m00)
        assertEquals(0.0, mat2.m01)
        assertEquals(0.0, mat2.m02)
        assertEquals(0.0, mat2.m03)

        assertEquals(0.0, mat2.m10)
        assertEquals(1.0, mat2.m11)
        assertEquals(0.0, mat2.m12)
        assertEquals(0.0, mat2.m13)

        assertEquals(0.0, mat2.m20)
        assertEquals(0.0, mat2.m21)
        assertEquals(1.0, mat2.m22)
        assertEquals(0.0, mat2.m23)

        assertEquals(0.0, mat2.m30)
        assertEquals(0.0, mat2.m31)
        assertEquals(0.0, mat2.m32)
        assertEquals(1.0, mat2.m33)

        mat2.m00 = 7.5
        mat2.m01 = 6.2
        mat2.m02 = 4.5
        mat2.m03 = 12.3

        mat2.m10 = -11.2
        mat2.m11 = 5.1
        mat2.m12 = -9.1
        mat2.m13 = 7.0

        mat2.m20 = 8.52
        mat2.m21 = 16.2
        mat2.m22 = 3.33
        mat2.m23 = 12.23

        mat2.m30 = 17.0
        mat2.m31 = 15.0
        mat2.m32 = -120.0
        mat2.m33 = -60.5

        assertEquals(7.5, mat2.m00)
        assertEquals(6.2, mat2.m01)
        assertEquals(4.5, mat2.m02)
        assertEquals(12.3, mat2.m03)

        assertEquals(-11.2, mat2.m10)
        assertEquals(5.1, mat2.m11)
        assertEquals(-9.1, mat2.m12)
        assertEquals(7.0, mat2.m13)

        assertEquals(8.52, mat2.m20)
        assertEquals(16.2, mat2.m21)
        assertEquals(3.33, mat2.m22)
        assertEquals(12.23, mat2.m23)

        assertEquals(17.0, mat2.m30)
        assertEquals(15.0, mat2.m31)
        assertEquals(-120.0, mat2.m32)
        assertEquals(-60.5, mat2.m33)

        mat2.c0 = Vec4d(12.3, 4.5, 6.2, 7.5)
        mat2.c1 = Vec4d(7.0, -9.1, 5.1, -11.2)
        mat2.c2 = Vec4d(12.23, 3.33, 16.2, 8.52)
        mat2.c3 = Vec4d(-60.5, -120.0, 15.0, 17.0)

        assertEquals(7.5, mat2.m03)
        assertEquals(6.2, mat2.m02)
        assertEquals(4.5, mat2.m01)
        assertEquals(12.3, mat2.m00)

        assertEquals(-11.2, mat2.m13)
        assertEquals(5.1, mat2.m12)
        assertEquals(-9.1, mat2.m11)
        assertEquals(7.0, mat2.m10)

        assertEquals(8.52, mat2.m23)
        assertEquals(16.2, mat2.m22)
        assertEquals(3.33, mat2.m21)
        assertEquals(12.23, mat2.m20)

        assertEquals(17.0, mat2.m33)
        assertEquals(15.0, mat2.m32)
        assertEquals(-120.0, mat2.m31)
        assertEquals(-60.5, mat2.m30)
    }

    @Test
    fun readMat2dValuesUsingRowAndColumns() {
        val mat = Mat2d(7.5, 6.2, -11.2, 5.1)
        val r0 = Vec2d(7.5, -11.2)
        val r1 = Vec2d(6.2, 5.1)
        val c0 = Vec2d(7.5, 6.2)
        val c1 = Vec2d(-11.2, 5.1)

        assertEquals(r0, mat.r0)
        assertEquals(r1, mat.r1)

        assertEquals(c0, mat.c0)
        assertEquals(c1, mat.c1)
    }

    @Test
    fun readMat3dValuesUsingRowAndColumns() {
        val mat = Mat3d(7.5, 6.2, 4.5, -11.2, 5.1, -9.1, 8.52, 16.2, 3.33)
        val r0 = Vec3d(7.5, -11.2, 8.52)
        val r1 = Vec3d(6.2, 5.1, 16.2)
        val r2 = Vec3d(4.5, -9.1, 3.33)
        val c0 = Vec3d(7.5, 6.2, 4.5)
        val c1 = Vec3d(-11.2, 5.1, -9.1)
        val c2 = Vec3d(8.52, 16.2, 3.33)

        assertEquals(r0, mat.r0)
        assertEquals(r1, mat.r1)
        assertEquals(r2, mat.r2)

        assertEquals(c0, mat.c0)
        assertEquals(c1, mat.c1)
        assertEquals(c2, mat.c2)
    }

    @Test
    fun readMat4dValuesUsingRowAndColumns() {
        val mat = Mat4d(7.5, 6.2, 4.5, 12.3, -11.2, 5.1, -9.1, 7.0, 8.52, 16.2, 3.33, 12.23, 17.0, 15.0, -120.0, -60.5)
        val r0 = Vec4d(7.5, -11.2, 8.52, 17.0)
        val r1 = Vec4d(6.2, 5.1, 16.2, 15.0)
        val r2 = Vec4d(4.5, -9.1, 3.33, -120.0)
        val r3 = Vec4d(12.3, 7.0, 12.23, -60.5)
        val c0 = Vec4d(7.5, 6.2, 4.5, 12.3)
        val c1 = Vec4d(-11.2, 5.1, -9.1, 7.0)
        val c2 = Vec4d(8.52, 16.2, 3.33, 12.23)
        val c3 = Vec4d(17.0, 15.0, -120.0, -60.5)

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
    fun mat2dEqualsMat2d() {
        val mat = Mat2d(1.0, 2.0, 3.0, 4.0)
        val mat2 = Mat2d(2.0)
        val mat3 = Mat2d()
        val mat4 = Mat2d(1.0, 2.0)
        val mat5: Any = Mat3d()
        val mat6 = Mat2d(1.0, 2.0, 3.0)

        assertTrue(mat == mat)
        assertFalse(mat == mat2)
        assertFalse(mat == mat3)
        assertFalse(mat == mat4)
        assertFalse(mat == mat5)
        assertFalse(mat == mat6)

        assertNotNull(mat.hashCode())

        assertEquals(mat.m00, mat.component1())
        assertEquals(mat.m01, mat.component2())
        assertEquals(mat.m10, mat.component3())
        assertEquals(mat.m11, mat.component4())
    }

    @Test
    fun mat3dEqualsMat3d() {
        val mat = Mat3d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)
        val mat2 = Mat3d(2.0)
        val mat3 = Mat3d()
        val mat4 = Mat3d(1.0, 2.0)
        val mat5: Any = Mat2d()
        val mat6 = Mat3d(1.0, 2.0, 3.0)
        val mat7 = Mat3d(1.0, 2.0, 3.0, 4.0)
        val mat8 = Mat3d(1.0, 2.0, 3.0, 4.0, 5.0)
        val mat9 = Mat3d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
        val mat10 = Mat3d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0)
        val mat11 = Mat3d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0)

        assertTrue(mat == mat)
        assertFalse(mat == mat2)
        assertFalse(mat == mat3)
        assertFalse(mat == mat4)
        assertFalse(mat == mat5)
        assertFalse(mat == mat6)
        assertFalse(mat == mat7)
        assertFalse(mat == mat8)
        assertFalse(mat == mat9)
        assertFalse(mat == mat10)
        assertFalse(mat == mat11)

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
    fun mat4dEqualsMat4d() {
        val mat = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0)
        val mat2 = Mat4d(2.0)
        val mat3 = Mat4d()
        val mat4 = Mat4d(1.0, 2.0)
        val mat5: Any = Mat3d()
        val mat6 = Mat4d(1.0, 2.0, 3.0)
        val mat7 = Mat4d(1.0, 2.0, 3.0, 4.0)
        val mat8 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0)
        val mat9 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
        val mat10 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0)
        val mat11 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0)
        val mat12 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)
        val mat13 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
        val mat14 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0)
        val mat15 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0)
        val mat16 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0)
        val mat17 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0)
        val mat18 = Mat4d(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0)

        assertTrue(mat == mat)
        assertFalse(mat == mat2)
        assertFalse(mat == mat3)
        assertFalse(mat == mat4)
        assertFalse(mat == mat5)
        assertFalse(mat == mat6)
        assertFalse(mat == mat7)
        assertFalse(mat == mat8)
        assertFalse(mat == mat9)
        assertFalse(mat == mat10)
        assertFalse(mat == mat11)
        assertFalse(mat == mat12)
        assertFalse(mat == mat13)
        assertFalse(mat == mat14)
        assertFalse(mat == mat15)
        assertFalse(mat == mat16)
        assertFalse(mat == mat17)
        assertFalse(mat == mat18)

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
    fun mat2dToString() {
        assertEquals("Mat2d(m00=1.0, m01=0.0, m10=0.0, m11=1.0)", Mat2d().toString())
    }

    @Test
    fun mat3dToString() {
        assertEquals("Mat3d(m00=1.0, m01=0.0, m02=0.0, m10=0.0, m11=1.0, m12=0.0, m20=0.0, m21=0.0, m22=1.0)", Mat3d().toString())
    }

    @Test
    fun mat4dToString() {
        assertEquals("Mat4d(m00=1.0, m01=0.0, m02=0.0, m03=0.0, m10=0.0, m11=1.0, m12=0.0, m13=0.0, m20=0.0, m21=0.0, m22=1.0, m23=0.0, m30=0.0, m31=0.0, m32=0.0, m33=1.0)", Mat4d().toString())
    }

    @Test
    fun mat2dCopy() {
        val mat = Mat2d()
        assertEquals(mat.copy(), mat)
    }

    @Test
    fun mat3dCopy() {
        val mat = Mat3d()
        assertEquals(mat.copy(), mat)
    }

    @Test
    fun mat4dCopy() {
        val mat = Mat4d()
        assertEquals(mat.copy(), mat)
    }

    @Test
    fun mat2dTimesMat2d() {
        val mat  = Mat2d( 5.0,  2.0,  1.0,  3.0)
        val mat2 = Mat2d( 1.0,  2.0,  3.0,  4.0)
        val mat3 = Mat2d( 7.0,  8.0, 19.0, 18.0)
        val mat4 = Mat2d(11.0, 18.0, 10.0, 14.0)
        val mat5 = Mat2d()

        assertEquals(mat3, mat  * mat2)
        assertEquals(mat4, mat2 *  mat)
        assertEquals(mat2, mat2 * mat5)
    }

    @Test
    fun mat3dTimesMat3d() {
        val mat  = Mat3d( 5.0,  2.0,   1.0,  3.0,  7.0,   1.0,   2.5,   6.5,  -8.0)
        val mat2 = Mat3d( 1.0,  2.0,   3.0,  4.0,  5.0,   6.0,   7.0,   8.0,   9.0)
        val mat3 = Mat3d(18.5, 35.5, -21.0, 50.0, 82.0, -39.0,  81.5, 128.5, -57.0)
        val mat4 = Mat3d(20.0, 28.0,  36.0, 38.0, 49.0,  60.0, -27.5, -26.5, -25.5)
        val mat5 = Mat3d()

        assertEquals(mat3, mat  * mat2)
        assertEquals(mat4, mat2 *  mat)
        assertEquals(mat2, mat2 * mat5)
    }

    @Test
    fun mat4dTimesMat4d() {
        val mat  = Mat4d( 5.0,  2.0,   1.0,  3.0,   7.0,   1.0,   2.5,   6.5,  -8.0,   7.0, -5.0,   1.0,   2.0,  4.5,  3.0,   2.5)
        val mat2 = Mat4d( 1.0,  2.0,   3.0,  4.0,   5.0,   6.0,   7.0,   8.0,   9.0, -10.0, -5.0,   2.0,   3.5,  1.5,  6.0,   9.0)
        val mat3 = Mat4d( 3.0, 43.0,   3.0, 29.0,  27.0, 101.0,   9.0,  81.0,  19.0, -18.0, 15.0, -38.0,  -2.0, 91.0, 4.25, 48.75)
        val mat4 = Mat4d(34.5, 16.5,  42.0, 65.0, 57.25,  4.75,  54.5,  99.5, -14.5,  77.5, 56.0,  23.0, 60.25, 4.75, 37.5,  72.5)
        val mat5 = Mat4d()

        assertEquals(mat3,  mat * mat2)
        assertEquals(mat4, mat2 *  mat)
        assertEquals(mat2, mat2 * mat5)
    }

    @Test
    fun mat2dTimesVec2d() {
        val mat  = Mat2d(5.0, 2.0, 1.0, 3.0)
        val vec  = Vec2d(  3.0,  4.0)
        val vec2 = Vec2d( 19.0, 18.0)

        assertEquals(vec2, mat * vec)
    }

    @Test
    fun mat3dTimesVec3d() {
        val mat  = Mat3d(5.0, 2.0, 1.0, 3.0, 7.0, 1.0, 2.5, 6.5, -8.0)
        val vec  = Vec3d(  7.0,   8.0,   9.0)
        val vec2 = Vec3d( 81.5, 128.5, -57.0)

        assertEquals(vec2, mat * vec)
    }

    @Test
    fun mat4dTimesVec4d() {
        val mat  = Mat4d(5.0, 2.0, 1.0, 3.0, 7.0, 1.0, 2.5, 6.5, -8.0, 7.0, -5.0, 1.0, 2.0, 4.5, 3.0, 2.5)
        val vec  = Vec4d( 3.5,  1.5,  6.0,   9.0)
        val vec2 = Vec4d(-2.0, 91.0, 4.25, 48.75)

        assertEquals(vec2, mat * vec)
    }

    @Test
    fun mat2dTimesFloat() {
        val mat  = Mat2d( 5.0, 2.0, 1.0, 3.0)
        val mat2 = Mat2d(10.0, 4.0, 2.0, 6.0)
        val mat3 = Mat2d(15.0, 6.0, 3.0, 9.0)

        assertEquals(mat2, mat * 2.0)
        assertEquals(mat3, 3.0 * mat)
    }

    @Test
    fun mat3dTimesFloat() {
        val mat  = Mat3d( 5.0, 2.0, 1.0, 3.0,  7.0, 1.0, 2.5,  6.5,  -8.0)
        val mat2 = Mat3d(10.0, 4.0, 2.0, 6.0, 14.0, 2.0, 5.0, 13.0, -16.0)
        val mat3 = Mat3d(15.0, 6.0, 3.0, 9.0, 21.0, 3.0, 7.5, 19.5, -24.0)

        assertEquals(mat2, mat * 2.0)
        assertEquals(mat3, 3.0 * mat)
    }

    @Test
    fun mat4dTimesFloat() {
        val mat  = Mat4d( 5.0, 2.0, 1.0, 3.0,  7.0, 1.0, 2.5,  6.5,  -8.0,  7.0,  -5.0, 1.0, 2.0,  4.5, 3.0, 2.5)
        val mat2 = Mat4d(10.0, 4.0, 2.0, 6.0, 14.0, 2.0, 5.0, 13.0, -16.0, 14.0, -10.0, 2.0, 4.0,  9.0, 6.0, 5.0)
        val mat3 = Mat4d(15.0, 6.0, 3.0, 9.0, 21.0, 3.0, 7.5, 19.5, -24.0, 21.0, -15.0, 3.0, 6.0, 13.5, 9.0, 7.5)

        assertEquals(mat2, mat * 2.0)
        assertEquals(mat3, 3.0 * mat)
    }

    @Test
    fun mat2dDivFloat() {
        val mat  = Mat2d( 5.0, 2.0, 1.0, 3.0)
        val mat2 = Mat2d(10.0, 4.0, 2.0, 6.0)

        assertEquals(mat, mat2 / 2.0)
    }

    @Test
    fun mat3dDivFloat() {
        val mat  = Mat3d( 5.0, 2.0, 1.0, 3.0,  7.0, 1.0, 2.5,  6.5,  -8.0)
        val mat2 = Mat3d(10.0, 4.0, 2.0, 6.0, 14.0, 2.0, 5.0, 13.0, -16.0)

        assertEquals(mat, mat2 / 2.0)
    }

    @Test
    fun mat4dDivFloat() {
        val mat  = Mat4d( 5.0, 2.0, 1.0, 3.0,  7.0, 1.0, 2.5,  6.5,  -8.0,  7.0,  -5.0, 1.0, 2.0,  4.5, 3.0, 2.5)
        val mat2 = Mat4d(10.0, 4.0, 2.0, 6.0, 14.0, 2.0, 5.0, 13.0, -16.0, 14.0, -10.0, 2.0, 4.0,  9.0, 6.0, 5.0)

        assertEquals(mat, mat2 / 2.0)
    }

    @Test
    fun mat2dPlusMat2d() {
        val mat  = Mat2d( 5.0,  2.0,  1.0,  3.0)
        val mat2 = Mat2d( 7.0, -5.0, 16.0,  7.0)
        val mat3 = Mat2d(12.0, -3.0, 17.0, 10.0)

        assertEquals(mat3, mat + mat2)
    }

    @Test
    fun mat3dPlusMat3d() {
        val mat  = Mat3d( 5.0,  2.0,  1.0,  3.0, 16.1,  -5.0,  3.6, 2.1, 1.5)
        val mat2 = Mat3d( 7.0, -5.0, 16.0,  7.0,  3.4,  -8.0,  9.0, 1.0, 2.2)
        val mat3 = Mat3d(12.0, -3.0, 17.0, 10.0, 19.5, -13.0, 12.6, 3.1, 3.7)

        assertEquals(mat3, mat + mat2)
    }

    @Test
    fun mat4dPlusMat4d() {
        val mat  = Mat4d( 5.0,  2.0,  1.0,  3.0, 16.1,  -5.0,  3.6, 2.1, 1.5, 2.1, -17.0,   6.5,  3.4, 2.0,  5.0,  9.1)
        val mat2 = Mat4d( 7.0, -5.0, 16.0,  7.0,  3.4,  -8.0,  9.0, 1.0, 2.2, 3.4,   4.4, -10.0, 12.0, 5.0, 14.0,  3.5)
        val mat3 = Mat4d(12.0, -3.0, 17.0, 10.0, 19.5, -13.0, 12.6, 3.1, 3.7, 5.5, -12.6,  -3.5, 15.4, 7.0, 19.0, 12.6)

        assertEquals(mat3, mat + mat2)
    }

    @Test
    fun mat2dMinusMat2d() {
        val mat  = Mat2d( 5.0,  2.0,  1.0,  3.0)
        val mat2 = Mat2d( 7.0, -5.0, 16.0,  7.0)
        val mat3 = Mat2d(12.0, -3.0, 17.0, 10.0)

        assertEquals(mat, mat3 - mat2)
    }

    @Test
    fun mat3dMinusMat3d() {
        val mat  = Mat3d( 5.0,  2.0,  1.0,  3.0, 16.1,  -5.0,  3.5, 2.1, 1.5)
        val mat2 = Mat3d( 7.0, -5.0, 16.0,  7.0,  3.4,  -8.0,  9.0, 1.0, 2.2)
        val mat3 = Mat3d(12.0, -3.0, 17.0, 10.0, 19.5, -13.0, 12.5, 3.1, 3.7)

        assertEquals(mat, mat3 - mat2)
    }

    @Test
    fun mat4dMinusMat4d() {
        val mat  = Mat4d( 5.0,  2.0,  1.0,  3.0, 16.1,  -5.0,  3.5, 2.1, 1.5, 2.1, -17.0,   6.6,  3.5, 2.0,  5.0,  9.1)
        val mat2 = Mat4d( 7.0, -5.0, 16.0,  7.0,  3.4,  -8.0,  9.0, 1.0, 2.2, 3.4,   4.4, -10.0, 12.0, 5.0, 14.0,  3.5)
        val mat3 = Mat4d(12.0, -3.0, 17.0, 10.0, 19.5, -13.0, 12.5, 3.1, 3.7, 5.5, -12.6,  -3.4, 15.5, 7.0, 19.0, 12.6)

        assertEquals(mat, mat3 - mat2)
    }

    @Test
    fun mat3dGetAndSetTranslation() {
        val mat  = Mat3d( 5.0,  2.0,  1.0,  3.0, 16.2,  -5.0,   3.5,  2.1, 1.5)
        val mat2 = Mat3d( 5.0,  2.0,  1.0,  3.0, 16.2,  -5.0,  15.5, -2.7, 4.0)

        val vec  = Vec3d( 3.5,  2.1, 1.5)
        val vec2 = Vec3d(15.5, -2.7, 4.0)
        val vec3 = Vec3d(20.5, -4.7, 5.0)

        assertEquals(mat.translation, vec)

        mat.translation = vec2

        assertEquals(mat.translation, vec2)
        assertEquals(mat, mat2)

        mat.translate(Vec3d(5.0, -2.0, 1.0))

        assertEquals(mat.translation, vec3)
    }

    @Test
    fun mat4dGetAndSetTranslation() {
        val mat  = Mat4d( 5.0,  2.0,  1.0,  3.0, 16.2,  -5.0,  3.5, 2.1, 1.5, 2.1, -17.0, 6.6,  3.5,  2.0, 5.0,  9.1)
        val mat2 = Mat4d( 5.0,  2.0,  1.0,  3.0, 16.2,  -5.0,  3.5, 2.1, 1.5, 2.1, -17.0, 6.6, 15.5, -2.7, 4.0, 16.5)

        val vec  = Vec4d(3.5,   2.0, 5.0,  9.1)
        val vec2 = Vec4d(15.5, -2.7, 4.0, 16.5)
        val vec3 = Vec4d(20.5, -4.7, 5.0, 17.0)

        assertEquals(mat.translation, vec)

        mat.translation = vec2

        assertEquals(mat.translation, vec2)
        assertEquals(mat, mat2)

        mat.translate(Vec4d(5.0, -2.0, 1.0, 0.5))

        assertEquals(mat.translation, vec3)
    }

    @Test
    fun mat2dGetIdentity() {
        val mat  = Mat2d(1.0, 0.0, 0.0, 1.0)
        val mat2 = Mat2d.identity()

        assertEquals(mat, mat2)
    }

    @Test
    fun mat3dGetIdentity() {
        val mat  = Mat3d(1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0)
        val mat2 = Mat3d.identity()

        assertEquals(mat, mat2)
    }

    @Test
    fun mat4dGetIdentity() {
        val mat  = Mat4d(1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0)
        val mat2 = Mat4d.identity()

        assertEquals(mat, mat2)
    }

    @Test
    fun mat3dGetTranslation() {
        val vec = Vec3d(-5.0, 2.0, 3.0)
        val mat = Mat3d.translation(vec)

        assertEquals(vec, mat.translation)
    }

    @Test
    fun mat4dGetTranslation() {
        val vec = Vec4d(-5.0, 2.0, 3.0, 7.5)
        val mat = Mat4d.translation(vec)

        assertEquals(vec, mat.translation)
    }

    @Test
    fun mat3dGetRotation() {
        val c = cos(90.0.toRadians())
        val s = sin(90.0.toRadians())

        val mat = Mat3d.translation(Vec3d(5.0, 4.0, 2.0))
        val mat2 = Mat3d.rotation(90.0, Vec3d(0.0, 0.0, 1.0))
        val mat3 = Mat3d(c, s, 0.0, -s, c, 0.0, 0.0, 0.0, 1.0)

        assertEquals(mat3, mat2)

        val mat4 = mat.rotate(90.0, Vec3d(0.0, 0.0, 1.0))

        assertEquals(Vec3d(c * 5.0 - s * 4.0, 5.0, 2.0), mat4.translation)

        val mat5 = Mat3d.rotation(90.0, Vec3d(0.0, 1.0, 0.0))
        val mat6 = Mat3d(c, 0.0, -s, 0.0, 1.0, 0.0, s, 0.0, c)

        assertEquals(mat6, mat5)

        val mat7 = Mat3d.rotation(90.0, Vec3d(1.0, 0.0, 0.0))
        val mat8 = Mat3d(1.0, 0.0, 0.0, 0.0, c, s, 0.0, -s, c)

        assertEquals(mat8, mat7)
    }

    @Test
    fun mat4dGetRotation() {
        val c = cos(90.0.toRadians())
        val s = sin(90.0.toRadians())

        val mat = Mat4d.translation(Vec4d(5.0, 4.0, 2.0, 3.0))
        val mat2 = Mat4d.rotation(90.0, Vec3d(0.0, 0.0, 1.0))
        val mat3 = Mat4d(c, s, 0.0, 0.0, -s, c, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0)

        assertEquals(mat3, mat2)

        val mat4 = mat.rotate(90.0, Vec3d(0.0, 0.0, 1.0))

        assertEquals(Vec4d(c * 5.0 - s * 4.0, 5.0, 2.0, 3.0), mat4.translation)

        val mat5 = Mat4d.rotation(90.0, Vec3d(0.0, 1.0, 0.0))
        val mat6 = Mat4d(c, 0.0, -s, 0.0, 0.0, 1.0, 0.0, 0.0, s, 0.0, c, 0.0, 0.0, 0.0, 0.0, 1.0)

        assertEquals(mat6, mat5)

        val mat7 = Mat4d.rotation(90.0, Vec3d(1.0, 0.0, 0.0))
        val mat8 = Mat4d(1.0, 0.0, 0.0, 0.0, 0.0, c, s, 0.0, 0.0, -s, c, 0.0, 0.0, 0.0, 0.0, 1.0)

        assertEquals(mat8, mat7)
    }
}