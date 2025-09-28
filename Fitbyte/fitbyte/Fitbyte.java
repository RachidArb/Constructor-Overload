package fitbyte;

public class Fitbyte {
	private int age, restingHeartRate;

	public Fitbyte(int age, int restingHeartRate) {
		this.restingHeartRate = restingHeartRate;
		this.age = age;
	}

	public double targetHeartRate(double percentageOfMaximum) {
		double maxHeartRate = 206.3 - (0.711 * this.age);
		return (maxHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
	}



}
