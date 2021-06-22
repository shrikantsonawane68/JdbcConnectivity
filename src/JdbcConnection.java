import java.sql.*;
public class JdbcConnection{
    public static void main(String args[])
    {
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:DemoAppDB");
            Statement stmt = conn.createStatement();
            String sql ="select * from Employee";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}