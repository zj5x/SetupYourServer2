import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.*;

public class GUI {
	
	private JLabel label, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14;
	private JButton button, button1, button2;
	private JPanel panel;
	private JFrame frame;
	
	public GUI() {
		
		frame = new JFrame();
		
		label = new JLabel("Setup-ul TLauncher pentru SRV BudgetCity");
		
		label1 = new JLabel("Acest setup va ajuta la");
		
		label2 = new JLabel("scurtarea operatiunilor actionate de");
		
		label3 = new JLabel("catre dumneavoastra!");
		
		label4 = new JLabel("Pentru inceput vom descarca fisierele cu ajutorul Butonului de mai jos numit download!");
		
		label5 = new JLabel("Dupa ce ati accesat link-ul apasati download!");
		
		label6 = new JLabel("Urmatorul pas este sa apsati Butonul numit Setup!");
		
		label7 = new JLabel("Ati teminat! Modurile au fost instalate cu succes!");
		
		label8 = new JLabel("Credite:");
		
		label9 = new JLabel("Software creat de:  VXZJDev");
		
		label10 = new JLabel("Proiectat de:NoobZJ");
		
		label11 = new JLabel("Programat de:Voltex XD");
		
		label12 = new JLabel("Detalii pe www.budgetcity.netlify.app!");
		
		label13 = new JLabel("Pas opțional:Daca nu aveti winrar apasati butonul de mai jos!");
		
		label14 = new JLabel("Atenție! VXZJDev nu are nicio formă de asociere cu Winrar");
		
		button = new JButton("Download");
		button.addActionListener(new ButtonListener());
		
		button1 = new JButton("Setup");
		button1.addActionListener(new ButtonListener());
		
		button2 = new JButton("Winrar");
		button2.addActionListener(new ButtonListener());
		
		panel =  new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(button);
		panel.add(label5);
		panel.add(label6);
		panel.add(button1);
		panel.add(label7);
		panel.add(label13);
		panel.add(button2);
		panel.add(label8);
		panel.add(label9);
		panel.add(label10);
		panel.add(label11);
		panel.add(label12);
		panel.add(label14);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Setup BudgetCity"); 
		frame.pack();
		frame.setVisible(true);
		
	}
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI("https://drive.google.com/uc?export=download&id=16jq5pw6QV0LQ1eYiTj8jmfUqc3oTsKVJ"));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}else if(e.getSource() == button1) {
				File source = new File("Downloads\\BudgetCity");
				File dest = new File("%appdata%\\.minecraft\\versions\\BudgetCity");
				try {
					Files.move(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else if(e.getSource() == button2) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI("https://www.win-rar.com/start.html?&L=0"));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
