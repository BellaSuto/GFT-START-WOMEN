package questao03;

import java.util.Scanner;

public class Doenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o numero que corresponde ao seu sintoma:");
        System.out.println("-1- Febre\n" +
                           "-2- Dor de cabeça\n" +
                           "-3- Tosse\n");

        int Sintoma = scan.nextInt();
        System.out.println("Possiveis doenças: ");
         switch (Sintoma){
             case 1:
                 System.out.println("Pneumonia,\n" +
                         " Gripe,\n" +
                         "COVID-19");
                 break;
             case 2:
                 System.out.println("Aneurisma,\n" +
                         " Sinusite,\n" +
                         "Meningite");
                 break;
             case 3:
                 System.out.println("Resfriado\n" +
                         " Alergia,\n" +
                         "Tuberculose");
                 break;
         }


    }
}
