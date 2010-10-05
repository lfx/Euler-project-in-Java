package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem4 {

	/**
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     * A: 906609
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=999;++i){
			for(int j=1; j<=999; ++j){
				if(isPolindorme(j*i)){
					list.add(j*i);
				}
			}
		}
		for(int nu : list){
			System.out.println(nu);
		}
		
		Collections.sort(list);
		System.out.println();
		System.out.print(list.get(list.size()-1));
		

	}
	
	public static boolean isPolindorme(int num){
		int n = num;
		int rev = 0;
		for(int i=0; i<=num; i++){
			int r=num%10;
			num=num/10;
			rev=rev*10+r;
			i=0;
		}
		if(n==rev){
			return true;
		}else{
			return false;
		}
	}

}
