import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Channel[] channels = Channel.getAll();

        System.out.println("Выберите канал или группу, введя их порядковый номер");

        for (int i = 0; i < channels.length; i++) {
            System.out.println((i + 1) + ") " + channels[i].getName());
        }

        int choice = sc.nextInt();

        channels[choice - 1].printMessages();

    }
}
