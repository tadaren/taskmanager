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

	public void setRegistrationDate(int regist){
		Registration_Date = regist;
	}

	public int getRegistrationDate(){
		return Registration_Date;
	}
	
	public void setQuestionDate(int question){
		Quuestion_Date = question;
	}

	public int getQuestionDate(){
		return Questions_Date;
	}
	
	public void setSubmissionDate(int sub){
		Submission_Date = sub;
	}

	public int getSubmissionDate(){
		return Submission_Date;
	}

	public void setSubject(String subj){
		subject = subj;
	}

	public String getSubject(){
		return subject;
	}

	public String setContent(String con){
		content = con;	
	}

	public String getContent(){
		return content;
	}
	
	public void setEnd(boolean end){
		End = end;
	}

	public boolean getEnd(){
		return End;
	}

	public String StringEnd(){
		if(End){
			return "完了";
		}else{
			return "未完了";
		}
	}
}
