package taskmanager;

import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListFrame extends JFrame{
	private JTextArea TextArea = new JTextArea();

	public ListFrame(ArrayList<Task> list, String title){
		setTitle(title);
		setBounds(100,100,300,600);
		setResizable(false);

		TextArea.setEditable(false);
		JPanel panel = new JPanel();
		JScrollPane scrPane = new JScrollPane(TextArea);
		scrPane.setSize(250, 550);
		panel.add(scrPane);
		add(panel);
	}

}
