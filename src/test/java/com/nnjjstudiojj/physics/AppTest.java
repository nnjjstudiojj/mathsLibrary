package com.nnjjstudiojj.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void vectorClassTest() {

    Vector2 vectorA = new Vector2( 1, 6);
    // Vector2 vectorB = new Vector2(7, 11);

    vectorA.vectorNormalisation();
    assertEquals(0.986393f, vectorA.getY(), 0.0001f);
  }
}
