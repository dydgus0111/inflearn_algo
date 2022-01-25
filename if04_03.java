package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class if04_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int arr[]=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int lt=0;
		int rt=0;
		StringBuilder sb=new StringBuilder();
		int cnt=0;
		int idx=0;
		while(rt<N) {
			if(idx==K) {
				idx--;
				sb.append(cnt+" ");
				if(map.get(arr[lt])==1) {
					map.remove(arr[lt]);
					cnt--;
				}
				else {
					map.put(arr[lt], map.getOrDefault(arr[lt], 0)-1);
				}
				lt++;
			}
			else {
				if(!map.containsKey(arr[rt])) {
					cnt++;
					map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
					rt++;
					idx++;
				}
				else {
					idx++;
					map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
					rt++;
				}
			}
		}
		sb.append(cnt);
		System.out.println(sb.toString());
	}
}
