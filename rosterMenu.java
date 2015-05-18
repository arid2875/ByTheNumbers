import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class rosterMenu extends JFrame implements ActionListener {
	private JButton newRosterButton, deleteRosterButton;
	private JPanel rosterButtonPanel;
	private JLabel rostersLabel;
	private JList rostersList;
	private JScrollPane rostersScrollPane;
	private Vector rosterNames;
	private Font font1;

	public rosterMenu(){
		this.setSize(400, 400);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.BLACK);
		this.setTitle("Rosters");
		rosterNames = new Vector<Roster>();
		rosterNames.add(new "Necia");
		rosterNames.add("Aaron");
		rosterNames.add("team");
		setLayout(new ColumnLayout(1));
		setSize(new Dimension(400,400));
		font1 = new Font("Arial",Font.BOLD,16);		
		rostersLabel = new JLabel("Rosters");
		rostersLabel.setFont(font1);
		rostersList = new JList(rosterNames);
		rostersList.addMouseListener(ml);
		rostersList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		rostersScrollPane = new JScrollPane(rostersList);
		rostersScrollPane.setPreferredSize(new Dimension(200,200));
		newRosterButton = new JButton("New Roster");
		newRosterButton.addActionListener(this);
		newRosterButton.setPreferredSize(new Dimension(125,50));
		deleteRosterButton = new JButton("Delete Roster");
		deleteRosterButton.addActionListener(this);
		deleteRosterButton.setPreferredSize(new Dimension(125,50));
		rosterButtonPanel = new JPanel(new FlowLayout());
		rosterButtonPanel.add(newRosterButton);
		rosterButtonPanel.add(deleteRosterButton);
		this.add(rostersLabel,BorderLayout.NORTH);
		this.add(rostersScrollPane,BorderLayout.CENTER);
		this.add(rosterButtonPanel,BorderLayout.SOUTH);
	}
	MouseListener ml = new MouseAdapter(){
		public void mouseDoubleClick(MouseEvent mouseEvent){
			rostersList = (JList) mouseEvent.getSource();
			if(mouseEvent.getClickCount() == 2)
			{
				int index = rostersList.locationToIndex(mouseEvent.getPoint());
				if(index >=0){
					Object o = rostersList.getModel().getElementAt(index);
					//open roster editor with selected roster
					// RosterEditor(o);
				}
			}
		}
	};

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == newRosterButton)
		{
			NewRoster n = new NewRoster();
			n.setVisible(true);
		}
		if(ae.getSource() == deleteRosterButton)
		{
			if(!rostersList.isSelectionEmpty())
			{
				Object o = rostersList.getSelectedValue();
				rosterNames.remove(o);
				rostersList.setListData(rosterNames);
				rostersList.repaint();				
			}
		}
		
	}


}
