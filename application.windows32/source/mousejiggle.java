import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.awt.Robot; 
import java.awt.AWTException; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class mousejiggle extends PApplet {



Robot r;
public void setup() {
  
  try {
    r = new Robot();
  }
  catch (AWTException e) {
  }
  background(255);
  text("alt+f4 to exit", 100, 100);
}
public void draw() {
  r.mouseMove(PApplet.parseInt(random(0, 10)), PApplet.parseInt(random(0, 10)));
}

  public void settings() {  size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "mousejiggle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
