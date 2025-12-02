import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    str =str.toLowerCase();
    boolean vowel=false;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowel=true;
            break;
        }
    }
    if(vowel){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}
}
