package br.com.unisenai.interfacegrafica;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class App2_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App2_2 frame = new App2_2();
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
	public App2_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		GridLayout layout = new GridLayout(2, 1);
		JLabel lbName = new JLabel("Nome: ");
		JTextField tfName = new JTextField();
		tfName.setColumns(40);
		JButton btnConfirm = new JButton("Confirmar");
		
		contentPane.setLayout(layout);
		
		JPanel pnRow1 = new JPanel(new FlowLayout());
		pnRow1.add(tfName);
		pnRow1.add(lbName);
		
		JPanel pnRow2 = new JPanel(new FlowLayout());
		pnRow2.add(btnConfirm);
		
		contentPane.add(pnRow1);
		contentPane.add(pnRow2);
		
		//contentPane.add(lbName);
		//contentPane.add(tfName);
		//contentPane.add(btnConfirm);

		setContentPane(contentPane);
	}

}
