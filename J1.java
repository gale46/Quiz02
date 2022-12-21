package quiz02;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:");
		int pw1 = sc.nextInt();
		System.out.print("請再輸入一次密碼:");
		int pw2 = sc.nextInt();
		if (pw1 == pw2) {
			System.out.println("密碼正確");
		} else {
			  int count = 0;
			  while (true) {
			    // 输入代码
			    if (pw1!=pw2) {
			      if (count != 2) {
			    	count++;
			    	System.out.println("與第一次輸入的不同!");
			    	System.out.print("請再輸入一次密碼:");
					pw2 = sc.nextInt();
			        
			      
			    }
			      else {
			    	  throw new RuntimeException("輸入三次錯誤！程式停止！");
			      }
			  }
			}
		}

	}

}
