import java.util.Scanner;
public class main {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

double boy, kg, vke;

System.out.print("Boyunuzu Giriniz :");
boy = in.nextDouble();

System.out.print("Kilonuzu Giriniz :");
kg = in.nextDouble();

vke = kg / (boy * boy);

System.out.print("Vücut Kitle Endeksiniz :"+vke);




    }
}
