package vehicle.showroom;

import java.sql.*;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Email");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label1.setBounds(65, 60, 46, 14);
		contentPane.add(label1);
		
		email = new JTextField();
		email.setBounds(115, 60, 241, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(53, 106, 58, 14);
		contentPane.add(lblNewLabel);
		
		password = new JPasswordField();
		password.setBounds(115, 105, 241, 20);
		contentPane.add(password);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_showroom","root","");
					System.out.println("Connected!");
					Statement stmt = con.createStatement();
					
					
					String sql = "Select * from users where email = '"+email.getText()+"' and password = '"+password.getText().toString()+"'";
					String email_str = email.getText().toString();
					
					ResultSet rs=null;
					System.out.println(email_str);
					
					String regex = "^(.+)@(.+)$";
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(email_str);
									
					if(matcher.matches()) {
						rs = stmt.executeQuery(sql);
					}
					else {
						JOptionPane.showMessageDialog(null, "Not an email address!");
					}
					
					if(rs.next()) {
						//JOptionPane.showMessageDialog(null,"Login Successful!");
						Home mf = new Home();
	                    mf.setVisible(true);
	                    dispose();
					}
					else {
						JOptionPane.showMessageDialog(null,"Incorrect email or password!");

					}
					con.close();
					
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		login.setBounds(115, 150, 85, 20);
		contentPane.add(login);
	}
}
