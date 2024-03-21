import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PainelEx2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNota1;
	private JTextField tfNota2;
	private JTextField tfNota3;
	private JTextField tfResultado;

	/**
	 * Create the panel.
	 */
	public PainelEx2() {
		setBackground(new Color(0, 128, 192));
		setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(10, 33, 53, 14);
		add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(10, 58, 46, 14);
		add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setBounds(10, 82, 46, 14);
		add(lblNota3);
		
		tfNota1 = new JTextField();
		tfNota1.setBounds(73, 30, 86, 20);
		add(tfNota1);
		tfNota1.setColumns(10);
		
		tfNota2 = new JTextField();
		tfNota2.setBounds(73, 55, 86, 20);
		add(tfNota2);
		tfNota2.setColumns(10);
		
		tfNota3 = new JTextField();
		tfNota3.setBounds(73, 79, 86, 20);
		add(tfNota3);
		tfNota3.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1 = Float.parseFloat(tfNota1.getText());
				float n2 = Float.parseFloat(tfNota2.getText());
				float n3 = Float.parseFloat(tfNota3.getText());
				
				tfResultado.setText("Media: " +(n1+n2+n3)/3);
			}
		});
		btnCalcular.setBounds(73, 110, 89, 23);
		add(btnCalcular);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(242, 55, 86, 20);
		add(tfResultado);
		tfResultado.setColumns(10);
		
		JLabel lblResposta = new JLabel("Resultado:");
		lblResposta.setBounds(242, 33, 59, 14);
		add(lblResposta);

	}

}
