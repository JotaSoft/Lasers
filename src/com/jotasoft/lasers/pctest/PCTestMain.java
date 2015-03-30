package com.jotasoft.lasers.pctest;

import com.jotasoft.lasers.core.GameLogic;
import com.jotasoft.lasers.core.ctrl.ShipControl;
import com.jotasoft.lasers.core.ctrl.SimpleAI;
import com.jotasoft.lasers.core.unit.Ship;
import com.saekari.util.*;
import com.saekari.util.input.*;

public class PCTestMain {
  public void start() {
    Display display = new Display(800, 450, false, "\"Fifty Shades of Lasers\" 0.1.0");
    display.setShowFPS(true);
    KeyInput keyInput = new KeyInput();
    MouseInput mouseInput = new MouseInput();
    display.attachKeyInput(keyInput);
    display.attachMouseInput(mouseInput);
    keyInput.setKeyBuffer(false);

    GameLogic game = new GameLogic();
    Ship ps = new Ship(400, 350, 100);
    ShipControl space = new PCSpaceInvadersControl(ps, keyInput, 2);
    //ShipControl aster = new PCAsteroidsControl(ps, keyInput, 0.1, 0.05);
    game.addShip(ps);
    Ship as = new Ship(400, 100, 100);
    SimpleAI ai = new SimpleAI(as, 20, 780, 2);
    game.addShip(as);
    game.addControl(ai);
    game.addControl(space);
    PCViewport viewport = new PCViewport(display, game);
    
    while (!display.isCloseRequested()) {
      game.update();
      viewport.draw();
      display.update();
      display.sync(60);
    }
    display.dispose();
  }

  public static void main(String[] args) {
    PCTestMain main = new PCTestMain();
    main.start();
  }
}
