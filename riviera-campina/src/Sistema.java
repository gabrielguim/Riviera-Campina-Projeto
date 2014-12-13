import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class Sistema extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sistema() {
		setTitle("Sistema de gerenciamento - Hotel Riviera Campina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(248, 211, 464, 236);
		contentPane.add(panel);
		panel.setBorder(new RoundEdgedBorder());
		panel.setLayout(null);
		
		JLabel lblNomeDoFuncionrio = new JLabel("Identificador do funcion\u00E1rio");
		lblNomeDoFuncionrio.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblNomeDoFuncionrio.setForeground(Color.DARK_GRAY);
		lblNomeDoFuncionrio.setBounds(20, 16, 158, 16);
		panel.add(lblNomeDoFuncionrio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setBounds(20, 70, 36, 16);
		panel.add(lblSenha);
		
		JLabel lblPin = new JLabel("PIN");
		lblPin.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblPin.setForeground(Color.DARK_GRAY);
		lblPin.setBounds(20, 120, 20, 16);
		panel.add(lblPin);
		
		textField = new JTextField();
		textField.setBounds(16, 34, 433, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(16, 85, 433, 32);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(16, 135, 50, 32);
		panel.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Acessar painel");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(16, 179, 435, 45);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Esqueceu algum dado?");
		lblNewLabel_1.setForeground(new Color(119, 136, 153));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(296, 123, 151, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/motioncrazy/Desktop/riviera-sistema-logo.png"));
		lblNewLabel.setBounds(273, 124, 414, 75);
		contentPane.add(lblNewLabel);
	}
}
