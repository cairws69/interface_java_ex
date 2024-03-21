import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelEx5 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfLado1;
	private JTextField tfLado2;
	private JTextField tfDobro;

	/**
	 * Create the panel.
	 */
	public PainelEx5() {
		setBackground(new Color(0, 128, 192));
		setLayout(null);
		
		JLabel lblLado1 = new JLabel("Lado 1:");
		lblLado1.setBounds(28, 44, 46, 14);
		add(lblLado1);
		
		tfLado1 = new JTextField();
		tfLado1.setBounds(84, 41, 86, 20);
		add(tfLado1);
		tfLado1.setColumns(10);
		
		JLabel lblLado2 = new JLabel("Lado 2:");
		lblLado2.setBounds(28, 69, 46, 14);
		add(lblLado2);
		
		tfLado2 = new JTextField();
		tfLado2.setBounds(84, 66, 86, 20);
		add(tfLado2);
		tfLado2.setColumns(10);
		
		tfDobro = new JTextField();
		tfDobro.setBounds(326, 41, 86, 20);
		add(tfDobro);
		tfDobro.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double lado1 = Double.parseDouble(tfLado1.getText());
				double lado2 = Double.parseDouble(tfLado2.getText());
				double area = lado1*lado2;
				double dobro = area*2;
				tfDobro.setText(""+dobro);
				
			}
		});
		btnCalcular.setBounds(171, 97, 89, 23);
		add(btnCalcular);
		
		JLabel lblDobro = new JLabel("Dobro da area:");
		lblDobro.setBounds(230, 44, 86, 14);
		add(lblDobro);

	}

}
