package _99_extra._01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Trick implements ActionListener {
public static void main(String[]args ) {
	new Trick () .trick();
	
}
	JFrame frame = new JFrame();
	JButton trick = new JButton("trick");
	JButton treat = new JButton("treat");
	JPanel panel = new JPanel();


private void trick() {
	panel.add(trick);
	panel.add(treat);
	frame.add(panel);
	frame.pack();
	trick.addActionListener(this);
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource())
}
	
	
	

}
