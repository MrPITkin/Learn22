package lesson09.implementation;

// ����������� <abstract> ��������� ��������� ������ ����� ������,
// �� ������� ����� ������ ����� ������� ������. ���� ��� <abstract> ������
// �������� ������ ���������� ������
public abstract class BestPersonalAccount extends PersonalAccount {

    public BestPersonalAccount(String name) {
        super(name);
    }

    protected abstract void printBalance();
}
