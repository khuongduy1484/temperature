import  java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ckeck;
        double fahrenheit;
        double celsius;

        do {
            System.out.println("MENNU");
            System.out.println("1. Fahrenheit to Celrius");
            System.out.println("2. Celrius to Fahrenheit");
            System.out.println("0 . Exit");
            System.out.println("Enter check");
            ckeck = scanner.nextInt();
            switch (ckeck){
                case 1:
                    System.out.println("Enter fahrenheit");
                    fahrenheit =scanner.nextDouble();
                    System.out.println("Celrius is :" + fahrenheittocelrius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter clerius");
                    celsius =scanner.nextDouble();
                    System.out.println("Fahrenheit is :" +celriustofahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }

        }while (ckeck!=0);

    }
    public static double fahrenheittocelrius(double fahrenheit){
        double celrius = (5.0 / 9) * (fahrenheit - 32);
        return celrius;
    }
    public static double celriustofahrenheit(double celrius) {
        double fahrenheit = ((5.0 / 9) / celrius) + 32;
        return fahrenheit;
    }




}