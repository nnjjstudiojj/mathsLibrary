package com.nnjjstudiojj.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void matrixClassTest() {

    Matrix2 matrix2 = new Matrix2(4.2567f, 6.958173f, 3.290189f, -7.27898723f);

    float determinant = matrix2.determinant();

    assertEquals(-53.8f, determinant, 0.1f);
  }
}
