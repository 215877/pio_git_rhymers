package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;//źle sformatowany

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())//źle sformatowany
			totalRejected++;
		else//źle sformatowany
			super.countIn(in);//źle sformatowany
	}
}