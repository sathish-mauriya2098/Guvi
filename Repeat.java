import java.util.*;
class Repeat{
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int i,j,k,c=0;
    int n=sc.nextInt();
    int s[]=new int[n];
    for(k=0;k<n;k++){
        s[k]=sc.nextInt();
    }
    Arrays.sort(s);
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(s[i]==s[j]){
                c=1;
                System.out.print(s[j]+" ");
            }
            
        }
    }
    if(c==0){
        System.out.print("Unique");
    }  
}
}
