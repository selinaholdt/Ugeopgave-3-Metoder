public class Main {
//Ugeopgave: Metoder
    //Opgave 1: Bank-konto
    double balance = 0;
    String accountName = "";

    void deposit100(){
        balance += 100;
    }
    void withdraw50(){
        balance -= 50;
    }
    void printBalance(){
        System.out.println( accountName + "s balance: " + balance + " kr");
    }

    //Opgave 2: Karakter-beregner
    int assignmentPoints = 0;
    int examPoints = 0;
    int projectPoints = 0;

    void addAssignmentsPoints(int points){
        assignmentPoints += points;
    }
    void addExamPoints(int points){
        examPoints += points;
    }
    void addProjectPoints(int points){
        projectPoints += points;
    }
    void printTotal(){
        System.out.println("Total assignment points: " + assignmentPoints);
        System.out.println("Total exam points: " + examPoints);
        System.out.println("Total project points: " + projectPoints);

    }

    //Opgave 3: Pris-beregner

    double applyDiscount(double price, double discountPercent){
        return price - (price * discountPercent / 100);
    }
    double addTax(double price){
        return price * 1.25;
    }
    double calculateFinalPrice(double basePrice, double discount){
        double priceAfterDiscount= applyDiscount(basePrice , discount);
        double fianlPrice = addTax(priceAfterDiscount);
        return fianlPrice;
    }

    //Opgave 4: Statistik-beregner
    double calculateAverage(int[] numbers){
        int sum = 0;
        int count = 0;
        for (int number : numbers){
            sum += number;
            count++;
        }
        double average = (double) sum / count;
        return average;
    }
    int findMax(int[] numbers){
        int max = numbers[0];
        for (int number : numbers){
            if (max < number){
                max = number;
            }
        }
        return max;
    }
    int findMin(int[] numbers){
        int min = numbers[0];
        for (int number : numbers){
            if (min > number){
                min = number;
            }
        }
        return min;
    }
    int countAboveAverage(int[] numbers){
        double average = calculateAverage(numbers);
        int aboveAverage = 0;
        for (int number : numbers){
            if (number > average){
                aboveAverage++;
            }
        }
        return aboveAverage;
    }




    void main(){
        //Opgave 1: Bank-konto
        accountName = "Selina";
        deposit100();
        deposit100();
        withdraw50();
        printBalance();

        //Opgave 2: Karakter-beregner
        addAssignmentsPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();

        //Opgave 3: Pris-beregner
        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Slutpris: " + finalPrice + " kr");

        //Opgave 4: Statistik-beregner
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        System.out.println("Gennemsnit: " + calculateAverage(numbers));
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " +findMin(numbers));
        System.out.println("Numbers above average: " +countAboveAverage(numbers));



    }

}
