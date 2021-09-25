package linecomparison;

public class LineCompute {
	double distance(int x1,int y1,int x2,int y2)	
	{
	
	         double dis;	
		     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		     return dis;
	}
public static void main(String[] args) {
LineCompute obj = new LineCompute();
double ans = obj.distance(1,2,3,4);
System.out.println("distance between points is :"+ans);
}
	}

