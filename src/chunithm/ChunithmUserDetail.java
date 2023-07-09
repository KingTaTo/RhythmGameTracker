package chunithm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DatabaseHandler;

public class ChunithmUserDetail {
	public static void getRecentPlays(DatabaseHandler databaseHandler) throws SQLException {
		Connection connection = databaseHandler.getConnection();
		Statement statement = databaseHandler.getStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM chusan_user_general_data");
		while (resultSet.next()) {
//			int id = resultSet.getInt("music_id");
			String recentPlays = resultSet.getString("property_value");

			for (int i = 0; i < recentPlays.length(); i++) {
				char c = recentPlays.charAt(i);
				if (c != ',')
					System.out.print(c);
				else
					System.out.println();
			}
		}
		resultSet.close();
	}
}
