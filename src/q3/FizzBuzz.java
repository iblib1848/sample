package q3;

public class FizzBuzz {

	private static final String MSG_FIRST_MULTIPLE = "最初の倍数を入力してください";
	private static final String MSG_SECOND_MULTIPLE = "次の倍数を入力してください";
	private static final int FIZZBUZZ_START_NUMBER = 1;
	private static final int FIZZBUZZ_END_NUMBER = 100;
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private static final String FIZZ_BUZZ = "FizzBuzz";
	private static String HYPHEN = "-------------------------------";

	/**{firsr}{second}をリプレイスしてメッセージ出力する*/
	private String msg_MultipeString = "{first}の倍数と{second}の倍数,両方の条件を満たす場合はメッセージが変わります。";

	/**
	 * ConsoleReaderインスタンスを生成し、コンソールから整数を2つ出力する。
	 * replaceMultipleメソッドを呼び出し、msg_MultipeStringをリプレイスして出力する。
	 * 入力した整数の倍数を使い、FizzBuzzルールに従い、文字列を出力する
	 * 
	 */
	public void start() {

		/*ここに処理を記述すること*/

	}

	/**
	 * msg_MultipeStringの{first}{second}を入力した値にリプレイスする
	 * 
	 * @param firstMultiple
	 * @param secondMultiple
	 */
	private void replaceMultiple(Integer firstMultiple, Integer secondMultiple) {
		this.msg_MultipeString = this.msg_MultipeString.replace("{first}", String.valueOf(firstMultiple)).replace(
				"{second}",
				String.valueOf(secondMultiple));

	}

	/**
	 * 入力が指定の倍数であるかどうかを判定する
	 * @return true:倍数であるとき | false:倍数でないとき
	 * 
	 * */
	private boolean isMultipleOf(int input, int count) {

		boolean isMultiple = false;
		if (count % input == 0) {
			isMultiple = true;
		}
		return isMultiple;
	}

}
