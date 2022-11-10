import java.util.Scanner;

public class Main{
	public static void main(String args[])
	for(int i=0;i<=1;i++){
		Scanner s = new Scanner(System.in);
		System.out.println("height");
		int height = s.nextInt();
		System.out.println("weight");
		int weight = s.nextInt();
		double BMI = weight/height/height;
		System.out.println("BMI"+BMI);
	}
	}
}
