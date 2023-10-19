package br.com.unisenai.interfacegrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class App3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App3 frame = new App3();
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
	public App3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 162);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("left:max(41dlu;min)"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		contentPane.add(lblNewLabel, "1, 1, left, default");
		
		tfNome = new JTextField();
		contentPane.add(tfNome, "2, 1, fill, default");
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email: ");
		contentPane.add(lblNewLabel_1, "1, 3, left, default");
		
		tfEmail = new JTextField();
		contentPane.add(tfEmail, "2, 3, fill, default");
		tfEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone: ");
		contentPane.add(lblNewLabel_2, "1, 5, left, default");
		
		textTelefone = new JTextField();
		contentPane.add(textTelefone, "2, 5, fill, default");
		textTelefone.setColumns(10);
		
		JButton btnSave = new JButton("Salvar");
		contentPane.add(btnSave, "2, 7");
	}

}
