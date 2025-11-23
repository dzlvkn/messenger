public class Message {

    private User sender;
    private User recipient;
    private String text;
    private String time;

    public Message(User sender, User recipient, String text, String time) {

        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.time = time;

    }

    public User getSender() { return sender; }

    public User getRecipient() { return recipient; }

    public String getText() { return text; }

    public String getTime() { return time; }


    public String toString() {
        String result = "От кого: " + sender + "\n" + "Кому: " + recipient + "\n" + "Сообщение: " + text + " (" + time + ")" + "\n";
        return result;
    }

    public static User mom = new User("Мама");
    public static User mainUser = new User("Динара");
    public static User friend1 = new User("Саша");
    public static User sister = new User("Рина");
    public static User friend2 = new User("Даша");

    public static Message[] getMsgWithMom() {
        Message[] msgWithMom = {
                new Message(mom, mainUser, "Привет!", "17:20"),
                new Message(mom, mainUser, "У тебя пары закончились? Когда домой?", "17:21"),
                new Message(mainUser, mom, "Привет, уже еду домой", "17:30"),
                new Message(mom, mainUser, "Хорошо", "17:30"),
                new Message(mom, mainUser, "Ещё зайди, пожалуйста, в магазин и купи хлеб с молоком", "17:31"),
        };

        return msgWithMom;
    }

    public static Message[] getMsgWithSister() {
        Message[] msgWithSister = {
                new Message(mainUser, sister, "Где мой планшет? Ты взяла?!!", "10:00"),
                new Message(mainUser, sister, "Быстро неси ко мне, мне уже выходить пора!!!", "10:01"),
                new Message(sister, mainUser, "Ща, 5 сек", "10:01")
        };

        return msgWithSister;
    }

    public static Message[] getMsgWithFriend1() {
        Message[] msgWithFriend1 = {
                new Message(friend1, mainUser, "Ты где? У нас уже платное ожидание началось!", "09:57"),
                new Message(mainUser, friend1, "5 минут и вылетаю!", "09:58"),
                new Message(friend1, mainUser, "Давай быстрее!!", "09:59"),
                new Message(mainUser, friend1, "Уже бегу", "10:05")
        };

        return msgWithFriend1;
    }

    public static Message[] getMsgWithFriend2() {
        Message[] msgWithFriend2 = {
                new Message(mainUser, friend2, "Мы за тобой заедем, я напишу когда выходить", "10:25"),
                new Message(friend2, mainUser, "Оке", "10:25"),
                new Message(mainUser, friend2, "Можешь выходить", "10:37"),
                new Message(friend2, mainUser, "Бегу", "10:37")
        };

        return msgWithFriend2;
    }


}
