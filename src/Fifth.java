/*
Создать программу на языке Java для определения класса в некоторой предметной области.
Описать свойства, конструктор, методы геттеры/сеттеры,
перекрыть метод toString() для вывода полной информации об объекте в отформатированном виде:

к - Конструктор

11). Продажа путевок

Tourist: Свойства: код путевки; к фамилия клиента;
                   к название пансионата; к номер;
                   к вид жилья; к дата заезда;
                   дата выезда; количество человек; цена;
 */


import java.time.LocalDate;


public class Fifth {
    public static void main(String[] args) {
        Tourist tourist = new Tourist(
                "Linkova",
                "Дивная шишка",
                "5",
                "Отель",
                LocalDate.of(2025, 7, 15)
        );

        System.out.println(tourist);

        tourist.setPrice(5600);
        tourist.setCheckOutDate(LocalDate.of(2025, 7, 20));
        System.out.println(tourist);
    }
}
