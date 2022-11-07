package Rough;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
 
public class dbsqlconnection {
 
        public static void main(String[] args) throws ClassNotFoundException, SQLException 
        
        {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
        Connection conn = DriverManager.getConnection("jdbc:sqlserver//192.168.0.13//mssql2019:1433;user=crmnext;password=abc123;database=ksc_sa");
        System.out.println("Database sucessfully connected.");
  
        Statement sta = conn.createStatement();
        String Sql = "select  *  from leads where LeadID=118";
        ResultSet rs = sta.executeQuery(Sql);
        ResultSetMetaData rsMetaData = rs.getMetaData();
        int numberOfColumns = rsMetaData.getColumnCount();
          for(int i = 1; i <= numberOfColumns; i++)
          {
               System.out.print(rsMetaData.getColumnLabel(i) + " ");
          }
          System.out.println();
          while (rs.next())
          {
               for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
            {
             System.out.print(rs.getString(e) + " ");
            }
           System.out.println();
          }
    }
}
