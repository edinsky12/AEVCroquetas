package cosetes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Procesadora {
	static int jamon=0;
	static int pollo=0;
	static int bacalao=0;
	static int queso=0;
	static int opcion=1;
	static int total;
	
	static int totaljamon;
	static int totalpollo;
	static int totalbacalao;
	static int totalqueso;
	
	static JLabel lbJam = new JLabel("-");
	static JLabel lbPoll = new JLabel("-");
	static JLabel lbBac = new JLabel("-");
	static JLabel lbQues = new JLabel("-");

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		jamon = Integer.valueOf(args[0]);
		pollo = Integer.valueOf(args[1]);
		bacalao = Integer.valueOf(args[2]);
		queso = Integer.valueOf(args[3]);
		opcion = Integer.valueOf(args[4]);
		total = jamon + pollo + bacalao + queso;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Procesadora window = new Procesadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Create the application.
	 */
	public Procesadora() {
		initialize();
		totaljamon = 0;
		totalpollo = 0;
		totalbacalao = 0;
		totalqueso = 0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 289, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("SE HAN PRODUCIDO:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(57, 11, 179, 33);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Croquetas de Jamon:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(29, 55, 137, 26);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Croquetas de Pollo");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(29, 92, 137, 26);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Croquetas de Bacalao");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(29, 129, 137, 26);
		frame.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Croquetas de Queso");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(29, 166, 137, 26);
		frame.getContentPane().add(lblNewLabel_1_3);

		
		lbJam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbJam.setBounds(178, 55, 49, 26);
		frame.getContentPane().add(lbJam);
		
		lbPoll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbPoll.setBounds(176, 92, 49, 26);
		frame.getContentPane().add(lbPoll);

		
		lbBac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbBac.setBounds(176, 129, 49, 26);
		frame.getContentPane().add(lbBac);

		
		lbQues.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbQues.setBounds(176, 166, 49, 26);
		frame.getContentPane().add(lbQues);
		
		JButton btnInicio = new JButton("Iniciar Croquetacion");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hacerCrocs();
			}
		});
		btnInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInicio.setBounds(57, 208, 167, 33);
		frame.getContentPane().add(btnInicio);
		
		
	}

	@SuppressWarnings("unused")
	public void hacerCrocs() {

		if (opcion == 1 || opcion == 0) {

			for (int i = 0; i < jamon; i++) {
				totaljamon += 1;
				lbJam.setText(totaljamon+"/"+jamon);
				try {
					System.out.println("");
					Proceso jamonP = new Proceso("jamon");
					
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			for (int i = 0; i < pollo; i++) {
				try {
					System.out.println("");
					Proceso polloP = new Proceso("pollo");
					totalpollo += 1;
					lbPoll.setText(totalpollo+"/"+pollo);
					lbPoll.repaint();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			for (int i = 0; i < bacalao; i++) {
				try {
					System.out.println("");
					Proceso bacalaoP = new Proceso("bacalao");
					totalbacalao += 1;
					lbBac.setText(totalbacalao+"/"+bacalao);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			for (int i = 0; i < queso; i++) {
				try {
					System.out.println("");
					Proceso quesoP = new Proceso("queso");
					totalqueso += 1;
					lbQues.setText(totalqueso+"/"+queso);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
		else if (opcion == 2) {
			
			for (int i = 0; i < pollo; i++) {
				try {
					System.out.println("");
					Proceso polloP = new Proceso("pollo");
					totalpollo += 1;
					lbPoll.setText(totalpollo+"/"+pollo);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			for (int i = 0; i < jamon; i++) {
				try {
					System.out.println("");
					Proceso jamonP = new Proceso("jamon");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totaljamon += 1;
				lbJam.setText(totaljamon+"/"+jamon);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			for (int i = 0; i < bacalao; i++) {
				try {
					System.out.println("");
					Proceso bacalaoP = new Proceso("bacalao");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalbacalao += 1;
				lbBac.setText(totalbacalao+"/"+bacalao);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			for (int i = 0; i < queso; i++) {
				try {
					System.out.println("");
					Proceso quesoP = new Proceso("queso");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalqueso += 1;
				lbQues.setText(totalqueso+"/"+queso);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		else if (opcion == 3) {
			
			for (int i = 0; i < bacalao; i++) {
				try {
					System.out.println("");
					Proceso bacalaoP = new Proceso("bacalao");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalbacalao += 1;
				lbBac.setText(totalbacalao+"/"+bacalao);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			for (int i = 0; i < jamon; i++) {
				try {
					System.out.println("");
					Proceso jamonP = new Proceso("jamon");
					
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totaljamon += 1;
				lbJam.setText(totaljamon+"/"+jamon);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			for (int i = 0; i < pollo; i++) {
				try {
					System.out.println("");
					Proceso polloP = new Proceso("pollo");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalpollo += 1;
				lbPoll.setText(totalpollo+"/"+pollo);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			
			for (int i = 0; i < queso; i++) {
				try {
					System.out.println("");
					Proceso quesoP = new Proceso("queso");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalqueso += 1;
				lbQues.setText(totalqueso+"/"+queso);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		else if (opcion == 4) {
			
			for (int i = 0; i < queso; i++) {
				try {
					System.out.println("");
					Proceso quesoP = new Proceso("queso");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalqueso += 1;
				lbQues.setText(totalqueso+"/"+queso);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			for (int i = 0; i < jamon; i++) {
				try {
					System.out.println("");
					Proceso jamonP = new Proceso("jamon");
					
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totaljamon += 1;
				lbJam.setText(totaljamon+"/"+jamon);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			for (int i = 0; i < pollo; i++) {
				try {
					System.out.println("");
					Proceso polloP = new Proceso("pollo");
				
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalpollo += 1;
				lbPoll.setText(totalpollo+"/"+pollo);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			for (int i = 0; i < bacalao; i++) {
				try {
					System.out.println("");
					Proceso bacalaoP = new Proceso("bacalao");
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				totalbacalao += 1;
				lbBac.setText(totalbacalao+"/"+bacalao);
				while (Thread.activeCount() > 100) {
					try {
						wait(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
	
