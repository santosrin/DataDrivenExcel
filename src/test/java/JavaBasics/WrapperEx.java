package JavaBasics;

public class WrapperEx {

    public static void main(String[] args) {
        String x = "100";
        System.out.println(x+20);

        //String to integer use parse int - data conversion
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        String y = "12.33";
        System.out.println(Double.parseDouble(y)+1.2);

        String k = "true";
        System.out.println(Boolean.parseBoolean(k));

        //integer to string conversion
        int j = 200;
        System.out.println(j+20);
        String s = String.valueOf(j);
        System.out.println(s+20);



    }
}
