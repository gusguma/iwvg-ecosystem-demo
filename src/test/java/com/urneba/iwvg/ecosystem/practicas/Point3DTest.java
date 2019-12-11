package com.urneba.iwvg.ecosystem.practicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Point3DTest {

    private Point3D point;

    @BeforeEach
    void before() {
        point = new Point3D(2, 3, 5);
    }

    @Test
    void testPoint3DIntIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
        assertEquals(5, point.getZ());
    }

    @Test
    void testPoint3DPointInt() {
        point = new Point3D(new Point(), 2);
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testPoint3D() {
        point = new Point3D();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(0, point.getZ());
    }

    @Test
    void testModule() {
        assertEquals(6.1644, point.module(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point3D(1, 1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(4, point.getZ());
    }
}
