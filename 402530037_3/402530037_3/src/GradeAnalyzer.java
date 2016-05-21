import javax.swing.JOptionPane;

public class GradeAnalyzer {
	
	//使用Array去存放每一個資料的進入是Ok, 不過因為範圍只有100個
	//想想看是不是需要寫一個extend的method去符合若第101個進入後, 陣列擴大呢?
	double grade[] = new double[100];
	
	double sum = 0;// 總和
	int totalnum = 0;// 數量
	double average = 0;// 平均
	int max = 110, min = 0;// 範圍邊界
	double standard = 0;// 標準差
	double temp = 0;

	// 各種階級數量
	int cAplus = 0; // A+
	int cA = 0; // A
	int cAmin = 0; // A-
	int cBplus = 0; // B+
	int cB = 0; // B
	int cBmin = 0; // B-
	int cCplus = 0; // C+
	int cC = 0; // C
	int cCmin = 0; // C-
	int cD = 0; // D
	int cF = 0; // F

	public boolean isValidGrade(double aGrade)// 確定輸入是否符合格式
	{
		if (aGrade < min || aGrade > max) {
			return false;
		} else {
			return true;
		}
	}

	public void addGrade(double aGrade)// 檢查並儲存輸入
	{
		if (isValidGrade(aGrade) == false) {
			// 這個寫法很好, 有提示使用者, +1
			// 超出範圍
			JOptionPane.showMessageDialog(null, "超出正常數字範圍(110~0)");
		} else {
			// 正常範圍
			grade[totalnum] = aGrade;
			sum += aGrade;// 總和
			totalnum++;// 數量
			
			
			//其實可以這麼做
			//grade[totalnum++] = aGrade;
		}
	}

	public void analyzeGrades()// 計算答案
	{
		int i;
		// A+ >= 98 > A >= 92 > A- >= 90
		// 90 > B+ >= 88 > B >= 82 > B- >= 80
		// 80 > C+ >= 78 > C >= 72 > C- >= 70
		// 70 > D >= 60 > F

		for (i = 0; i < totalnum; i++)// 分級
		{
			if (grade[i] >= 98) {
				cAplus++;// A+
			} else if (98 > grade[i] && grade[i] >= 92) {
				cA++;// A
			} else if (92 > grade[i] && grade[i] >= 90) {
				cAmin++;// A-
			} else if (90 > grade[i] && grade[i] >= 88) {
				cBplus++;// B+
			} else if (88 > grade[i] && grade[i] >= 82) {
				cB++;// B
			} else if (82 > grade[i] && grade[i] >= 80) {
				cBmin++;// B-
			} else if (80 > grade[i] && grade[i] >= 78) {
				cCplus++;// C+
			} else if (78 > grade[i] && grade[i] >= 72) {
				cC++;// C-
			} else if (72 > grade[i] && grade[i] >= 70) {
				cCmin++;// C-
			} else if (70 > grade[i] && grade[i] >= 60) {
				cD++;// D
			} else {
				cF++;
			} // F
		}
		// 算平均值
		average = sum / totalnum;
		// 算標準差
		for (i = 0; i < totalnum; i++) {
			temp += Math.pow(grade[i] - average, 2);
		}
		standard = Math.sqrt(temp / (totalnum - 1));
	}

	public String toString()// 輸出
	{
		return "You entered " + totalnum + " valid grades from 0 to 110."
				+ " Invalid grades are ignored!\n\nThe average = " + (int) average + " with a standard deviation = "
				+ (int) standard + "\n\nThe grade " + "distribution is:\n" + "\nA+ = " + cAplus + "\nA = " + cA
				+ "\nA- = " + cAmin + "\nB+ = " + cBplus + "\nB = " + cB + "\nB- = " + cBmin + "\nC+ = " + cCplus
				+ "\nC = " + cC + "\nC- = " + cCmin + "\nD = " + cD + "\nF+ = " + cF;
	}
}
