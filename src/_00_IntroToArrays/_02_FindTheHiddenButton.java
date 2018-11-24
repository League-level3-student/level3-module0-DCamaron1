package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	JButton[] array;
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String answer = JOptionPane.showInputDialog("Please enter a positive number.");
		int answerNum = Integer.parseInt(answer);
		array = new JButton[answerNum];
		for (int i = 0; i < array.length; i++) {
			array[i] = new JButton();
			array[i].addActionListener(this);
			panel.add(array[i]);
		}
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		JOptionPane.showMessageDialog(null, "Find the special button.");
		Random random = new Random();
		hiddenButton = random.nextInt(answerNum - 1);
		array[hiddenButton].setText("M E");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		array[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked==array[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "Congrats! You won!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Oomph :( Try again.");
		}
	}
}
