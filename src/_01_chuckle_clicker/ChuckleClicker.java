package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ChuckleClicker implements  ActionListener {
public static void main(String[] args) {
	new ChuckleClicker () .makeButtons();

}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton JokeButton = new JButton("Joke");
JButton PunchButton = new JButton("Punchline");

private void makeButtons() {
	// TODO Auto-generated method stub

	panel.add(JokeButton);
	panel.add(PunchButton);
	frame.add(panel);
	frame.pack();
	JokeButton.addActionListener(this);
	PunchButton.addActionListener(this);
	frame.setVisible(true);
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() == JokeButton) {
		JOptionPane.showMessageDialog(null, "Whyd the chicken cross the road");
	}
	else if (e.getSource() == PunchButton) {
		JOptionPane.showMessageDialog(null, "To get to the other side");
	}
}
	
}

	
