package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot HRI = new Robot();
		HRI.setSpeed(100);
		HRI.move(100);
		HRI.sparkle();
		HRI.turn(360 / 1);
	}
}
