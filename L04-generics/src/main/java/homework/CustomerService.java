package homework;


import java.util.*;

@SuppressWarnings("unchecked")
public class CustomerService {

    //todo: 3. ���� ����������� ������ ����� ������
    //����� ��������� ���������� Map-�, ���������� �� ����� ������������ ������, ��� ��� �������
    private Customer customerH;
    private String dataH;
    private long Scores;
    private final Map<Customer, String> map = new HashMap<Customer, String>();

    public Map.Entry<Customer, String> getSmallest() {


        //��������, ����� ����������� ���� �����, ����������� ���������� ��� Map.Entry ������ � jdk
      //   return null; // ��� "��������, ����� �������������"


        Scores = Long.MAX_VALUE;
        for(Customer d:  map.keySet()){

            if (d.getScores() < Scores) {
                Scores = d.getScores();
                dataH = map.get(d);
                customerH = d;
            }
        }

      //  System.out.println("Scores =" + Scores);



        return  new AbstractMap.SimpleEntry(customerH,dataH);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {

        TreeMap<Long,Customer> Tmap=new TreeMap<Long, Customer>();

        for(Customer d:  map.keySet()){

            Tmap.put(d.getScores(),d);
            System.out.println("Data = " + map.get(d));
        }
        Tmap.put(customer.getScores(),customer);

        for(Map.Entry m:Tmap.entrySet()){
            System.out.println( m.getKey() + " " + m.getValue()+ " " + map.get((Customer) m.getValue()));
            if (customerH == customer) {
                System.out.println("������� " +  m.getKey() + " " + m.getValue()+ " " + map.get((Customer) m.getValue()));
                return new AbstractMap.SimpleEntry(m.getValue(), map.get((Customer) m.getValue()));
            }
            customerH = (Customer) m.getValue();
        }


        //System.out.println("In" + customer.getScores());


        return null; // ��� "��������, ����� �������������"
    }

  //  public void add(Customer customer, String data) {
  public void add(Customer customer, String data) {

      //this.customer = customer;
     // this.data = data;
        map.put(customer, data);
    }
}