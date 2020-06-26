package Java8_2;

public class MainClass implements InterfaceEx,Interface1 {

    public static void main(String[] args) {
        MainClass mc = new MainClass();
        mc.test();
        mc.show();
        InterfaceEx.display();
    }

    @Override
    public void test() {
        System.out.println("Test check");
    }

    @Override
    public void show() {

    }

    @Override
    public void test1() {

    }
}
