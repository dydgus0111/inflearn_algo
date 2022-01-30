package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class if05_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		Queue<Character> queue=new LinkedList<Character>();
		boolean flag=true;
		for(Character x : str.toCharArray()) {
			if(x=='(') {
				queue.add(x);
			}
			else {
				if(queue.size()==0) {
					flag=false;
					break;
				}
				queue.poll();
			}
		}
		if(queue.size()!=0 || !flag) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
	}
}
