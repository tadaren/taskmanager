package taskmanager;
import java.util.List;

// JSONICをインポート
import net.arnx.jsonic.JSON;

public class JsonicSample {
	public static void main(String[] args) {

		final JsonicSample jsonicSample = new JsonicSample();
		jsonicSample.go();
	}

		public void go() {
			// エンコード(Java → JSON)対象のクラス
			final Hoge hoge = new Hoge();
			hoge.setName("sample");
			hoge.setAge(10);

			// JSON形式にエンコード
			final String hogeJson = JSON.encode(hoge);

			// {"name":"sample","age":10} が出力されます
			System.out.println("エンコード結果:" + hogeJson);


			final String hogeJson2 = "{\"name\":\"sample2\",\"age\":20}";

			// JSON形式のデータをJavaのclassに変換(デコード)
			final Hoge hoge2 = JSON.decode(hogeJson, Hoge.class);
			System.out.println("hoge2.name:" + hoge2.getName());
			System.out.println("hoge2.age:" + hoge2.getAge());

			// 配列を含むJSON形式のデータを用意
			final String hoges = "{\"id\":\"10\",\"hoges\":[{\"name\":\"test\",\"age\":1},{\"name\":\"sample2\",\"age\":2}]}";

			final HogeList hogeList = JSON.decode(hoges, HogeList.class);

			// hogesのようにHogeの形式の配列を持つJSONを、HogeクラスのListをもつクラスにデコードすることが出来ます
			System.out.println("hogeList.id:" + hogeList.getId());
			for (final Hoge tmp : hogeList.getHoges()) {
				System.out.println("tmp.name:" + tmp.getName());
				System.out.println("tmp.age:" + tmp.getAge());
			}
		}

		/**
		 * JSONに対応するクラス
		 * 各フィールド名をJSONのKEY名と同じにする
		 * JSONのKEY名が 「sample-name」のような場合は「sampleName」とする
		 */
		class Hoge {

			private String name;

			private int age;

			public void setName(final String name) {
				this.name = name;
			}

			public String getName() {
				return name;
			}

			public void setAge(final int age) {
				this.age = age;
			}

			public int getAge() {
				return age;
			}
		}

		/**
		 * HogeクラスのListを保持するクラス
		 */
		class HogeList {

			private String id;

			private List<Hoge> hoges;

			public void setId(final String id) {
				this.id = id;
			}

			public String getId() {
				return id;
			}

			public void setHoges(final List<Hoge> hoges) {
				this.hoges = hoges;
			}

			public List<Hoge> getHoges() {
				return hoges;
			}
		}
	}
