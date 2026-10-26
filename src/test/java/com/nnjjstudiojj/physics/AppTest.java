package com.nnjjstudiojj.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void matrixClassTest() {

    Matrix2 matrix2 = new Matrix2(
      0, 0, 
      6, 9
    );

    Matrix2 matrix22 = new Matrix2(
      1, 2,
       10, 10
      );

    matrix2.multiply(matrix22);

    matrix2 = Matrix2.identityMatrix();

    assertEquals(1, matrix2.getElement(1, 1), 0.0001f);
  }
}
