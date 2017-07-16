import java.sql.*;

/**
 * Created by Dell on 7/9/2017.
 */
public class DBConnect {
    private Connection conn;
    private Statement stmt;

    public DBConnect(){
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


    public boolean EnrollStudents(String nameValue, String addressValue,String ageValue,String sexValue,String contactnoValue,String courseValue ){
        String sql = "Insert into  students" + "(name,address,age,sex,contactno,course) " + " values(?,?,?,?,?,?)";
         try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,nameValue);
            statement.setString(2,addressValue);
            statement.setString(3,ageValue);
            statement.setString(4,sexValue);
            statement.setString(5,contactnoValue);
            statement.setString(6,courseValue);

            if(statement.executeUpdate() == 1){
                return true;
            }
            else
                return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean insertCourse(String name, String teacher, String duration, String fee){
        String sql = "INSERT INTO coursedetails      " +
                "VALUES (Name , Teacher, Duration, fee)";

        try {
            stmt = conn.createStatement();
            if(stmt.executeUpdate(sql) == 1){
                return true;
            }
            else
                return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    public ResultSet fetchCourse(){
        String sql = "SELECT * FROM coursedetails";
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet fetchStudent(){
        String sql = "SELECT * FROM students";
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean addUser(String username, String password){
        String sql = "Insert into  user" + "(username,password) " + " values(?,?)";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1,username);
            statement.setString(2,password);
            if(statement.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet fetchUser(){
            String sql = "select * from user";
            ResultSet rs  = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean deleteStudent(String name){
        String sql = "DELETE FROM  students where name = ? ";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            if(stmt.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
