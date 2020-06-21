package ocrdemo;

public class GFG1 {

    public static int search(int arr[],int x , int len) {
        int i = 0;
        while(i<len) {
            if(arr[i] == x)
                return i;
            i = i + Math.abs(arr[i]-x);
        }
        System.out.println("Element not present");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int x = 89;
        int len = arr.length;
        System.out.println("Element "+ x + " present at index "+ search(arr,x,len));
    }
}
