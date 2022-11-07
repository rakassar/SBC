package Rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class oracledbconnectivity {
	 static String Loginid ;
	 public static void main(String[] args)
	 {
	 Connection conn= null;
	
	    try {
	            
	            Class.forName("oracle.jdbc.OracleDriver");
	            String dbURL2 =  "jdbc:oracle:thin:@192.168.0.236:1521/TPBANK122";
	            String username = "SBC_UPGRADE_GOLD7";
	            String password = "abc123";
	            conn = DriverManager.getConnection(dbURL2, username, password);
	            if (conn != null) {
	                System.out.println("Connected with connection #1");
	            }
	            Statement st=conn.createStatement();
                String sql="select  Loginid from az_user where  userid in (select distinct AssignTo  from leads where leadid='"+55555+"') and AppOwnerID=444 and rownum = 1";
	            ResultSet rs=st.executeQuery(sql);
	            while( rs.next() ){ 
	            Loginid=rs.getString(1);
		
	             } 
	             }
	            catch (ClassNotFoundException ex) 
	            {
	            ex.printStackTrace();
	            } 
	           catch (SQLException ex) 
	            {
	            ex.printStackTrace();
	            }
	           finally {
	            try {
	                if (conn != null && !conn.isClosed()) 
	                {
	                    conn.close();
	                }
	               } 
	            catch (SQLException ex)
	            {
	                ex.printStackTrace();
	            }

	               }
	

	    }

}
