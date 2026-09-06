package com.nnjjstudiojj.physics;

public class Vector2 { // unresolvable issue with floating point numbers, give leniency to 3 d.p

  private float x;
  private float y;

  public Vector2 (float x, float y) {

    this.x = x;
    this.y = y;
  }

  public void vectorAddition(Vector2 addend) {

    x = x + addend.x;
    y = y + addend.y;
  }

  public void vectorSubtraction(Vector2 subtrahend) {

    x = x - subtrahend.x;
    y = y - subtrahend.y;
  }

  public void vectorScalarMultiplication(float scalar) {

    x = x * scalar;
    y = y * scalar;
  }

  public void vectorScalarDivision(float scalar) { 

    if (scalar == 0) {
      throw new ArithmeticException();
    }

    x = x / scalar;
    y = y / scalar;
  }

  public float vectorDotProduct(Vector2 otherVector) {

    float dotProduct = x * otherVector.x + y * otherVector.y;
    return dotProduct;
  }

  public float vectorMagnitude() {

    double addition = x * x + y * y;
    float magnitude = (float) Math.sqrt(addition);
    return magnitude;
  }

  public void vectorNormalisation() {

    float magnitude = vectorMagnitude();
    
    x = x / magnitude;
    y = y / magnitude;
  }

  public float getX() {

    return this.x;
  }

  public float getY() {

    return this.y;
  }
}
