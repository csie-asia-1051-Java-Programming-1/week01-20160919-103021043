package hw;
/*
 * Topic:假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2) 
 * Date: 2016/09/19
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw01_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("當n=");
		int n=scn.nextInt();
		int a=1;
		int b=0;
		for(int i=0;i<n;i++){
			if(a>=n){
				break;
			}
			a=a*2;
			b=b+1;
		}
			System.out.println(b+"bite");		
	}
}
