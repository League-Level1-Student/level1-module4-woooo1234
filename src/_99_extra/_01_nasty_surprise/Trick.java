package _99_extra._01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Trick implements ActionListener {
public static void main(String[]args ) {
	new Trick () .trick();
	
}
	JFrame frame = new JFrame();
	JButton trick = new JButton("trick");
	JButton treat = new JButton("treat");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

private void trick() {
	panel.add(trick);
	panel.add(treat);
	frame.add(panel);
	frame.pack();
	trick.addActionListener(this);
	treat.addActionListener(this);
	frame.setVisible(true);
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == trick) {
	showPictureFromTheInternet("https://bestlifeonline.com/wp-content/uploads/sites/3/2019/12/gold.jpg?quality=82&strip=1&resize=1250%2C702");
	}
	if(e.getSource() == treat) {
	showPictureFromTheInternet("https://png.pngtree.com/thumb_back/fh260/background/20230521/pngtree-dark-scary-woman-is-covering-her-face-in-a-hoodie-image_2677963.jpg");
}
}
private void showPictureFromTheInternet(String imageurl) {
    try {
        URL url = new URL(imageurl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}	
	
	

}
