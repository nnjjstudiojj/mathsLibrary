package com.nnjjstudiojj.physics;

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

  public Vector2 vectorScalarMultiplication(Vector2 vector, Vector2 scalar) {

    float x = vector.x * scalar.x;
    float y = vector.y * scalar.y;

    Vector2 result = new Vector2(x, y);
    return result;
  }

  public Vector2 vectorScalarDivision(Vector2 vector, Vector2 scalar) {

    if (scalar.x == 0 || scalar.y == 0) {
      throw new ArithmeticException();
    }

    float x = vector.x / scalar.x;
    float y = vector.y / scalar.y;

    Vector2 result = new Vector2(x, y);
    return result;
  }
  public float vectorDotProduct(Vector2 vectorA, Vector2 vectorB) {

    float x = vectorA.x * vectorB.x;
    float y = vectorA.y * vectorB.y;

    float dotProduct = x + y;
    return dotProduct;
  }
}
