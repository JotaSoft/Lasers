package com.jotasoft.lasers.core.unit;

public abstract class Entity {
  protected double x, y, angle, v_x, v_y;
  public int getX() { return (int) Math.round(x); }
  public int getY() { return (int) Math.round(y); }
  public double getAngle() { return angle; }
  public double getVelocityX() { return v_x; }
  public double getVelocityY() { return v_y; }
  public void setX(double nx) { x = nx; };
  public void setY(double ny) { y = ny; };
  public void setAngle(double t) { angle = t; };
  public void setVelocityX(double nvx) { v_x = nvx; };
  public void setVelocityY(double nvy) { v_y = nvy; };
  public void update() {
    x += v_x;
    y += v_y;
  }
}
