package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotRacer {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How many robots do you want to race? Your max is 15");
		int answerNum = Integer.parseInt(answer);
		Random random = new Random();
		Robot[] robots = new Robot[answerNum];
		int x = 30;
		int y = 500;
		int spacer = 900/answerNum;
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setSpeed(10);
			robots[i].setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
			robots[i].penDown();
			robots[i].moveTo(x + spacer*i, y);

		}
		while (!checkForWinner(robots)) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(random.nextInt(101));
			}
		}
	}

	static public boolean checkForWinner(Robot[] robots) {
		for (int i = 0; i < robots.length; i++) {
			if (robots[i].getY() < 50) {
				robots[i].sparkle();
				return true;
			}
		}
		return false;
	}
}
