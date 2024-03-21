import javax.swing.JOptionPane;
		import javax.swing.JPanel;
		import javax.swing.JTextField;
		import javax.swing.JButton;
		import javax.swing.JLabel;
		import java.awt.event.ActionListener;
		import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

		public class PainelEx1 extends JPanel {

			private static final long serialVersionUID = 1L;
			private JTextField tfNumero1;
			private JTextField tfNumero2;
			private JTextField tfSoma;
			private JTextField tfMulti;
			private JTextField tfDiv;
			private JTextField tfSub;
			private JLabel lblSubresp;
			private JLabel lblMultiresp;
			private JLabel lblDiviResp;

			/**
			 * Create the panel.
			 */
			public PainelEx1() {
				setBackground(new Color(0, 128, 192));
				setLayout(null);
				
				tfNumero1 = new JTextField();
				tfNumero1.setBounds(83, 52, 86, 20);
				add(tfNumero1);
				tfNumero1.setColumns(10);
				
				tfNumero2 = new JTextField();
				tfNumero2.setBounds(83, 83, 86, 20);
				add(tfNumero2);
				tfNumero2.setColumns(10);
				
				JButton btnNewButton = new JButton("Calcular");
				btnNewButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        float n1 = Float.parseFloat(tfNumero1.getText());
				        float n2 = Float.parseFloat(tfNumero2.getText());
				        
				        tfSoma.setText("\n soma = " + (n1+n2));
				        tfSub.setText("\n subtração = " + (n1-n2));
				        tfMulti.setText( "\n multiplicação = " + (n1*n2));
				        tfDiv.setText(  "\n divisao = " + (n1/n2));
				    }
				});

				btnNewButton.setBounds(83, 137, 89, 23);
				add(btnNewButton);
				
				JLabel lblNumero1 = new JLabel("Numero1");
				lblNumero1.setBounds(10, 55, 63, 14);
				add(lblNumero1);
				
				JLabel lblNumero2 = new JLabel("Numero2");
				lblNumero2.setBounds(10, 86, 63, 14);
				add(lblNumero2);
				
				JLabel lblResultado = new JLabel("");
				lblResultado.setBounds(394, 89, 46, 14);
				add(lblResultado);
				
				tfSoma = new JTextField();
				tfSoma.setHorizontalAlignment(SwingConstants.LEFT);
				tfSoma.setBounds(292, 55, 98, 20);
				add(tfSoma);
				tfSoma.setColumns(10);
				
				JLabel lblResposta = new JLabel("Resultado:");
				lblResposta.setBounds(229, 29, 63, 14);
				add(lblResposta);
				
				tfMulti = new JTextField();
				tfMulti.setBounds(292, 114, 98, 20);
				add(tfMulti);
				tfMulti.setColumns(10);
				
				tfDiv = new JTextField();
				tfDiv.setBounds(292, 140, 98, 20);
				add(tfDiv);
				tfDiv.setColumns(10);
				
				tfSub = new JTextField();
				tfSub.setBounds(292, 83, 98, 20);
				add(tfSub);
				tfSub.setColumns(10);
				
				JLabel lblSomaresp = new JLabel("Soma: ");
				lblSomaresp.setBounds(239, 55, 46, 14);
				add(lblSomaresp);
				
				lblSubresp = new JLabel("Subtração: ");
				lblSubresp.setBounds(212, 86, 70, 14);
				add(lblSubresp);
				
				lblMultiresp = new JLabel("Multiplicação: ");
				lblMultiresp.setBounds(212, 117, 70, 14);
				add(lblMultiresp);
				
				lblDiviResp = new JLabel("Divisão: ");
				lblDiviResp.setBounds(229, 141, 46, 14);
				add(lblDiviResp);
				

				
			}
		}

