import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(192, 192, 192));
		setJMenuBar(menuBar);
		
		JMenu mnExercicios = new JMenu("Exercicios");
		mnExercicios.setBackground(new Color(0, 0, 0));
		menuBar.add(mnExercicios);
		
		JMenuItem mntmExercicio1 = new JMenuItem("Exercicio1");
		mntmExercicio1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        PainelEx1 p1 = new PainelEx1();
		        setContentPane(p1);
		        revalidate();
		        repaint();
		    }
		});


		mnExercicios.add(mntmExercicio1);
		
		JMenuItem mntmExercicio2 = new JMenuItem("Exercicio2");
		mntmExercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 PainelEx2 p2 = new PainelEx2();
			        setContentPane(p2);
			        revalidate();
			        repaint();
			    }
		});
		
		mnExercicios.add(mntmExercicio2);
		
		JMenuItem mntmExercicio3 = new JMenuItem("Exercicio3");
		mntmExercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 PainelEx3 p3 = new PainelEx3();
			        setContentPane(p3);
			        revalidate();
			        repaint();
			}
		});
		mnExercicios.add(mntmExercicio3);
		
		JMenuItem mntmExercicio4 = new JMenuItem("Exercicio4");
		mntmExercicio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelEx4 p4 = new PainelEx4();
		        setContentPane(p4);
		        revalidate();
		        repaint();
			}
		});
		mnExercicios.add(mntmExercicio4);
		
		JMenuItem mntmExercicio5 = new JMenuItem("Exercicio5");
		mntmExercicio5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelEx5 p5 = new PainelEx5();
		        setContentPane(p5);
		        revalidate();
		        repaint();
			}
		});
		mnExercicios.add(mntmExercicio5);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}

