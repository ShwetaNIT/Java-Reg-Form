package Registration_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_System extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_System frame = new Registration_System();
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
	public Registration_System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(233, 150, 122)));
		panel.setBounds(10, 10, 1350, 670);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(233, 150, 122)));
		panel_1.setBackground(new Color(245, 222, 179));
		panel_1.setBounds(20, 21, 1307, 118);
		panel.add(panel_1);
		
		JLabel lblMembershipRegistrationSystem = new JLabel("Membership Registration System");
		lblMembershipRegistrationSystem.setForeground(new Color(139, 0, 139));
		lblMembershipRegistrationSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembershipRegistrationSystem.setFont(new Font("Monotype Corsiva", Font.BOLD, 54));
		lblMembershipRegistrationSystem.setBounds(24, 22, 1262, 74);
		panel_1.add(lblMembershipRegistrationSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(233, 150, 122)));
		panel_2.setBackground(new Color(245, 222, 179));
		panel_2.setBounds(20, 144, 581, 392);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Reference No");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(33, 25, 232, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBounds(33, 61, 232, 25);
		panel_2.add(lblFirstName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(33, 133, 232, 25);
		panel_2.add(lblAddress);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSurname.setBounds(33, 97, 232, 25);
		panel_2.add(lblSurname);
		
		JLabel lblPostCode = new JLabel("Post Code");
		lblPostCode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPostCode.setBounds(33, 169, 232, 25);
		panel_2.add(lblPostCode);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelephone.setBounds(33, 205, 232, 25);
		panel_2.add(lblTelephone);
		
		JLabel lblDateOfReg = new JLabel("Date of Reg");
		lblDateOfReg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDateOfReg.setBounds(33, 241, 232, 25);
		panel_2.add(lblDateOfReg);
		
		JLabel lblProofOfId = new JLabel("Proof of ID");
		lblProofOfId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProofOfId.setBounds(33, 277, 232, 25);
		panel_2.add(lblProofOfId);
		
		JLabel lblMembershipType = new JLabel("Membership Type");
		lblMembershipType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMembershipType.setBounds(33, 313, 232, 25);
		panel_2.add(lblMembershipType);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAmountPaid.setBounds(33, 349, 232, 25);
		panel_2.add(lblAmountPaid);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(258, 25, 276, 25);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(258, 61, 276, 25);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(258, 133, 276, 25);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(258, 97, 276, 25);
		panel_2.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(258, 241, 276, 25);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(258, 169, 276, 25);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(258, 205, 276, 25);
		panel_2.add(textField_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Student", "Drivers License", "Pilot License", "Passport"}));
		comboBox.setBounds(258, 277, 276, 25);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Monthly", "Quaterly", "Six Months", "Annually"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setBounds(258, 313, 276, 25);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Rs 4000", "Rs 11000", "Rs 20000", "Rs 40000"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_2.setBounds(258, 349, 276, 25);
		panel_2.add(comboBox_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(233, 150, 122)));
		panel_3.setBackground(new Color(245, 222, 179));
		panel_3.setBounds(606, 144, 721, 392);
		panel.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 23, 674, 347);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No", "First Name", "Surname", "Address", "Post Code", "Telephone ", "Date of Reg", "Proof of ID", "Membership Type", "Amount Paid"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(77);
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(233, 150, 122)));
		panel_4.setBackground(new Color(245, 222, 179));
		panel_4.setBounds(20, 541, 1307, 107);
		panel.add(panel_4);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_7.getText(),
						textField_5.getText(),
						textField_6.getText(),
						comboBox.getSelectedItem(),
						comboBox_1.getSelectedItem(),
						comboBox_2.getSelectedItem()
				});
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "Membership Update Confirmed", "Membership Registration System",JOptionPane.OK_OPTION);
					}
				}
				
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(41, 34, 228, 43);
		panel_4.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_7.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox.setSelectedItem("Make a Selection");
				comboBox_1.setSelectedItem("Make a Selection");
				comboBox_2.setSelectedItem("Make a Selection");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(290, 34, 228, 43);
		panel_4.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Membership Registration System", JOptionPane.OK_OPTION);
					}
					else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Membership Registration System", JOptionPane.OK_OPTION);
					}
				}
				else {
					model.removeRow(table.getSelectedRow());
				}
			}
		
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(791, 34, 228, 43);
		panel_4.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to EXIT","MemberShip Registration System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(1043, 34, 228, 43);
		panel_4.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer Found",e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBounds(539, 34, 228, 43);
		panel_4.add(btnPrint);
	}
}
