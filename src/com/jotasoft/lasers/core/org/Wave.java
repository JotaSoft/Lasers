package com.jotasoft.lasers.core.org;

import java.util.LinkedList;

import com.jotasoft.lasers.core.ctrl.ShipControl;

public class Wave {
  private LinkedList<Cue> cue;
  private LinkedList<ShipControl> control;
  public Wave() {
    cue = new LinkedList<Cue>();
    control = new LinkedList<ShipControl>();
  }
  public void addShip(Cue c, ShipControl s) {
    
  }
}
