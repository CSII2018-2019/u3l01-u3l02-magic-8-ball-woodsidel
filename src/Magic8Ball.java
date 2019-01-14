import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Magic8Ball extends JFrame{
		
		public Magic8Ball() {
			initGUI();
			
			setTitle("Magic 8 Ball");
			//setSize(200, 100); //pixels
			setResizable(true);
			pack();
			setLocationRelativeTo(null); //centers on screen, do this after packing but before visible

				
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
		public void initGUI(){
			//create the label
			JLabel titleLabel = new JLabel("Magic 8 Ball");
			//customize the label
			Font titleFont = new  Font ("Broadway", Font.BOLD + Font.ITALIC, 64);
			titleLabel.setFont(titleFont);
			titleLabel.setForeground(Color.BLUE);
			titleLabel.setBackground(Color.BLACK);
			titleLabel.setOpaque(true);
			//add the label to your window
			add(titleLabel, BorderLayout.PAGE_START);
			titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
			
			//center panel
			JPanel centerPanel = new JPanel();
			centerPanel.setBackground(Color.BLACK);
			add(centerPanel, BorderLayout.CENTER);
			
			//button panel
			JPanel buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.BLUE);
			add(buttonPanel, BorderLayout.PAGE_END);
			
			//button
			JButton shake = new JButton("SHAKE");
			
			shake.setBackground(Color.BLACK);
			shake.setForeground(Color.WHITE);
			buttonPanel.add(shake);
			
			Font shakeFont = new  Font ("Broadway", Font.BOLD, 32);
			shake.setFont(shakeFont);
		
		
			
	}
	



	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new Magic8Ball();
            }   
        });

		

	}

}
