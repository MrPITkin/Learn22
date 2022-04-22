package lesson11;

public enum OrganizationType {
    OOO(3), ZAO(-7, "ЗаО"), OAO(11, "оАо");

    private final int number;
    private String rusName;

    OrganizationType(int arg) {
        this.number = arg;
    }

    OrganizationType(int arg, String russianName) {
        this.number = arg;
        this.rusName = russianName;
    }

    public int getNumber() {
        return number;
    }

    public String getRusName() {
        return rusName;
    }
}
