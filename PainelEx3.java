import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelEx3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfMetros;
	private JTextField tfCm;

	/**
	 * Create the panel.
	 */
	public PainelEx3() {
		setBackground(new Color(0, 128, 192));
		setLayout(null);
		
		JLabel lblMetros = new JLabel("Metros:");
		lblMetros.setBounds(15, 75, 46, 14);
		add(lblMetros);
		
		tfMetros = new JTextField();
		tfMetros.setBounds(71, 72, 86, 20);
		add(tfMetros);
		tfMetros.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float metros = Float.parseFloat(tfMetros.getText());
				float cm = metros/100;
				tfCm.setText("" +cm);
				
			}
		});
		btnCalcular.setBounds(176, 136, 89, 23);
		add(btnCalcular);
		
		JLabel lblCm = new JLabel("Centimetros:");
		lblCm.setBounds(224, 75, 71, 14);
		add(lblCm);
		
		tfCm = new JTextField();
		tfCm.setBounds(301, 72, 86, 20);
		add(tfCm);
		tfCm.setColumns(10);

	}

}
