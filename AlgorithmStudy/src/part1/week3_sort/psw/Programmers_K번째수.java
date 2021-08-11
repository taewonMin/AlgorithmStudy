package part1.week3_sort.psw;

public class Programmers_K번째수 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		for(int h=0;h<commands.length;h++){
			int ti=0;
			int[] temp;
			
			temp=new int[commands[h][1]-commands[h][0]+1];
			for(int i=commands[h][0]-1;i<commands[h][1];i++){
				temp[ti]=array[i];
				ti++;
			}
			for(int i=0;i<temp.length-1;i++){
				for(int j=0;j<temp.length-1-i;j++){
					if(temp[j]>temp[j+1]){
						int temp2=temp[j];
						temp[j]=temp[j+1];
						temp[j+1]=temp2;
					}			
				}			
			}
			answer[h]=temp[commands[h][2]-1];
		}
		
	}
}