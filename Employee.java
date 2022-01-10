import java.util.*;
public class Employee {

    private String firstName;
    private String lastName;
    private int id;

    ArrayList(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String lastName){
        this.lastName = lastName;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return "Employee{"+"firstName ='"+firstName+"\'"+
        "lastName =" +lastName+"\'"+
        "id=" +id+')';
    }
    
  
    
}
