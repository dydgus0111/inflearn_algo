package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if03_04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int arr[]=new int[N];
		int ans=0;
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int tmp=0;
		int cur=0;
		for(int i=0;i<N;i++) {
			tmp+=arr[i];
			if(tmp==M) {
				ans++;
				if(i>0) {
					tmp-=arr[i-cur];
				}
			}
			else if(tmp>M) {
				tmp-=arr[i-cur];
			}
			else {
				cur++;
			}
		}
		System.out.println(ans);
	}
}
