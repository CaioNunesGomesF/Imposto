package entities;

public class Company extends TaxPayer{

    public int numberOfEmployees;



    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if(numberOfEmployees > 10){
            return getAnualIncome() * 14 / 100;
        }else{
            return getAnualIncome()* 16 / 100;

        }
    }

}
