/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest;

/**
 *
 * @author Emily
 */

import java.util.*;
public class ClassContest{
    
    public static void meth(int x, int y, ArrayList<Integer> myNums){
		
		Collections.sort(myNums);
                Collections.reverse(myNums);
                System.out.println(myNums);
                
		boolean isSqr = false;

		ArrayList<String> str = new ArrayList<String>();
                int sqr = 0;
		for(int count = myNums.size()-1; count > 0; count--){
                    //System.out.println(myNums.get(count));
			if((myNums.get(count) <= x) && (myNums.get(count) <= y&&myNums.size()!= 0)){
				sqr = myNums.get(count);
				isSqr = true;
				myNums.remove(count);
                                break;
			}
		}

		if(isSqr = false || myNums.size() == 0){
			for(int count = 0; count<str.size(); count++){
				System.out.println(str.get(count));
			}
		} else {
                        str.add("Sqare is: " + sqr);
			/*int[][] pane = new int[y][x];

			for(int count = 0; count < y; count++){
				for(int counter = 0; counter < x; counter++){
					pane[count][counter] = 0;
				}
			}

			int smallestX = 0;
			int smallestY = 0;

			for(int count = 0; count < y; count++){
				for(int counter = 0; counter < x; counter++){
					if(pane[count][counter] == 0 && smallestY > count && smallestX > counter){
						smallestY = count;
						smallestX = counter;
					}
				}
			}
                       
			System.out.println("Square with edge " + sqr + " has lower left (" + smallestX + ", " + smallestY +" ))");

			for(int count = smallestY+1; count <= sqr+smallestY; count++ ){
				for(int counter = smallestX+1; counter<=sqr+smallestX; counter++){
					pane[count][counter] = 1;
				}
			}
                        
                        myNums = myNums;*/
                        meth(x, y, myNums);


		}
                
          
                
       
            
            
        
	}
	/*public static void meth(ArrayList<Integer> myNums, int x, int y){
		
		ArrayList<String> strngs = new ArrayList<String>();

		Collections.sort(myNums);
		ArrayList<Integer> sqrs = new ArrayList<Integer>();
		boolean thereIs = false;
		
		int i = myNums.size();
		
		if((myNums.get(i) > x) && (myNums.get(i-1) > y)){
			i--;
		} else {
			int sqr = myNums.get(i-1);
			thereIs = true;
			myNums.remove(i-1);
			sqrs.add(sqr);

		if(thereIs = false){
			for(int count = 0; count<strngs.size(); count++){
				System.out.println(strngs.get(count));
			}
		}
		else{
			int starterX = 0;
			int starterY = 0;


			strngs.add("Square with edge " + sqr + " has lower left (" + starterX + ", " + starterY +" ))");

			for(int count = 0; count <= 2; count++){
				if(count == 0){
					meth(myNums, sqr, y-sqr);
					starterX += sqr;
				}
				if(count == 1){
					meth(myNums, x-sqr, y-sqr);
					starterY += sqr;
					starterX += sqr;
				}
				else{
					meth(myNums, x-sqr, sqr);
					starterX += sqr;

				}
			}
			

		}



	}
}*/}