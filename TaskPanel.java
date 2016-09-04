package taskmanager;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TaskPanel extends JPanel{

	public TaskPanel(Task task){
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);

		textArea.append(task.getRegistrationDate()+"\n");
		textArea.append(task.getQuestionDate()+"\n");
		textArea.append(task.getSubmissionDate()+"\n");
		textArea.append(task.getSubject()+"\n");
		textArea.append(task.StringEnd()+"\n");
		textArea.append(task.getContent()+"\n");

		add(textArea);

	}

}
