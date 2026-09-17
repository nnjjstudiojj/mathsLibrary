package com.nnjjstudiojj.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void matrixClassTest() {

    Matrix2 matrix2 = new Matrix2(1, 0, 1, 0);

    assertEquals(1, matrix2.getElement(0, 0));
  }
}
