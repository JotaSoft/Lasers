package com.jotasoft.lasers.pctest;

import java.awt.event.KeyEvent;

import com.jotasoft.lasers.core.ctrl.ShipControl;
import com.jotasoft.lasers.core.unit.Ship;
import com.saekari.util.input.KeyInput;

public class PCAsteroidsControl extends ShipControl {
  private KeyInput key;
  private double accel, v_turn;
  public PCAsteroidsControl(Ship s, KeyInput k, double a, double t) {
    super(s);
    key = k;
    accel = a;
    v_turn = t;
  }
  @Override
  public void update() {
    if (key.keyDown(KeyEvent.VK_A)) ship.setAngle(ship.getAngle() + v_turn);
    if (key.keyDown(KeyEvent.VK_D)) ship.setAngle(ship.getAngle() - v_turn);
    if (key.keyDown(KeyEvent.VK_W)) {
      ship.setVelocityX(ship.getVelocityX() + Math.sin(ship.getAngle()) * accel);
      ship.setVelocityY(ship.getVelocityY() + Math.cos(ship.getAngle()) * accel);
    }
  }
}
