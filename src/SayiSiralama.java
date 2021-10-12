import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        a=input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        b=input.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        c=input.nextInt();

        if((a>c) && (b>c)){
            if(a>b){
                System.out.println(c+"<"+b+"<"+a);
            }else{
                System.out.println(c+"<"+a+"<"+b);
            }
        }else if((a>b) && (c>b)){
            if(a>c){
                System.out.println(b+"<"+c+"<"+a);
            }else{
                System.out.println(b+"<"+a+"<"+c);
            }
        }else{
            if(b>c){
                System.out.println(a+"<"+c+"<"+b);
            }else{
                System.out.println(a+"<"+b+"<"+c);
            }
        }
    }
}
