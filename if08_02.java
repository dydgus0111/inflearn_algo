package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if08_02 {
	static int C=0;
	static int N=0;
	static int ans=0;
	public static void dfs(int []arr,int n, int sum) {
		if(sum>C) return;
		if(n==arr.length) {
			if(ans<sum) {
				ans=sum;
			}
			return;
		}
		dfs(arr,n+1,sum+arr[n]);
		dfs(arr,n+1,sum);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		C=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		dfs(arr, 0, 0);
		System.out.println(ans);
	}
}
