package ocrdemo;

public class Dummy2 extends Dummy1 {

    public void foo() {
        System.out.println("I am Dummy2");
    }

    public static void main(String[] args) {
        Dummy1 d1 = new Dummy2();
        d1.foo();

        int a = 10,b=10;
        System.out.println(a--);
        System.out.println(--b);

    }
}
