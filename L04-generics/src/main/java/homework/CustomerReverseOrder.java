package homework;


import java.util.LinkedList;

public class CustomerReverseOrder {
    private Customer customerH;
    //todo: 2. ���� ����������� ������ ����� ������
    //���� ��������� ���������� ��������� ������, ����� ������� ����� � "��� �������"
    LinkedList<Customer> ll = new LinkedList<>();
    public void add(Customer customer) {
      ll.add(customer);
    }

    public Customer take() {
        //return null; // ��� "��������, ����� �������������"
        customerH = ll.pollLast();
        return customerH;
    }
}