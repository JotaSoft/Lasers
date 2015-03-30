package com.jotasoft.lasers.core.org;

public class Cue {
  public enum Relation {
    AFTER_START, AFTER_PREVIOUS
  }
  public final long time;
  public final double x, y;
  public Cue(long t, double x_i, double y_i) {
    time = t;
    x = x_i;
    y = y_i;
  }
}
