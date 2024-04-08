import java.lang.module.FindException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Employee employee = new Employee();
        employee.setEmpNo();
        //System.out.println(empNo);

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(30);
        myList.add(42);
        myList.remove(1);
        System.out.println(myList);

    }
}
