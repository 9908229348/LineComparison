package linecomparison;

public class LineCompute {
	double distanceCal(int x1,int y1,int x2,int y2)	
	{
	
	         double dis;	
		     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 	 	    	 	    
             return dis;  	         
	}
public static void main(String[] args) {
   LineCompute obj = new LineCompute();
   Double line1=obj.distanceCal(1,1,1,1);
   Double line2=obj.distanceCal(1,2,3,4);
   System.out.println("line1 and line 2 are equal.True or False :" +line1.equals(line2));
}
}