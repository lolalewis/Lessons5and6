
package Lesson6;

public class EmployeeTester {

   
    public static void main(String[] args) {
        Employee e1, e2;
        e1 =new Employee();
        e2 = new Employee();
        
        e1.setNAme("Joey Full time");
        e1.setType(1);
        e1.setHour(45);
        e1.setRate(20);
        
        e2.setNAme("Joey Full time");
        e2.setType(2);
        e2.setHour(45);
        e2.setRate(20);
        
        System.out.println(e1.getAme()+ "pay = $ " + e1.getPay());
         System.out.println(e2.getAme()+ "pay = $ " + e2.getPay());
        
        
        
    }
    
}
