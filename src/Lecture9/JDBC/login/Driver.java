package Lecture9.JDBC.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Driver {

    private static Connection con;
    static Scanner sc = new Scanner(System.in);


    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 2
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/temp"
                    , "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter 1 for user creation\n2. for login\n3. deletion\n4. Show details");
        int option;

        do {
            option = sc.nextInt();

            sc.nextLine();

            if (option == 1) {
                createUser();
            }else if (option == 2){
                login();
            }

        } while (option > 0 && option < 5);

    }

    private static void login() {

        String username = sc.nextLine();
        String password = sc.nextLine();

        try{
            PreparedStatement ps = con.prepareStatement("select * from users where (username = ? or name=?) and password = ?");
            ps.setString(1,username);
            ps.setString(2,username);
            ps.setString(3,password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                System.out.println("Login Success");
                System.out.println("Welcome "+rs.getString("name"));
            }else{
                System.out.println("Invalid username or password");
            }

        }catch (Exception e){

        }

    }

    private static void createUser() {

        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String email = sc.nextLine();
        String phone = sc.nextLine();
        String username = sc.nextLine();
        String password = sc.nextLine();
        try {
            PreparedStatement ps = con.prepareStatement("insert into users " +
                    "(id,name,email,phone,username,password) value (?,?,?,?,?,?)");

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,email);
            ps.setString(4,phone);
            ps.setString(5,username);
            ps.setString(6,password);


            ps.execute();

            System.out.println("User created");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("user not created");
        }
    }

}
