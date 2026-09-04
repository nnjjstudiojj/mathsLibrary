package com.nnjjstudiojj.physics;

import org.junit.jupiter.api.Test;

public class AppTest {

  public void main(String[] args) {

    Vector2 vectorOne = new Vector2(5.6f, 9.9f);
    Vector2 vectorTwo = new Vector2(8.9f, 10.1f);

    Vector2 vectorThree = new Vector2(0, 0);
    vectorThree.vectorAddition(vectorOne, vectorTwo);

  }
}
