package goopAssignment;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.SwingConstants;

public class Lab033 {
	public static String msgReport = "";
	JFrame frame033;

	/**
	 * Create the application.
	 */
	public Lab033() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame033 = new JFrame();
		frame033.setBackground(Color.WHITE);
		frame033.setTitle("Lab 137");
		frame033.getContentPane().setBackground(SystemColor.activeCaption);
		frame033.getContentPane().setForeground(SystemColor.desktop);
		frame033.setBounds(100, 100, 727, 466);
		frame033.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel row02 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/row330.jpg")).getImage();
		row02.setIcon(new ImageIcon(img));

		JLabel row01 = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/row330.jpg")).getImage();
		row01.setIcon(new ImageIcon(img));
		Image img1 = new ImageIcon(this.getClass().getResource("/computersmi.png")).getImage();
		// each check-box selected will add to the string msgReport, used in the final
		// email report
		JLabel LecturerPcLbl = new JLabel("");
		LecturerPcLbl.setIcon(new ImageIcon("/rowOf1.jpg"));
		LecturerPcLbl.setHorizontalAlignment(SwingConstants.CENTER);
		LecturerPcLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		LecturerPcLbl.setBackground(SystemColor.menu);

		JCheckBox chckbxPcA = new JCheckBox("A1");

		chckbxPcA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxPcA.isSelected()) {
					msgReport += "A1:  \n";

				} else {
					msgReport = "";
				}
			}
		});
		chckbxPcA.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA = new JCheckBox("A2");
		chckbxA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA.isSelected()) {
					msgReport += "A2:  \n";

				} else {
					msgReport = "";
				}
			}
		});
		chckbxA.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_1 = new JCheckBox("A3");
		chckbxA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_1.isSelected()) {
					msgReport += "A3:  \n";

				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_2 = new JCheckBox("A4");
		chckbxA_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_2.isSelected()) {
					msgReport += "A4:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_5 = new JCheckBox("A7");
		chckbxA_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_5.isSelected()) {
					msgReport += "A7:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_7 = new JCheckBox("A9");
		chckbxA_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_7.isSelected()) {
					msgReport += "A9:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_7.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_6 = new JCheckBox("A8");
		chckbxA_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_6.isSelected()) {
					msgReport += "A8:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_4 = new JCheckBox("A6");
		chckbxA_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_4.isSelected()) {
					msgReport += "A6:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_3 = new JCheckBox("A5");
		chckbxA_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_3.isSelected()) {
					msgReport += "A5:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxA_8 = new JCheckBox("A10");
		chckbxA_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxA_8.isSelected()) {
					msgReport += "A10:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxA_8.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_1 = new JCheckBox("B1");
		chckbxB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_1.isSelected()) {
					msgReport += "B1:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_02 = new JCheckBox("B2");
		chckbxB_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_02.isSelected()) {
					msgReport += "B2:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_02.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_03 = new JCheckBox("B3");
		chckbxB_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_03.isSelected()) {
					msgReport += "B3:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_03.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_04 = new JCheckBox("B4");
		chckbxB_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_04.isSelected()) {
					msgReport += "B4:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_04.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_05 = new JCheckBox("B5");
		chckbxB_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_05.isSelected()) {
					msgReport += "B5:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_05.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_06 = new JCheckBox("B6");
		chckbxB_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_06.isSelected()) {
					msgReport += "B6:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_06.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_07 = new JCheckBox("B7");
		chckbxB_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_07.isSelected()) {
					msgReport += "B7:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_07.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_08 = new JCheckBox("B8");
		chckbxB_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_08.isSelected()) {
					msgReport += "B8:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_08.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_09 = new JCheckBox("B9");
		chckbxB_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_09.isSelected()) {
					msgReport += "B9:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_09.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxB_10 = new JCheckBox("B10");
		chckbxB_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxB_10.isSelected()) {
					msgReport += "B10:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxB_10.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JCheckBox chckbxLecturerPc = new JCheckBox("Lecturer PC");
		chckbxLecturerPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxLecturerPc.isSelected()) {
					msgReport += "Lecturer Pc:  \n";
				} else {
					msgReport = "";
				}
			}
		});
		chckbxLecturerPc.setForeground(new Color(255, 51, 0));

		JLabel lblLab033 = new JLabel("Lab 137");
		lblLab033.setToolTipText("");
		lblLab033.setForeground(new Color(0, 139, 139));
		lblLab033.setFont(new Font("Lucida Grande", Font.BOLD, 24));

		JButton btnReportIssue = new JButton("Report an issue");
		btnReportIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame033.setVisible(false);
				ReportPage page = new ReportPage();
				page.frame.setVisible(true);
			}
		});
		btnReportIssue.setBackground(Color.LIGHT_GRAY);

		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxLecturerPc.setSelected(false);

				chckbxPcA.setSelected(false);
				chckbxA.setSelected(false);
				chckbxA_1.setSelected(false);
				chckbxA_2.setSelected(false);
				chckbxA_3.setSelected(false);
				chckbxA_4.setSelected(false);
				chckbxA_5.setSelected(false);
				chckbxA_6.setSelected(false);
				chckbxA_7.setSelected(false);
				chckbxA_8.setSelected(false);

				chckbxB_1.setSelected(false);
				chckbxB_02.setSelected(false);
				chckbxB_03.setSelected(false);
				chckbxB_04.setSelected(false);
				chckbxB_05.setSelected(false);
				chckbxB_06.setSelected(false);
				chckbxB_07.setSelected(false);
				chckbxB_08.setSelected(false);
				chckbxB_09.setSelected(false);
				chckbxB_10.setSelected(false);
			}
		});

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame033.dispose();
				Main window = new Main();
				window.mainFrame.setVisible(true);
			}
		});

		JLabel lecturerPc1 = new JLabel("");
		Image imgPc = new ImageIcon(this.getClass().getResource("/rowOf1.jpg")).getImage();
		lecturerPc1.setIcon(new ImageIcon(imgPc));

		GroupLayout groupLayout = new GroupLayout(frame033.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(39)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chckbxPcA).addGap(18)
																.addComponent(chckbxA, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chckbxA_1, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chckbxA_2, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chckbxA_3, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(chckbxA_4, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chckbxA_5, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chckbxA_6, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chckbxA_7, GroupLayout.PREFERRED_SIZE, 55,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(2).addComponent(chckbxA_8,
																		GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE))
														.addComponent(row01)
														.addGroup(groupLayout.createSequentialGroup()
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(chckbxLecturerPc)
																		.addGroup(groupLayout
																				.createSequentialGroup().addGap(8)
																				.addComponent(lecturerPc1)))
																.addPreferredGap(ComponentPlacement.RELATED, 342,
																		Short.MAX_VALUE)
																.addComponent(lblLab033)))
												.addGap(131))
										.addGroup(groupLayout.createSequentialGroup().addGap(6)
												.addComponent(chckbxB_1, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(chckbxB_02, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(chckbxB_03, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(27)
												.addComponent(chckbxB_04, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(chckbxB_05, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(chckbxB_06, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(chckbxB_07, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(chckbxB_08, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(26)
												.addComponent(chckbxB_09, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(chckbxB_10))
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(groupLayout.createSequentialGroup().addComponent(btnNewButton)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnReset)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(btnReportIssue))
												.addComponent(row02))))
						.addGroup(groupLayout.createSequentialGroup().addGap(16).addComponent(LecturerPcLbl,
								GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblLab033,
										GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup().addComponent(LecturerPcLbl)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lecturerPc1)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(chckbxLecturerPc)))
						.addGap(22).addComponent(row01).addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(chckbxA_1)
								.addComponent(chckbxA_2).addComponent(chckbxA_3).addComponent(chckbxA_4)
								.addComponent(chckbxA_5).addComponent(chckbxA_6)
								.addComponent(chckbxA_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(chckbxPcA).addComponent(chckbxA).addComponent(chckbxA_8))
						.addGap(41).addComponent(row02).addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(chckbxB_1)
								.addComponent(chckbxB_02).addComponent(chckbxB_03).addComponent(chckbxB_04)
								.addComponent(chckbxB_05).addComponent(chckbxB_06).addComponent(chckbxB_07)
								.addComponent(chckbxB_08).addComponent(chckbxB_09).addComponent(chckbxB_10))
						.addGap(18).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnReportIssue).addComponent(btnReset).addComponent(btnNewButton))
						.addGap(11)));
		frame033.getContentPane().setLayout(groupLayout);
	}

	// used to return a final string containing the PCs which have any issues...
	// this will be used in the email body
	public String getMsg() {
		return "Room 137 \n" + msgReport;
	}

}
