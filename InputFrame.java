package taskmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InputFrame extends JFrame implements ActionListener{
	public JTextField TF1 = new JTextField(10);
	public JTextField TF2 = new JTextField(10);
	public JTextField TF3 = new JTextField(10);
	public JTextField TF4 = new JTextField(10);

	public InputFrame(String title){
		setTitle(title);
		setBounds(100,100,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.add(TF1);
		panel.add(TF2);
		panel.add(TF3);

		JButton Enter = new JButton("登録");
		Enter.addActionListener(this);
		panel.add(Enter);

		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
