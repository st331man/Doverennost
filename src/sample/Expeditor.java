package sample;

public class Expeditor {
    private String shortName;
    private String fullName;
    private String passportSerial;
    private String passportNumber;
    private String passportIssuedBy;
    private String passportIssuedDate;
    private String passportIssuedMonth;
    private String passportIssuedYear;

    public Expeditor(String shortName, String fullName, String passportNumber, String passportSerial, String passportIssuedBy, String passportIssuedDate, String passportIssuedMonth, String passportIssuedYear) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.passportIssuedBy = passportIssuedBy;
        this.passportIssuedDate = passportIssuedDate;
        this.passportIssuedMonth = passportIssuedMonth;
        this.passportIssuedYear = passportIssuedYear;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportIssuedBy() {
        return passportIssuedBy;
    }

    public void setPassportIssuedBy(String passportIssuedBy) {
        this.passportIssuedBy = passportIssuedBy;
    }

    public String getPassportIssuedDate() {
        return passportIssuedDate;
    }

    public void setPassportIssuedDate(String passportIssuedDate) {
        this.passportIssuedDate = passportIssuedDate;
    }

    public String getPassportIssuedMonth() {
        return passportIssuedMonth;
    }

    public void setPassportIssuedMonth(String passportIssuedMonth) {
        this.passportIssuedMonth = passportIssuedMonth;
    }

    public String getPassportIssuedYear() {
        return passportIssuedYear;
    }

    public void setPassportIssuedYear(String passportIssuedYear) {
        this.passportIssuedYear = passportIssuedYear;
    }

    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }
}
