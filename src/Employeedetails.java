package src;
import java.util.Arrays;
public class Employeedetails {

    public static void main(String[]args){
        String[][]Employees= new String[5][2];
        Employees[0][0]="100300";
        Employees[0][1]="30000";
        Employees[1][0]="100301";
        Employees[1][1]="40000";
        Employees[2][0]="100302";
        Employees[2][1]="50000";
        Employees[3][0]="100303";
        Employees[3][1]="60000";
        Employees[4][0]="100304";
        Employees[4][1]="70000";
        for(String[]Employee:Employees){
            System.out.println(Arrays.toString(Employee));
        }
    }
}
