import java.util.Scanner;

public class ArgsMain {
    public static void main(String[] args) {
     //   try {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
            Args arg = new Args("d,p#,h*", args);

        boolean detach = arg.getBoolean("d");

    }

    private static void executeApplication(boolean detach, int port, String hero) {
        System.out.printf("detach is %s, port: %d, hero: %s\n",detach, port, hero);
    }
}