import java.time.LocalDate;

public class InternationalTour extends Tour {
    private String passportNumber;
    private boolean hasInsurance;

    public InternationalTour(String code, String clientName, String resortName, String roomNumber,
                             String accommodationType, LocalDate checkInDate, LocalDate checkOutDate,
                             int numberOfPeople, double price, String passportNumber, boolean hasInsurance) {
        super(code, clientName, resortName, roomNumber, accommodationType, checkInDate,
                checkOutDate, numberOfPeople, price);
        this.passportNumber = passportNumber;
        this.hasInsurance = hasInsurance;
    }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }
    public boolean hasInsurance() { return hasInsurance; }
    public void setHasInsurance(boolean hasInsurance) { this.hasInsurance = hasInsurance; }

    @Override
    public String toString() {
        return super.toString() + String.format("\nЗагранпаспорт: %s, Страховка: %s",
                passportNumber, hasInsurance ? "есть" : "нет");
    }
}