package q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * q1で作成した問題を仕様変更する
 * ・３，５と決まった数値でなくコンソールから入力した任意の倍数で割り切れる時にFizz、Buzz（両方の数値で割り切れる場合はFizzBuzz）と出力されるようにする
 * ・割り切れるかどうかの判定はboolean型を返すメソッドとして定義する
 * 例　isMultipleOf(int input,int count)
 * ※print文は複数回使ってよい。
 * ※例外処理は考慮しなくてよい
 * */
public class FizzBuzzMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("input first multiple>>");

	}

	/**
	 * 
	 * 
	 * */
	public static boolean isMultipleOf(int input, int count) {

		boolean isMultiple = false;

		return isMultiple;
	}

}
