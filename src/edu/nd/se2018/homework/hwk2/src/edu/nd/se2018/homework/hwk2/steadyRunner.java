package src.edu.nd.se2018.homework.hwk2;

public class steadyRunner implements strategy{
	public int moveForward(int pos, int maxSpeed) {
		int nextSpot = 0;
		int delta = 0;
		delta = (int) (maxSpeed * 0.8);
		nextSpot = pos + delta;
		return nextSpot;
	}

}
