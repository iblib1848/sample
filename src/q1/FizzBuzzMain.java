package q1;

/**
 * 1-100の数字を連続で出力する
 * ただし、3の倍数の時はFizz、5の倍数のときはBuzz、両方の条件を満たすときにはFizzBuzzとコンソールに表示するようにしなさい
 * なお、print文の利用は1度のみとする
 * */

public class FizzBuzzMain {

	public static void main(String[] args) {
		
		
		
		for(int i = 1 ; i<=100 ; i++){
			String rails = "";
			if(i % 3 == 0) { 
				rails = "Fizz ";
			}//３で割り切れる時にFizzを代入
			if(i % 5 == 0) {
				rails = "Buzz ";
			}//5で割り切れる時にBuzzを代入
			if(i % 3 == 0 && i % 5 == 0) {
				rails = "FizzBuzz ";//３と5で割り切れる時にFizzBuzzを代入
			}
			else {
				rails = rails + i;//3でも5でも割れない時にiを出力
			}	
		System.out.print(rails +" ");
		}
	}

}
