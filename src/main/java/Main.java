import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Channel[] channels = Channel.getAll();
        Dialog[] dialogs = {
                Dialog.getChatWithMom(),
                Dialog.getChatWithSister(),
                Dialog.getChatWithFriend1(),
                Dialog.getChatWithFriend2()
        };

 anasClass
        System.out.println("Выберите канал или группу, введя их порядковый номер");

        System.out.println("MESSANGER" + "\n");

        System.out.println("Каналы:");
 master

        for (int i = 0; i < channels.length; i++) {
            System.out.println((i + 1) + ") " + channels[i].getName());
        }

 anasClass

        System.out.println("\n" + "Беседы:");

 master
        for (int i = 0; i < dialogs.length; i++) {
            System.out.println((i+5) + ") " + dialogs[i].getChatName());
        }

        int choice = sc.nextInt();
 anasClass

        if (0 < choice && choice < 5) {
            channels[choice - 1].printMessages();
        } else {
            Dialog selectedDialog = dialogs[choice - 5];
            System.out.println(selectedDialog);
        }

 master

        if (0 < choice && choice < 5) {
            channels[choice - 1].printMessages();
        } else {
            Dialog selectedDialog = dialogs[choice - 5];
            System.out.println(selectedDialog);
        }
    }
}
