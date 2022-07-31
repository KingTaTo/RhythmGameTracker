package games.iidx;

import games.IScoreCalculator;

/**
 * Various IIDX tools and calculations
 */
public class IIDXMain implements IScoreCalculator {
	private enum Grade {
		F, E, D, C, B, A, AA, AAA, MAX
	}
	final private int total_notes, max_score;

	/**
	 * Constructor, most likely temporary since most methods in here should be static anyway. Only like this because there's no other way of putting in data.
	 * @param total_notes amount of notes in a map.
	 */
	public IIDXMain (int total_notes) {
		this.total_notes = total_notes;
		this.max_score = calculateMaxScore(total_notes);
	}

	/**
	 * @param total_notes amount of notes in a map.
	 * @return highest possible EXSCORE obtainable
	 */
	@Override
	public int calculateMaxScore(int total_notes) {
//		FORMULA: max_score = total_notes * 2s
		return total_notes * 2;
	}

	@Override
	public java.lang.String calculateGrade(int score) {
		double ex_score =  ((double) score / max_score) * 100;

		if (ex_score > 100) {
			return "Invalid score";
		} else if (ex_score >= 94.44) {
			int num = max_score - score;
			return Grade.MAX + "-" + num;
		} else if (ex_score >= 88.89) {
			return Grade.AAA.toString();
		} else if (ex_score >= 77.78) {
			return Grade.AA.toString();
		} else if (ex_score >= 66.67) {
			return Grade.A.toString();
		} else if (ex_score >= 55.56) {
			return Grade.B.toString();
		} else if (ex_score >= 44.44) {
			return Grade.C.toString();
		} else if (ex_score >= 33.33) {
			return Grade.D.toString();
		} else if (ex_score >= 22.22) {
			return Grade.E.toString();
		} else
			return Grade.F.toString();
	}
}
