public enum Fruit {
    Apple(30, 3.5),
    Orange(50, 4.5);

    private final int count;
    private final double price;

    Fruit(int count, double price) {
        this.count = count;
        this.price = price;
    }

    public double totalPrice() {
        return price * count;
    }
}
