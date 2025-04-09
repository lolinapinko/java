import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TourManager {
    private List<Tour> tours = new ArrayList<>();

    // Метод для добавления путевки
    public void addTour(Tour tour) {
        tours.add(tour);
        System.out.println("Путевка успешно добавлена!");
    }

    // Метод для вывода всех путевок
    public void printAllTours() {
        if (tours.isEmpty()) {
            System.out.println("Список путевок пуст.");
            return;
        }

        System.out.println("\n=== Список всех путевок ===");
        for (int i = 0; i < tours.size(); i++) {
            System.out.println((i + 1) + ". " + tours.get(i));
            System.out.println("--------------------------");
        }
    }

    // Методы сортировки
    public void sortByPrice() {
        Collections.sort(tours, Comparator.comparingDouble(Tour::getPrice));
    }

    public void sortByPriceDesc() {
        Collections.sort(tours, Comparator.comparingDouble(Tour::getPrice).reversed());
    }

    public void sortByCheckInDate() {
        Collections.sort(tours, Comparator.comparing(Tour::getCheckInDate));
    }

    public void sortByCheckInDateDesc() {
        Collections.sort(tours, Comparator.comparing(Tour::getCheckInDate).reversed());
    }

    public void sortByClientName() {
        Collections.sort(tours, Comparator.comparing(Tour::getClientName));
    }

    public void sortByResortName() {
        Collections.sort(tours, Comparator.comparing(Tour::getResortName));
    }

    public void sortByResortNameDesc() {
        Collections.sort(tours, Comparator.comparing(Tour::getResortName).reversed());
    }

    public void sortByResortThenDate() {
        Collections.sort(tours, Comparator
                .comparing(Tour::getResortName)
                .thenComparing(Tour::getCheckInDate));
    }

    // Методы для добавления разных типов путевок
    private void addInternationalTour(Scanner scanner) {
        System.out.println("\nДобавление зарубежной путевки:");
        Tour baseTour = createBaseTour(scanner);

        System.out.print("Номер загранпаспорта: ");
        String passport = scanner.nextLine();

        System.out.print("Есть страховка (да/нет): ");
        boolean insurance = scanner.nextLine().equalsIgnoreCase("да");

        InternationalTour tour = new InternationalTour(
                baseTour.getCode(), baseTour.getClientName(), baseTour.getResortName(),
                baseTour.getRoomNumber(), baseTour.getAccommodationType(),
                baseTour.getCheckInDate(), baseTour.getCheckOutDate(),
                baseTour.getNumberOfPeople(), baseTour.getPrice(),
                passport, insurance);

        addTour(tour);
    }

    private void addSanatoriumTour(Scanner scanner) {
        System.out.println("\nДобавление путевки в санаторий:");
        Tour baseTour = createBaseTour(scanner);

        System.out.print("Номер мед. полиса: ");
        String policy = scanner.nextLine();

        System.out.print("Диагноз: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Направление: ");
        String direction = scanner.nextLine();

        SanatoriumTour tour = new SanatoriumTour(
                baseTour.getCode(), baseTour.getClientName(), baseTour.getResortName(),
                baseTour.getRoomNumber(), baseTour.getAccommodationType(),
                baseTour.getCheckInDate(), baseTour.getCheckOutDate(),
                baseTour.getNumberOfPeople(), baseTour.getPrice(),
                policy, diagnosis, direction);

        addTour(tour);
    }

    private void addChildrenTour(Scanner scanner) {
        System.out.println("\nДобавление детской оздоровительной путевки:");
        Tour baseTour = createBaseTour(scanner);

        System.out.print("Возраст ребенка: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Номер свидетельства о рождении: ");
        String certificate = scanner.nextLine();

        System.out.print("Пол ребенка: ");
        String gender = scanner.nextLine();

        ChildrenTour tour = new ChildrenTour(
                baseTour.getCode(), baseTour.getClientName(), baseTour.getResortName(),
                baseTour.getRoomNumber(), baseTour.getAccommodationType(),
                baseTour.getCheckInDate(), baseTour.getCheckOutDate(),
                baseTour.getNumberOfPeople(), baseTour.getPrice(),
                age, certificate, gender);

        addTour(tour);
    }

    // Создание базовой путевки (общие данные)
    private Tour createBaseTour(Scanner scanner) {
        System.out.print("Код путевки: ");
        String code = scanner.nextLine();

        System.out.print("Фамилия клиента: ");
        String name = scanner.nextLine();

        System.out.print("Название пансионата: ");
        String resort = scanner.nextLine();

        System.out.print("Номер комнаты: ");
        String room = scanner.nextLine();

        System.out.print("Вид жилья: ");
        String type = scanner.nextLine();

        System.out.print("Дата заезда (гггг-мм-дд): ");
        LocalDate checkIn = LocalDate.parse(scanner.nextLine());

        System.out.print("Дата выезда (гггг-мм-дд): ");
        LocalDate checkOut = LocalDate.parse(scanner.nextLine());

        System.out.print("Количество человек: ");
        int people = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Цена: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        return new Tour(code, name, resort, room, type, checkIn, checkOut, people, price);
    }

    // Основное меню
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Меню управления путевками ===");
            System.out.println("1. Добавить зарубежную путевку");
            System.out.println("2. Добавить путевку в санаторий");
            System.out.println("3. Добавить детскую оздоровительную путевку");
            System.out.println("4. Показать все путевки");
            System.out.println("=== Сортировка ===");
            System.out.println("5. По цене (возрастание)");
            System.out.println("6. По цене (убывание)");
            System.out.println("7. По дате заезда (возрастание)");
            System.out.println("8. По дате заезда (убывание)");
            System.out.println("9. По фамилии клиента");
            System.out.println("10. По названию пансионата (А-Я)");
            System.out.println("11. По названию пансионата (Я-А)");
            System.out.println("12. По пансионату и дате заезда");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (choice) {
                case 1:
                    addInternationalTour(scanner);
                    break;
                case 2:
                    addSanatoriumTour(scanner);
                    break;
                case 3:
                    addChildrenTour(scanner);
                    break;
                case 4:
                    printAllTours();
                    break;
                case 5:
                    sortByPrice();
                    System.out.println("Путевки отсортированы по цене (возрастание).");
                    break;
                case 6:
                    sortByPriceDesc();
                    System.out.println("Путевки отсортированы по цене (убывание).");
                    break;
                case 7:
                    sortByCheckInDate();
                    System.out.println("Путевки отсортированы по дате заезда (возрастание).");
                    break;
                case 8:
                    sortByCheckInDateDesc();
                    System.out.println("Путевки отсортированы по дате заезда (убывание).");
                    break;
                case 9:
                    sortByClientName();
                    System.out.println("Путевки отсортированы по фамилии клиента.");
                    break;
                case 10:
                    sortByResortName();
                    System.out.println("Путевки отсортированы по названию пансионата (А-Я).");
                    break;
                case 11:
                    sortByResortNameDesc();
                    System.out.println("Путевки отсортированы по названию пансионата (Я-А).");
                    break;
                case 12:
                    sortByResortThenDate();
                    System.out.println("Путевки отсортированы по пансионату и дате заезда.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TourManager manager = new TourManager();
        manager.showMenu();
    }
}