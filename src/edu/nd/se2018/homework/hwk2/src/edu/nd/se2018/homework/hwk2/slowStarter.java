package src.edu.nd.se2018.homework.hwk2;

public class slowStarter implements strategy {

	public int moveForward(int pos, int maxSpeed) {
		int nextSpot = 0;
		int delta = 0;
		if(pos < 600) {
			delta = (int) (maxSpeed * 0.75);
			nextSpot = delta + pos;
		} else if (pos > 600 && pos < 900){
			delta = (int) ((int) maxSpeed * 0.9);
			nextSpot = delta + pos;
		} else {
			delta = maxSpeed;
			nextSpot = maxSpeed + pos;
		}
		delta = (int) (maxSpeed * 0.8);
		nextSpot = pos + delta;
		return nextSpot;
	}

}
