package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class if07_08 {
	// 현수 이동 방법 : 앞1, 뒤1, 앞5
	static class Node{
		int cur;
		int cnt;
		public Node(int cur, int cnt) {
			this.cur=cur;
			this.cnt=cnt;
		}
	}
	static int move[]= {1,-1,5};
	static int check[]=new int[100001];
	static int ans=Integer.MAX_VALUE;
	public static int bfs(int S, int E) {
		Queue<Node> queue=new LinkedList<Node>();
		queue.offer(new Node(S,0));
		while(!queue.isEmpty()) {
			Node tmp=queue.poll();
			for(int i=0;i<move.length;i++) {
				int m=tmp.cur+move[i];
				if(m==E) 
					return tmp.cnt+1;
//				System.out.println(m);
				if(m>=1 || m<=10000 && check[m]==0) {
					check[m]=1;
					queue.offer(new Node(m,tmp.cnt+1));
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int S=Integer.parseInt(st.nextToken());//현수의 위치 
		int E=Integer.parseInt(st.nextToken());// 송아지 위치 
		System.out.println(bfs(S,E));
	}
}
