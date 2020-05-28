package ocrdemo;


class A4 {
    static int i =100;

    static {
        i = i-- - --i;
        System.out.println("First "+ i);
    }
    {
        i = i++ + ++i;
        System.out.println("Second "+ i);
    }
        }

class B4 extends A4 {
    static {
        i = --i - i--;
        System.out.println("Third "+ i);
    }
    {
        i = ++i + i++;
        System.out.println("Fourth "+ i);
    }
}

public class DBDemo2 {

    public static void main(String[] args) {
        B4 b4 = new B4();
        System.out.println(b4.i);


    }


    }

