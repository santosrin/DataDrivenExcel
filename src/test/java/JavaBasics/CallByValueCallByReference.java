package JavaBasics;

public class CallByValueCallByReference {

    int p;
    int q;

    public static void main(String[] args) {
        CallByValueCallByReference cb = new CallByValueCallByReference();
        System.out.println(cb.testSum(10,20)); // call by value
        cb.p = 50;
        cb.q = 60;

        cb.swap(cb);
        System.out.println(cb.p + " " + cb.q);
    }

    public int testSum(int a , int b) {
    int c = a+b;
    return c;
    }

    public void swap(CallByValueCallByReference t){
        int temp;
        temp = t.p;
        t.p = t.q;
        t.q = temp;
    }
}
