import java.util.HashMap;

public class Task5_1 implements ITask {

    public void Execute() {
        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
        // человек может иметь несколько телефонов.
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();

        // Сделал класс Person для хранения значений. Вывод для простоты сделан через
        // переопределение метода toString().
        Person firstPerson = new Person("Виктор Попов", new String[] { "+7911111111" }, "Друг");
        Person secondPerson = new Person("Дмитрий Кузнецов", new String[] { "+7811231111", "+7923165723" }, null);
        Person thirdPerson = new Person("Анна Иванова", new String[] { "+7364346111", "+712312312", "8812555555" },
                "Однокурсница");

        map.putIfAbsent(0, firstPerson);
        map.put(1, secondPerson);
        map.put(2, thirdPerson);

        System.out.println("Полный вывод:\n" + map.toString());

        System.out.println("\nОтдельно ключи:\n" + map.keySet());

        System.out.println("\nОтдельно значения:\n" + map.values());

    }

    class Person {
        String _name;
        String _phoneNumber = "";
        String _comment = "";

        public Person(String name, String[] phoneNumber, String comment) {
            _name = name;

            if (comment != null)
                _comment = comment;

            if (phoneNumber != null) {
                for (int i = 0; i < phoneNumber.length; i++) {

                    // если номер последний, запятая не нужна. Тернарная операция.
                    _phoneNumber = i == phoneNumber.length - 1 ? _phoneNumber + phoneNumber[i]
                            : _phoneNumber + phoneNumber[i] + ", ";
                }
            }

        }

        @Override
        public String toString() {
            if (_comment != null)
                return _name + " Телефон: " + _phoneNumber + " " + _comment;
            return _name + " Телефон: " + _phoneNumber;
        }
    }
}
