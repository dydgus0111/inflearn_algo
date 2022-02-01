package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class if04_05 {
	static int ans=-1;
	static ArrayList<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int arr[]=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		combi(arr, new int[3], 0, 0);
		Collections.sort(list,Collections.reverseOrder());
		if(list.size()<K)
			System.out.println(ans);
		else
			System.out.println(list.get(K-1));
		
	}
	public static void combi(int[] arr, int[] sel, int idx, int cnt) {
		if(cnt==sel.length) {
			int tmp=0;
			for(int i=0;i<sel.length;i++) {
				tmp+=sel[i];
			}
			list.add(tmp);
			return;
		}
		if(idx==arr.length) return;
		sel[cnt]=arr[idx];
		combi(arr, sel, idx+1, cnt+1);
		sel[cnt]=0;
		combi(arr, sel, idx+1, cnt);
	}
}
