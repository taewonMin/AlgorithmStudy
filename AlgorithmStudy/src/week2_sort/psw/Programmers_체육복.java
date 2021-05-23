package week2_sort.psw;

import java.util.Vector;

public class Programmers_체육복 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};

		for(int i=0;i<n;i++){
			Student.v.add(new Student(i));
		}

		//////////////////////////// 학생 객체 생성

		for(int i=0;i<lost.length;i++){
			Student s=(Student)Student.v.elementAt(lost[i]-1);
			s.stolen=true;	
			s.goClass=false;
		}
		for(int i=0;i<reserve.length;i++){
			Student s=(Student)Student.v.elementAt(reserve[i]-1);
			s.reserve=true;	
		}
		///////////////////////// 도둑맞은 여부와 여벌 여부

		for(int i=0;i<Student.v.size();i++){
			Student s=(Student)Student.v.elementAt(i);
			if(s.stolen&&s.reserve){
				s.goClass=true;
				s.reserve=false;
			}
		}
		////////////////////도둑맞은 사람이 여벌이 있을 경우 여벌을 없애고 수업 고고싱
		for(int i=0;i<lost.length;i++){
			Student s1=(Student)Student.v.elementAt(lost[i]-1);
			if(!s1.goClass&&s1.num==1){
				Student s3=(Student)Student.v.elementAt(lost[i]);
				if(s3.reserve){
					s1.goClass=true;
					s3.reserve=false;
				}
			} else if(!s1.goClass&&(lost[i]-1>0&&lost[i]!=n)){
				Student s2=(Student)Student.v.elementAt(lost[i]-2);
				Student s3=(Student)Student.v.elementAt(lost[i]);	
				if(s2.reserve){
					s1.goClass=true;
					s2.reserve=false;
				} else if(s3.reserve){
					s1.goClass=true;
					s3.reserve=false;
				}
			} else if(!s1.goClass&&s1.num==n){
				Student s2=(Student)Student.v.elementAt(lost[i]-2);
				if(s2.reserve){
					s1.goClass=true;
					s2.reserve=false;
				}
			}
		}




		///////////////////////////////////////// 개수 측정
		for(int i=0;i<Student.v.size();i++){
			Student s=(Student)Student.v.elementAt(i);
			if(s.goClass){
				answer++;
			}
		}


	}

}

class Student{
	static Vector v=new Vector();
	int num;
	boolean reserve;
	boolean stolen;
	boolean goClass=true;


	public Student(int i) {
		this.num=i+1;
	}

}