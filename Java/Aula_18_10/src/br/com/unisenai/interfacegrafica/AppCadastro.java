package br.com.unisenai.interfacegrafica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AppCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppCadastro frame = new AppCadastro();
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
	public AppCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar(); //Cria um conjunto de menus
		setJMenuBar(menuBar);
		
		JMenu nmCadastros = new JMenu("Cadastro");
		menuBar.add(nmCadastros);
		
		JMenuItem nmiCustumerList = new JMenuItem("Listar clientes");
		nmCadastros.add(nmiCustumerList);
		
		JMenuItem nmiCustumerForm = new JMenuItem("Cadastrar clientes");
		nmiCustumerForm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new CadastroClienteView();
				dialog.setVisible(true);
			}
		});
		nmCadastros.add(nmiCustumerForm);
		
		JSeparator separador = new JSeparator();
		nmCadastros.add(separador);
		
		JMenuItem mniExit = new JMenuItem("Sair");
		nmCadastros.add(mniExit);
		
		JMenu nmFinantial = new JMenu("Financeiro");
		menuBar.add(nmFinantial);
		JMenuItem nmiContasPagar = new JMenuItem("Contas a Pagar");
		nmFinantial.add(nmiContasPagar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
