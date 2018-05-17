package uk.co.newagedev.knade.math

import kotlin.math.sqrt
import kotlin.test.*

class VectordTest {

    @Test
    fun createVec2dWithSpecificValues() {
        val vec = Vec2d(1.5, -2.5)

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)

        vec.x = 2.5
        vec.y = -5.0

        assertEquals(2.5, vec.x)
        assertEquals(-5.0, vec.y)

        vec.r = 1.25
        vec.g = -3.0

        assertEquals(1.25, vec.x)
        assertEquals(-3.0, vec.y)

        vec.s = -11.5
        vec.t = 7.0

        assertEquals(-11.5, vec.x)
        assertEquals(7.0, vec.y)
    }

    @Test
    fun createVec3dWithSpecificValues() {
        val vec = Vec3d(1.5, -2.5, 1.2)

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)

        vec.x = 2.5
        vec.y = -5.0
        vec.z = 75.16

        assertEquals(2.5, vec.x)
        assertEquals(-5.0, vec.y)
        assertEquals(75.16, vec.z)

        vec.r = 1.25
        vec.g = -3.0
        vec.b = 43.275

        assertEquals(1.25, vec.x)
        assertEquals(-3.0, vec.y)
        assertEquals(43.275, vec.z)

        vec.s = -11.5
        vec.t = 7.0
        vec.p = 16.75

        assertEquals(-11.5, vec.x)
        assertEquals(7.0, vec.y)
        assertEquals(16.75, vec.z)
    }

    @Test
    fun createVec3dWithVec2dAndSpecificValue() {
        val vec = Vec3d(Vec2d(1.5, -2.5), 1.2)

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
    }

    @Test
    fun createVec3dWithDifferentVec2dAndSpecificValue() {
        val vec = Vec3d(1.5, Vec2d(-2.5, 1.2))

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
    }

    @Test
    fun createVec4dWithSpecificValues() {
        val vec = Vec4d(1.5, -2.5, 1.2, -5.3)

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
        assertEquals(-5.3, vec.w)

        vec.x = 2.5
        vec.y = -5.0
        vec.z = 75.16
        vec.w = -24.65

        assertEquals(2.5, vec.x)
        assertEquals(-5.0, vec.y)
        assertEquals(75.16, vec.z)
        assertEquals(-24.65, vec.w)

        vec.r = 1.25
        vec.g = -3.0
        vec.b = 43.275
        vec.a = -13.5

        assertEquals(1.25, vec.x)
        assertEquals(-3.0, vec.y)
        assertEquals(43.275, vec.z)
        assertEquals(-13.5, vec.w)

        vec.s = -11.5
        vec.t = 7.0
        vec.p = 16.75
        vec.q = -25.33

        assertEquals(-11.5, vec.x)
        assertEquals(7.0, vec.y)
        assertEquals(16.75, vec.z)
        assertEquals(-25.33, vec.w)
    }

    @Test
    fun createVec4dWithVec3dAndSpecificValue() {
        val vec = Vec4d(Vec3d(1.5, -2.5, 1.2), -5.3)

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
        assertEquals(-5.3, vec.w)
    }

    @Test
    fun createVec4dWithDifferentVec3dAndSpecificValue() {
        val vec = Vec4d(1.5, Vec3d(-2.5, 1.2, -5.3))

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
        assertEquals(-5.3, vec.w)
    }

    @Test
    fun createVec4dWithVec2dAndSpecificValues() {
        val vec = Vec4d(Vec2d(1.5, -2.5), 1.2, -5.3)

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
        assertEquals(-5.3, vec.w)
    }

    @Test
    fun createVec4dWithDifferentVec2dAndSpecificValues() {
        val vec = Vec4d(1.5, Vec2d(-2.5, 1.2), -5.3)

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
        assertEquals(-5.3, vec.w)
    }

    @Test
    fun createVec4dWithVeryDifferentVec2dAndSpecificValues() {
        val vec = Vec4d(1.5, -2.5, Vec2d(1.2, -5.3))

        assertEquals(1.5, vec.x)
        assertEquals(-2.5, vec.y)
        assertEquals(1.2, vec.z)
        assertEquals(-5.3, vec.w)
    }

    @Test
    fun createVec2dReadRG() {
        val vec = Vec2d(1.5, -2.5)

        assertEquals(1.5, vec.r)
        assertEquals(-2.5, vec.g)
    }

    @Test
    fun createVec3dReadRGB() {
        val vec = Vec3d(1.5, -2.5, 1.2)

        assertEquals(1.5, vec.r)
        assertEquals(-2.5, vec.g)
        assertEquals(1.2, vec.b)
    }

    @Test
    fun createVec4dReadRGBW() {
        val vec = Vec4d(1.5, -2.5, 1.2, -5.3)

        assertEquals(1.5, vec.r)
        assertEquals(-2.5, vec.g)
        assertEquals(1.2, vec.b)
        assertEquals(-5.3, vec.a)
    }

    @Test
    fun createVec2dReadST() {
        val vec = Vec2d(1.5, -2.5)

        assertEquals(1.5, vec.s)
        assertEquals(-2.5, vec.t)
    }

    @Test
    fun createVec3dReadSTP() {
        val vec = Vec3d(1.5, -2.5, 1.2)

        assertEquals(1.5, vec.s)
        assertEquals(-2.5, vec.t)
        assertEquals(1.2, vec.p)
    }

    @Test
    fun createVec4dReadSTPQ() {
        val vec = Vec4d(1.5, -2.5, 1.2, -5.3)

        assertEquals(1.5, vec.s)
        assertEquals(-2.5, vec.t)
        assertEquals(1.2, vec.p)
        assertEquals(-5.3, vec.q)
    }

    @Test
    fun vec2dEqualsVec2d() {
        val vec = Vec2d(1.0)
        val vec2 = Vec2d(2.0)
        val vec3 = Vec2d(1.0, 1.0)
        val vec4: Any = Vec4d(1.0)
        val vec5 = Vec2d(1.0, 2.0)

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
    fun vec3dEqualsVec3d() {
        val vec = Vec3d(1.0)
        val vec2 = Vec3d(2.0)
        val vec3 = Vec3d(1.0, 1.0, 1.0)
        val vec4: Any = Vec4d(1.0)
        val vec5 = Vec3d(1.0, 2.0, 1.0)
        val vec6 = Vec3d(1.0, 1.0, 2.0)

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
    fun vec4dEqualsVec4d() {
        val vec = Vec4d(1.0)
        val vec2 = Vec4d(2.0)
        val vec3 = Vec4d(1.0, 1.0, 1.0, 1.0)
        val vec4: Any = Vec2d(1.0)
        val vec5 = Vec4d(1.0, 2.0, 1.0, 1.0)
        val vec6 = Vec4d(1.0, 1.0, 2.0, 1.0)
        val vec7 = Vec4d(1.0, 1.0, 1.0, 2.0)

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
    fun vec2dToString() {
        assertEquals("Vec2d(x=1.0, y=1.0)", Vec2d(1.0).toString())
    }

    @Test
    fun vec3dToString() {
        assertEquals("Vec3d(x=1.0, y=1.0, z=1.0)", Vec3d(1.0).toString())
    }

    @Test
    fun vec4dToString() {
        assertEquals("Vec4d(x=1.0, y=1.0, z=1.0, w=1.0)", Vec4d(1.0).toString())
    }

    @Test
    fun vec2dCopy() {
        val vec = Vec2d(1.0)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec3dCopy() {
        val vec = Vec3d(1.0)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec4dCopy() {
        val vec = Vec4d(1.0)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec2dPlus() {
        val vec = Vec2d(1.0, -5.0)
        val vec2 = Vec2d(1.0, 3.5)
        val vec3 = Vec2d(2.0, -1.5)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3dPlus() {
        val vec = Vec3d(1.0, -5.0, 4.75)
        val vec2 = Vec3d(1.0, 3.5, 6.5)
        val vec3 = Vec3d(2.0, -1.5, 11.25)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4dPlus() {
        val vec = Vec4d(1.0, -5.0, 4.75, -22.3)
        val vec2 = Vec4d(1.0, 3.5, 6.5, 10.0)
        val vec3 = Vec4d(2.0, -1.5, 11.25, -12.3)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2dMinus() {
        val vec = Vec2d(1.0, -5.0)
        val vec2 = Vec2d(1.0, 3.5)
        val vec3 = Vec2d(0.0, -8.5)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3dMinus() {
        val vec = Vec3d(1.0, -5.0, 4.75)
        val vec2 = Vec3d(1.0, 3.5, 6.5)
        val vec3 = Vec3d(0.0, -8.5, -1.75)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4dMinus() {
        val vec = Vec4d(1.0, -5.0, 4.75, -22.4)
        val vec2 = Vec4d(1.0, 3.5, 6.5, 10.0)
        val vec3 = Vec4d(0.0, -8.5, -1.75, -32.4)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2dTimes() {
        val vec = Vec2d(1.0, -5.0)
        val vec3 = Vec2d(2.5, -12.5)
        val vec4 = vec * 2.5

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3dTimes() {
        val vec = Vec3d(1.0, -5.0, 4.75)
        val vec3 = Vec3d(2.5, -12.5, 11.875)
        val vec4 = vec * 2.5

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4dTimes() {
        val vec = Vec4d(1.0, -5.0, 4.75, -22.4)
        val vec3 = Vec4d(2.5, -12.5, 11.875, -56.0)
        val vec4 = vec * 2.5

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2dDiv() {
        val vec = Vec2d(1.0, -5.0)
        val vec3 = Vec2d(0.4, -2.0)
        val vec4 = vec / 2.5

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3dDiv() {
        val vec = Vec3d(1.0, -5.0, 4.75)
        val vec3 = Vec3d(0.4, -2.0, 1.9)
        val vec4 = vec / 2.5

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4dDiv() {
        val vec = Vec4d(1.0, -5.0, 4.75, -22.0)
        val vec3 = Vec4d(0.4, -2.0, 1.9, -8.8)
        val vec4 = vec / 2.5

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2dLen() {
        val vec = Vec2d(1.0, -5.0)

        assertEquals(sqrt(26.0), vec.len())
    }

    @Test
    fun vec3dLen() {
        val vec = Vec3d(1.0, -5.0, 4.75)

        assertEquals(sqrt(48.5625), vec.len())
    }

    @Test
    fun vec4dLen() {
        val vec = Vec4d(1.0, -5.0, 4.75, -22.4)

        assertEquals(sqrt(550.3225), vec.len())
    }

    @Test
    fun vec2dNorm() {
        val vec = Vec2d(3.0, 4.0)
        val vec2 = vec.norm()

        assertEquals(0.6, vec2.x)
        assertEquals(0.8, vec2.y)
    }

    @Test
    fun vec3dNorm() {
        val vec = Vec3d(1.0, 4.0, 8.0)
        val vec2 = vec.norm()

        assertEquals(1.0 / 9.0, vec2.x)
        assertEquals(4.0 / 9.0, vec2.y)
        assertEquals(8.0 / 9.0, vec2.z)
    }

    @Test
    fun vec4dNorm() {
        val vec = Vec4d(1.0, 3.0, 5.0, 17.0)
        val vec2 = vec.norm()

        assertEquals(1.0 / 18.0, vec2.x)
        assertEquals(3.0 / 18.0, vec2.y)
        assertEquals(5.0 / 18.0, vec2.z)
        assertEquals(17.0 / 18.0, vec2.w)
    }

    @Test
    fun vec2dDot() {
        val vec = Vec2d(2.0, -3.0)
        val vec2 = Vec2d(3.0, 6.0)

        assertEquals(-12.0, vec dot vec2)
    }

    @Test
    fun vec3dDot() {
        val vec = Vec3d(2.0, -3.0, 4.0)
        val vec2 = Vec3d(3.0, 6.0, 8.0)

        assertEquals(20.0, vec dot vec2)
    }

    @Test
    fun vec4dDot() {
        val vec = Vec4d(2.0, -3.0, 4.0, -5.0)
        val vec2 = Vec4d(3.0, 6.0, 8.0, -4.0)

        assertEquals(40.0, vec dot vec2)
    }

    @Test
    fun vec3dCross() {
        val vec = Vec3d(1.0,0.0,0.0)
        val vec2 = Vec3d(0.0,1.0,0.0)
        val vec3 = Vec3d(0.0,0.0,1.0)
        val vec4 = Vec3d(0.0,0.0,-1.0)

        assertEquals(vec3, vec cross vec2)
        assertEquals(vec4, vec2 cross vec)
    }

    @Test
    fun vec2dDataStructConversions() {
        val vec = Vec2d(-5.0, 2.1)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5.0, 2.1), list)
        assertEquals(-5.0, array[0])
        assertEquals(2.1, array[1])
        assertEquals(arrayListOf(-5.0, 2.1), arrayList)
        assertEquals(mutableListOf(-5.0, 2.1), mutableList)
    }

    @Test
    fun vec3dDataStructConversions() {
        val vec = Vec3d(-5.0, 2.1, 7.6)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5.0, 2.1, 7.6), list)
        assertEquals(-5.0, array[0])
        assertEquals(2.1, array[1])
        assertEquals(7.6, array[2])
        assertEquals(arrayListOf(-5.0, 2.1, 7.6), arrayList)
        assertEquals(mutableListOf(-5.0, 2.1, 7.6), mutableList)
    }

    @Test
    fun vec4dDataStructConversions() {
        val vec = Vec4d(-5.0, 2.1, 7.6, -11.2)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5.0, 2.1, 7.6, -11.2), list)
        assertEquals(-5.0, array[0])
        assertEquals(2.1, array[1])
        assertEquals(7.6, array[2])
        assertEquals(-11.2, array[3])
        assertEquals(arrayListOf(-5.0, 2.1, 7.6, -11.2), arrayList)
        assertEquals(mutableListOf(-5.0, 2.1, 7.6, -11.2), mutableList)
    }
}