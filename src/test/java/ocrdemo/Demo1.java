package ocrdemo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo1 {

    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj); // o/p => packageName.ClassName@ObjectAddressOfHeapMemory
    }
}

class A // by default every class extends Object class if not extending any other class
{

}
