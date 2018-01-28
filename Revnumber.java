import java.util.*;
class Main{
public static void main (String[] args) {
    int value,i=0;
        Scanner s=new Scanner(System.in);
        value=s.nextInt();
        while(value>0)
        {
        i= i*10;
          i=value%10;
          value=value/10;
        System.out.print(i);
        }
}

}