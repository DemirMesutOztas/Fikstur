import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int y=0;
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int takimsayisi;
        String takimName;
        int takimid;
        Fikstur f1 = new Fikstur();

        System.out.println("Kaç takım gireceksiniz");
        takimsayisi = scan.nextInt();

        System.out.println("Takımları giriniz");
        for(int i=0;i<takimsayisi;i++)
        {
            System.out.println("Takım ismi");
            takimName=scan.next();
            takimid=i;
            f1.takim.add(takimName);
        }

        if(takimsayisi%2!=0)
        {
            f1.takim.add("Bay");
            takimsayisi++;
        }

        int m = takimsayisi*(takimsayisi-1);
        String []second = new String[m];

        Collections.shuffle(f1.takim);

        String  [] temp = new String[takimsayisi];

        temp[0]=f1.takim.get(0);

        for(int j=1;j<takimsayisi;j++)
        {
            for(int i=1;i<takimsayisi-1;i++)
            {
                if(i==1)
                {
                    temp[i]=f1.takim.get(takimsayisi-1);

                }
                temp[i+1]=f1.takim.get(i);

            }

            for(int k=0; k<takimsayisi;k++)
            {
                f1.takim.add(k,temp[k]);
            }
            System.out.println(j+".hafta");

            for(int l=0;l<takimsayisi/2;l++)
            {
                if(l==(takimsayisi-1)/2)
                {
                    System.out.println(f1.takim.get(0) + " - " + f1.takim.get(takimsayisi/2));
                    second[y++]=f1.takim.get(0);
                    second[y++]=f1.takim.get(takimsayisi/2);
                }
                else
                {
                    System.out.println(f1.takim.get(l+1) + " - " + f1.takim.get(takimsayisi-l-1));
                    second[y++]=f1.takim.get(l+1);
                    second[y++]=f1.takim.get(takimsayisi-l-1);
                }

            }
        }

        int x=takimsayisi;
        int y=0;

        for(int n = 0; n<takimsayisi-1;n++)
        {
            System.out.println(x++ + ". HAFTA");
            for(int i =0; i<takimsayisi/2;i++)
            {

                System.out.println(second[y+1]+" - "+second[y]);
                y=y+2;
            }
        }

    }

}