import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;

public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Conectare");
	JButton resetButton = new JButton("Resetare");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("Utilizator:");
	JLabel userPasswordLabel = new JLabel("Parola:");
	JLabel messageLabel = new JLabel();
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	LoginPage(HashMap<String, String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null, Font.ITALIC, 25));
		
		userIDField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Conectează-te pentru a continua!");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
			messageLabel.setText("");
		}else if(e.getSource() == loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Conectare reușită!");
					GUI gui = new GUI();
					
				}else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Parolă greșită!");
				}
			}else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Nume negasit!");
			}
		}
		
	}
}
