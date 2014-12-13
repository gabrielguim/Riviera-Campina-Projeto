package riviera.db;
import java.sql.*;

public class ConnectionFactory
{
	public Connection getConnection()
	{
		try
		{
			System.out.println("Conex‹o ao banco de dados estabelecida com sucesso!");
			return DriverManager.getConnection("jdbc:mysql://localhost/riviera-db", "root", "");
		}
		catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
	}
}
