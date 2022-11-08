import java.util.*;
public class Main {
	public static void main(String[] agrs){
		Scanner sc =new Scanner(System.in);
		double weigth;
		double height;
		double result;
		double result2; 
		for(int i=0;i<2;i++){
		System.out.print("体重:");
		 weigth=sc.nextDouble();
		System.out.print("身長(メートルで入力してください。):");
		height=sc.nextDouble();
		result=weigth/(height*height);
	String sv =String.format("%.2f",result);
	 result2=Double.parseDouble(sv);
		System.out.println("BMI:"+result2);
		}
	}
}
