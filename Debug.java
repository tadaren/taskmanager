package taskmanager;

public class Debug {

	public static void main(String[] args) {
		Task task = new Task();
		task.AllSet(20160904, 201609051, "英語", "みあか");
		TaskList list = new TaskList();
		list.TaskList.add(task);
		list.jsonEncode(task);
		System.out.println(list.jsonEncode(task));

//		System.out.println(list.TaskList);


	}

}
