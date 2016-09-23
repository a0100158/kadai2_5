import java.util.Scanner;

public class Kadai2_5_1 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください。");
		Scanner scan = new Scanner(System.in);
		int intSeisu = scan.nextInt();

		for(int i = 1; i <= intSeisu; i++ ){
			if(i % 3 == 0 || Integer.toString(i).contains("3") ){
	            System.out.println(" アホ ");
			}else{
				System.out.println(" " + i + " ");
			}

		}
	}
}
