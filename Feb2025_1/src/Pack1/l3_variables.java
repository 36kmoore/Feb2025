package Pack1;

public class l3_variables {
	
	private double dblWidth = 1;
	private double dblHeight = 2;
	private double dblDepth = 3;
	private static int boxid;
	public double calcVolume() {
		double dblTemp;
		dblTemp = dblWidth * dblHeight * dblDepth;
		return dblTemp;
	}
	
	public static void main(String[] args) {
		l3_variables obj=new l3_variables();
		System.out.println(obj.calcVolume());
	}

}
