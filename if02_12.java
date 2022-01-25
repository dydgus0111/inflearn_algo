package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if02_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int arr[][]=new int[M][N];
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		boolean std[][]=new boolean[N][N];
		for(int k=0;k<N;k++) {
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j]!=k+1)
						std[k][arr[i][j]-1]=true;
					else {
						std[k][k]=true;
						break;
					}
				}
			}
		}
		int ans=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!std[i][j]) ans++;
			}
		}
		System.out.println(ans);
	}
}
