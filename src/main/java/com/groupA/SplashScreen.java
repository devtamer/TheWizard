package com.groupA;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * @author Mark Lucernas
 * Date: 2020-07-16
 */
public class SplashScreen extends JFrame {

  private GraphicsSplash splash = new GraphicsSplash();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          SplashScreen frame = new SplashScreen();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public SplashScreen() {
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(splash);
    setVisible(true);
  }
}
