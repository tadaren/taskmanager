package taskmanager;

import java.util.Calendar;

import com.sun.imageio.plugins.common.SubImageInputStream;

public class Task {
	private int registrationDate;
	private int questionsDate;
	private int submissionDate;
	private String subject;
	private String content;
	private boolean end;

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
		registrationDate = Integer.parseInt(RDate1.toString());
		questionsDate = QDate;
		submissionDate = SDate;
		subject = sub;
		content = con;
		end = false;
	}

	public int getRegistrationDate(){
		return registrationDate;
	}

	public void setRegistrationDate(final int registrationDate){
		this.registrationDate = registrationDate;
	}

	public int getQuestionDate(){
		return questionsDate;
	}

	public void setQuestionDate(int questionsDate){
		this.questionsDate = questionsDate;
	}

	public int getSubmissionDate(){
		return submissionDate;
	}

	public void setSubmissionDate(int submissionDate){
		this.submissionDate = submissionDate;
	}

	public String getSubject(){
		return subject;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getContent(){
		return content;
	}

	public void setContent(String content){
		this.content = content;
	}

	public boolean getEnd(){
		return end;
	}

	public void setEnd(boolean end){
		this.end = end;
	}

	public String StringEnd(){
		if(end){
			return "完了";
		}else{
			return "未完了";
		}
	}
}
