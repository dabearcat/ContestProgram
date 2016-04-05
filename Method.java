
package contest;
import java.util.*;

public class Method {
    public static void meth(int x, int y, ArrayList<Integer> myNums){
      
      Collections.sort(myNums);
      boolean isSqr = false;
      ArrayList<String> strings = new ArrayList();
      
      int sqr = 0;
      int index = 0;
      
      if(myNums.size() != 0){
        for(int i = 0; i<myNums.size(); i++){

            if(myNums.get(i) <= x && myNums.get(i) <= y){
                sqr = myNums.get(i);
                isSqr = true;
                index = i;
                
            }
            
        }
      }
      
      myNums.remove(index);
      
      if(isSqr = false){
          System.out.println(strings);
      } else {
          
                int[][] pane = new int[y][x];

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
                        
                        
                        meth(x, y, myNums);


		}
                
          
                
       
            
      }
      
      
      
      
      
    }

