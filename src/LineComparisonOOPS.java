
public class LineComparisonOOPS {

	public static void main(String[] args) {
		System.out.println("  ====>  Wellcome To line Comparison Computation Program on Master Branch  <==== ");
		lineFunction lineFunctionObject = new lineFunction();
		int x1 = lineFunctionObject.getLineValue();
		int x2 = lineFunctionObject.getLineValue();
		int y1 = lineFunctionObject.getLineValue();
		int y2 = lineFunctionObject.getLineValue();
		double length = lineFunctionObject.getLineLength(x1,x2,y1,y2);
		System.out.println("length:" + length);
	}
}
class lineFunction{

	int getLineValue(){
        	int value = (int)(Math.random() * 100);
        	return value;
        }

	double getLineLength(int x1,int x2, int y1,int y2){
		double x = Math.pow((x2 - x1), 2);
		double y = Math.pow((y2 - y1), 2);
		return Math.sqrt(x + y);
		

	}

}
