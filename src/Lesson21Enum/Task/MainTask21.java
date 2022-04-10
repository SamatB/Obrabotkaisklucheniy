package Lesson21Enum.Task;

public class MainTask21 {
    public static void main(String[] args) {
        WeekDays weekDays = WeekDays.MONDAY;
        switch (weekDays) {
            case MONDAY -> System.out.println("Дуйшомбу куну жава окуйм.");
            case TUESDAY -> System.out.println("Шейшемби куну англис тили сабагын окуйм.");
            case WEDNESDAY -> System.out.println("Шаршемби куну жава окуйм.");
            case THURSDAY -> System.out.println("Бейшенби куну практикалык сабагын окуйм.");
            case FRIDAY -> System.out.println("Жума куну жава окуйм.");
            case SATURDAY -> System.out.println("Ишемби куну практикалык сабагын окуйм.");
            case SUNDAY -> System.out.println("Жекшемби куну англис тили сабагын окуйм.");
            default -> System.out.println("Жуманын кундорун туура жазыныз!");

        }
    }
}
