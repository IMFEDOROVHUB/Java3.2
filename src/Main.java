public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87;
        int weight = 98;

        int myIndex = service.calculate(height, weight);
        System.out.println("ИМТ " + myIndex);
    }
}