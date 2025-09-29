package view;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


public class JogoDeTruco extends JFrame{
	
	private JButton jbTruco; 
	private JButton jbSeis; 
	private JButton jbNove; 
	private JButton jbDoze; 
	
	public JogoDeTruco() {
		
	}
	
	public static void main(String[] args) {
		JogoDeTruco t = new JogoDeTruco(); 
		t.setVisible(true);
	}
}
