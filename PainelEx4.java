import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelEx4 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfRaio;
	private JTextField tfArea;

	/**
	 * Create the panel.
	 */
	public PainelEx4() {
		setBackground(new Color(0, 128, 192));
		setLayout(null);
		
		JLabel lblRaio = new JLabel("Raio do circulo:");
		lblRaio.setBounds(10, 57, 80, 14);
		add(lblRaio);
		
		tfRaio = new JTextField();
		tfRaio.setBounds(87, 54, 86, 20);
		add(tfRaio);
		tfRaio.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double raio = Double.parseDouble(tfRaio.getText());
				double area =  3.14 *(raio*raio);
				tfArea.setText(""+area);
			}
		});
		btnCalcular.setBounds(176, 95, 89, 23);
		add(btnCalcular);
		
		tfArea = new JTextField();
		tfArea.setBounds(302, 54, 86, 20);
		add(tfArea);
		tfArea.setColumns(10);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(267, 57, 46, 14);
		add(lblArea);

	}

}
