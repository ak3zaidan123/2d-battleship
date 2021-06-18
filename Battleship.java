import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.Font;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Battleship extends reset{  
	public static void main(String[] args) {
		JFrame frame = new JFrame("Battleship");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ControlPanel control = new ControlPanel();
		frame.add(control, BorderLayout.WEST);
		frame.add(new BattleshipPanel(control)); 
		frame.pack();
		frame.setVisible(true);
		
           }
}
	
