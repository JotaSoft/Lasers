package com.jotasoft.lasers.core;

import java.util.LinkedList;

import com.jotasoft.lasers.core.ctrl.ShipControl;
import com.jotasoft.lasers.core.unit.Entity;
import com.jotasoft.lasers.core.unit.Ship;

public class GameLogic {
  public LinkedList<Entity> ship;
  public LinkedList<Entity> laser;
  public LinkedList<ShipControl> control;
  public GameLogic() {
    ship = new LinkedList<Entity>();
    laser = new LinkedList<Entity>();
    control = new LinkedList<ShipControl>();
  }
  public void update() {
    for (ShipControl sc : control) sc.update();
    for (Entity e : ship) e.update();
    for (Entity e : laser) e.update();
  }
  public void addShip(Ship s) {
    ship.add(s);
  }
  public void addControl(ShipControl s) {
    control.add(s);
  }
}
