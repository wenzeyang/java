package notepadplusplus;
import java.time.LocalDate;

// * @author youngwenze
// * @version 1.0
// * 2021/8/11 11:20
// * Description -
// */
// public class Employee {
//    private String name;
//    private do uble salary;
//    private LocalDate hireDay;
//
//    public Employee(String n, double s, int year, int month, int day){
//        this.name = n;
//        this.salary = s;
//        this.hireDay = LocalDate.of(year,month,day);
//    }
//    public String getName(){
//        return name;
//    }
//    public double getSalary(){
//        return salary;
//    }
//    public LocalDate getHireDay(){
//        return hireDay;
//    }
//
//    public void raiseSalary(double byPercent){
//        double raise = salary * byPercent/100;
//        salary = salary + raise;
//    }
//
//}

class Employee // simplified Employee class
{

    private String name;
    private double salary;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}