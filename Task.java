package taskmanager;

import java.util.Calendar;

public class Task {
	private int Registration_Date;
	private int Questions_Date;
	private int Submission_Date;
	private String subject;
	private String content;
	private boolean End;

	public Task(int QDate, int SDate, String sub, String con){
		Calendar calendar = Calendar.getInstance();
		StringBuilder RDate1 = new StringBuilder();
		RDate1.append(""+calendar.get(Calendar.YEAR));
		if(calendar.get(Calendar.MONTH) < 10){
			RDate1.append("0"+calendar.get(Calendar.MONTH));
		}else{
			RDate1.append(calendar.get(Calendar.MONTH));
		}
		if(calendar.get(Calendar.DATE) < 10){
			RDate1.append("0"+calendar.get(Calendar.DATE));
		}else{
			RDate1.append(calendar.get(Calendar.DATE));
		}
		Registration_Date = Integer.parseInt(RDate1.toString());
		Questions_Date = QDate;
		Submission_Date = SDate;
		subject = sub;
		content = con;
		End = false;
	}

	public int getRegistrationDate(){
		return Registration_Date;
	}

	public int getQuestionDate(){
		return Questions_Date;
	}

	public int getSubmissionDate(){
		return Submission_Date;
	}
}
