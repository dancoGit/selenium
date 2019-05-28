package seleniumtest.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class JavaRobot {
  public static void main(String[] args) throws AWTException  {
    // instanciamos la clase Robot
    Robot robot = new Robot();

    // cambia la posición en pantalla del puntero a las coordenadas
    // X=300 e Y=600.
    robot.mouseMove(400, 300);

    //click con el botón derecho
    robot.mousePress(InputEvent.BUTTON3_MASK);
    robot.mouseRelease(InputEvent.BUTTON3_MASK);
  }
}
