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
   Double line2=obj.distanceCal(1,1,1,1);
   if(Double.compare(line1,line2)==0)
   {
	   System.out.println("Two lines are equal");
   }
   else if(Double.compare(line1, line2) < 0)
   {
	   System.out.println("Line1 is less than Line2");
   }
   else
	   System.out.println("Line1 is Greater than Line2");
}
}
