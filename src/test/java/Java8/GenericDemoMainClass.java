package Java8;

public class GenericDemoMainClass {

    public static void main(String[] args) {
        GenericsDemo<Integer> gi = new GenericsDemo<Integer>(10);
        GenericsDemo<Double> gi1 = new GenericsDemo<Double>(10.5);
        gi1.show();
    }
}
