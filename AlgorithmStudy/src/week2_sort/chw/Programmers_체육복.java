package week2_sort.chw;

import java.util.ArrayList;
import java.util.List;

public class Programmers_체육복 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};

		List<Student> studentList = new ArrayList<Student>();
		
		// 학생 객체 생성
		for(int i=0;i<n;i++){
			studentList.add(new Student(i));
		}
		// 누가 훔쳐갔으면 일단 수업 못감
		for(int i=0;i<lost.length;i++){
			Student s = studentList.get(lost[i]-1);
			s.stolen=true;	
			s.goClass=false;
		}
		
		// 여벌있는지 유무 셋팅
		for(int i=0;i<reserve.length;i++){
			Student s = studentList.get(reserve[i]-1);
			s.reserve=true;	
		}

		// 도둑맞은 사람이 여벌이 있을 경우 우선적으로 여벌을 없애고 수업 참여
		for(int i=0;i< studentList.size();i++){
			Student s= studentList.get(i);
			if( s.stolen && s.reserve){
				s.goClass=true;
				s.reserve=false;
			}
		}
		
		// 분배의 시간
		for(int i=0;i<lost.length;i++){
			Student curStu = studentList.get(lost[i]-1);
			
			// 첫번째 친구일때는 다음 학생의 여분만 가져옴
			if(!curStu.goClass && curStu.num == 1){
				Student nextStu = studentList.get(lost[i]);
				if(nextStu.reserve){
					curStu.goClass=true;
					nextStu.reserve=false;
				}
			
			// 중간에 있는 친구는 앞,뒤 모두 여벌을 찾아야함
			} else if(!curStu.goClass && (lost[i]-1 > 0 && lost[i] != n)){
				Student preStu = studentList.get(lost[i]-2);
				Student nextStu = studentList.get(lost[i]);	
				if(preStu.reserve){
					curStu.goClass=true;
					preStu.reserve=false;
				} else if(nextStu.reserve){
					curStu.goClass=true;
					nextStu.reserve=false;
				}
				
			//끝에 있는 친구는 이전 친구만 가져옴
			} else if(!curStu.goClass && curStu.num == n){
				Student preStu= studentList.get(lost[i]-2);
				if(preStu.reserve){
					curStu.goClass = true;
					preStu.reserve = false;
				}
			}
		}

		// 개수 측정
		for(int i=0;i<studentList.size();i++){
			Student stu= studentList.get(i);
			if(stu.goClass){
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}

}

class Student{
	int num;
	
	boolean reserve = false;
	boolean stolen = false;
	boolean goClass = true;


	public Student(int i) {
		this.num=i+1;
	}

}