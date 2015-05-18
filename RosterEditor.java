import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class RosterEditor extends JFrame implements ActionListener {
    JButton addPlayerButton, deletePlayerButton, editPlayerButton;
    JPanel buttonPanel, playerPanel;
    JTextField nameTextField, numberTextField;
    JComboBox yearComboBox;
    JLabel nameLabel, numberLabel, yearLabel;
    JList currentPlayersList;
    Vector currentPlayers;
    JScrollPane currentPlayersScrollPane;
    
    public RosterEditor(){
        this.setSize(400,400);
        this.setLayout(new GridLayout(2,2));
        this.setLocation(200,200);
        
        buttonPanel = new JPanel(new FlowLayout());
        editPlayerButton = new JButton("Edit Player");
        editPlayerButton.addActionListener(this);
        editPlayerButton.setSize(75, 25);
        deletePlayerButton = new JButton("Delete Player");
        deletePlayerButton.addActionListener(this);
        deletePlayerButton.setSize(75, 25);
        buttonPanel.add(editPlayerButton);
        buttonPanel.add(deletePlayerButton);
        
        this.add(buttonPanel);
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
                
    }

}