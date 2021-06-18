/**
 * battleship game
 *
 * Ahmed
 * june 10
 */
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
public class reset extends JFrame implements ActionListener{
  JButton buttonreset;
  ControlPanel control;
  reset(){
        JFrame frame = new JFrame("Battleship");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	control = new ControlPanel();
	frame.add(control, BorderLayout.WEST);
	frame.add(new BattleshipPanel(control)); 
	frame.pack();
	frame.setVisible(true);
        buttonreset = new JButton();           buttonreset.setBounds(100,100,150,50);           buttonreset.addActionListener(this);              buttonreset.setText("reset");
        buttonreset.setBackground(Color.blue);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(buttonreset); 
   }
  public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttonreset){ 
                JFrame frame = new JFrame("Battleship");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ControlPanel control = new ControlPanel();
		frame.add(control, BorderLayout.WEST);
		frame.add(new BattleshipPanel(control)); 
		frame.pack();
		frame.setVisible(true);
        }
      }
}
