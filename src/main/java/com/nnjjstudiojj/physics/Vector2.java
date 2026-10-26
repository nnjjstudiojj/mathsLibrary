package com.nnjjstudiojj.physics;

public class Vector2 { // unresolvable issue with floating point numbers, give leniency to 3 d.p, complete

  private float x;
  private float y;

  public Vector2 (float x, float y) {// complete & tested
    
    this.x = x;
    this.y = y;
  }

  public void vectorAddition(Vector2 addend) { // complete & tested

    x = x + addend.x;
    y = y + addend.y;
  }

  public void vectorSubtraction(Vector2 subtrahend) { // complete & tested

    x = x - subtrahend.x;
    y = y - subtrahend.y;
  }

  public void vectorScalarMultiplication(float scalar) { // complete & tested

    x = x * scalar;
    y = y * scalar;
  }

  public void vectorScalarDivision(float scalar) { // complete & tested

    if (scalar == 0) {
      throw new ArithmeticException();
    }

    x = x / scalar;
    y = y / scalar;
  }

  public float vectorDotProduct(Vector2 otherVector) { // complete & tested

    float dotProduct = x * otherVector.x + y * otherVector.y;
    return dotProduct;
  }

  public float vectorMagnitude() {

    double addition = x * x + y * y;
    float magnitude = (float) Math.sqrt(addition);
    return magnitude;
  }

  public void vectorNormalisation() { // complete & tested

    float magnitude = vectorMagnitude();

    if (magnitude == 0) {
      throw new ArithmeticException(
        "Magnitude of the vector cannot be equal to 0."
      );
    }
    
    x = x / magnitude;
    y = y / magnitude;
  }

  public float getX() { // complete & tested

    return this.x;
  }

  public float getY() { // complete & tested

    return this.y;
  }
}
