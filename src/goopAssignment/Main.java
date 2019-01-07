package goopAssignment;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class Main {

	JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//creation of the main menu
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(Color.WHITE);
		mainFrame.setBackground(new Color(238, 238, 238));
		mainFrame.setTitle("SMI Computer Lab Fault Reporting System");
		mainFrame.setBounds(100, 100, 500, 330);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		Image img = new ImageIcon(this.getClass().getResource("/smilogo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		//will select lab137
		JButton lab137Bttn = new JButton("Lab 137");
		lab137Bttn.setBackground(Color.LIGHT_GRAY);
		lab137Bttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.setVisible(false);
				Lab033 lab1 = new Lab033();
				lab1.frame033.setVisible(true);
			}
		});
		//will select lab033
		JButton lab033Bttn = new JButton("Lab 033");
		lab033Bttn.setBackground(Color.LIGHT_GRAY);
		lab033Bttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.setVisible(false);
				Lab137 lab2 = new Lab137();
				lab2.frmLab.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Saint Martins Institute of Higher Education");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));

		JLabel lblComputerLabFault = new JLabel("Computer Lab Fault Reporting System");
		Image img1 = new ImageIcon(this.getClass().getResource("/smilogo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));

		GroupLayout groupLayout = new GroupLayout(mainFrame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(12)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblComputerLabFault)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lab033Bttn, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lab137Bttn,
												GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
						.addGap(37)).addComponent(lblNewLabel_1))
				.addGap(37)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addGap(33).addComponent(lblNewLabel_1)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(lblComputerLabFault).addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
						.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lab033Bttn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(lab137Bttn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGap(63))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))));
		mainFrame.getContentPane().setLayout(groupLayout);
	}
}
