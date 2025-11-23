public class Dialog {

    private String chatName;
    private Message[] messages;

    public Dialog(String chatName, Message[] messages) {

        this.chatName = chatName;
        this.messages = messages;

    }

    public String getChatName() {
        return chatName;
    }

    public Message[] getMessage() {
        return messages;
    }

    public String toString() {

        String result =  "Чат с " + chatName + "\n" + "\n";
        for (int i = 0; i < messages.length; ++i) {
            result += messages[i].toString() + "\n";
        }

        return result;
    }

    public static Dialog getChatWithMom() {
        return new Dialog("Мамочка", Message.getMsgWithMom());
    }

    public static Dialog getChatWithSister() {
        return new Dialog("Систр", Message.getMsgWithSister());
    }

    public static Dialog getChatWithFriend1() {
        return new Dialog("Сашулик", Message.getMsgWithFriend1());
    }

    public static Dialog getChatWithFriend2() {
        return new Dialog("Дашулик", Message.getMsgWithFriend2());
    }

}
