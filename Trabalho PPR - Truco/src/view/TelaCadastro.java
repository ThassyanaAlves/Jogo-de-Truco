package view;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {
	
	private JTextField txtJogador1; 
	private JTextField txtJogador2; 
	private JButton jbIniciarJogo; 
	
	public TelaCadastro() {
		
		setTitle("Cadastro de Jogadores"); 
		setSize(300, 200); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocationRelativeTo(null); 
		initComponents(); 	
	}
	
	private void initComponents() {
		
		JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
		
		panel.add(new JLabel("Nome do Jogador 1:")); 
		txtJogador1 = new JTextField(); 
		panel.add(txtJogador1); 
		
		panel.add(new JLabel("Nome do Jogador 2:")); 
		txtJogador2 = new JTextField(); 
		panel.add(txtJogador2); 
		
		jbIniciarJogo = new JButton("Jogar"); 
		
		jbIniciarJogo.addActionListener(e -> {
			String jogador1 = txtJogador1.getText(); 
			String jogador2 = txtJogador2.getText(); 
			
		});
		
		panel.add(jbIniciarJogo); 
		
		add(panel); 
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new TelaCadastro().setVisible(true));
	}

}
