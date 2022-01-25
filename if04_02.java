package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class if04_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2=new HashMap<Character, Integer>();
		for(char c : str1.toCharArray()) {
			map1.put(c,map1.getOrDefault(c, 0)+1);
		}
		for(char c : str2.toCharArray()) {
			map2.put(c,map2.getOrDefault(c, 0)+1);
		}
		if(map1.equals(map2)) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
}
