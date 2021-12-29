public class HelloEnum {
    public static void main(String[] args) {
        Fruit[] fruits = {Fruit.Apple, Fruit.Orange};
        for (var fruit : fruits) {
            System.out.printf("Total price of all %s: %.2f%n", fruit.name(), fruit.totalPrice());
        }
    }
}
