import java.util.Scanner;


        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {


                System.out.println("Introdu un numar de la 0 pana la 3 ");
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                if (i == 0) System.out.println("Exit");
                else if (i == 1) System.out.println("Hello!");
                else if (i == 2) System.out.println("Bay!");
                else if (i == 3) System.out.println("Good!");
                else System.out.println("Ai gresit numarul!");

                System.out.println("Introdu un numar de la 0 pana la 3 ");
                int j = sc.nextInt();
                switch (j) {
                    case 0 -> System.out.println("Exit");
                    case 1 -> System.out.println("Hello!");
                    case 2 -> System.out.println("Bay!");
                    case 3 -> System.out.println("Good!");
                    default -> System.out.println("Ai gresit numarul!");
                }
            }
        }
    

