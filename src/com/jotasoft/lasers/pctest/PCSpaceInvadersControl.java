package com.jotasoft.lasers.pctest;

import java.awt.event.KeyEvent;

import com.jotasoft.lasers.core.ctrl.ShipControl;
import com.jotasoft.lasers.core.unit.Ship;
import com.saekari.util.input.KeyInput;

public class PCSpaceInvadersControl extends ShipControl {
  private KeyInput key;
  private double v_x;
  public PCSpaceInvadersControl(Ship s, KeyInput k, double v) {
    super(s);
    key = k;
    v_x = v;
  }
  @Override
  public void update() {
    ship.setAngle(Math.PI);
    if (key.keyDown(KeyEvent.VK_A)) ship.setVelocityX(-v_x);
    else if (key.keyDown(KeyEvent.VK_D)) ship.setVelocityX(v_x);
    else ship.setVelocityX(0);
  }
}
