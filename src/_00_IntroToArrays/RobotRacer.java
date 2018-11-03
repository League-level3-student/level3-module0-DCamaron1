package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;

public class RobotRacer {
	// JFrame frame = new JFrame();
	// JPanel panel = new

	public static void main(String[] args) {
		Random random = new Random();
		Robot[] robots = new Robot[5];
		int x = 30;
		int y = 500;
		for (int i = 0; i < robots.length; i++) {
			robots[i]= new Robot();
			robots[i].penDown();
			robots[i].moveTo(x+200*i,y);
			
		}
		while () {
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(random.nextInt(101));
			}	
		}
		
	}

	public boolean checkForWinner(Robot[] robots) {
		for (int i = 0; i < robots.length; i++) {
			if (robots[i].getX()<50) {
				return true;
			}
			else {
				return false; 
			}
		}
	}
}
