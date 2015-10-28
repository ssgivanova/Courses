
public class GetAverage {

	
	public static void main(String[] args) {
		
		double avg1 = getAverage(1.5, 2.5, 3.8);
		double avg2 = getAverage(12, 13, 25);
		double avg3 = getAverage(0.005, 0.5, 0.55);
		double avg4 = getAverage(0, 0, 2);
		System.out.printf("%.2f",avg1);
		System.out.printf("%n%.2f",avg2);
		System.out.printf("%n%.2f",avg3);
		System.out.printf("%n%.2f",avg4);
	}
	
	public static double getAverage(double a, double b, double c){
		
		double avg = (a+b+c)/3;
		return avg;
	}

}
