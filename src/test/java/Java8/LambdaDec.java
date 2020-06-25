package Java8;

public class LambdaDec {

    public static void main(String[] args) {
        WebPage w1 = (name,age) -> System.out.println("hii "+ name + " " + age);
        w1.header("google",20);
    }
}
