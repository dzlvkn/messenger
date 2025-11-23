public class Channel {
    private String name;
    private Message[] messages; //изменю потом на тип message, когда такой класс создашь

    public Channel(String name, Message[] messages) {
        this.name = name;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void printMessages() {
        System.out.println(name + ":");
        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i].toString());
        }
    }

    public static Channel[] getAll() {
        User kosti = new User("KOSTI");
        User topor = new User("Топор+");
        User vogue = new User("Vogue is my religion");
        User kk = new User("KK");

        Message[] kostiMessages = {
                new Message(kosti, kosti, "Сегодня отмечается День эспрессо", "8:00"),
                new Message(kosti, kosti, "Фанаты Хейли и Джастина устали терпеть негативное отношение к их паре со стороны фанатов Селены", "9:23"),
                new Message(kosti, kosti, "В Новосибирске автомобиль пробил двери вестибюля метро", "15:40"),
                new Message(kosti, kosti, "Вакцина против рака легких впервые будет испытана на людях в 2026 году", "16:34"),
                new Message(kosti, kosti, "В Москве 22-летняя девушка оказалась у врачей после ежедневных «марафонов» из пяти кружек матчи", "22:15")
        };

        Message[] toporMessages = {
                new Message(topor, topor, "2 тысячи человек собрались в Нью-Йорке чтобы вместе...покурить сигареты.", "07:30"),
                new Message(topor, topor, "Полицейский застрелил агрессивного алабая, который бросался на местных жителей — теперь мужчину хотят посадить в тюрьму.", "08:45"),
                new Message(topor, topor, "От матчи желтеет кожа и отказывает печень — врачи рассказали ещё о нескольких побочках популярного напитка.", "10:10"),
                new Message(topor, topor, "Спрайт с водкой Absolut завезли в российские магазины — есть даже вариант с арбузным вкусом.", "11:55")
        };

        Message[] vogueMessages = {
                new Message(vogue, vogue, "Хейли Бибер, как обычно, начала праздновать свой день рождения за несколько дней до. Первый образ для вечеринки — Versace из весенне-летней коллекции 2002 года.", "09:00"),
                new Message(vogue, vogue, "Вайнона Райдер на обложке и в кавер-стори Interview Magazine.", "10:20"),
                new Message(vogue, vogue, "Какая чудесная коллаборация случилась у Dries Van Noten с гонконгской художницей Мэй Сум: вместе они создали серию скульптурных помад.", "11:30"),
                new Message(vogue, vogue, "Лили Коллинз — героиня обложки декабрьского выпуска Elle España.", "12:40"),
                new Message(vogue, vogue, "Герцогиня Меган Маркл для свежего выпуска американского Harper's Bazaar.", "13:15")
        };

        Message[] kkMessages = {
                new Message(kk, kk, "Количество книжных магазинов в России сократилось более чем на 11% за два года", "08:20"),
                new Message(kk, kk, "В России предлагают полностью запретить скидки на маркетплейсах — инициативу в Госдуму направили руководители крупнейших банков", "09:40"),
                new Message(kk, kk, "Трек Ивана Золо «Баобаб» взлетел на первое место в мировом чарте Genius", "11:00"),
                new Message(kk, kk, "Этой ночью в Таиланде прошёл конкурс «Мисс Вселенная», и титул победительницы завоевала мексиканка Фатима Бош Фернандес", "14:30")
        };

        Channel[] channels = new Channel[4];
        channels[0] = new Channel("KOSTI", kostiMessages);
        channels[1] = new Channel("Топор+", toporMessages);
        channels[2] = new Channel("Vogue is my religion", vogueMessages);
        channels[3] = new Channel("KK", kkMessages);

        return channels;
    }
}
