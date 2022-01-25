package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class if04_01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		String str=br.readLine();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 1)+1);
		}
		int val=Integer.MIN_VALUE;
		char ans=' ';
		for(char x : map.keySet()) {
			if(map.get(x)>val) {
				val=map.get(x);
				ans=x;
			}
		}
		System.out.println(ans);
	}
}
