package uk.co.newagedev.knade.math

import kotlin.math.sqrt
import kotlin.test.*

class VectoriTest {

    @Test
    fun createVec2iWithSpecificValues() {
        val vec = Vec2i(1, -2)

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)

        vec.x = 2
        vec.y = -5

        assertEquals(2, vec.x)
        assertEquals(-5, vec.y)

        vec.r = 1
        vec.g = -3

        assertEquals(1, vec.x)
        assertEquals(-3, vec.y)

        vec.s = -11
        vec.t = 7

        assertEquals(-11, vec.x)
        assertEquals(7, vec.y)
    }

    @Test
    fun createVec3iWithSpecificValues() {
        val vec = Vec3i(1, -2, 1)

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)

        vec.x = 2
        vec.y = -5
        vec.z = 75

        assertEquals(2, vec.x)
        assertEquals(-5, vec.y)
        assertEquals(75, vec.z)

        vec.r = 1
        vec.g = -3
        vec.b = 43

        assertEquals(1, vec.x)
        assertEquals(-3, vec.y)
        assertEquals(43, vec.z)

        vec.s = -11
        vec.t = 7
        vec.p = 16

        assertEquals(-11, vec.x)
        assertEquals(7, vec.y)
        assertEquals(16, vec.z)
    }

    @Test
    fun createVec3iWithVec2iAndSpecificValue() {
        val vec = Vec3i(Vec2i(1, -2), 1)

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
    }

    @Test
    fun createVec3iWithDifferentVec2iAndSpecificValue() {
        val vec = Vec3i(1, Vec2i(-2, 1))

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
    }

    @Test
    fun createVec4iWithSpecificValues() {
        val vec = Vec4i(1, -2, 1, -5)

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
        assertEquals(-5, vec.w)

        vec.x = 2
        vec.y = -5
        vec.z = 75
        vec.w = -24

        assertEquals(2, vec.x)
        assertEquals(-5, vec.y)
        assertEquals(75, vec.z)
        assertEquals(-24, vec.w)

        vec.r = 1
        vec.g = -3
        vec.b = 43
        vec.a = -13

        assertEquals(1, vec.x)
        assertEquals(-3, vec.y)
        assertEquals(43, vec.z)
        assertEquals(-13, vec.w)

        vec.s = -11
        vec.t = 7
        vec.p = 16
        vec.q = -25

        assertEquals(-11, vec.x)
        assertEquals(7, vec.y)
        assertEquals(16, vec.z)
        assertEquals(-25, vec.w)
    }

    @Test
    fun createVec4iWithVec3iAndSpecificValue() {
        val vec = Vec4i(Vec3i(1, -2, 1), -5)

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
        assertEquals(-5, vec.w)
    }

    @Test
    fun createVec4iWithDifferentVec3iAndSpecificValue() {
        val vec = Vec4i(1, Vec3i(-2, 1, -5))

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
        assertEquals(-5, vec.w)
    }

    @Test
    fun createVec4iWithVec2iAndSpecificValues() {
        val vec = Vec4i(Vec2i(1, -2), 1, -5)

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
        assertEquals(-5, vec.w)
    }

    @Test
    fun createVec4iWithDifferentVec2iAndSpecificValues() {
        val vec = Vec4i(1, Vec2i(-2, 1), -5)

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
        assertEquals(-5, vec.w)
    }

    @Test
    fun createVec4iWithVeryDifferentVec2iAndSpecificValues() {
        val vec = Vec4i(1, -2, Vec2i(1, -5))

        assertEquals(1, vec.x)
        assertEquals(-2, vec.y)
        assertEquals(1, vec.z)
        assertEquals(-5, vec.w)
    }

    @Test
    fun createVec2iReadRG() {
        val vec = Vec2i(1, -2)

        assertEquals(1, vec.r)
        assertEquals(-2, vec.g)
    }

    @Test
    fun createVec3iReadRGB() {
        val vec = Vec3i(1, -2, 1)

        assertEquals(1, vec.r)
        assertEquals(-2, vec.g)
        assertEquals(1, vec.b)
    }

    @Test
    fun createVec4iReadRGBW() {
        val vec = Vec4i(1, -2, 1, -5)

        assertEquals(1, vec.r)
        assertEquals(-2, vec.g)
        assertEquals(1, vec.b)
        assertEquals(-5, vec.a)
    }

    @Test
    fun createVec2iReadST() {
        val vec = Vec2i(1, -2)

        assertEquals(1, vec.s)
        assertEquals(-2, vec.t)
    }

    @Test
    fun createVec3iReadSTP() {
        val vec = Vec3i(1, -2, 1)

        assertEquals(1, vec.s)
        assertEquals(-2, vec.t)
        assertEquals(1, vec.p)
    }

    @Test
    fun createVec4iReadSTPQ() {
        val vec = Vec4i(1, -2, 1, -5)

        assertEquals(1, vec.s)
        assertEquals(-2, vec.t)
        assertEquals(1, vec.p)
        assertEquals(-5, vec.q)
    }

    @Test
    fun vec2iEqualsVec2i() {
        val vec = Vec2i(1)
        val vec2 = Vec2i(2)
        val vec3 = Vec2i(1, 1)
        val vec4: Any = Vec4i(1)
        val vec5 = Vec2i(1, 2)

        assertTrue(vec == vec)
        assertFalse(vec == vec2)
        assertTrue(vec == vec3)
        assertFalse(vec == vec4)
        assertFalse(vec == vec5)

        assertNotNull(vec.hashCode())

        assertEquals(vec.x, vec.component1())
        assertEquals(vec.y, vec.component2())
    }

    @Test
    fun vec3iEqualsVec3i() {
        val vec = Vec3i(1)
        val vec2 = Vec3i(2)
        val vec3 = Vec3i(1, 1, 1)
        val vec4: Any = Vec4i(1)
        val vec5 = Vec3i(1, 2, 1)
        val vec6 = Vec3i(1, 1, 2)

        assertTrue(vec == vec)
        assertFalse(vec == vec2)
        assertTrue(vec == vec3)
        assertFalse(vec == vec4)
        assertFalse(vec == vec5)
        assertFalse(vec == vec6)

        assertNotNull(vec.hashCode())

        assertEquals(vec.x, vec.component1())
        assertEquals(vec.y, vec.component2())
        assertEquals(vec.z, vec.component3())
    }

    @Test
    fun vec4iEqualsVec4i() {
        val vec = Vec4i(1)
        val vec2 = Vec4i(2)
        val vec3 = Vec4i(1, 1, 1, 1)
        val vec4: Any = Vec2i(1)
        val vec5 = Vec4i(1, 2, 1, 1)
        val vec6 = Vec4i(1, 1, 2, 1)
        val vec7 = Vec4i(1, 1, 1, 2)

        assertTrue(vec == vec)
        assertFalse(vec == vec2)
        assertTrue(vec == vec3)
        assertFalse(vec == vec4)
        assertFalse(vec == vec5)
        assertFalse(vec == vec6)
        assertFalse(vec == vec7)

        assertNotNull(vec.hashCode())

        assertEquals(vec.x, vec.component1())
        assertEquals(vec.y, vec.component2())
        assertEquals(vec.z, vec.component3())
        assertEquals(vec.z, vec.component4())
    }

    @Test
    fun vec2iToString() {
        assertEquals("Vec2i(x=1, y=1)", Vec2i(1).toString())
    }

    @Test
    fun vec3iToString() {
        assertEquals("Vec3i(x=1, y=1, z=1)", Vec3i(1).toString())
    }

    @Test
    fun vec4iToString() {
        assertEquals("Vec4i(x=1, y=1, z=1, w=1)", Vec4i(1).toString())
    }

    @Test
    fun vec2iCopy() {
        val vec = Vec2i(1)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec3iCopy() {
        val vec = Vec3i(1)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec4iCopy() {
        val vec = Vec4i(1)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec2iPlus() {
        val vec = Vec2i(1, -5)
        val vec2 = Vec2i(1, 3)
        val vec3 = Vec2i(2, -2)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3iPlus() {
        val vec = Vec3i(1, -5, 4)
        val vec2 = Vec3i(1, 3, 6)
        val vec3 = Vec3i(2, -2, 10)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4iPlus() {
        val vec = Vec4i(1, -5, 4, -22)
        val vec2 = Vec4i(1, 3, 6, 10)
        val vec3 = Vec4i(2, -2, 10, -12)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2iMinus() {
        val vec = Vec2i(1, -5)
        val vec2 = Vec2i(1, 3)
        val vec3 = Vec2i(0, -8)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3iMinus() {
        val vec = Vec3i(1, -5, 4)
        val vec2 = Vec3i(1, 3, 6)
        val vec3 = Vec3i(0, -8, -2)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4iMinus() {
        val vec = Vec4i(1, -5, 4, -22)
        val vec2 = Vec4i(1, 3, 6, 10)
        val vec3 = Vec4i(0, -8, -2, -32)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2iTimes() {
        val vec = Vec2i(1, -5)
        val vec3 = Vec2i(2, -10)
        val vec4 = vec * 2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3iTimes() {
        val vec = Vec3i(1, -5, 4)
        val vec3 = Vec3i(2, -10, 8)
        val vec4 = vec * 2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4iTimes() {
        val vec = Vec4i(1, -5, 4, -22)
        val vec3 = Vec4i(2, -10, 8, -44)
        val vec4 = vec * 2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2iDiv() {
        val vec = Vec2i(1, -5)
        val vec3 = Vec2i(0, -2)
        val vec4 = vec / 2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3iDiv() {
        val vec = Vec3i(1, -5, 4)
        val vec3 = Vec3i(0, -2, 2)
        val vec4 = vec / 2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4iDiv() {
        val vec = Vec4i(1, -5, 4, -22)
        val vec3 = Vec4i(0, -2, 2, -11)
        val vec4 = vec / 2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2iLen() {
        val vec = Vec2i(1, -5)

        assertEquals(sqrt(26.0).toInt(), vec.len())
    }

    @Test
    fun vec3iLen() {
        val vec = Vec3i(1, -5, 4)

        assertEquals(sqrt(48.0).toInt(), vec.len())
    }

    @Test
    fun vec4iLen() {
        val vec = Vec4i(1, -5, 4, -22)

        assertEquals(sqrt(526.0).toInt(), vec.len())
    }

    @Test
    fun vec2iNorm() {
        val vec = Vec2i(3, 4)
        val vec2 = vec.norm()

        assertEquals(0, vec2.x)
        assertEquals(0, vec2.y)
    }

    @Test
    fun vec3iNorm() {
        val vec = Vec3i(1, 4, 8)
        val vec2 = vec.norm()

        assertEquals(1 / 9, vec2.x)
        assertEquals(4 / 9, vec2.y)
        assertEquals(8 / 9, vec2.z)
    }

    @Test
    fun vec4iNorm() {
        val vec = Vec4i(1, 3, 5, 17)
        val vec2 = vec.norm()

        assertEquals(1 / 18, vec2.x)
        assertEquals(3 / 18, vec2.y)
        assertEquals(5 / 18, vec2.z)
        assertEquals(17 / 18, vec2.w)
    }

    @Test
    fun vec2iDot() {
        val vec = Vec2i(2, -3)
        val vec2 = Vec2i(3, 6)

        assertEquals(-12, vec dot vec2)
    }

    @Test
    fun vec3iDot() {
        val vec = Vec3i(2, -3, 4)
        val vec2 = Vec3i(3, 6, 8)

        assertEquals(20, vec dot vec2)
    }

    @Test
    fun vec4iDot() {
        val vec = Vec4i(2, -3, 4, -5)
        val vec2 = Vec4i(3, 6, 8, -4)

        assertEquals(40, vec dot vec2)
    }

    @Test
    fun vec3iCross() {
        val vec = Vec3i(1,0,0)
        val vec2 = Vec3i(0,1,0)
        val vec3 = Vec3i(0,0,1)
        val vec4 = Vec3i(0,0,-1)

        assertEquals(vec3, vec cross vec2)
        assertEquals(vec4, vec2 cross vec)
    }

    @Test
    fun vec2iDataStructConversions() {
        val vec = Vec2i(-5, 2)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5, 2), list)
        assertEquals(-5, array[0])
        assertEquals(2, array[1])
        assertEquals(arrayListOf(-5, 2), arrayList)
        assertEquals(mutableListOf(-5, 2), mutableList)
    }

    @Test
    fun vec3iDataStructConversions() {
        val vec = Vec3i(-5, 2, 7)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5, 2, 7), list)
        assertEquals(-5, array[0])
        assertEquals(2, array[1])
        assertEquals(7, array[2])
        assertEquals(arrayListOf(-5, 2, 7), arrayList)
        assertEquals(mutableListOf(-5, 2, 7), mutableList)
    }

    @Test
    fun vec4iDataStructConversions() {
        val vec = Vec4i(-5, 2, 7, -11)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5, 2, 7, -11), list)
        assertEquals(-5, array[0])
        assertEquals(2, array[1])
        assertEquals(7, array[2])
        assertEquals(-11, array[3])
        assertEquals(arrayListOf(-5, 2, 7, -11), arrayList)
        assertEquals(mutableListOf(-5, 2, 7, -11), mutableList)
    }
}