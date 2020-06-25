package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamswithSet {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Naveen");
        emp1.addDevices("Iphone8");
        emp1.addDevices("Samsumg");
        emp1.addDevices("iPhonex");
        emp1.addDevices("macbook pro");

        Employee emp2 = new Employee();
        emp2.setName("Tom");
        emp2.addDevices("Lenovo");
        emp2.addDevices("Windows10");
        emp2.addDevices("Samsumg");
        emp2.addDevices("macbook air");

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);

        List<String> ls = empList.stream().
                map(x -> x.getDevices()).
                flatMap(x -> x.stream()).
                distinct().
                collect(Collectors.toList());

        ls.forEach( x -> System.out.println(x));
    }
}
