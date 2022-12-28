package javaws;

import java.sql.*;
public class DAO {
	private static String DB_URL = "jdbc:mysql://localhost:3306/account";
    private static String USER_NAME = "root";
    private static String PASSWORD = "1234";

    public static boolean addAccount(Account account){
        String sql = "INSERT INTO account (username, password, gender, birthday, married, hobbies, country, notes) VALUES " +
                "(?,?,?,?,?,?,?,?);";
        Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
        try {
            // create statement
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setString(1, String.valueOf(a.getId()));
            ps.setString(1, account.getUsername());
            ps.setString(2, account.getPassword());
            ps.setString(3, account.getGender());
            ps.setString(4, account.getBirthday());
            ps.setString(5, account.getMarried());
            ps.setString(6, String.valueOf(account.getHobbylist()));
            ps.setString(7, account.getCountry());
            ps.setString(8, account.getNotes());
            System.out.println("\nSaved to database!\n");
            //executeUpdate thay đổi csdl 
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void getListAccount(){
        try {
            // connnect to database 'account'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // create statement
            Statement stmt = conn.createStatement();
            // get data from table 'account'
            //Query đọc dữ liệu
            ResultSet rs = stmt.executeQuery("select * from account");
            
            // show data
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t DANH SÁCH ACCOUNT \n\n");
            for (int i = 0; i <= 100; i++) {	
            	while (rs.next()) {
	            	i = i + 1;
	                System.out.format("\n\t Account " + i + ": ");
	                System.out.format("Tên đăng nhập: " + "\t%15s | ", rs.getString(1));
	                System.out.format("Mật khẩu: " + "\t%10s | ", rs.getString(2));
	                System.out.format("Giới tính: " + "%5s | ", rs.getString(3));
	                System.out.format("Ngày sinh: " + "\t%10s | ", rs.getString(4));
	                System.out.format("Tình trạng hôn nhân: " + "\t%10s | ", rs.getString(5));
	                System.out.format("Sở thích: " + "\t%40s | ", rs.getString(6));
	                System.out.format("Quốc tịch: " + "\t%15s | ", rs.getString(7));
	                System.out.format("Ghi chú: " + "\t%40s | ", rs.getString(8));
	                System.out.print("\n\n");
	            	}
            	}
            // close connection
            	conn.close();
        	} catch (Exception ex) {
        		ex.printStackTrace();
        }
    }

    //connect Database
    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            
        } catch (Exception ex) {
            System.out.println("Connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}