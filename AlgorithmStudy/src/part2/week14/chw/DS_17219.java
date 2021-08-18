package part2.week14.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class DS_17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] cnt = bf.readLine().split(" ");
		int address = Integer.parseInt(cnt[0]);
		int site = Integer.parseInt(cnt[1]);
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < address; i++) {
			String[] addr = bf.readLine().split(" ");
			map.put(addr[0], addr[1]);
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < site; i++) {
			bw.write(map.get(bf.readLine()) +"\n");
		}
		bw.flush();
		bw.close();
	}
}