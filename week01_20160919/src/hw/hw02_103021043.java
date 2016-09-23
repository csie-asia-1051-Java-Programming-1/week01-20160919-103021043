package hw;
/*
 * Topic:請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆) 
 * Date: 2016/09/19
 * Author: 103021043 何宙運
 */
import java.util.Random;
import java.util.Scanner;
public class hw02_103021043 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Random ran = new Random();
		System.out.print("please input A:");
		int a =scn.nextInt();
		for(int i=0;i<6;i++){
			int b=ran.nextInt(a)+1;
			System.out.print(b+" ");
		}
	}
}
