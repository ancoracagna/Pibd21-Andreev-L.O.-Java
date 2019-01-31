package lab2;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class WinCar {

	private JFrame frame;
	private JPanel panel;
	private JButton buttonUp;
	private JButton buttonDown;
	private JButton buttonLeft;
	private JButton buttonRight;
	private JButton buttonCreateGruzovik;
	private JButton buttonCreateSamosval;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinCar window = new WinCar();
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

	public WinCar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 901, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel = new PanelCar();
		panel.setBounds(10, 11, 864, 439);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		buttonDown = new JButton("↓");
		buttonDown.setBounds(735, 351, 62, 60);
		panel.add(buttonDown);
		buttonDown.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PanelCar.initialization) {
					PanelCar.ship.MoveTransport(Direction.Down);
				}
				RedrawUI();
			}
		});
		buttonDown.setIcon(null);
		buttonRight = new JButton("→");
		buttonRight.setBounds(802, 351, 62, 60);
		panel.add(buttonRight);
		buttonRight.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PanelCar.initialization) {
					PanelCar.ship.MoveTransport(Direction.Right);
				}
				RedrawUI();
			}
		});
		buttonRight.setIcon(null);
		buttonLeft = new JButton("←");
		buttonLeft.setBounds(670, 351, 62, 60);
		panel.add(buttonLeft);
		buttonLeft.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PanelCar.initialization) {
					PanelCar.ship.MoveTransport(Direction.Left);
				}
				RedrawUI();
			}
		});
		buttonLeft.setIcon(null);
		buttonUp = new JButton("↑");
		buttonUp.setBounds(735, 286, 62, 60);
		panel.add(buttonUp);
		buttonUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PanelCar.initialization) {
					PanelCar.ship.MoveTransport(Direction.Up);
				}
				RedrawUI();
			}
		});
		buttonUp.setIcon(null);
		
		buttonCreateGruzovik = new JButton("Создать грузовик");
		buttonCreateGruzovik.setBounds(10, 11, 198, 29);
		panel.add(buttonCreateGruzovik);
		buttonCreateGruzovik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
				PanelCar.ship = new GruzCar(rnd.nextInt(200) + 100, rnd.nextInt(1000) + 1000, Color.GRAY, Color.BLUE, true, true, 1);
				PanelCar.initialization = true;
				PanelCar.ship.SetPosition(rnd.nextInt(90) + 40, rnd.nextInt(90) + 40, panel.getWidth(), panel.getHeight());
				RedrawUI();
			}
		});
		
		buttonCreateSamosval = new JButton("Создать самосвал");
		buttonCreateSamosval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
				PanelCar.ship = new SamosvalCar(rnd.nextInt(200) + 100, rnd.nextInt(1000) + 1000, Color.GRAY);
				PanelCar.initialization = true;
				PanelCar.ship.SetPosition(rnd.nextInt(90) + 10, rnd.nextInt(90) + 10, panel.getWidth(), panel.getHeight());
				RedrawUI();
			}
		});
		buttonCreateSamosval.setBounds(220, 11, 198, 29);
		panel.add(buttonCreateSamosval);
	}

	private void RedrawUI() {
		panel.updateUI();
	}
}
