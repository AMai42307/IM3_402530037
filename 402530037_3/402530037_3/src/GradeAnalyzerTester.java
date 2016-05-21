/*
 * [97]
 * [TA's Advise]
 * 1. 先產生一個double length = 100 的陣列是個有趣的方法, 不過想想是不是要防止使用者產生第101的值呢?
 * 2. 使用者輸入的時候請一定要記得做例外處理, 你無法預計使用者會不會不小心多打了個什麼讓整個程式crush, e.g. a78
 * 3. 你確實讓使用者在提示框要求他們要輸入兩筆以上的資料, 但可惜的是你沒有在最後去檢查他們是不是真正成功輸入兩筆.
 * */

import javax.swing.*;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		String input;
		double grade;
		GradeAnalyzer GA = new GradeAnalyzer();

		input = JOptionPane.showInputDialog("請輸入成績(至少要輸入兩筆以上)\n離開請打\"Q\"或是\"q\"");
		// 輸入
		// 是否離開
		while (input != "q" && input != "Q") {
			
			//這邊可能會產生錯誤, 有使用者輸入的情況請務必做例外處理, -2, e.g. 我輸入hello會不會crush?
			grade = Double.parseDouble(input);// 轉成數字

			GA.addGrade(grade);

			input = JOptionPane.showInputDialog("請輸入成績(至少要輸入兩筆以上)\n離開請打\"Q\"或是\"q\"");
		}
		
		//假如使用者成功輸入的筆數少於兩筆, 還會計算嗎? -2
		GA.analyzeGrades();// 計算答案
		System.out.println(GA.toString());// 輸出

	}

}
