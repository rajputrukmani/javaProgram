import java.util.*;
import java.sql.*;

class JDBCUtils {
    private static final String URL = "jdbc:mysql://localhost:3307/school";
    private static final String USER = "root";
    private static final String PASSWORD = "2004";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}


class Implementation{
    public void selectOrder()
    {
        String sql = "select order_id,supplier_name,product,quantity,order_data form  orders where order_id=?";
        try{
            Connection con = JDBCUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println("order id"+ rs.getInt("order_id"));
                System.out.println("supplier_name"+ rs.getString("supplier_name"));
                System.out.println("product"+ rs.getNString( "product"));
                System.out.println("quantity"+ rs.getInt("quantity"));
                System.out.println("order_date"+ rs.getDate("order_date"));
            }
        }
        catch(SQLException e )
        {
            JDBCUtils.printSQLException(e);
            e.printStackTrace();
        }
    }


    //insert command
    public void insertOrder()
    {
        String sql = "insert into  orders(order_id,supplier_name, product,quantity,order_date) values(?,?,?,?,?)";

        try
        {
            Connection con = JDBCUtils. getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,1);
            ps.setString(2,"ram");
            ps.setString(3, "phone");
            ps.setInt(4, 2);
            ps.setDate(5, java.sql.Date.valueOf("2024-10-01")); // Use correct date format
            ps.executeUpdate();
            System.out.println("Record create");
        }
        catch(SQLException e )
        {
            JDBCUtils.printSQLException(e);
            e.printStackTrace();
        }

    }

    public void updateOrder() {
        String sql = "UPDATE orders SET  order_id=?, supolier_name=?, product=?,quantity=? order_date WHERE order_id = ?";
        try{Connection conn = JDBCUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, "jane");
            ps.setString(3, "watch");
            ps.setInt(4, 4);
            ps.setDate(5, java.sql.Date.valueOf("2024-10-01")); // Use correct date format
            ps.executeUpdate();
            System.out.println("Record updated.");
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            e.printStackTrace();
        }
   }
    //delete command

    public void deleteOrder()
    {
        String sql = "delete ferm orders where order_id =?";
        try
        {
            Connection con = JDBCUtils.getConnection();
            PreparedStatement ps = con .prepareStatement(sql);
            ps.setInt(1,1);
            ps.executeUpdate();
            System.out.println("Record delete");

        }
        catch(SQLException e)
        {
            JDBCUtils.printSQLException(e);
            e.printStackTrace();
        }
    }

public static void main(String[] args) {

        int choice;
        Implementation obj=new Implementation();
        
        System.out.println("Welcome to ABC Limited \n Please Enter your Choice");
        System.out.println(" 1. View order \n 2. Add New order_name \n 3. Update Existing order \n 4. Delete Exisitng order \n 5. Exit ");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        
        switch(choice)
        {
            case 1: obj.selectOrder();
                    break;
            case 2: obj.insertOrder();
                    break;
            case 3: obj.updateOrder();
                    break;
            case 4: obj.deleteOrder();
                    break;
                 
                    
          }
        }
    
    
}









