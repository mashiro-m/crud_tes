package test09;

public class cytech09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] subjects = {"国語","数学","理科","社会"};

		int[][] scores = {
				{10,20,50,90},
				{20,30,50,80},
				{5,40,50,60},
				{30,50,70,100}};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("学生" +(i + 1) + "さん");
			
			for(int j = 0; j < scores[i].length; j++) {
				System.out.println(
						subjects[j] + ":" + scores[i][j] + "点");
			}
		}       System.out.println();
	}

}
