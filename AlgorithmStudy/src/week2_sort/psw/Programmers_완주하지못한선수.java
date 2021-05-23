package week2_sort.psw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_완주하지못한선수 {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"}; 
		String[] completion = {"eden", "kiki"};
		String answer="";

		List<String> pl=new ArrayList<>();
		for (int i = 0; i < participant.length; i++) {
			pl.add(participant[i]);
		}
		Collections.sort(pl);
		List<String> cl=new ArrayList<>();
		for (int i = 0; i < completion.length; i++) {
			cl.add(completion[i]);
		}
		Collections.sort(cl);
		for (int i = 0; i < completion.length; i++) {
			if(!pl.get(i).toString().equals(cl.get(i).toString())){
				answer=pl.get(i);
				break;
			}
		}	
		if(answer.isEmpty()){
			answer=pl.get(pl.size()-1);
		}
	}
}
