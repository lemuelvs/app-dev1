//////import java.sql.*;
//////import java.util.*;
//////
//////public class Movie {
//////
//////	public static void main(String[] args) throws Exception{
//////		
//////
//////		        String url = "jdbc:mysql://localhost/movierental";
//////		        String user = "root";
//////		        String pass = "tiger";
//////		        Connection con = DriverManager.getConnection(url, user, pass);
//////		        Scanner sc = new Scanner(System.in);
//////		        String query="Select * from movie";
//////		        Statement st=con.createStatement();
//////		        ResultSet rs=st.executeQuery(query);
////////		        st.setInt(1,mov_id);
////////		        st.setString(2,mov_name);
////////		        st.setInt(3,price);
//////		        while(rs.next()) {
//////		        	System.out.println("Mov_id: " + rs.getInt(1));
//////		        	System.out.println("Mov_name: " + rs.getString(2));
//////		        	System.out.println("Mov_price: " + rs.getInt(3));
//////		        }
//////		        System.out.println("Enter User Id: ");
//////		        int id = sc.nextInt();
//////		        System.out.println("Enter USer Name: ");
//////		        String name = sc.next();
//////		        
//////		        System.out.println("Enter Movie Id: ");
//////		        int mov_id = sc.nextInt();
//////		        
//////		        String query2 = "insert into user values(?,?,?)";
//////		        PreparedStatement ps = con.prepareStatement(query2);
//////                ps.setInt(1, id);
//////                ps.setString(2, name);
//////                ps.setInt(3, mov_id);
//////                ps.execute();
//////                System.out.println("Value Added");
//////                
//////                String query3 = ""
//////                
//////	
//////		
//////
//////	}
//////
//////}
////import java.sql.*;
////import java.util.*;
////
////public class Movie {
////
////    public static void main(String[] args) throws Exception {
////
////        String url = "jdbc:mysql://localhost/movierental";
////        String user = "root";
////        String pass = "tiger";
////        Connection con = DriverManager.getConnection(url, user, pass);
////        Scanner sc = new Scanner(System.in);
////        String query = "SELECT * FROM movie";
////        Statement st = con.createStatement();
////        ResultSet rs = st.executeQuery(query);
////
////        System.out.println("Movies in the database:");
////        while (rs.next()) {
////            System.out.println("Mov_id: " + rs.getInt(1));
////            System.out.println("Mov_name: " + rs.getString(2));
////            System.out.println("Mov_price: " + rs.getInt(3));
////            System.out.println("-------------------------");
////        }
////
////        System.out.println("Enter User Id: ");
////        int id = sc.nextInt();
////        System.out.println("Enter User Name: ");
////        String name = sc.next();
////
////        System.out.println("Enter Movie Id: ");
////        int mov_id = sc.nextInt();
////
////        // Check if the movie ID exists in the "movie" table
////        String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
////        PreparedStatement checkStmt = con.prepareStatement(checkQuery);
////        checkStmt.setInt(1, mov_id);
////        ResultSet checkRs = checkStmt.executeQuery();
////
////        if (checkRs.next()) {
////            // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
////            String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
////            PreparedStatement ps = con.prepareStatement(insertQuery);
////            ps.setInt(1, id);
////            ps.setInt(2, mov_id);
////
////            // You can set the date_rented and due_date values according to your requirements
////            ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
////            ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date
////
////            ps.executeUpdate();
////            System.out.println("Rental record added successfully.");
////        } else {
////            System.out.println("Invalid movie ID. Rental record not added.");
////        }
////
////        con.close();
////    }
////}
//
//
////import java.sql.*;
////import java.util.*;
////
////public class Movie {
////
////    public static void main(String[] args) throws Exception {
////
////        String url = "jdbc:mysql://localhost/movierental";
////        String user = "root";
////        String pass = "tiger";
////        Connection con = DriverManager.getConnection(url, user, pass);
////        Scanner sc = new Scanner(System.in);
////        String query = "SELECT * FROM movie";
////        Statement st = con.createStatement();
////        ResultSet rs = st.executeQuery(query);
////
////        System.out.println("Movies in the database:");
////        while (rs.next()) {
////            System.out.println("Mov_id: " + rs.getInt(1));
////            System.out.println("Mov_name: " + rs.getString(2));
////            System.out.println("Mov_price: " + rs.getInt(3));
////            System.out.println("-------------------------");
////        }
////
////        System.out.println("Enter User Id: ");
////        int id = sc.nextInt();
////        System.out.println("Enter User Name: ");
////        String name = sc.next();
////
////        System.out.println("Enter Movie Id: ");
////        int mov_id = sc.nextInt();
////
////        // Check if the movie ID exists in the "movie" table
////        String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
////        PreparedStatement checkStmt = con.prepareStatement(checkQuery);
////        checkStmt.setInt(1, mov_id);
////        ResultSet checkRs = checkStmt.executeQuery();
////
////        if (checkRs.next()) {
////            // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
////            String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
////            PreparedStatement ps = con.prepareStatement(insertQuery);
////            ps.setInt(1, id);
////            ps.setInt(2, mov_id);
////
////            // You can set the date_rented and due_date values according to your requirements
////            ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
////            ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date
////
////            ps.executeUpdate();
////            System.out.println("Rental record added successfully.");
////        } else {
////            System.out.println("Invalid movie ID. Rental record not added.");
////        }
////
////        // Delete rental records with due_date in the past
////        String deleteQuery = "DELETE FROM rental WHERE due_date < ?";
////        PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
////        deleteStmt.setDate(1, java.sql.Date.valueOf(java.time.LocalDate.now()));
////        int deletedRows = deleteStmt.executeUpdate();
////        System.out.println(deletedRows + " rental record(s) deleted.");
////
////        con.close();
////    }
////}
//
////import java.sql.*;
////import java.util.*;
////import java.sql.Date;
////
////public class Movie {
////
////    public static void main(String[] args) {
////        String url = "jdbc:mysql://localhost/movierental";
////        String user = "root";
////        String pass = "tiger";
////
////        try {
////            Connection con = DriverManager.getConnection(url, user, pass);
////            Scanner sc = new Scanner(System.in);
////
////            // Display the available movies in the database
////            String query = "SELECT * FROM movie";
////            Statement st = con.createStatement();
////            ResultSet rs = st.executeQuery(query);
////
////            System.out.println("Movies in the database:");
////            while (rs.next()) {
////                System.out.println("Mov_id: " + rs.getInt("mov_id"));
////                System.out.println("Mov_name: " + rs.getString("mov_name"));
////                System.out.println("Mov_price: " + rs.getInt("price"));
////                System.out.println("-------------------------");
////            }
////
////            // Get user input for rental
////            System.out.println("Enter User Id: ");
////            int cust_id = sc.nextInt();
////            System.out.println("Enter User Name: ");
////            String cust_name = sc.next();
////
////            System.out.println("Enter Movie Id: ");
////            int mov_id = sc.nextInt();
////
////            // Check if the movie ID exists in the "movie" table
////            String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
////            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
////            checkStmt.setInt(1, mov_id);
////            ResultSet checkRs = checkStmt.executeQuery();
////
////            if (checkRs.next()) {
////                // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
////                String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
////                PreparedStatement ps = con.prepareStatement(insertQuery);
////                ps.setInt(1, cust_id);
////                ps.setInt(2, mov_id);
////
////                // You can set the date_rented and due_date values according to your requirements
////                ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
////                ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date
////
////                ps.executeUpdate();
////                System.out.println("Rental record added successfully.");
////
////                // Calculate due fee for overdue rentals
////                String selectRentalQuery = "SELECT * FROM rental WHERE cust_id = ? AND mov_id = ?";
////                PreparedStatement selectRentalStmt = con.prepareStatement(selectRentalQuery);
////                selectRentalStmt.setInt(1, cust_id);
////                selectRentalStmt.setInt(2, mov_id);
////                ResultSet rentalRs = selectRentalStmt.executeQuery();
////
////                if (rentalRs.next()) {
////                    Date dueDate = rentalRs.getDate("due_date");
////                    Date currentDate = java.sql.Date.valueOf(java.time.LocalDate.now());
////                    if (dueDate.before(currentDate)) {
////                        // Calculate overdue days
////                        long overdueDays = (currentDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
////
////                        // Assuming the due fee is $1 per day
////                        double dueFee = overdueDays * 1.0;
////
////                        System.out.println("Due Fee for Overdue Rental: $" + dueFee);
////                    }
////                }
////            } else {
////                System.out.println("Invalid movie ID. Rental record not added.");
////            }
////
////            // Delete rental records with due_date in the past
////            String deleteQuery = "DELETE FROM rental WHERE due_date < ?";
////            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
////            deleteStmt.setDate(1, java.sql.Date.valueOf(java.time.LocalDate.now()));
////            int deletedRows = deleteStmt.executeUpdate();
////            System.out.println(deletedRows + " rental record(s) deleted.");
////
////            con.close();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
////}
//
////import java.sql.*;
////import java.util.*;
////import  java.sql.Date;
////
////public class Movie{
////
////    public static void main(String[] args) {
////        String url = "jdbc:mysql://localhost/movierental";
////        String user = "root";
////        String pass = "tiger";
////
////        try {
////            Connection con = DriverManager.getConnection(url, user, pass);
////            Scanner sc = new Scanner(System.in);
////
////            // Display the available movies in the database
////            String query = "SELECT * FROM movie";
////            Statement st = con.createStatement();
////            ResultSet rs = st.executeQuery(query);
////
////            System.out.println("Movies in the database:");
////            while (rs.next()) {
////                System.out.println("Mov_id: " + rs.getInt("mov_id"));
////                System.out.println("Mov_name: " + rs.getString("mov_name"));
////                System.out.println("Mov_price: " + rs.getInt("price"));
////                System.out.println("-------------------------");
////            }
////
////            // Get user input for rental
////            System.out.println("Enter User Id: ");
////            int cust_id = sc.nextInt();
////            System.out.println("Enter User Name: ");
////            String cust_name = sc.next();
////
////            System.out.println("Enter Movie Id: ");
////            int mov_id = sc.nextInt();
////
////            // Check if the movie ID exists in the "movie" table
////            String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
////            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
////            checkStmt.setInt(1, mov_id);
////            ResultSet checkRs = checkStmt.executeQuery();
////
////            if (checkRs.next()) {
////                // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
////                String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
////                PreparedStatement ps = con.prepareStatement(insertQuery);
////                ps.setInt(1, cust_id);
////                ps.setInt(2, mov_id);
////
////                // You can set the date_rented and due_date values according to your requirements
////                ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
////                ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date
////
////                ps.executeUpdate();
////                System.out.println("Rental record added successfully.");
////
////                // Calculate due fee for overdue rentals
////                String selectRentalQuery = "SELECT * FROM rental WHERE cust_id = ? AND mov_id = ?";
////                PreparedStatement selectRentalStmt = con.prepareStatement(selectRentalQuery);
////                selectRentalStmt.setInt(1, cust_id);
////                selectRentalStmt.setInt(2, mov_id);
////                ResultSet rentalRs = selectRentalStmt.executeQuery();
////
////                if (rentalRs.next()) {
////                    Date dueDate = rentalRs.getDate("due_date");
////                    Date currentDate = java.sql.Date.valueOf(java.time.LocalDate.now());
////                    if (dueDate.before(currentDate)) {
////                        // Calculate overdue days
////                        long overdueDays = (currentDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
////
////                        // Assuming the due fee is $1 per day
////                        double dueFee = overdueDays * 1.0;
////
////                        System.out.println("Due Fee for Overdue Rental: $" + dueFee);
////
////                        // Insert overdue details into the "due" table
////                        String insertDueQuery = "INSERT INTO due (cust_id, mov_id, due_amount) VALUES (?, ?, ?)";
////                        PreparedStatement insertDueStmt = con.prepareStatement(insertDueQuery);
////                        insertDueStmt.setInt(1, cust_id);
////                        insertDueStmt.setInt(2, mov_id);
////                        insertDueStmt.setDouble(3, dueFee);
////                        insertDueStmt.executeUpdate();
////                        System.out.println("Overdue details inserted into the 'due' table.");
////                    }
////                }
////            } else {
////                System.out.println("Invalid movie ID. Rental record not added.");
////            }
////
////            // Delete rental records with due_date in the past
////            String deleteQuery = "DELETE FROM rental WHERE due_date < ?";
////            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
////            deleteStmt.setDate(1, java.sql.Date.valueOf(java.time.LocalDate.now()));
////            int deletedRows = deleteStmt.executeUpdate();
////            System.out.println(deletedRows + " rental record(s) deleted.");
////
////            con.close();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
////}
////
////
//
////import java.sql.*;
////import java.util.*;
////import java.sql.Date;
////
////public class Movie {
////
////    public static void main(String[] args) {
////        String url = "jdbc:mysql://localhost/movierental";
////        String user = "root";
////        String pass = "tiger";
////
////        try {
////            Connection con = DriverManager.getConnection(url, user, pass);
////            Scanner sc = new Scanner(System.in);
////
////            // Display the available movies in the database
////            String query = "SELECT * FROM movie";
////            Statement st = con.createStatement();
////            ResultSet rs = st.executeQuery(query);
////
////            System.out.println("Movies in the database:");
////            while (rs.next()) {
////                System.out.println("Mov_id: " + rs.getInt("mov_id"));
////                System.out.println("Mov_name: " + rs.getString("mov_name"));
////                System.out.println("Mov_price: " + rs.getInt("mov_price"));
////                System.out.println("-------------------------");
////            }
////
////            // Check if the user is an existing user or a new user
////            System.out.println("Are you an existing user? (yes/no)");
////            String existingUser = sc.next().toLowerCase();
////
////            int cust_id;
////            String cust_name;
////
////            if (existingUser.equals("yes")) {
////                // For existing users, get user ID and name
////                System.out.println("Enter User Id: ");
////                cust_id = sc.nextInt();
////                System.out.println("Enter User Name: ");
////                cust_name = sc.next();
////            } else {
////                // For new users, create a new user entry
////                System.out.println("Enter New User Name: ");
////                cust_name = sc.next();
////
////                // Insert the new user into the "user" table
////                String insertUserQuery = "INSERT INTO user(name) VALUES (?)";
////                PreparedStatement insertUserStmt = con.prepareStatement(insertUserQuery, Statement.RETURN_GENERATED_KEYS);
////                insertUserStmt.setString(1, cust_name);
////                insertUserStmt.executeUpdate();
////
////                // Get the generated user ID for the new user
////                ResultSet generatedKeys = insertUserStmt.getGeneratedKeys();
////                if (generatedKeys.next()) {
////                    cust_id = generatedKeys.getInt(1);
////                    System.out.println("New user created with User ID: " + cust_id);
////                } else {
////                    System.out.println("Failed to create a new user. Exiting...");
////                    con.close();
////                    return;
////                }
////            }
////
////            System.out.println("Enter Movie Id: ");
////            int mov_id = sc.nextInt();
////
////            // Check if the movie ID exists in the "movie" table
////            String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
////            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
////            checkStmt.setInt(1, mov_id);
////            ResultSet checkRs = checkStmt.executeQuery();
////
////            if (checkRs.next()) {
////                // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
////                String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
////                PreparedStatement ps = con.prepareStatement(insertQuery);
////                ps.setInt(1, cust_id);
////                ps.setInt(2, mov_id);
////
////                // You can set the date_rented and due_date values according to your requirements
////                ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
////                ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date
////
////                ps.executeUpdate();
////                System.out.println("Rental record added successfully.");
////
////                // Calculate due fee for overdue rentals
////                String selectRentalQuery = "SELECT * FROM rental WHERE cust_id = ? AND mov_id = ?";
////                PreparedStatement selectRentalStmt = con.prepareStatement(selectRentalQuery);
////                selectRentalStmt.setInt(1, cust_id);
////                selectRentalStmt.setInt(2, mov_id);
////                ResultSet rentalRs = selectRentalStmt.executeQuery();
////
////                if (rentalRs.next()) {
////                    Date dueDate = rentalRs.getDate("due_date");
////                    Date currentDate = java.sql.Date.valueOf(java.time.LocalDate.now());
////                    if (dueDate.before(currentDate)) {
////                        // Calculate overdue days
////                        long overdueDays = (currentDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
////
////                        // Assuming the due fee is $1 per day
////                        double dueFee = overdueDays * 1.0;
////
////                        System.out.println("Due Fee for Overdue Rental: $" + dueFee);
////
////                        // Insert overdue details into the "due" table
////                        String insertDueQuery = "INSERT INTO due (cust_id, mov_id, due_amount) VALUES (?, ?, ?)";
////                        PreparedStatement insertDueStmt = con.prepareStatement(insertDueQuery);
////                        insertDueStmt.setInt(1, cust_id);
////                        insertDueStmt.setInt(2, mov_id);
////                        insertDueStmt.setDouble(3, dueFee);
////                        insertDueStmt.executeUpdate();
////                        System.out.println("Overdue details inserted into the 'due' table.");
////                    }
////                }
////            } else {
////                System.out.println("Invalid movie ID. Rental record not added.");
////            }
////
////            // Delete rental records with due_date in the past
////            String deleteQuery = "DELETE FROM rental WHERE due_date < ?";
////            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
////            deleteStmt.setDate(1, java.sql.Date.valueOf(java.time.LocalDate.now()));
////            int deletedRows = deleteStmt.executeUpdate();
////            System.out.println(deletedRows + " rental record(s) deleted.");
////
////            con.close();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
////}
//import java.sql.*;
//import java.util.*;
//import java.sql.Date;
//
//public class Movie {
//
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost/movierental";
//        String user = "root";
//        String pass = "tiger";
//
//        try {
//            Connection con = DriverManager.getConnection(url, user, pass);
//            Scanner sc = new Scanner(System.in);
//
//            // Display the available movies in the database
//            String query = "SELECT * FROM movie";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(query);
//
//            System.out.println("Movies in the database:");
//            while (rs.next()) {
//                System.out.println("Mov_id: " + rs.getInt("mov_id"));
//                System.out.println("Mov_name: " + rs.getString("mov_name"));
//                System.out.println("Mov_price: " + rs.getInt("mov_price"));
//                System.out.println("-------------------------");
//            }
//
//            // Check if the user is an existing user or a new user
//            System.out.println("Are you an existing user? (yes/no)");
//            String existingUser = sc.next().toLowerCase();
//
//            int cust_id;
//            String cust_name;
//
//            if (existingUser.equals("yes")) {
//                // For existing users, get user ID and name
//                System.out.println("Enter User Id: ");
//                cust_id = sc.nextInt();
//                System.out.println("Enter User Name: ");
//                cust_name = sc.next();
//            } else {
//                // For new users, create a new user entry
//                System.out.println("Enter New User Name: ");
//                cust_name = sc.next();
//
//                // Insert the new user into the "user" table
//                String insertUserQuery = "INSERT INTO user(cust_name) VALUES (?)";
//                PreparedStatement insertUserStmt = con.prepareStatement(insertUserQuery, Statement.RETURN_GENERATED_KEYS);
//                insertUserStmt.setString(1, cust_name);
//                insertUserStmt.executeUpdate();
//
//                // Get the generated user ID for the new user
//                ResultSet generatedKeys = insertUserStmt.getGeneratedKeys();
//                if (generatedKeys.next()) {
//                    cust_id = generatedKeys.getInt(1);
//                    System.out.println("New user created with User ID: " + cust_id);
//                } else {
//                    System.out.println("Failed to create a new user. Exiting...");
//                    con.close();
//                    return;
//                }
//            }
//
//            System.out.println("Enter Movie Id: ");
//            int mov_id = sc.nextInt();
//
//            // Check if the movie ID exists in the "movie" table
//            String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
//            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
//            checkStmt.setInt(1, mov_id);
//            ResultSet checkRs = checkStmt.executeQuery();
//
//            if (checkRs.next()) {
//                // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
//                String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
//                PreparedStatement ps = con.prepareStatement(insertQuery);
//                ps.setInt(1, cust_id);
//                ps.setInt(2, mov_id);
//
//                // You can set the date_rented and due_date values according to your requirements
//                ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
//                ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date
//
//                ps.executeUpdate();
//                System.out.println("The Movie is yours!");
//
//                // Calculate due fee for overdue rentals
//                String selectRentalQuery = "SELECT * FROM rental WHERE cust_id = ? AND mov_id = ?";
//                PreparedStatement selectRentalStmt = con.prepareStatement(selectRentalQuery);
//                selectRentalStmt.setInt(1, cust_id);
//                selectRentalStmt.setInt(2, mov_id);
//                ResultSet rentalRs = selectRentalStmt.executeQuery();
//
//                if (rentalRs.next()) {
//                    Date dueDate = rentalRs.getDate("due_date");
//                    Date currentDate = java.sql.Date.valueOf(java.time.LocalDate.now());
//                    if (dueDate.before(currentDate)) {
//                        // Calculate overdue days
//                        long overdueDays = (currentDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
//
//                        // Assuming the due fee is $1 per day
//                        double dueFee = overdueDays * 1.0;
//
//                        System.out.println("Due Fee for Overdue Rental: $" + dueFee);
//
//                        // Insert overdue details into the "due" table
//                        String insertDueQuery = "INSERT INTO due (cust_id, mov_id, due_amount) VALUES (?, ?, ?)";
//                        PreparedStatement insertDueStmt = con.prepareStatement(insertDueQuery);
//                        insertDueStmt.setInt(1, cust_id);
//                        insertDueStmt.setInt(2, mov_id);
//                        insertDueStmt.setDouble(3, dueFee);
//                        insertDueStmt.executeUpdate();
//                        System.out.println("Overdue details inserted into the 'due' table.");
//                    }
//                }
//            } else {
//                System.out.println("Invalid movie ID. Rental record not added.");
//            }
//
//            // Delete rental records with due_date in the past
//            String deleteQuery = "DELETE FROM rental WHERE due_date < ?";
//            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
//            deleteStmt.setDate(1, java.sql.Date.valueOf(java.time.LocalDate.now()));
//            int deletedRows = deleteStmt.executeUpdate();
//            System.out.println(deletedRows + " rental record(s) deleted.");
//
//            con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

//import java.sql.*;
//import java.util.*;
//import java.sql.Date;
//
//public class Movie {
//
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost/movierental";
//        String user = "root";
//        String pass = "tiger";
//
//        try {
//            Connection con = DriverManager.getConnection(url, user, pass);
//            Scanner sc = new Scanner(System.in);
//
//            boolean rentMore = true;
//
//            while (rentMore) {
//                // Display the available movies in the database
//                String query = "SELECT * FROM movie";
//                Statement st = con.createStatement();
//                ResultSet rs = st.executeQuery(query);
//
//                System.out.println("Movies in the database:");
//                while (rs.next()) {
//                    System.out.println("Mov_id: " + rs.getInt("mov_id"));
//                    System.out.println("Mov_name: " + rs.getString("mov_name"));
//                    System.out.println("Mov_price: " + rs.getInt("mov_price"));
//                    System.out.println("-------------------------");
//                }
//
//                // Check if the user is an existing user or a new user
//                System.out.println("Are you an existing user? (yes/no)");
//                String existingUser = sc.next().toLowerCase();
//
//                int cust_id;
//                String cust_name;
//
//                if (existingUser.equals("yes")) {
//                    // For existing users, get user ID and name
//                    System.out.println("Enter User Id: ");
//                    cust_id = sc.nextInt();
//                    System.out.println("Enter User Name: ");
//                    cust_name = sc.next();
//                } else {
//                    // For new users, create a new user entry
//                    System.out.println("Enter New User Name: ");
//                    cust_name = sc.next();
//
//                    // Insert the new user into the "user" table
//                    String insertUserQuery = "INSERT INTO user(cust_name) VALUES (?)";
//                    PreparedStatement insertUserStmt = con.prepareStatement(insertUserQuery, Statement.RETURN_GENERATED_KEYS);
//                    insertUserStmt.setString(1, cust_name);
//                    insertUserStmt.executeUpdate();
//
//                    // Get the generated user ID for the new user
//                    ResultSet generatedKeys = insertUserStmt.getGeneratedKeys();
//                    if (generatedKeys.next()) {
//                        cust_id = generatedKeys.getInt(1);
//                        System.out.println("New user created with User ID: " + cust_id);
//                    } else {
//                        System.out.println("Failed to create a new user. Exiting...");
//                        con.close();
//                        return;
//                    }
//                }
//
//                System.out.println("Enter Movie Id: ");
//                int mov_id = sc.nextInt();
//
//                // Check if the movie ID exists in the "movie" table
//                String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
//                PreparedStatement checkStmt = con.prepareStatement(checkQuery);
//                checkStmt.setInt(1, mov_id);
//                ResultSet checkRs = checkStmt.executeQuery();
//
//                if (checkRs.next()) {
//                    // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
//                    String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
//                    PreparedStatement ps = con.prepareStatement(insertQuery);
//                    ps.setInt(1, cust_id);
//                    ps.setInt(2, mov_id);
//
//                    // You can set the date_rented and due_date values according to your requirements
//                    ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
//                    ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date
//
//                    ps.executeUpdate();
//                    System.out.println("The Movie is yours!");
//
//                    // Calculate due fee for overdue rentals
//                    String selectRentalQuery = "SELECT * FROM rental WHERE cust_id = ? AND mov_id = ?";
//                    PreparedStatement selectRentalStmt = con.prepareStatement(selectRentalQuery);
//                    selectRentalStmt.setInt(1, cust_id);
//                    selectRentalStmt.setInt(2, mov_id);
//                    ResultSet rentalRs = selectRentalStmt.executeQuery();
//
//                    if (rentalRs.next()) {
//                        Date dueDate = rentalRs.getDate("due_date");
//                        Date currentDate = java.sql.Date.valueOf(java.time.LocalDate.now());
//                        if (dueDate.before(currentDate)) {
//                            // Calculate overdue days
//                            long overdueDays = (currentDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
//
//                            // Assuming the due fee is $1 per day
//                            double dueFee = overdueDays * 1.0;
//
//                            System.out.println("Due Fee for Overdue Rental: $" + dueFee);
//
//                            // Insert overdue details into the "due" table
//                            String insertDueQuery = "INSERT INTO due (cust_id, mov_id, due_amount) VALUES (?, ?, ?)";
//                            PreparedStatement insertDueStmt = con.prepareStatement(insertDueQuery);
//                            insertDueStmt.setInt(1, cust_id);
//                            insertDueStmt.setInt(2, mov_id);
//                            insertDueStmt.setDouble(3, dueFee);
//                            insertDueStmt.executeUpdate();
//                            System.out.println("Overdue details inserted into the 'due' table.");
//                        }
//                    }
//                } else {
//                    System.out.println("Invalid movie ID. Rental record not added.");
//                }
//
//                // Prompt the user to rent more films
//                System.out.println("Do you want to rent more films? (yes/no)");
//                String continueRenting = sc.next().toLowerCase();
//                if (!continueRenting.equals("yes")) {
//                    rentMore = false;
//                }
//
//                // Delete rental records with due_date in the past
//                String deleteQuery = "DELETE FROM rental WHERE due_date < ?";
//                PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
//                deleteStmt.setDate(1, java.sql.Date.valueOf(java.time.LocalDate.now()));
//                int deletedRows = deleteStmt.executeUpdate();
//                System.out.println(deletedRows + " rental record(s) deleted.");
//            }
//
//            con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
import java.sql.*;
import java.util.*;
import java.sql.Date;

public class Movie {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost/movierental";
        String user = "root";
        String pass = "root";

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver") ;
            Connection con = DriverManager.getConnection(url, user, pass);
            Scanner sc = new Scanner(System.in);

            boolean rentMore = true;
            int cust_id = 0;
            String cust_name = "";

            while (rentMore) {
                // Display the available movies in the database
                String query = "SELECT * FROM movie";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                System.out.println("Movies in the database:");
                while (rs.next()) {
                    System.out.println("Mov_id: " + rs.getInt("mov_id"));
                    System.out.println("Mov_name: " + rs.getString("mov_name"));
                    System.out.println("Mov_price: " + rs.getInt("mov_price"));
                    System.out.println("-------------------------");
                }

                if (cust_id == 0) {
                    // For new users, create a new user entry
                    System.out.println("Enter New User Name: ");
                    cust_name = sc.next();

                    // Insert the new user into the "user" table
                    String insertUserQuery = "INSERT INTO user(cust_name) VALUES (?)";
                    PreparedStatement insertUserStmt = con.prepareStatement(insertUserQuery, Statement.RETURN_GENERATED_KEYS);
                    insertUserStmt.setString(1, cust_name);
                    insertUserStmt.executeUpdate();

                    // Get the generated user ID for the new user
                    ResultSet generatedKeys = insertUserStmt.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        cust_id = generatedKeys.getInt(1);
                        System.out.println("New user created with User ID: " + cust_id);
                    } else {
                        System.out.println("Failed to create a new user. Exiting...");
                        con.close();
                        return;
                    }
                }

                System.out.println("Enter Movie Id: ");
                int mov_id = sc.nextInt();

                // Check if the movie ID exists in the "movie" table
                String checkQuery = "SELECT * FROM movie WHERE mov_id = ?";
                PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                checkStmt.setInt(1, mov_id);
                ResultSet checkRs = checkStmt.executeQuery();

                if (checkRs.next()) {
                    // Movie ID exists in the "movie" table, insert the user ID and movie ID into the "rental" table
                    String insertQuery = "INSERT INTO rental(cust_id, mov_id, date_rented, due_date) VALUES (?, ?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(insertQuery);
                    ps.setInt(1, cust_id);
                    ps.setInt(2, mov_id);

                    // You can set the date_rented and due_date values according to your requirements
                    ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
                    ps.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(7))); // Due date set as 7 days from the current date

                    ps.executeUpdate();
                    System.out.println("The Movie is yours!");

                    // Calculate due fee for overdue rentals
                    String selectRentalQuery = "SELECT * FROM rental WHERE cust_id = ? AND mov_id = ?";
                    PreparedStatement selectRentalStmt = con.prepareStatement(selectRentalQuery);
                    selectRentalStmt.setInt(1, cust_id);
                    selectRentalStmt.setInt(2, mov_id);
                    ResultSet rentalRs = selectRentalStmt.executeQuery();

                    if (rentalRs.next()) {
                        Date dueDate = rentalRs.getDate("due_date");
                        Date currentDate = java.sql.Date.valueOf(java.time.LocalDate.now());
                        if (dueDate.before(currentDate)) {
                            // Calculate overdue days
                            long overdueDays = (currentDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);

                            // Assuming the due fee is $1 per day
                            double dueFee = overdueDays * 1.0;

                            System.out.println("Due Fee for Overdue Rental: $" + dueFee);

                            // Insert overdue details into the "due" table
                            String insertDueQuery = "INSERT INTO due (cust_id, mov_id, due_amount) VALUES (?, ?, ?)";
                            PreparedStatement insertDueStmt = con.prepareStatement(insertDueQuery);
                            insertDueStmt.setInt(1, cust_id);
                            insertDueStmt.setInt(2, mov_id);
                            insertDueStmt.setDouble(3, dueFee);
                            insertDueStmt.executeUpdate();
                            System.out.println("Overdue details inserted into the 'due' table.");
                        }
                    }
                } else {
                    System.out.println("Invalid movie ID. Rental record not added.");
                }

                // Prompt the user to rent more films
                System.out.println("Do you want to rent more films? (yes/no)");
                String continueRenting = sc.next().toLowerCase();
                if (!continueRenting.equals("yes")) {
                    rentMore = false;
                }

                // Delete rental records with due_date in the past
                String deleteQuery = "DELETE FROM rental WHERE due_date < ?";
                PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
                deleteStmt.setDate(1, java.sql.Date.valueOf(java.time.LocalDate.now()));
                int deletedRows = deleteStmt.executeUpdate();
//                System.out.println(deletedRows + " rental record(s) deleted.");
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
