import java.util.Random;

public class MagicBox<T> {
    protected int maxItem; //максимальное число объектов в боксе
    protected T[] items; // сам бокс

    // конструктор
    public MagicBox(int maxItem) {
        this.maxItem = maxItem;
        this.items = (T[]) new Object[maxItem];
    }

    // метод вывода объектов коробки
    public void getItems() {
        for (T item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    // метод проверки заполненности коробки
    public boolean isFull() {
        for (int i = 0; i < maxItem; i++) {
            if (items[i] == null) {
                return false;
            }
        }
        return true;
    }

    // У вас должен быть метод добавления объекта boolean add(T item).
    // Если коробка ещё не полна, то элемент должен в ней сохраниться и метод вернуть true.
    // Если полна, то коробка не должна измениться, а метод должен вернуть false.
    public boolean add(T item) {
        for (int i = 0; i < maxItem; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println(String.format("Объект %s добавлен в коробку", item));
                return true;
            }
        }
        System.out.println(String.format("Объект %s не может быть добавлен в коробку, т.к. она заполнена", item));
        return false;
    }

    // Также нужно реализовать метод T pick(), работающий следующим образом:
    // Если коробка не полна, то он выкидывает RuntimeException с сообщением,
    // что коробка не полна и осталось ещё столько-то ячеек заполнить
    // Если коробка полна, то метод выбирает случайным образом (см. ниже) один из сохранённых элементов
    // и возвращает его из метода.

    public T pick() {
        if (isFull()) {
            Random random = new Random();
            int randomInt = random.nextInt(maxItem - 1);//рандомное число от 0 до maxItem-1
            System.out.println(String.format("Рандомное число: %s", randomInt));
            System.out.println(String.format("в коробке с этим индексом лежит значение: %s", items[randomInt]));
            return items[randomInt];
        } else {
            int count = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null) {
                    count += 1;
                }
            }
            System.out.println(String.format("Коробка не полна, нужно заполнить еще %s ячеек", items.length - count));
        }
        return null;
    }
}
