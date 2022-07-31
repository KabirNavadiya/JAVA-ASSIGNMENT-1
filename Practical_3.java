import java.util.*;
public class Practical_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test case: ");
        int t=sc.nextInt();
        int n1,n2;
        for(int i=0;i<t;i++)
        {
            n1=sc.nextInt();
            n2=sc.nextInt();

            if(n1%10 == n2%10)
            {
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        System.out.println('\n');
        System.out.println("21CE080_KABIR NAVADIYA");
    }
}
