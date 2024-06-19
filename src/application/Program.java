package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double totalTaxes = 0;
        System.out.println("Enter the number of tax payer: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c)? ");
            char valida = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(valida == 'c'|| valida == 'C') {
                System.out.println("Number of employee: ");
                int numberOfEmployee = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployee));

            }else if( valida == 'i' || valida == 'I'){

                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }

        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for( TaxPayer t : list){
            System.out.println(t);

            totalTaxes += t.tax();
        }



        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));

    }

}
