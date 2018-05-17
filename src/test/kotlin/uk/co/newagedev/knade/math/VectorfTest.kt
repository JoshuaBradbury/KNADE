package uk.co.newagedev.knade.math

import kotlin.math.sqrt
import kotlin.test.*

class VectorfTest {

    @Test
    fun createVec2fWithSpecificValues() {
        val vec = Vec2f(1.5f, -2.5f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)

        vec.x = 2.5f
        vec.y = -5f

        assertEquals(2.5f, vec.x)
        assertEquals(-5f, vec.y)

        vec.r = 1.25f
        vec.g = -3f

        assertEquals(1.25f, vec.x)
        assertEquals(-3f, vec.y)

        vec.s = -11.5f
        vec.t = 7f

        assertEquals(-11.5f, vec.x)
        assertEquals(7f, vec.y)
    }

    @Test
    fun createVec3fWithSpecificValues() {
        val vec = Vec3f(1.5f, -2.5f, 1.2f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)

        vec.x = 2.5f
        vec.y = -5f
        vec.z = 75.16f

        assertEquals(2.5f, vec.x)
        assertEquals(-5f, vec.y)
        assertEquals(75.16f, vec.z)

        vec.r = 1.25f
        vec.g = -3f
        vec.b = 43.275f

        assertEquals(1.25f, vec.x)
        assertEquals(-3f, vec.y)
        assertEquals(43.275f, vec.z)

        vec.s = -11.5f
        vec.t = 7f
        vec.p = 16.75f

        assertEquals(-11.5f, vec.x)
        assertEquals(7f, vec.y)
        assertEquals(16.75f, vec.z)
    }

    @Test
    fun createVec3fWithVec2fAndSpecificValue() {
        val vec = Vec3f(Vec2f(1.5f, -2.5f), 1.2f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
    }

    @Test
    fun createVec3fWithDifferentVec2fAndSpecificValue() {
        val vec = Vec3f(1.5f, Vec2f(-2.5f, 1.2f))

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
    }

    @Test
    fun createVec4fWithSpecificValues() {
        val vec = Vec4f(1.5f, -2.5f, 1.2f, -5.3f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
        assertEquals(-5.3f, vec.w)

        vec.x = 2.5f
        vec.y = -5f
        vec.z = 75.16f
        vec.w = -24.65f

        assertEquals(2.5f, vec.x)
        assertEquals(-5f, vec.y)
        assertEquals(75.16f, vec.z)
        assertEquals(-24.65f, vec.w)

        vec.r = 1.25f
        vec.g = -3f
        vec.b = 43.275f
        vec.a = -13.5f

        assertEquals(1.25f, vec.x)
        assertEquals(-3f, vec.y)
        assertEquals(43.275f, vec.z)
        assertEquals(-13.5f, vec.w)

        vec.s = -11.5f
        vec.t = 7f
        vec.p = 16.75f
        vec.q = -25.33f

        assertEquals(-11.5f, vec.x)
        assertEquals(7f, vec.y)
        assertEquals(16.75f, vec.z)
        assertEquals(-25.33f, vec.w)
    }

    @Test
    fun createVec4fWithVec3fAndSpecificValue() {
        val vec = Vec4f(Vec3f(1.5f, -2.5f, 1.2f), -5.3f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
        assertEquals(-5.3f, vec.w)
    }

    @Test
    fun createVec4fWithDifferentVec3fAndSpecificValue() {
        val vec = Vec4f(1.5f, Vec3f(-2.5f, 1.2f, -5.3f))

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
        assertEquals(-5.3f, vec.w)
    }

    @Test
    fun createVec4fWithVec2fAndSpecificValues() {
        val vec = Vec4f(Vec2f(1.5f, -2.5f), 1.2f, -5.3f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
        assertEquals(-5.3f, vec.w)
    }

    @Test
    fun createVec4fWithDifferentVec2fAndSpecificValues() {
        val vec = Vec4f(1.5f, Vec2f(-2.5f, 1.2f), -5.3f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
        assertEquals(-5.3f, vec.w)
    }

    @Test
    fun createVec4fWithVeryDifferentVec2fAndSpecificValues() {
        val vec = Vec4f(1.5f, -2.5f, Vec2f(1.2f, -5.3f))

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
        assertEquals(-5.3f, vec.w)
    }

    @Test
    fun createVec2fReadRG() {
        val vec = Vec2f(1.5f, -2.5f)

        assertEquals(1.5f, vec.r)
        assertEquals(-2.5f, vec.g)
    }

    @Test
    fun createVec3fReadRGB() {
        val vec = Vec3f(1.5f, -2.5f, 1.2f)

        assertEquals(1.5f, vec.r)
        assertEquals(-2.5f, vec.g)
        assertEquals(1.2f, vec.b)
    }

    @Test
    fun createVec4fReadRGBW() {
        val vec = Vec4f(1.5f, -2.5f, 1.2f, -5.3f)

        assertEquals(1.5f, vec.r)
        assertEquals(-2.5f, vec.g)
        assertEquals(1.2f, vec.b)
        assertEquals(-5.3f, vec.a)
    }

    @Test
    fun createVec2fReadST() {
        val vec = Vec2f(1.5f, -2.5f)

        assertEquals(1.5f, vec.s)
        assertEquals(-2.5f, vec.t)
    }

    @Test
    fun createVec3fReadSTP() {
        val vec = Vec3f(1.5f, -2.5f, 1.2f)

        assertEquals(1.5f, vec.s)
        assertEquals(-2.5f, vec.t)
        assertEquals(1.2f, vec.p)
    }

    @Test
    fun createVec4fReadSTPQ() {
        val vec = Vec4f(1.5f, -2.5f, 1.2f, -5.3f)

        assertEquals(1.5f, vec.s)
        assertEquals(-2.5f, vec.t)
        assertEquals(1.2f, vec.p)
        assertEquals(-5.3f, vec.q)
    }

    @Test
    fun vec2fEqualsVec2f() {
        val vec = Vec2f(1.0f)
        val vec2 = Vec2f(2.0f)
        val vec3 = Vec2f(1.0f, 1.0f)
        val vec4: Any = Vec4f(1.0f)
        val vec5 = Vec2f(1.0f, 2.0f)

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
    fun vec3fEqualsVec3f() {
        val vec = Vec3f(1.0f)
        val vec2 = Vec3f(2.0f)
        val vec3 = Vec3f(1.0f, 1.0f, 1.0f)
        val vec4: Any = Vec4f(1.0f)
        val vec5 = Vec3f(1.0f, 2.0f, 1.0f)
        val vec6 = Vec3f(1.0f, 1.0f, 2.0f)

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
    fun vec4fEqualsVec4f() {
        val vec = Vec4f(1.0f)
        val vec2 = Vec4f(2.0f)
        val vec3 = Vec4f(1.0f, 1.0f, 1.0f, 1.0f)
        val vec4: Any = Vec2f(1.0f)
        val vec5 = Vec4f(1.0f, 2.0f, 1.0f, 1.0f)
        val vec6 = Vec4f(1.0f, 1.0f, 2.0f, 1.0f)
        val vec7 = Vec4f(1.0f, 1.0f, 1.0f, 2.0f)

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
    fun vec2fToString() {
        assertEquals("Vec2f(x=1.0, y=1.0)", Vec2f(1.0f).toString())
    }

    @Test
    fun vec3fToString() {
        assertEquals("Vec3f(x=1.0, y=1.0, z=1.0)", Vec3f(1.0f).toString())
    }

    @Test
    fun vec4fToString() {
        assertEquals("Vec4f(x=1.0, y=1.0, z=1.0, w=1.0)", Vec4f(1.0f).toString())
    }

    @Test
    fun vec2fCopy() {
        val vec = Vec2f(1.0f)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec3fCopy() {
        val vec = Vec3f(1.0f)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec4fCopy() {
        val vec = Vec4f(1.0f)
        assertEquals(vec.copy(), vec)
    }

    @Test
    fun vec2fPlus() {
        val vec = Vec2f(1.0f, -5.0f)
        val vec2 = Vec2f(1.0f, 3.5f)
        val vec3 = Vec2f(2.0f, -1.5f)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3fPlus() {
        val vec = Vec3f(1.0f, -5.0f, 4.75f)
        val vec2 = Vec3f(1.0f, 3.5f, 6.5f)
        val vec3 = Vec3f(2.0f, -1.5f, 11.25f)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4fPlus() {
        val vec = Vec4f(1.0f, -5.0f, 4.75f, -22.4f)
        val vec2 = Vec4f(1.0f, 3.5f, 6.5f, 10.0f)
        val vec3 = Vec4f(2.0f, -1.5f, 11.25f, -12.4f)
        val vec4 = vec + vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2fMinus() {
        val vec = Vec2f(1.0f, -5.0f)
        val vec2 = Vec2f(1.0f, 3.5f)
        val vec3 = Vec2f(0.0f, -8.5f)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3fMinus() {
        val vec = Vec3f(1.0f, -5.0f, 4.75f)
        val vec2 = Vec3f(1.0f, 3.5f, 6.5f)
        val vec3 = Vec3f(0.0f, -8.5f, -1.75f)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4fMinus() {
        val vec = Vec4f(1.0f, -5.0f, 4.75f, -22.4f)
        val vec2 = Vec4f(1.0f, 3.5f, 6.5f, 10.0f)
        val vec3 = Vec4f(0.0f, -8.5f, -1.75f, -32.4f)
        val vec4 = vec - vec2

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2fTimes() {
        val vec = Vec2f(1.0f, -5.0f)
        val vec3 = Vec2f(2.5f, -12.5f)
        val vec4 = vec * 2.5f

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3fTimes() {
        val vec = Vec3f(1.0f, -5.0f, 4.75f)
        val vec3 = Vec3f(2.5f, -12.5f, 11.875f)
        val vec4 = vec * 2.5f

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4fTimes() {
        val vec = Vec4f(1.0f, -5.0f, 4.75f, -22.4f)
        val vec3 = Vec4f(2.5f, -12.5f, 11.875f, -56.0f)
        val vec4 = vec * 2.5f

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2fDiv() {
        val vec = Vec2f(1.0f, -5.0f)
        val vec3 = Vec2f(0.4f, -2.0f)
        val vec4 = vec / 2.5f

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
    }

    @Test
    fun vec3fDiv() {
        val vec = Vec3f(1.0f, -5.0f, 4.75f)
        val vec3 = Vec3f(0.4f, -2.0f, 1.9f)
        val vec4 = vec / 2.5f

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
    }

    @Test
    fun vec4fDiv() {
        val vec = Vec4f(1.0f, -5.0f, 4.75f, -22.4f)
        val vec3 = Vec4f(0.4f, -2.0f, 1.9f, -8.96f)
        val vec4 = vec / 2.5f

        assertEquals(vec3.x, vec4.x)
        assertEquals(vec3.y, vec4.y)
        assertEquals(vec3.z, vec4.z)
        assertEquals(vec3.w, vec4.w)
    }

    @Test
    fun vec2fLen() {
        val vec = Vec2f(1.0f, -5.0f)

        assertEquals(sqrt(26.0f), vec.len())
    }

    @Test
    fun vec3fLen() {
        val vec = Vec3f(1.0f, -5.0f, 4.75f)

        assertEquals(sqrt(48.5625f), vec.len())
    }

    @Test
    fun vec4fLen() {
        val vec = Vec4f(1.0f, -5.0f, 4.75f, -22.4f)

        assertEquals(sqrt(550.3225f), vec.len())
    }

    @Test
    fun vec2fNorm() {
        val vec = Vec2f(3.0f, 4.0f)
        val vec2 = vec.norm()

        assertEquals(0.6f, vec2.x)
        assertEquals(0.8f, vec2.y)
    }

    @Test
    fun vec3fNorm() {
        val vec = Vec3f(1.0f, 4.0f, 8.0f)
        val vec2 = vec.norm()

        assertEquals(1.0f / 9.0f, vec2.x)
        assertEquals(4.0f / 9.0f, vec2.y)
        assertEquals(8.0f / 9.0f, vec2.z)
    }

    @Test
    fun vec4fNorm() {
        val vec = Vec4f(1.0f, 3.0f, 5.0f, 17.0f)
        val vec2 = vec.norm()

        assertEquals(1.0f / 18.0f, vec2.x)
        assertEquals(3.0f / 18.0f, vec2.y)
        assertEquals(5.0f / 18.0f, vec2.z)
        assertEquals(17.0f / 18.0f, vec2.w)
    }

    @Test
    fun vec2fDot() {
        val vec = Vec2f(2f, -3f)
        val vec2 = Vec2f(3f, 6f)

        assertEquals(-12f, vec dot vec2)
    }

    @Test
    fun vec3fDot() {
        val vec = Vec3f(2f, -3f, 4f)
        val vec2 = Vec3f(3f, 6f, 8f)

        assertEquals(20f, vec dot vec2)
    }

    @Test
    fun vec4fDot() {
        val vec = Vec4f(2f, -3f, 4f, -5f)
        val vec2 = Vec4f(3f, 6f, 8f, -4f)

        assertEquals(40f, vec dot vec2)
    }

    @Test
    fun vec3fCross() {
        val vec = Vec3f(1.0f,0.0f,0.0f)
        val vec2 = Vec3f(0.0f,1.0f,0.0f)
        val vec3 = Vec3f(0.0f,0.0f,1.0f)
        val vec4 = Vec3f(0.0f,0.0f,-1.0f)

        assertEquals(vec3, vec cross vec2)
        assertEquals(vec4, vec2 cross vec)
    }

    @Test
    fun vec2fDataStructConversions() {
        val vec = Vec2f(-5.0f, 2.1f)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5.0f, 2.1f), list)
        assertEquals(-5.0f, array[0])
        assertEquals(2.1f, array[1])
        assertEquals(arrayListOf(-5.0f, 2.1f), arrayList)
        assertEquals(mutableListOf(-5.0f, 2.1f), mutableList)
    }

    @Test
    fun vec3fDataStructConversions() {
        val vec = Vec3f(-5.0f, 2.1f, 7.6f)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5.0f, 2.1f, 7.6f), list)
        assertEquals(-5.0f, array[0])
        assertEquals(2.1f, array[1])
        assertEquals(7.6f, array[2])
        assertEquals(arrayListOf(-5.0f, 2.1f, 7.6f), arrayList)
        assertEquals(mutableListOf(-5.0f, 2.1f, 7.6f), mutableList)
    }

    @Test
    fun vec4fDataStructConversions() {
        val vec = Vec4f(-5.0f, 2.1f, 7.6f, -11.2f)

        val list = vec.toList()
        val array = vec.toArray()
        val arrayList = vec.toArrayList()
        val mutableList = vec.toMutableList()

        assertEquals(listOf(-5.0f, 2.1f, 7.6f, -11.2f), list)
        assertEquals(-5.0f, array[0])
        assertEquals(2.1f, array[1])
        assertEquals(7.6f, array[2])
        assertEquals(-11.2f, array[3])
        assertEquals(arrayListOf(-5.0f, 2.1f, 7.6f, -11.2f), arrayList)
        assertEquals(mutableListOf(-5.0f, 2.1f, 7.6f, -11.2f), mutableList)
    }
}