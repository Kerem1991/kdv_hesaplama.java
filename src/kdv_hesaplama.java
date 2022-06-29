import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args){
       double tutar, kdvOran=0.18, kdvTutar, KdvliTutar;
       Scanner input = new Scanner(System.in);
       System.out.println("Ucret Tutarini Giriniz :");
       tutar=input.nextDouble();
        boolean kdv = (0 < tutar) && (1000 > tutar);
        kdvOran = kdv ? 0.18d : 0.08d;
        kdvTutar = tutar * kdvOran;
        KdvliTutar = tutar + kdvTutar;
       System.out.println("Kdv'siz Tutar :" + tutar);
       System.out.println("Kdv Orani :" + kdvOran);
       System.out.println("Kdv Tutari :" + kdvTutar);
       System.out.println("Kdv'li tutar : " + KdvliTutar);






    }
}
