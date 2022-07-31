import games.iidx.IIDXMain;

/**
 * Placeholder main method, mostly for testing.
 */
public class Main {
	public static void main(String[] args) {
		new gui.MyFrame();
		IIDXMain iidx = new IIDXMain(1479);

		System.out.printf("Max Score: %d\n", iidx.calculateMaxScore(1479));

		int score = 2958;
		System.out.printf("EXSCORE: %d | Grade: %s", score, iidx.calculateGrade(score));
	}
}
