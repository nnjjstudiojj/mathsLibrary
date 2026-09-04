package com.nnjjstudiojj.physics;

import java.math.*;

public class Vector2 {

  private float x;
  private float y;

  public Vector2 (float x, float y) {

    this.x = x;
    this.y = y;
  }

  public Vector2 vectorAddition(Vector2 vectorA, Vector2 vectorB) {

    float x = vectorA.x + vectorB.x;
    float y = vectorA.y + vectorB.y;

    Vector2 result = new Vector2(x, y);
    return result;
  }

  public Vector2 vectorSubtraction(Vector2 minuend, Vector2 subtrahend) {

    float x = minuend.x - subtrahend.x;
    float y = minuend.y - subtrahend.y;

    Vector2 result = new Vector2(x, y);
    return result;
  }

  public Vector2 vectorScalarMultiplication(Vector2 vector, float scalar) {

    float x = vector.x * scalar;
    float y = vector.y * scalar;

    Vector2 result = new Vector2(x, y);
    return result;
  }

  public Vector2 vectorScalarDivision(Vector2 vector, float scalar) {

    if (scalar == 0) {
      throw new ArithmeticException();
    }

    float x = vector.x / scalar;
    float y = vector.y / scalar;

    Vector2 result = new Vector2(x, y);
    return result;
  }

  public float vectorDotProduct(Vector2 vectorA, Vector2 vectorB) {

    float x = vectorA.x * vectorB.x;
    float y = vectorA.y * vectorB.y;

    float dotProduct = x + y;
    return dotProduct;
  }

  public float vectorMagnitude(Vector2 vector) {

    double addition = vector.x * vector.x + vector.y * vector.y;
    float magnitude = (float) Math.sqrt(addition);
    return magnitude;
  }

  public Vector2 vectorNormalisation(Vector2 vector) {

    float magnitude = vectorMagnitude(vector);
    
    float x = vector.x / magnitude;
    float y = vector.y / magnitude;

    Vector2 result = new Vector2(x, y);
    return result;
  }
}
