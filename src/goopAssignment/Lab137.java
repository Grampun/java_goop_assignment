package goopAssignment;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Lab137 {
	public static String msgReport = "";
	JFrame frmLab;

	/**
	 * Create the application.
	 */

	public Lab137() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frmLab = new JFrame();
		frmLab.getContentPane().setBackground(Color.WHITE);

		JLabel row_a1 = new JLabel("");
		java.awt.Image img = new ImageIcon(this.getClass().getResource("/rowOf3.jpg")).getImage();
		row_a1.setIcon(new ImageIcon(img));

		JLabel row_b1 = new JLabel("");
		row_b1.setIcon(new ImageIcon(img));

		JLabel row_c1 = new JLabel("");
		row_c1.setIcon(new ImageIcon(img));

		JLabel a4 = new JLabel("");
		a4.setIcon(new ImageIcon(img));

		JLabel row_b2 = new JLabel("");
		row_b2.setIcon(new ImageIcon(img));

		JLabel row_c2 = new JLabel("");
		java.awt.Image img1 = new ImageIcon(this.getClass().getResource("/rowOf2.jpg")).getImage();
		row_c2.setIcon(new ImageIcon(img1));

		JCheckBox a1 = new JCheckBox("A1");
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a1.isSelected()) {
					msgReport += "A1:  \n";

				} else {
					msgReport = "";
				}
			}
		});
		a1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});

		JCheckBox a2 = new JCheckBox("A2");
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a2.isSelected()) {
					msgReport += "A2:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox a3 = new JCheckBox("A3");
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a3.isSelected()) {
					msgReport += "A3:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox chckbxA = new JCheckBox("A4");
		chckbxA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA.isSelected()) {
					msgReport += "A4:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox a5 = new JCheckBox("A5");
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a5.isSelected()) {
					msgReport += "A5:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox a6 = new JCheckBox("A6");
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a6.isSelected()) {
					msgReport += "A6:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox b1 = new JCheckBox("B1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1.isSelected()) {
					msgReport += "B1:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox chckbxB = new JCheckBox("B2");
		chckbxB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB.isSelected()) {
					msgReport += "B2:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox b3 = new JCheckBox("B3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b3.isSelected()) {
					msgReport += "B3:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox b4 = new JCheckBox("B4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b4.isSelected()) {
					msgReport += "B4:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox b5 = new JCheckBox("B5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b5.isSelected()) {
					msgReport += "B5:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox b6 = new JCheckBox("B6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b6.isSelected()) {
					msgReport += "B6:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox c1 = new JCheckBox("C1");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c1.isSelected()) {
					msgReport += "C1:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox c2 = new JCheckBox("C2");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c2.isSelected()) {
					msgReport += "C2:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox c3 = new JCheckBox("C3");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c3.isSelected()) {
					msgReport += "C3:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox c4 = new JCheckBox("C4");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c4.isSelected()) {
					msgReport += "C4:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JCheckBox c5 = new JCheckBox("C5");
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c5.isSelected()) {
					msgReport += "C5:  \n";

				} else {
					msgReport = "";
				}
			}
		});

		JLabel lecturerPc = new JLabel("");
		java.awt.Image img2 = new ImageIcon(this.getClass().getResource("/rowOf1.jpg")).getImage();
		lecturerPc.setIcon(new ImageIcon(img2));

		JCheckBox chckbxLecturerPc = new JCheckBox("Lecturer PC");
		chckbxLecturerPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxLecturerPc.isSelected()) {
					msgReport += "Lecturer PC:  \n";

				} else {
					msgReport = "";
				}
			}
		});
		chckbxLecturerPc.setForeground(new Color(255, 51, 0));

		JLabel lblLab = new JLabel("Lab 033");
		lblLab.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblLab.setForeground(new Color(0, 153, 153));

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxLecturerPc.setSelected(false);
				a1.setSelected(false);
				a2.setSelected(false);
				a3.setSelected(false);
				chckbxA.setSelected(false);
				a5.setSelected(false);
				a6.setSelected(false);

				b1.setSelected(false);
				chckbxB.setSelected(false);
				b3.setSelected(false);
				b4.setSelected(false);
				b5.setSelected(false);
				b6.setSelected(false);

				c1.setSelected(false);
				c2.setSelected(false);
				c3.setSelected(false);
				c4.setSelected(false);
				c5.setSelected(false);
			}
		});
		btnReset.setBackground(Color.LIGHT_GRAY);

		JButton button = new JButton("Report an issue");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLab.dispose();
				ReportPage page = new ReportPage();
				page.frame.setVisible(true);
			}
		});
		button.setBackground(Color.LIGHT_GRAY);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLab.setVisible(false);
				Main window = new Main();
				window.mainFrame.setVisible(true);

			}
		});

		GroupLayout groupLayout = new GroupLayout(frmLab.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(60)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lecturerPc)
						.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING)
								.addComponent(row_c1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup().addGap(6).addComponent(b1,
														GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
												.addComponent(c1, GroupLayout.PREFERRED_SIZE, 49,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup().addGap(22)
														.addComponent(chckbxB, GroupLayout.PREFERRED_SIZE, 49,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(b3, GroupLayout.PREFERRED_SIZE, 49,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup().addGap(26)
														.addComponent(c2, GroupLayout.PREFERRED_SIZE, 49,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(c3, GroupLayout.PREFERRED_SIZE, 49,
																GroupLayout.PREFERRED_SIZE))))
								.addComponent(row_a1)
								.addGroup(groupLayout.createSequentialGroup().addComponent(a1).addGap(28)
										.addComponent(a2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(a3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
								.addComponent(row_b1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBack))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
										.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(chckbxA, GroupLayout.PREFERRED_SIZE, 49,
																GroupLayout.PREFERRED_SIZE)
														.addGap(27)
														.addComponent(a5, GroupLayout.PREFERRED_SIZE, 49,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addComponent(a6, GroupLayout.PREFERRED_SIZE, 49,
																GroupLayout.PREFERRED_SIZE)
														.addGap(83))
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(
														groupLayout.createSequentialGroup().addGroup(groupLayout
																.createParallelGroup(Alignment.LEADING)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(row_b2,
																				GroupLayout.PREFERRED_SIZE, 200,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(row_c2)
																		.addComponent(a4, Alignment.TRAILING,
																				GroupLayout.PREFERRED_SIZE, 200,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblLab, Alignment.TRAILING))
																.addGroup(groupLayout.createSequentialGroup()
																		.addComponent(b4, GroupLayout.PREFERRED_SIZE,
																				49, GroupLayout.PREFERRED_SIZE)
																		.addGap(28)
																		.addComponent(b5, GroupLayout.PREFERRED_SIZE,
																				49, GroupLayout.PREFERRED_SIZE)
																		.addGap(18).addComponent(b6,
																				GroupLayout.PREFERRED_SIZE, 49,
																				GroupLayout.PREFERRED_SIZE)))
																.addContainerGap(75, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(c4, GroupLayout.PREFERRED_SIZE, 49,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(c5, GroupLayout.PREFERRED_SIZE, 49,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(76)))))
										.addGroup(groupLayout.createSequentialGroup().addGap(103)
												.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 78,
														GroupLayout.PREFERRED_SIZE)
												.addContainerGap())))))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(437, Short.MAX_VALUE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE).addGap(72))
				.addGroup(groupLayout.createSequentialGroup().addGap(52).addComponent(chckbxLecturerPc)
						.addContainerGap(495, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(25)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(lecturerPc)
						.addComponent(lblLab, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(chckbxLecturerPc).addGap(13)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup()
						.addComponent(a4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(chckbxA)
								.addComponent(a5).addComponent(a6))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(row_b2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(b4).addComponent(b5)
								.addComponent(b6))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(row_c2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(c4).addComponent(c5))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button)
								.addComponent(btnReset)))
						.addGroup(groupLayout.createSequentialGroup().addComponent(row_a1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(a1)
										.addComponent(a2).addComponent(a3))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(row_b1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(b1)
										.addComponent(chckbxB).addComponent(b3))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(row_c1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(c1)
										.addComponent(c2).addComponent(c3))
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnBack)))
				.addContainerGap(10, Short.MAX_VALUE)));
		frmLab.getContentPane().setLayout(groupLayout);
		frmLab.setTitle("Lab 033");
		frmLab.setBounds(100, 100, 650, 500);
		frmLab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// used to return a final string containing the PCs which have any issues...
	// this will be used in the email body
	public String getMsg() {
		return "Room 033 \n" + msgReport;
	}

}
