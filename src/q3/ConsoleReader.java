package q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	private ConsoleReader() {
	}

	/**
	 * 整数をコンソール入力して戻す
	 * 整数値以外を入力した場合は再度入力させる
	 * 
	 * @return コンソールから入力した整数を戻す
	 */
	public Integer input() {

		String inputString = null;
		Integer inputNumber = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean isValid = false;
		while (!isValid) {

			System.out.print("input multiple[1-10]>>");
			try {
				inputString = br.readLine();
				inputNumber = Integer.parseInt(inputString);
				if (inputNumber < 1 || 10 < inputNumber) {
					System.out.println("1～10の整数を入力してください");
					continue;
				}
				isValid = true;
			} catch (IOException e) {
				System.out.println("System Error");
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("整数を入力してください");
				continue;

			}
		}

		return inputNumber;

	}

	public static ConsoleReader getInstance() {
		return new ConsoleReader();
	}

}
