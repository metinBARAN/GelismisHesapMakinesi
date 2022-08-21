import java.util.Scanner;

public class Main {
    static int collection(int a,int b){
        int result =(a+b);
        System.out.println("Toplama: "+result);
        return result;
    }
    static int extraction(int a,int b){
        int result=(a-b);
        System.out.println("Cikarma: "+result);
        return result;
    }
    static int multiplation(int a,int b){
        int result=(a*b);
        System.out.println("Carpma: "+result);
        return result;
    }
    static int division(int a,int b){
        int result=(a/b);
        System.out.println("Bolme: "+result);
        return result;
    }
    static int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result *=a;

        }
        return result;
    }
    static int mod(int a,int b){
        int result=(a%b);
        System.out.println("Mod: "+result);
        return result;
    }
    static int varyansCalculation(int a,int b){
        int result=(2*(a+b))+(a*b);
        System.out.println("Cevresi: "+(2*(a+b)));
        System.out.println("Alan: "+(a*b));
        return result;
    }


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int select;

        String menu="1-Toplama Islemi\n"
                 +"2-Cikarma Islemi\n"
                 +"3-Carpma Islemi\n"
                 +"4-Bolme Islemi\n"
                 +"5-Uslu Sayi Hesaplama\n"
                 +"6-Mod Alma\n"
                 +"7-Dikdortgen Alan Ve Cevre Hesabi\n"
                 +"0-Cikis";
       while (true){


        System.out.println(menu);
        System.out.println("Bir Islem Seciniz: ");
        select=input.nextInt();
        if (select==0){
            break;
        }
        System.out.println("Birinci Sayi: ");
        int a=input.nextInt();
        System.out.println("Ikinci Sayi: ");
        int b=input.nextInt();

        switch (select){
            case 1:
                collection(a,b);
                  break;
            case 2:
                extraction(a,b);
                break;
            case 3:
                multiplation(a,b);
                break;
            case 4:
                division(a,b);
                break;
            case 5:
                power(a,b);
                System.out.println("Us Hesabi: "+power(a,b));
                break;
            case 6:
                mod(a,b);
                break;
            case 7:
                varyansCalculation(a,b);
                break;
            default:
                System.out.println("Gecersiz Bir İslem Gİrdiniz");

        }
       }
        System.out.println("Gule gule");

    }
}
