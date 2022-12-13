package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class calci {
	private JFrame frame;
	private JTextField textField;
	Font digital1;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Font digital1;


		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			digital1= Font.createFont(Font.TRUETYPE_FONT, new File("digital.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("digital.ttf")));
		}
		catch(Exception e) {
			
		}
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textField = new JTextField();
		textField.setFont(digital1);
		textField.setBounds(29, 10, 429, 95);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\u2190");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
					
				}
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBackspace.setBounds(29, 139, 85, 60);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1.getText();
				textField.setText(number);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(29, 209, 85, 60);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2.getText();
				textField.setText(number);

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.setBounds(29, 279, 85, 60);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.setBounds(29, 356, 85, 60);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0\r\n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.setBounds(29, 440, 85, 60);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(145, 139, 85, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_6.getText();
				textField.setText(number);

			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_6.setBounds(145, 209, 85, 60);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_7.getText();
				textField.setText(number);

			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_7.setBounds(145, 279, 85, 60);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_8.getText();
				textField.setText(number);

			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_8.setBounds(145, 356, 85, 60);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);

			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDot.setBounds(145, 440, 85, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);

			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn00.setBounds(255, 139, 85, 60);
		frame.getContentPane().add(btn00);
		
		JButton btnNewButton_11 = new JButton("9");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_11.getText();
				textField.setText(number);

			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_11.setBounds(255, 209, 85, 60);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_12.getText();
				textField.setText(number);

			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_12.setBounds(255, 279, 85, 60);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_13.getText();
				textField.setText(number);

			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_13.setBounds(255, 356, 85, 60);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnpercent.setBounds(255, 440, 85, 60);
		frame.getContentPane().add(btnpercent);
		
		JButton btnPlius = new JButton("+");
		btnPlius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlius.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlius.setBounds(359, 139, 85, 60);
		frame.getContentPane().add(btnPlius);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(359, 209, 85, 60);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMul.setBounds(359, 279, 85, 60);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDiv.setBounds(359, 356, 85, 60);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if (operation =="+") {
					result = first+second;
					answer = String.format("%f", result);
					textField.setText(answer);
					
				}
				 if (operation =="-") {
					result= first-second;
					answer = String.format("%f", result);
					textField.setText(answer);
					
				}
				 if (operation =="*") {
					result = first*second;
					answer = String.format("%f", result);
					textField.setText(answer);
					
				}
				if (operation =="/") {
					result = first/second;
					answer = String.format("%f", result);
					textField.setText(answer);
					
				}
				if (operation =="%") {
					result = first%second;
					answer = String.format("%f", result);
					textField.setText(answer);
					
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqual.setBounds(359, 440, 85, 60);
		frame.getContentPane().add(btnEqual);
	}
}
