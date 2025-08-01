import java.util.Scanner;

public class patternprinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            printMenu();
            System.out.print("Enter your choice (1-10, 0 to Exit): ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for using Pattern Printer. Goodbye!");
                break;
            }

            if (choice < 0 || choice > 11) {
                System.out.println("Please enter a valid option.");
                continue;
            }

            if (choice == 11) {
                continueprogram();
                System.out.println("\n-----------------------------\n");
                continue;
            }

            System.out.print("Enter the size : ");
            int n = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1: solidRectangle(n); break;
                case 2: hollowRectangle(n); break;
                case 3: rightTriangle(n); break;
                case 4: leftTriangle(n); break;
                case 5: invertedRightTriangle(n); break;
                case 6: numberTriangle(n); break;
                case 7: pyramid(n); break;
                case 8: invertedPyramid(n); break;
                case 9: diamondPattern(n); break;
                case 10: pascalsTriangle(n); break;
                default: break;
            }
            System.out.println("\n-----------------------------\n");
        }
        sc.close();
    }

    static void printMenu() {
        System.out.println("=== Pattern Printer ===");
        System.out.println("1. Solid Rectangle");
        System.out.println("2. Hollow Rectangle");
        System.out.println("3. Right Triangle");
        System.out.println("4. Left Triangle");
        System.out.println("5. Inverted Right Triangle");
        System.out.println("6. Number Triangle");
        System.out.println("7. Pyramid");
        System.out.println("8. Inverted Pyramid");
        System.out.println("9. Diamond Pattern");
        System.out.println("10. Pascal's Triangle");
        System.out.println("11. continue the program--");
        
        System.out.println("0. Exit");
    }

    static void solidRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollowRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void leftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void invertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void invertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j < n - i; j++)
                System.out.print("  ");
            for (int k = 0; k <= i; k++) {
                System.out.print(number + "   ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
     static void continueprogram() {
        System.out.println("\n=== Continue This Project ===");
    }
}


