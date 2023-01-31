import java.util.HashMap;
import java.util.Map;

public class Task2_1 implements ITask {

    @Override
    public void Execute() {
        /*
         * Дана строка sql-запроса "select * from students where ". Сформируйте часть
         * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
         * ниже в виде json строки.
         * Если значение null, то параметр не должен попадать в запрос.
         * Результат "select * from students where “name” = “Ivanov” and
         * “country”=”Russia” …
         */

        String res = "select * from students where ";

        HashMap<String, String> parms = new HashMap<String, String>();
        parms.put("name", "Ivanov");
        parms.put("country", "Russia");
        parms.put("city", "Moscow");
        parms.put("age", null);

        System.out.println(res + getQueryString(parms));

    }

    private static String getQueryString(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                sb.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        // Удаляем последний and.
        sb.delete(sb.toString().length() - 5, sb.toString().length());
        return sb.toString();
    }
}
