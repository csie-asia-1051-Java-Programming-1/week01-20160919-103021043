package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入幾公斤");
		int a=scn.nextInt();
		double b=0.45359*a;
		System.out.println(b);
	}

}
