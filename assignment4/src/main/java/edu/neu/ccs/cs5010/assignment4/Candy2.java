package edu.neu.ccs.cs5010.assignment4;

public abstract class Candy2 implements ICandy2 {

  private final Size size;

  public Candy2(Size size) {
    this.size = size;
  }

  public Size getSize() {
    return size;
  }

}