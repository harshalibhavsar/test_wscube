package libary.management.system;
import java.awt.*;
import javax.swing.*;

public class ReadMe extends JFrame {
	
    private JPanel contentPane;
    
	public static void main(String[] args) {
		
   new ReadMe().setVisible(true);
	}
	public ReadMe() {
		
		super("Read Me - Libery Management System");
		setBounds(500,250,700,500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel 13 = new JLabel("Library");
		13.setForground(new Color(0,250,154));
		13.setFont(new Font("Trebuchet M3",Font.BOLD | Font.ITALIC,34));
		13.setBounds(160,40,150,55);
		contentPane.add(13);
		
		
		JLabel 14 = new JLabel("Management System");
		14.setForground(new Color(127,255,0));
		14.setFont(new Font("Trebuchet M3",Font.BOLD |Font.ITALIC,34));
		14.setBounds(70,90,405,40);
		contentPane.add(14);
		
		
		JLabel 15 = new JLabel("v5.1");
		15.setForground(new Color(30,144,255));
		15.setFont(new Font("Trebuchet M3",Font.BOLD |Font.ITALIC,25));
		15.setBounds(105,140,100,21);
		contentPane.add(15);
		
		
		JLabel 16 = new JLabel("Develope By: code for interview");
		16.setForground(new Color(127,255,0));
		16.setFont(new Font("Trebuchet M3",Font.BOLD |Font.ITALIC,30));
		16.setBounds(70,198,600,35);
		contentPane.add(16);
		

		JTextArea 17 = new JTextArea("Libery management system is a project which\n aims in developing a computerized system  to\n maintain all \the daily work of library.the content track\n all the books available in the library. It allows both the\n admin and student to search for the desired book.");
		17.setFont(new Font("Trebuchet M3",Font.BOLD ,20));
		17.setBounds(70,260,600,200);
		contentPane.add(17);
		
		contentPane.setBackground(Color.WHITE);
		
	}
}
		
	

