import java.awt.*;
import java.util.Random;

public class Test1 {
    public static final int FIVE_SECONDS = 3000;
    public static final int MAX_X = 1920;
    public static final int MAX_Y = 1080;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y-10);
            System.out.println(MouseInfo.getPointerInfo().getLocation());
//            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(FIVE_SECONDS);
        }
    }
}