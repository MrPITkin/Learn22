package lesson11;

public class OrganizationRunner {
    public static void main(String[] args) {
        System.out.println((OrganizationType.OAO.ordinal() + 1) * 100);
        System.out.println(OrganizationType.ZAO.getNumber());
        System.out.println(OrganizationType.OOO.getRusName());
        System.out.println(OrganizationType.ZAO.getRusName());
    }
}
