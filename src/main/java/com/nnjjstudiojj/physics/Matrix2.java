package com.nnjjstudiojj.physics;

public class Matrix2 {

    private float[][] matrix;

    public Matrix2(float a, float b, float c, float d) {

        matrix = new float[][] {
            {a, b},
            {c, d}
        };
    }

    public static Matrix2 identityMatrix2() {

        Matrix2 identityMatrix2 = new Matrix2(1, 0, 0, 1);

        return identityMatrix2;
    }

    public static Matrix2 rotationMatrix2(double radians) {

        float sine = (float) Math.sin(radians);
        float cosine = (float) Math.cos(radians);

        Matrix2 rotationMatrix2 = new Matrix2(cosine, -sine, sine, cosine);

        return rotationMatrix2;
    }

    public static Matrix2 scalingMatrix2(float scalingX, float scalingY) {

        Matrix2 scalingMatrix2 = new Matrix2(scalingX, 0, 0, scalingY);
        
        return scalingMatrix2;
    }
}