import database.DatabaseHandler;
import chunithm.*;
import java.sql.*;

public class Main {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlite:D:/Games/_Rhythm Games/Sega/Chunithm NEW PLUS/data/db.sqlite"; // Filepath goes here
		DatabaseHandler databaseHandler;

		try {
			databaseHandler = new DatabaseHandler(url);

			// Do stuff here
			ChunithmUserDetail.getRecentPlays(databaseHandler);


		} catch	(SQLException e) {
			e.printStackTrace();
		}
	}

}