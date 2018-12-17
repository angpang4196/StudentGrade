package com.biz.sg.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.sg.vo.StudentGradeVO;

public class StudentGradeService {
	String strStudent;
	String strScore;
	String strStudentGrade;
	String strFileName1;
	String strFileName2;

	List<StudentGradeVO> stuList1;
	List<StudentGradeVO> stuList2;

	public StudentGradeService(String strStudentGrade, String strScore, String strStudent) {
		stuList1 = new ArrayList();
		stuList2 = new ArrayList();

		this.strFileName1 = strScore;
		this.strFileName2 = strStudent;
		this.strStudentGrade = strStudentGrade;
	}

	public void readFile1(String strFileName) {
		FileReader fr;

		BufferedReader buffer;

		try {
			fr = new FileReader(strFileName);

			buffer = new BufferedReader(fr);

			while (true) {

				String strRead = buffer.readLine();

				if (strRead == null)
					break;

				String[] strSp = strRead.split(":");

				StudentGradeVO vo = new StudentGradeVO();
				if (strFileName2.equals(strFileName)) {
					vo.setStrNum(strSp[0]);
					vo.setStrName(strSp[1]);
					vo.setStrTel(strSp[2]);
					vo.setStrAddr(strSp[3]);
					stuList1.add(vo);
				}
			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public void readFile2(String strFileName) {
		FileReader fr;

		BufferedReader buffer;

		try {
			fr = new FileReader(strFileName);

			buffer = new BufferedReader(fr);

			while (true) {

				String strRead = buffer.readLine();

				if (strRead == null)
					break;

				String[] strSp = strRead.split(":");

				StudentGradeVO vo = new StudentGradeVO();

				if (strFileName1.equals(strFileName)) {
					vo.setStrNum(strSp[0]);
					vo.setIntKor(Integer.valueOf(strSp[1]));
					vo.setIntEng(Integer.valueOf(strSp[2]));
					vo.setIntMath(Integer.valueOf(strSp[3]));
					vo.setIntSum(vo.getIntKor() + vo.getIntEng() + vo.getIntMath());
					vo.setFloatAvg(vo.getIntSum() / 3);

					stuList2.add(vo);
				}
			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public void match() {
		int intSize = stuList1.size();
		for (int i = 0; i < intSize; i++) {
			if (stuList1.get(i).getStrNum().equals(stuList2.get(i).getStrNum())) {
				stuList1.get(i).setIntKor(stuList2.get(i).getIntKor());
				stuList1.get(i).setIntEng(stuList2.get(i).getIntEng());
				stuList1.get(i).setIntMath(stuList2.get(i).getIntMath());
				stuList1.get(i).setIntSum(stuList2.get(i).getIntSum());
				stuList1.get(i).setFloatAvg(stuList2.get(i).getFloatAvg());
			}
		}
	}

	public void saveFile() {

		FileWriter fw;
		PrintWriter pw;

		try {
			fw = new FileWriter(strStudentGrade);

			pw = new PrintWriter(fw);

			pw.println("=====================================================================================================");
			pw.println("학번\t이름\t전화번호\t\t주소\t\t\t\t\t국어\t영어\t수학\t총점\t평균");
			pw.println("=====================================================================================================");

			for (StudentGradeVO vo : stuList1) {

				pw.println(vo.getStrNum() + "\t\t" + vo.getStrName() + "\t" + vo.getStrTel() + "\t" + vo.getStrAddr() + "\t\t\t"
						+ vo.getIntKor() + "\t\t" + vo.getIntEng() + "\t\t" + vo.getIntMath() + "\t\t" + vo.getIntSum() + "\t\t"
						+ vo.getFloatAvg());
			}

			pw.close();
			fw.close();

			System.out.println("Save Complete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
