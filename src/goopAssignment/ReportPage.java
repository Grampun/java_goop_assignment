package goopAssignment;


import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ReportPage {

	JFrame frame;
	private JTextArea emailField;
	private JTextField emailTo;
	private JLabel lblReportAnIssue;
	public String sendTo;
	private JLabel lblEmail;

	/**
	 * Create the application.
	 */
	public ReportPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Lab033 lab1 = new Lab033();
		Lab137 lab2 = new Lab137();
		String emailBody = lab1.getMsg() + lab2.getMsg();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		emailField = new JTextArea();
		emailField.setText(emailBody);
		emailField.setBackground(SystemColor.window);
		emailField.setColumns(10);

		JLabel lblKindlyProvideDetails = new JLabel(
				"Kindly provide details regarding the faults being displayed by the machine/s below...");
		lblKindlyProvideDetails.setFont(new Font("Lucida Grande", Font.PLAIN, 9));

		emailTo = new JTextField();
		emailTo.setText("");
		emailTo.setToolTipText("you can change the email as you wish");
		emailTo.setForeground(new Color(204, 51, 51));
		emailTo.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		emailTo.setBackground(SystemColor.window);
		emailTo.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SendMail.send(emailTo.getText(), "Faulty Computers", emailBody + emailField.getText(), "goopAssignmentSM4079@gmail.com",
						"hopeipass");
				emailTo.setText(" ");
				frame.dispose();
				Main window = new Main();
				window.mainFrame.setVisible(true);

			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main window = new Main();
				window.mainFrame.setVisible(true);
			}
		});

		lblReportAnIssue = new JLabel("Report any issues");
		lblReportAnIssue.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblReportAnIssue.setForeground(new Color(0, 153, 153));

		lblEmail = new JLabel("Email:");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(24)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false).addGroup(groupLayout
								.createSequentialGroup()
								.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSubmit)).addComponent(emailField, GroupLayout.PREFERRED_SIZE, 401,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblKindlyProvideDetails, Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addComponent(lblReportAnIssue)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblEmail).addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(emailTo, GroupLayout.PREFERRED_SIZE, 133,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))))
				.addContainerGap(25, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(31)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblReportAnIssue)
								.addComponent(lblEmail).addComponent(emailTo, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
						.addComponent(lblKindlyProvideDetails).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(emailField, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout
								.createParallelGroup(Alignment.BASELINE).addComponent(btnSubmit).addComponent(btnBack))
						.addGap(15)));
		frame.getContentPane().setLayout(groupLayout);

	}

}
