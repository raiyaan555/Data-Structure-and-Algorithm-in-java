import java.util.*;


  class ArrayListPrac {
     public static void main(String[] args) {
        
        List<Employee> employeeList = new ArrayList<>(); //default there will be 10 elements
            employeeList.add(new Employee("jane", "jones", 123));
            employeeList.add(new Employee("jill", "jonas", 124));
            employeeList.add(new Employee("jack", "jacke", 125));
            employeeList.add(new Employee("janey", "jypsy", 126));
            employeeList.add(new Employee("jim", "jig", 127));

            employeeList.forEach(employee -> System.out.println(employee));

            System.out.prinln(employeeList.get(1));
            // isEmpty()
            // set(index, new className("","" ,index ))
            // add(3,new className(...))
         }
 }
     
