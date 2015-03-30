package com.jotasoft.lasers.ui.gfx;

import com.jotasoft.lasers.core.GameLogic;
import com.jotasoft.lasers.core.unit.Entity;

public abstract class Viewport {
  protected int width, height;
  protected GameLogic game;
  public final void draw() {
    initialize();
    for (Entity e : game.ship) {
      drawShip(e);
    }
    for (Entity e : game.laser) {
      drawLaser(e);
    }
    finalize();
  }
  public abstract void initialize();
  public abstract void finalize();
  public abstract void drawShip(Entity e);
  public abstract void drawLaser(Entity e);
}
