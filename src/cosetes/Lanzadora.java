package cosetes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Lanzadora {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lanzadora window = new Lanzadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void ejecutar(int jamon, int pollo, int bacalao, int queso, int opcion) {
		String clase = "cosetes.Procesadora";
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clase;
		
		

		
		List<String> command = new ArrayList<>();
		command.add(javaBin);
		command.add("-cp");
		command.add(classpath);
		command.add(className);
		command.add(String.valueOf(jamon));
		command.add(String.valueOf(pollo));
		command.add(String.valueOf(bacalao));
		command.add(String.valueOf(queso));
		command.add(String.valueOf(opcion));
		ProcessBuilder pb = new ProcessBuilder(command);
		System.out.print(command);
		try {
			pb.inheritIO().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public Lanzadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 218, 274);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner spJamon = new JSpinner();
		spJamon.setBounds(30, 58, 30, 20);
		frame.getContentPane().add(spJamon);
		
		JSpinner spPollo = new JSpinner();
		spPollo.setBounds(30, 89, 30, 20);
		frame.getContentPane().add(spPollo);
		
		JSpinner spBacalao = new JSpinner();
		spBacalao.setBounds(30, 120, 30, 20);
		frame.getContentPane().add(spBacalao);
		
		JSpinner spQueso = new JSpinner();
		spQueso.setBounds(30, 151, 30, 20);
		frame.getContentPane().add(spQueso);
		
		JLabel lblNewLabel = new JLabel("Jam\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(70, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPollo = new JLabel("Pollo");
		lblPollo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPollo.setBounds(70, 92, 46, 14);
		frame.getContentPane().add(lblPollo);
		
		JLabel lblBacalao = new JLabel("Bacalao");
		lblBacalao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBacalao.setBounds(70, 123, 56, 14);
		frame.getContentPane().add(lblBacalao);
		
		JLabel lblQueso = new JLabel("Queso");
		lblQueso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQueso.setBounds(70, 154, 46, 14);
		frame.getContentPane().add(lblQueso);
		
		JRadioButton rbJamon = new JRadioButton("");
		rbJamon.setBounds(143, 57, 21, 23);
		frame.getContentPane().add(rbJamon);
		
		JRadioButton rbPollo = new JRadioButton("");
		rbPollo.setBounds(143, 88, 21, 23);
		frame.getContentPane().add(rbPollo);
		
		JRadioButton rbQueso = new JRadioButton("");
		rbQueso.setBounds(143, 148, 21, 23);
		frame.getContentPane().add(rbQueso);
		
		JRadioButton rbBacalao = new JRadioButton("");
		rbBacalao.setBounds(143, 119, 21, 23);
		frame.getContentPane().add(rbBacalao);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbJamon);
        group.add(rbPollo);
        group.add(rbBacalao);
        group.add(rbQueso);
		
		JLabel lblNewLabel_1 = new JLabel("Prioridad:");
		lblNewLabel_1.setBounds(128, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnFabricar = new JButton("Fabricar");
		btnFabricar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int jam = (Integer) spJamon.getValue();
				int pol = (Integer) spPollo.getValue();
				int bac = (Integer) spBacalao.getValue();
				int que = (Integer) spQueso.getValue();
				boolean jam1 = rbJamon.isSelected();
				boolean pol1 = rbPollo.isSelected();
				boolean bac1 = rbBacalao.isSelected();
				boolean que1 = rbQueso.isSelected();
				int opcion = 0;
				if (jam1) {
					opcion = 1;
				}else if (pol1) {
					opcion = 2;
				}else if (bac1) {
					opcion = 3;
				}else if (que1) {
					opcion = 4;
				}
				ejecutar(jam, pol, bac, que, opcion);
			}
		});
		btnFabricar.setBounds(59, 201, 89, 23);
		frame.getContentPane().add(btnFabricar);
		
		JLabel lblNewLabel_2 = new JLabel("CROQUETRONIC 2000");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(20, 11, 163, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
}
