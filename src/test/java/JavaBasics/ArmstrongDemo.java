package JavaBasics;

public class ArmstrongDemo {
 public static boolean AmsChk(int num) {
     int ams = 0;
     int temp = num;
     while(num!= 0) {
         int rem = num%10;
         ams = ams + (rem*rem*rem);
         num = num/10;
     }
     if(temp == ams) {
         return true;
     } else {
         return false;
     }
 }

    public static void main(String[] args) {
        System.out.println(AmsChk(153));
    }
}
