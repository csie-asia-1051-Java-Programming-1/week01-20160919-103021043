package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值 
 * Date: 2016/09/19
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入6個數:");
		double a1=scn.nextDouble();
		double a2=scn.nextDouble();
		double a3=scn.nextDouble();
		double a4=scn.nextDouble();
		double a5=scn.nextDouble();
		double a6=scn.nextDouble();
		double b=Math.min(a1,a2);
		double c=Math.min(a3,a4);
		double d=Math.min(a5,a6);
		double e=Math.min(b,c);
		double f=Math.min(d,e);
		System.out.println(f);
		
	}

}
