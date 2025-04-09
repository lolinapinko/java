import java.time.LocalDate;

public class ChildrenTour extends Tour {
    private int childAge;
    private String birthCertificate;
    private String gender;

    public ChildrenTour(String code, String clientName, String resortName, String roomNumber,
                        String accommodationType, LocalDate checkInDate, LocalDate checkOutDate,
                        int numberOfPeople, double price, int childAge, String birthCertificate, String gender) {
        super(code, clientName, resortName, roomNumber, accommodationType, checkInDate,
                checkOutDate, numberOfPeople, price);
        this.childAge = childAge;
        this.birthCertificate = birthCertificate;
        this.gender = gender;
    }

    // Геттеры и сеттеры
    public int getChildAge() { return childAge; }
    public void setChildAge(int childAge) { this.childAge = childAge; }
    public String getBirthCertificate() { return birthCertificate; }
    public void setBirthCertificate(String birthCertificate) { this.birthCertificate = birthCertificate; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return super.toString() + String.format("\nВозраст ребенка: %d, Свидетельство о рождении: %s, Пол: %s",
                childAge, birthCertificate, gender);
    }
}