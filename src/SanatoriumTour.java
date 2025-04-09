import java.time.LocalDate;

public class SanatoriumTour extends Tour {
    private String medicalPolicy;
    private String diagnosis;
    private String direction;

    public SanatoriumTour(String code, String clientName, String resortName, String roomNumber,
                          String accommodationType, LocalDate checkInDate, LocalDate checkOutDate,
                          int numberOfPeople, double price, String medicalPolicy, String diagnosis, String direction) {
        super(code, clientName, resortName, roomNumber, accommodationType, checkInDate,
                checkOutDate, numberOfPeople, price);
        this.medicalPolicy = medicalPolicy;
        this.diagnosis = diagnosis;
        this.direction = direction;
    }

    public String getMedicalPolicy() { return medicalPolicy; }
    public void setMedicalPolicy(String medicalPolicy) { this.medicalPolicy = medicalPolicy; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    @Override
    public String toString() {
        return super.toString() + String.format("\nМед. полис: %s, Диагноз: %s, Направление: %s",
                medicalPolicy, diagnosis, direction);
    }
}