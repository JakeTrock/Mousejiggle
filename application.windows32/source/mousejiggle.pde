import java.awt.Robot;
import java.awt.AWTException;
Robot r;
void setup(){size(200, 200);try{r = new Robot();}catch (AWTException e){}text("alt+f4 to exit",0,0);}
void draw(){r.mouseMove(int(random(0, 10)), int(random(0, 10)));}
