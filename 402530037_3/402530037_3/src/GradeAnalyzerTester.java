/*
 * [97]
 * [TA's Advise]
 * 1. �����ͤ@��double length = 100 ���}�C�O�Ӧ��쪺��k, ���L�Q�Q�O���O�n����ϥΪ̲��Ͳ�101���ȩO?
 * 2. �ϥΪ̿�J���ɭԽФ@�w�n�O�o���ҥ~�B�z, �A�L�k�w�p�ϥΪ̷|���|���p�ߦh���F�Ӥ�������ӵ{��crush, e.g. a78
 * 3. �A�T�����ϥΪ̦b���ܮحn�D�L�̭n��J�ⵧ�H�W�����, ���i�����O�A�S���b�̫�h�ˬd�L�̬O���O�u�����\��J�ⵧ.
 * */

import javax.swing.*;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		String input;
		double grade;
		GradeAnalyzer GA = new GradeAnalyzer();

		input = JOptionPane.showInputDialog("�п�J���Z(�ܤ֭n��J�ⵧ�H�W)\n���}�Х�\"Q\"�άO\"q\"");
		// ��J
		// �O�_���}
		while (input != "q" && input != "Q") {
			
			//�o��i��|���Ϳ��~, ���ϥΪ̿�J�����p�аȥ����ҥ~�B�z, -2, e.g. �ڿ�Jhello�|���|crush?
			grade = Double.parseDouble(input);// �ন�Ʀr

			GA.addGrade(grade);

			input = JOptionPane.showInputDialog("�п�J���Z(�ܤ֭n��J�ⵧ�H�W)\n���}�Х�\"Q\"�άO\"q\"");
		}
		
		//���p�ϥΪ̦��\��J�����Ƥ֩�ⵧ, �ٷ|�p���? -2
		GA.analyzeGrades();// �p�⵪��
		System.out.println(GA.toString());// ��X

	}

}
