import java.util.*;
class Main{
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    char v;
    v=sc.next().charAt(0);
    if(v=='a'||v=='e'||v=='i'||v=='o'||v=='o'){
        System.out.println("Vowel");
    }
    else{
        System.out.println("Not a Vowel");
    }
}

}