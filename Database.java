import java.sql.*;

public class Database {

    public Connection getConnection(String url) throws SQLException {
        return DriverManager.getConnection(url);
    }

    public void saveInfo(String date, String movie,String category, String seat_type,String seat,String souvenir,String food, Double price, String payment){

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\database\\DBcinema.db");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO report (date,movie, movie_category,seat_type, seat, souvenir, food, price, payment_type ) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?)");
            pstmt.setString(1, date);
            pstmt.setString(2, movie);
            pstmt.setString(3, category);
            pstmt.setString(4, seat_type);
            pstmt.setString(5, seat);
            pstmt.setString(6, souvenir);
            pstmt.setString(7, food);
            pstmt.setDouble(8, price);
            pstmt.setString(9, payment);

            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }



    }



        public void readData() {
            try {
                Connection conn = getConnection("jdbc:sqlite:C:\\database\\DBcinema.db");

                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM report");
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    String date = rs.getString("date");
                    String movie = rs.getString("movie");
                    String category = rs.getString("movie_category");
                    String seatType = rs.getString("seat_type");
                    String seat = rs.getString("seat");
                    String souvenir = rs.getString("souvenir");
                    String food = rs.getString("food");
                    Double price = rs.getDouble("price");
                    String payment = rs.getString("payment_type");


                    System.out.println("Date"+ date +
                            ",Movie: " + movie +
                            ", Category: " + category +
                            ", Seat Type: " + seatType +
                            ", Seat: " + seat +
                            ", Souvenir: " + souvenir +
                            ", Food: " + food +
                            ", Price: " + price +
                            ", Payment Type: " + payment
                            );
                }

                rs.close();
                pstmt.close();
                conn.close();

            } catch (SQLException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }


        }
    }

