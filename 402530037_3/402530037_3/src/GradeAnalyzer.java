import javax.swing.JOptionPane;

public class GradeAnalyzer {
	
	//�ϥ�Array�h�s��C�@�Ӹ�ƪ��i�J�OOk, ���L�]���d��u��100��
	//�Q�Q�ݬO���O�ݭn�g�@��extend��method�h�ŦX�Y��101�Ӷi�J��, �}�C�X�j�O?
	double grade[] = new double[100];
	
	double sum = 0;// �`�M
	int totalnum = 0;// �ƶq
	double average = 0;// ����
	int max = 110, min = 0;// �d�����
	double standard = 0;// �зǮt
	double temp = 0;

	// �U�ض��żƶq
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

	public boolean isValidGrade(double aGrade)// �T�w��J�O�_�ŦX�榡
	{
		if (aGrade < min || aGrade > max) {
			return false;
		} else {
			return true;
		}
	}

	public void addGrade(double aGrade)// �ˬd���x�s��J
	{
		if (isValidGrade(aGrade) == false) {
			// �o�Ӽg�k�ܦn, �����ܨϥΪ�, +1
			// �W�X�d��
			JOptionPane.showMessageDialog(null, "�W�X���`�Ʀr�d��(110~0)");
		} else {
			// ���`�d��
			grade[totalnum] = aGrade;
			sum += aGrade;// �`�M
			totalnum++;// �ƶq
			
			
			//���i�H�o��
			//grade[totalnum++] = aGrade;
		}
	}

	public void analyzeGrades()// �p�⵪��
	{
		int i;
		// A+ >= 98 > A >= 92 > A- >= 90
		// 90 > B+ >= 88 > B >= 82 > B- >= 80
		// 80 > C+ >= 78 > C >= 72 > C- >= 70
		// 70 > D >= 60 > F

		for (i = 0; i < totalnum; i++)// ����
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
		// �⥭����
		average = sum / totalnum;
		// ��зǮt
		for (i = 0; i < totalnum; i++) {
			temp += Math.pow(grade[i] - average, 2);
		}
		standard = Math.sqrt(temp / (totalnum - 1));
	}

	public String toString()// ��X
	{
		return "You entered " + totalnum + " valid grades from 0 to 110."
				+ " Invalid grades are ignored!\n\nThe average = " + (int) average + " with a standard deviation = "
				+ (int) standard + "\n\nThe grade " + "distribution is:\n" + "\nA+ = " + cAplus + "\nA = " + cA
				+ "\nA- = " + cAmin + "\nB+ = " + cBplus + "\nB = " + cB + "\nB- = " + cBmin + "\nC+ = " + cCplus
				+ "\nC = " + cC + "\nC- = " + cCmin + "\nD = " + cD + "\nF+ = " + cF;
	}
}
