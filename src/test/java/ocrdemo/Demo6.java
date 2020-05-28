package ocrdemo;

public class Demo6 {

    public static void main(String[] args) {

        String text = "vishytom";
        String pattern = "shy1";

        int count = 0;

        int tlen = text.length();
        int plen = pattern.length();
        char c,p;

        for(int i=0;i<=tlen-plen;i++) {
            c = text.charAt(i);
            p = pattern.charAt(0);

            if(c==p){

                for(int j = i,k=0;j<i+plen;j++,k++) {
                    c = text.charAt(j);
                    p = pattern.charAt(k);

                    if (c == p) {
                        count++;
                    }
                }
            }
        }

        if(count == plen) {
            System.out.println("Pattern found");
        }else {
            System.out.println("Pattern not found");
        }
    }
}
