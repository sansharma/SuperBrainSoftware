import java.sql.*;

/**
 * Created by Dell on 7/9/2017.
 */
public class DBConnect {
    private Connection conn;
    private Connection stmt;

    public void setConnection() {
        String url = "jdbc:mysql://localhost/superbrain";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean checkCredentials(String username, String password) {
        try {
            String sql = "select * from userdetails where username = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);


            ResultSet resultSet = statement.executeQuery();
            if(resultSet != null){
                    resultSet.next();
                    String ps = resultSet.getString("password");
                    if(ps.equals(password)){
                        return true;
                    }
                    else{
                        return false;
                    }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }




}
