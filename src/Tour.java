import java.time.LocalDate;

public class Tour {
    private String code;
    private String clientName;
    private String resortName;
    private String roomNumber;
    private String accommodationType;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numberOfPeople;
    private double price;

    public Tour(String code, String clientName, String resortName, String roomNumber,
                String accommodationType, LocalDate checkInDate, LocalDate checkOutDate,
                int numberOfPeople, double price) {
        this.code = code;
        this.clientName = clientName;
        this.resortName = resortName;
        this.roomNumber = roomNumber;
        this.accommodationType = accommodationType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfPeople = numberOfPeople;
        this.price = price;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }
    public String getResortName() { return resortName; }
    public void setResortName(String resortName) { this.resortName = resortName; }
    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public String getAccommodationType() { return accommodationType; }
    public void setAccommodationType(String accommodationType) { this.accommodationType = accommodationType; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public void setCheckInDate(LocalDate checkInDate) { this.checkInDate = checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(LocalDate checkOutDate) { this.checkOutDate = checkOutDate; }
    public int getNumberOfPeople() { return numberOfPeople; }
    public void setNumberOfPeople(int numberOfPeople) { this.numberOfPeople = numberOfPeople; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return String.format("Путевка %s: Клиент - %s, Пансионат - %s, Номер - %s, Тип - %s\n" +
                        "Даты: %s - %s, Количество человек: %d, Цена: %.2f",
                code, clientName, resortName, roomNumber, accommodationType,
                checkInDate, checkOutDate, numberOfPeople, price);
    }
}
