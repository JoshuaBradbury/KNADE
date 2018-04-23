package uk.co.newagedev.knade.math

import kotlin.test.*

class VectorTest {

    @Test
    fun createVec2fWithSpecificValues() {
        val vec = Vec2f(1.5f, -2.5f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)

        vec.x = 2.5f
        vec.y = -5f

        assertEquals(2.5f, vec.x)
        assertEquals(-5f, vec.y)
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
}