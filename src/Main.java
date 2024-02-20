import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        int a,b,c,u,cevresi;
        double alan;

        Scanner input=new Scanner(System.in);

        System.out.println("1. Kenar uzunluğunu giriniz" );
        a=input.nextInt();

        System.out.println("2. Kenar uzunluğunu giriniz" );
        b=input.nextInt();

        System.out.println("3. Kenar uzunluğunu giriniz" );
        c=input.nextInt();

        u=(a+b+c)/2;
        cevresi=2*u;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Çevresi: "+ cevresi);
        System.out.println("Üçgenin alanı: "+ alan);



    }
}