import java.util.*;
class Index{
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int i,c=0;
    int n=sc.nextInt();
    int s[]=new int[n];
    for(i=0;i<n;i++){
        s[i]=sc.nextInt();
        if(s[i]==i){
            c=1;
            System.out.print(s[i]+" ");
        }
    }
    if(c==0){
        System.out.print("-1");
    }
}

}