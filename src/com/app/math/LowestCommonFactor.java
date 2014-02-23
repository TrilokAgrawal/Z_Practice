package com.app.math;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonFactor {
	
	public int lcf(int a, int b) {
		if(a == 0 || b == 0) 
			return 0;
		if(a == b)
			return a;
		int[] arr = null;
		if(a > b) {
			arr = new int[a-b+1];
			for(int i=0; a>=b; i++,b++) {
				arr[i] = b;
			}
		}else {
			arr = new int[b-a+1];
			for(int i=0; a<=b; i++,a++) {
				arr[i] = a;
			}
		}
		
		List<Integer> lcf = new ArrayList<Integer>();
		int i=2;
		boolean flag = false;
		boolean isAllOne = true;
		while(true) {
			flag = false;
			isAllOne = true;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > 1) {
					isAllOne = false;
					if(arr[j]%i == 0) {
						flag = true;
						arr[j] = arr[j]/i;
					}
				} 
			}
			if(isAllOne) {
				break;
			}
			if(flag) {
				lcf.add(i);
			} else {
				i++;
			}
		}
		int result = 1;
		for(int k=0; k<lcf.size(); k++) {
			result = result * lcf.get(k);
		}
		return result;
	}

	public static void main(String[] args) {
		LowestCommonFactor lcf =new LowestCommonFactor();
		System.out.println(lcf.lcf(1, 10));
	}
}
