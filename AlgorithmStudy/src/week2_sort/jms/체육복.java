package week2_sort.jms;

import java.util.ArrayList;
import java.util.List;

public class 체육복 {//
	public static void main(String[] args) {

		int answer = 0;
		int n =5;
		int[] lost = {2,4};
		int[] reserve = {3};

		List<Student> ListOfStudent = new ArrayList<>();

		for (int i = 0; i < n; i++) { 
			ListOfStudent.add(new Student(i+1));
		}

		//도난
		for (int i = 0; i < lost.length; i++) {
			int num = lost[i];
			for (int j = 0; j < ListOfStudent.size(); j++) {
				Student student = ListOfStudent.get(j);
				if (student.num == num) {
					student.stolen = true;
					student.goClass = false;
				}
			}
		}



		//여벌
		for (int i = 0; i <reserve.length; i++) {
			int num = reserve[i];

			for (int j = 0; j < ListOfStudent.size(); j++) {
				Student student = ListOfStudent.get(j);
				if (student.num == num) {
					student.reserve =true;
				}
			}
		}

		//여벌 있는 애들이 도난 당하면
		for (Student student : ListOfStudent) {
			if (student.reserve == true && student.stolen == true) {
				student.goClass = true;
				student.reserve = false;
			}
		}

		//여유 있는 애들 나눠주자
		for (int i = 0; i < ListOfStudent.size(); i++) {
			Student student = ListOfStudent.get(i);

			if (student.reserve) {
				Student smallStudent = ListOfStudent.get(i-1); 
				Student moreStudent = ListOfStudent.get(i+1);
				if (smallStudent.stolen) {
					smallStudent.stolen = false;
					smallStudent.goClass = true;

					student.reserve = false;

				}else if(moreStudent.stolen) {
					moreStudent.stolen = true;
					moreStudent.goClass = true;

					student.reserve = false;
				}

			}
		}

		// 총 현황
		for (Student student : ListOfStudent) {

			if (student.goClass) answer++;
			System.out.println(student.toString());
		}

		System.out.println(answer);


	}

}

class Student {
	int num =0;
	boolean reserve = false;
	boolean stolen = false;
	boolean goClass = true;

	public Student(int i) {
		this.num = i;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", reserve=" + reserve + ", stolen=" + stolen + ", goClass=" + goClass + "]";
	}

}
