import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int ans=0;
        switch(c) {
            case 1:
                ans=a+b;
                break;
            case 2:
                ans=a-b;
                break;
            case 3:
                ans=a/b;
                break;
            case 4:
                ans=a+*b;
                break;
            default:
                System.out.println("Error");
                return;
        }

        System.out.println("Ans : "+ans);
    }
}