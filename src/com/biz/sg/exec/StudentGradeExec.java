package com.biz.sg.exec;

import com.biz.sg.service.StudentGradeService;

public class StudentGradeExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strScore = "src/com/biz/sg/vo/점수표.txt";
		String strStudent = "src/com/biz/sg/vo/학생리스트.txt";
		String strStudentGrade = "src/com/biz/sg/list/성적표정리.txt";

		StudentGradeService sgs = new StudentGradeService(strStudentGrade, strScore, strStudent);

		sgs.readFile1(strStudent);
		sgs.readFile2(strScore);

		sgs.match();

		sgs.saveFile();

	}

}
