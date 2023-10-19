package br.com.unisenai.interfacegrafica;

import java.awt.EventQueue;

import javax.swing.JDialog;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroClienteView extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the dialog.
	 */
	public CadastroClienteView() {
		setBounds(100, 100, 450, 290);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("15dlu"),},
			new RowSpec[] {
				RowSpec.decode("15dlu"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("15dlu"),}));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "2, 2, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		panel.add(lblNewLabel, "1, 1");
		
		textField = new JTextField();
		panel.add(textField, "1, 2, fill, default");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email: ");
		panel.add(lblNewLabel_1, "1, 4");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "1, 5, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone: ");
		panel.add(lblNewLabel_2, "1, 7");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "1, 8, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		panel.add(lblNewLabel_3, "1, 10");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "1, 11, fill, default");
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		panel.add(btnNewButton, "1, 13");

	}

}
