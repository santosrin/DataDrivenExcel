package ocrdemo;

public class Demo7 {

    static int i;
    public Demo7() {
        i++;
    }

    public static void main(String[] args) {
        Demo7 obj1 = new Demo7();
        Demo7 obj2 = new Demo7();
        Demo7 obj3 = new Demo7();
        System.out.println(i);
    }
}
