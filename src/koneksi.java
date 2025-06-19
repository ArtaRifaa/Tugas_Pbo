import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC tidak ditemukan!", e);
        }

        String url = "jdbc:mysql://localhost:3306/cinetix";
        String user ="root";
        String pass = "";
        return DriverManager.getConnection(url,user,pass);

    }
}