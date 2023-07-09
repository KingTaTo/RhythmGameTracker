package iidx;

/**
 * Interface for calculating score and corresponding grade.
 */
public interface IScoreCalculator {
	/**
	 * Calculates the highest possible score obtainable in a map.
	 * @param total_notes amount of notes in a map.
	 * @return score
	 */
	int calculateMaxScore(int total_notes);

	/**
	 * Calculates a grade based on the given score.
	 * @param score points obtained for a play.
	 * @return a grade.
	 */
	String calculateGrade(int score);
}