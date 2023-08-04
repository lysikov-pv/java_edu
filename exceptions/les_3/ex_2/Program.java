package exceptions.les_3.ex_2;

public class Program {

    public static void main(String[] args) throws Exception {
        try (Counter counter = new Counter()){
            counter.add(10);
            System.out.println(counter.getCount());
            counter.close();
            System.out.println(counter.getCount());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
