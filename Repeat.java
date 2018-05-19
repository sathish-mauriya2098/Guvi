import java.util.*;
class Repeat{
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int i,j,c=0;
    char a[]=s.toCharArray();
    Arrays.sort(a);
    String s1=new String(a);
    char b[]=s1.toCharArray();
    for(i=0;i<s1.length();i++){
        for(j=i+1;j<s1.length();j++){
            if(b[i]==b[j]){
                c++;
                System.out.print(b[j]+" ");
                break;
            }
        }
    }
}

}