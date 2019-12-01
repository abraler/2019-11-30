import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1，注册driver
        Class.forName("com.mysql.jdbc.Driver");
        //2，通过DriverMAnager获取数据库数据
        /*
            获取statement
            执行statement并得到resultSet
          */
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS?useSSL=false","root","wx123456");
        Statement statement =connection.createStatement();
        int rows= statement.executeUpdate("INSERT INTO classes (NAME)VALUES('向日葵班')");


        System.out.println(rows);
        connection.close();



       /*
        ResultSet resultSet=statement.executeQuery("SHOW TABLES");
        while(resultSet.next()){
            String table =resultSet.getString(1);
            System.out.println(table);
        }
*/
        connection.close();
    }

}
