package taskmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import net.arnx.jsonic.JSON;;

public class TaskList {
	//	private int taskcount;//タスクの数を保存しておく
	public ArrayList<Task> TaskList = new ArrayList<Task>();

	public TaskList(){
		decode();
	}

	public void FileManage(){

	}

	public void encode(){
		File file = lookfile();
		FileWriter fr;
		try{
			fr = new FileWriter(file); //書き込み用クラスの作成
			for(int i = 0; i < TaskList.size(); i++){
				fr.write(jsonEncode(TaskList.get(i)) + "\n");
			}
			fr.close(); //クラスを閉じる
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public String jsonEncode(Task task){
		String Taskjson = JSON.encode(task);
		return Taskjson;
	}

	public void decode(){
		TaskList.clear();
		File file = lookfile();
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));//ファイル読み込みのクラスの作成
			String str = br.readLine();//1行目の読み込み
			while(str != null){
				System.out.println(str);
				Task task = JSON.decode(str, Task.class);
				TaskList.add(task);
//				TaskList.add(JSON.decode(str));
				str = br.readLine();

			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static File lookfile(){
		File file = new File(".\\Task.json"); //ファイルクラスの作成
		if(!(file.exists())){ //ファイルが存在するかを確認する
			try {
				file.createNewFile(); //存在しなければファイルを作成
			} catch (IOException e) { //エラー処理
				e.printStackTrace();
			}
		}
		return file; //返り値にファイルを返す
	}

	//ソートするメソッド群
	//提出日順ソート
	public void SubmissionSort(boolean ascending){
		Collections.sort(TaskList, new Comparator<Task>() {
			public int compare(Task task1, Task task2){
				if(ascending){
					return task1.getSubmissionDate() - task2.getSubmissionDate();
				}else{
					return task2.getSubmissionDate() - task1.getSubmissionDate();
				}
			}
		});
	}

	//登録日順ソート
	public void RegistrationSort(boolean ascending){
		Collections.sort(TaskList, new Comparator<Task>() {
			public int compare(Task task1, Task task2){
				if(ascending){
					return task1.getRegistrationDate() - task2.getRegistrationDate();
				}else{
					return task2.getRegistrationDate() - task1.getRegistrationDate();
				}
			}
		});
	}
	//登録日順ソート
	public void QuestionSort(boolean ascending){
		Collections.sort(TaskList, new Comparator<Task>() {
			public int compare(Task task1, Task task2){
				if(ascending){
					return task1.getQuestionDate() - task2.getQuestionDate();
				}else{
					return task2.getQuestionDate() - task1.getQuestionDate();
				}
			}
		});
	}

}
