package uk.co.newagedev.knade.math

import kotlin.test.Test
import kotlin.test.assertEquals

class VectorTest {

    @Test
    fun createVec2fWithSpecificValues() {
        val vec = Vec2f(1.5f, -2.5f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
    }

    @Test
    fun createVec3fWithSpecificValues() {
        val vec = Vec3f(1.5f, -2.5f, 1.2f)

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)
        assertEquals(1.2f, vec.z)
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
}