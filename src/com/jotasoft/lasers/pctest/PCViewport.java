package com.jotasoft.lasers.pctest;

import java.awt.Color;
import java.awt.Graphics2D;

import com.jotasoft.lasers.core.GameLogic;
import com.jotasoft.lasers.core.unit.Entity;
import com.jotasoft.lasers.ui.gfx.Viewport;
import com.saekari.util.Display;

public class PCViewport extends Viewport {
  private Graphics2D g;
  public PCViewport(Display d, GameLogic gl) {
    game = gl;
    g = d.graphics();
    width = d.width;
    height = d.height;
  }
  @Override
  public void initialize() {
    g.setColor(Color.BLACK);
    g.clearRect(0, 0, width, height);
  }
  @Override
  public void finalize() {
  }
  @Override
  public void drawShip(Entity e) {
    g.setColor(Color.RED);
    g.translate(e.getX(), e.getY());
    g.rotate(-e.getAngle());
    g.drawLine(-5, -5, 0, 5);
    g.drawLine(5, -5, 0, 5);
    g.rotate(e.getAngle());
    g.translate(-e.getX(), -e.getY());
  }
  @Override
  public void drawLaser(Entity e) {
    g.setColor(Color.BLUE);
    g.translate(e.getX(), e.getY());
    g.rotate(-e.getAngle());
    g.drawLine(0, -5, 0, 5);
    g.rotate(e.getAngle());
    g.translate(-e.getX(), -e.getY());
  }
}
