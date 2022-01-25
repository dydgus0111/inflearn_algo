package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if01_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine().toUpperCase();
		String alpha=br.readLine().toUpperCase();
		int ans=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)==alpha.charAt(0)) ans++;
		}
		System.out.println(ans);
	}
}
