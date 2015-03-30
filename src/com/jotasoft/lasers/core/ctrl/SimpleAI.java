package com.jotasoft.lasers.core.ctrl;

import com.jotasoft.lasers.core.unit.Ship;

public class SimpleAI extends ShipControl {
  private double start, end, v_x;
  public SimpleAI(Ship s, double x_i, double x_f, double v) {
    super(s);
    start = x_i;
    end = x_f;
    v_x = v;
  }
  @Override
  public void update() {
    if (ship.getVelocityX() == 0) ship.setVelocityX(v_x);
    if (ship.getX() < start) ship.setVelocityX(v_x);
    if (ship.getX() > end) ship.setVelocityX(-v_x);
  }
}
