package uk.co.newagedev.knade.math

import java.util.*
import kotlin.reflect.full.*
import kotlin.reflect.jvm.reflect
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class VectorSwizzleTest {

    @Test
    fun checkVec2fSwizzleXY() {
        val origVec = Vec2f(1.5f, -2.5f)
        val vec = origVec.xy

        assertEquals(1.5f, vec.x)
        assertEquals(-2.5f, vec.y)

        origVec.xy = Vec2f(1.0f, 2.5f)

        assertEquals(1.0f, origVec.x)
        assertEquals(2.5f, origVec.y)
    }

    @Test
    fun checkVec2fSwizzleYX() {
        val origVec = Vec2f(1.5f, -2.5f)
        val vec = origVec.yx

        assertEquals(-2.5f, vec.x)
        assertEquals(1.5f, vec.y)

        origVec.yx = Vec2f(1.0f, 2.5f)

        assertEquals(2.5f, origVec.x)
        assertEquals(1.0f, origVec.y)
    }

    @Test
    fun checkVec2fSwizzleXX() {
        val vec = Vec2f(1.5f, -2.5f).xx

        assertEquals(1.5f, vec.x)
        assertEquals(1.5f, vec.y)
    }

    @Test
    fun checkVec2fSwizzleYY() {
        val vec = Vec2f(1.5f, -2.5f).yy

        assertEquals(-2.5f, vec.x)
        assertEquals(-2.5f, vec.y)
    }

    @Test
    fun checkVec2fSwizzleAssign() {
        val origVec = Vec2f(1.5f, -2.5f)

        origVec.xy = origVec.yy

        assertEquals(-2.5f, origVec.x)
        assertEquals(-2.5f, origVec.y)
    }
}