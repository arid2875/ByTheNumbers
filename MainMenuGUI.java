import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MainMenuGUI extends JFrame implements ActionListener
{
    JButton newMatchButton, resultsButton, rosterButton;
    JLabel titleLabel;
    JPanel buttonPanel;
    Font font1;

    public MainMenuGUI(){
        this.setSize(new Dimension(400,425));
        this.setLocation(300, 300);
        this.setLayout(new ColumnLayout(1)); 
        this.setBackground(Color.WHITE);
        font1 = new Font("Arial",Font.BOLD,16);
        titleLabel = new JLabel("                                 By The Numbers");
        titleLabel.setFont(font1);        
        buttonPanel = new JPanel(new ColumnLayout(1,25,25));
        buttonPanel.setPreferredSize(new Dimension(400,400));
        buttonPanel.setBackground(Color.WHITE);
        newMatchButton = new JButton("New Match");
        newMatchButton.addActionListener(this);        
        newMatchButton.setPreferredSize(new Dimension(400,100));
        newMatchButton.setBackground(Color.CYAN);
        newMatchButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        resultsButton = new JButton("Results");
        resultsButton.addActionListener(this);
        resultsButton.setPreferredSize(new Dimension(400,100));
        resultsButton.setBackground(Color.CYAN);
        rosterButton = new JButton("Roster");
        rosterButton.addActionListener(this); 
        rosterButton.setPreferredSize(new Dimension(400,100));
        rosterButton.setBackground(Color.CYAN);
        buttonPanel.add(titleLabel);
        buttonPanel.add(newMatchButton);
        buttonPanel.add(rosterButton);
        buttonPanel.add(resultsButton);                
        this.add(buttonPanel);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==newMatchButton){
                    
                }
            if(ae.getSource()==resultsButton){
                
            }
            if(ae.getSource()==rosterButton){
            	rosterMenu r = new rosterMenu();
            	r.setVisible(true);
            	r.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) { System.exit(0); }
                  });
                
            }
        }

}
