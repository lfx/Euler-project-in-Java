package problem5;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import helpers.CurrentTimeAndDate;

public class problem5 {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 * A: 232792560
	 */
	public static void main(String[] args) {
		int i = 1;
		int j=0;
		CurrentTimeAndDate dt = new CurrentTimeAndDate();
		System.out.println(dt.main());
		while(true){
			boolean state=true;
			for(j=1;j<20;j++){
				if(i%j==0){
					//state=true;
				}else{
					state=false;
				}
			}
			if(state){
				System.out.println(i);
				break;
			}
			++i;
		}
		System.out.println(dt.main());
	}

}
