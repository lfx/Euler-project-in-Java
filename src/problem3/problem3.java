package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem3 {

	/**
	 * @param args
	 */
	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 * A: 6857
	 */
	public static void main(String[] args) {
		long num = 600851475143L;
		long i = 0;
		List<Long> factors = new ArrayList<Long>();
		for(i=3; i*i<=num; i+=2){
			if(isPrime(i)){
				if(num%i==0){
					factors.add(i);
					//System.out.println(i);
				}
			}
		}
		Collections.sort(factors);
		System.out.println(factors.get(factors.size()-1));
		
		//System.out.println(i);
	}
	
	public static boolean isPrime(long in){
		if((in & 1) == 0){
			return false;
		}
		for(long i = 3; i*i<=in; i+=2){
			if((in % i) == 0){
				return false;
			}
		}
		
		return true;
	}

}
