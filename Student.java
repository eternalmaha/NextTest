import java.time.LocalDate;

public class Student {
    
    private String studentName; 
    private int sessionCount; 
    private LocalDate lastTestDate;  

    //default constructor 
    public Student(String studentName, int sessionCount, LocalDate lastTestDate){
        this.studentName = studentName;
        this.sessionCount = sessionCount;
        this.lastTestDate = lastTestDate;  
    }

    public void setStudentName(String studentName){
        this.studentName = studentName; 
    }

    public String getStudentName(){
        return studentName;
    }

    //increment current session count by 1; 
    public void incrementSessionCount(){
            this.sessionCount++; 
    }

    public int getSessionCount(){
        return sessionCount; 
    }

    public void setLastTestDate(LocalDate lastTestDate) {
        this.lastTestDate = lastTestDate;
    }

    public LocalDate getLastTestDate() {
        return lastTestDate;
    }


}