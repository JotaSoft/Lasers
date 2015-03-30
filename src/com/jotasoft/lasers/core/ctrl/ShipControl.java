package com.jotasoft.lasers.core.ctrl;

import com.jotasoft.lasers.core.unit.Ship;

public abstract class ShipControl {
  protected Ship ship;
  public ShipControl(Ship s) {
    ship = s;
  }
  public abstract void update();
}
