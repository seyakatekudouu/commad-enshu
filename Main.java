import java.util.*;
public class Main {
	public static void main(String[] agrs){
		Scanner sc =new Scanner(System.in);
		System.out.print("�̏d:");
		double weigth=sc.nextDouble();
		System.out.print("�g��(���[�g���œ��͂��Ă��������B):");
		double height=sc.nextDouble();
	double	result=weigth/(height*height);
	String sv =String.format("%.2f",result);
	double result2=Double.parseDouble(sv);
		System.out.println("BMI:"+result2);

	}
}
