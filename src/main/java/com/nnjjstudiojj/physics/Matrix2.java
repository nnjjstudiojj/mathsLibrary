package com.nnjjstudiojj.physics;

public class Matrix2 {

    private float[][] matrix;

    public Matrix2(float a, float b, float c, float d) {

        matrix = new float[][] {
            {a, b},
            {c, d}
        };
    }

    public static Matrix2 identityMatrix() {

        return new Matrix2(
            1, 0, 
            0, 1
        );
    }

    public static Matrix2 rotationMatrix(double radians) { // anti-clockwise rotation

        float sine = (float) Math.sin(radians);
        float cosine = (float) Math.cos(radians);

        return new Matrix2(
            cosine, -sine,
            sine, cosine
        );
    }

    public static Matrix2 scalingMatrix(float scalingX, float scalingY) {

        return new Matrix2(
            scalingX, 0, 
            0, scalingY
        );
    }

    public void matrixMultiplication(Matrix2 otherMatrix) {

        float a = matrix[0][0] * otherMatrix.getElement(0, 0) + matrix[0][1] * otherMatrix.getElement(1, 0);
        float b = matrix[0][0] * otherMatrix.getElement(0, 1) + matrix[0][1] * otherMatrix.getElement(1, 1);
        float c = matrix[1][0] * otherMatrix.getElement(0, 0) + matrix[1][1] * otherMatrix.getElement(1, 0);
        float d = matrix[1][0] * otherMatrix.getElement(0, 1) + matrix[1][1] * otherMatrix.getElement(1, 1);

        matrix[0][0] = a;
        matrix[0][1] = b;
        matrix[1][0] = c;
        matrix[1][1] = d;
    }

    public float getElement(int row, int column) {

        if (row < 0 || row >= 2 || column < 0 || column >= 2) {
            throw new IndexOutOfBoundsException (
                "Matrix indice must be between 0 & 1"
            );
        }

        return matrix[row][column];
    }

    public float determinant() {

        float determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        return determinant;
    }
}