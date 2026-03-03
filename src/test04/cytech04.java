package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		long seconds = Instant.now().getEpochSecond();
		
		switch((int)seconds % 2) {
		case 0:
		System.out.println("偶数");
		break;
		
		case 1:
		System.out.println("奇数");
		break;
		}
		
		

	}

}
