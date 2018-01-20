import java.util.*;
class Main{
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    char v;
    v=sc.next().charAt(0);
    if(v>='a'&& v<='z'||v>='A'&& v<='Z'){
        System.out.println("Alphabet");
    }
    else{
        System.out.println("Not a Alphabet");
    }
}

}