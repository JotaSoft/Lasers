package com.jotasoft.lasers.core.unit;

public class Ship extends Entity {
  protected int health;
  public int getHealth() { return health; }
  public Ship(double x_i, double y_i, int hp) {
    x = x_i;
    y = y_i;
    angle = v_x = v_y = 0;
    health = hp;
  }
}
