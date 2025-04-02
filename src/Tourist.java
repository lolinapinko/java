import java.time.LocalDate;

public class Tourist {
    private int idTicket; //код путевки;
    private String clientSurname; //к фамилия клиента;
    private String nameResort; //к название пансионата;
    private String roomNumber; //к номер;
    private String typeOfHouse; //  к вид жилья;
    private LocalDate checkInDate; // к дата заезда;
    private LocalDate checkOutDate; // дата выезда;
    private int peopleNumber; // количество человек;
    private int price; // цена;

    public Tourist(String clientSurname, String nameResort, String roomNumber, String typeOfHouse, LocalDate checkInDate) {
        this.clientSurname = clientSurname;
        this.nameResort = nameResort;
        this.roomNumber = roomNumber;
        this.typeOfHouse = typeOfHouse;
        this.checkInDate = checkInDate;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getNameResort() {
        return nameResort;
    }

    public void setNameResort(String nameResort) {
        this.nameResort = nameResort;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(String typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "idTicket=" + idTicket +
                ", clientSurname='" + clientSurname + '\'' +
                ", nameResort='" + nameResort + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", typeOfHouse='" + typeOfHouse + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", peopleNumber=" + peopleNumber +
                ", price=" + price +
                '}';
    }
}
