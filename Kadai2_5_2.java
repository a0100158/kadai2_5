import java.util.Scanner;

public class Kadai2_5_2 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください。");
		Scanner scan = new Scanner(System.in);
		int intSeisu = scan.nextInt();

		for(int i = 1; i <= intSeisu; i++ ){
			if(i % 3 == 0 || Integer.toString(i).contains("3") ){
	            System.out.println(" アホ ");
			}else if(i % 5 == 0){
				System.out.println(" ワン ");
			}else{
				System.out.println(" " + i + " ");
			}

		}
	}
}
