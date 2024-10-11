import java.sql.*;

public class PostgresqlDemo {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:postgresql://localhost:5432/mydatabase";
        String username="postgres";
        String password="dummy";
        Connection con=DriverManager.getConnection(url,username,password);
//        int id=3;
//        String name="Marcus Rashford";
//        int marks = 120;
//        PreparedStatement ps =con.prepareStatement("insert into student values (?,?,?)");
//        ps.setInt(1,id);
//        ps.setString(2,name);
//        ps.setInt(3,marks);
//        ps.execute();
//
//
//        id=4;
//        name="Alejandro Garnacho";
//        marks=20;
//        ps.setInt(1,id);
//        ps.setString(2,name);
//        ps.setInt(3,marks);
//        ps.execute();
//
//
//

        PreparedStatement ps=con.prepareStatement("update student set marks=? where id=?");
        ps.setInt(1,122);
        ps.setInt(2,3);
        ps.execute();

        ps= con.prepareStatement("delete from student where id=?");
        ps.setInt(1,4);
        ps.execute();

        ps=con.prepareStatement("select * from student");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getString("id")+"- ");
            System.out.print(rs.getString("name")+"- ");
            System.out.println(rs.getString("marks"));
        }
        con.close();
    }
}
