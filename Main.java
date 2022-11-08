import java.util.*;
public class Main {
	public static void main(String[] agrs){
		Scanner sc =new Scanner(System.in);
		System.out.print("体重:");
		double weigth=sc.nextDouble();
		System.out.print("身長(メートルで入力してください。):");
		double height=sc.nextDouble();
	double	result=weigth/(height*height);
	String sv =String.format("%.2f",result);
	double result2=Double.parseDouble(sv);
		System.out.println("BMI:"+result2);

	}
}
