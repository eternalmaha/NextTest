import java.sql.DriverManager;
import java.sql.SQLException;

public class createDataBase {

    public static void main(String[] args) {
        
        String url = "jdbc:sqlite:studentSessions.db";

        String studentTable = """
            CREATE TABLE IF NOT EXISTS students (
            id INTEGER PRIMARY KEY AUTOINCREMENT, 
            studentName TEXT NOT NULL,
            lastTestDate TEXT,
            numberOfSessions INTEGER DEFAULT 0
         );
        """ ;

        try (var conn = DriverManager.getConnection(url)){

            
            if(conn != null){
                var meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("Database connection established"); 
            }

            var stmt = conn.createStatement();
            stmt.execute(studentTable); 
            System.out.println("Table 'students' created or already exists.");

        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }

        


    }
    
}
