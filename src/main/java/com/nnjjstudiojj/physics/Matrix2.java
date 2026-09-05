package com.nnjjstudiojj.physics;

public class Matrix2 {

    private float a;
    private float b;
    private float c;
    private float d;

    private float[][] matrix = new float[][] {{a, c}, {b, d}};

    public float[][] Matrix2(float a, float b, float c, float d) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        return matrix;
    }
}