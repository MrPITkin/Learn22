package lesson09;

public class Account {

    private double balance = 1_000_000; // ������� ���
    private double maxLimit = Double.MAX_VALUE; // �������
    private double minLimit = 0; // ������ ������
    // private String owner = "�� ��� ����� ?";
    private final String owner;
// ���� ������ (����������) � ������������� <final> ����� ���� ������������������� ���� ���
    private boolean blocked;

    public Account(String name) {
        this.owner = name;
        this.balance = 0;
        this.blocked = true;
    }

    public  Account() {
        //this.owner = "��� �� �� ?";
        this( "`��� �� �� ?`");
// � ������������ ��� ��������� ��� ���� ������ � ������������� <final>
// ������ ���� ���������� ��������
    }

    public boolean replenish(double amount) {
// ���������� �����
        if (blocked || balance + amount > maxLimit) {
            System.out.printf("���� ������� %s ��������� �� %f �� �������.\n"
                    , this.owner, amount);
            return false;
        }
        balance += amount;
        System.out.printf("���� ������� %s ���������� �� %f\n",
                this.owner, amount);
        return true;
    }

    public boolean withdraw(double amount) {
// ������ �� �����
        if (this.balance - amount >= this.minLimit && !this.blocked) {
            balance -= amount;
            System.out.printf("���� ������� %s ���������� �� %f\n",
                    this.owner, amount);
            return true;
        }
        System.out.printf("�������� ���������� ����� %s �� %f �� �������.\n"
                , this.owner, amount);
        return false;
    }

    protected boolean isBlocked() {
// protected ���������� private + ������ �������� ����� ������ � ��� �� ������
        return this.blocked;
    }

    void activeClient(boolean status) {
        this.blocked = !status;
    }

    public final double getBalance() {
        return balance;
    }
// ����������� <final> ��������� ��������������� ������ � ����������� �������

    public String getOwner() {
        return owner;
    }

    public void setMaxLimit(double maxLimit) {
        this.maxLimit = maxLimit;
    }
}
