import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class CreateDB {

    //Run this code only the first time to create a database
    public void createDB() {
        try {


            Connection conn = getConnection("jdbc:sqlite:C:\\database\\DBcinema.db");

            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE report (movie TEXT,movie_category TEXT,seat_type TEXT, seat TEXT,price DOUBLE, payment_type TEXT, date TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS report (" +
                    "movie TEXT," +
                    "movie_category TEXT," +
                    "seat_type TEXT," +
                    "seat TEXT," +
                    "price DOUBLE," +
                    "payment_type TEXT," +
                    "date TEXT" +
                    ")");
            statement.close();
            conn.close();

        } catch (
                SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public void addcolum(){
        // URL de conexão com o banco de dados SQLite
        String url = "jdbc:sqlite:C:\\database\\DBcinema.db";

        // Comando SQL para adicionar uma nova coluna (alteração da tabela)
        String sql = "ALTER TABLE report ADD COLUMN souvenir TEXT";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Executando o comando SQL
            stmt.execute(sql);

            System.out.println("Nova coluna adicionada com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
