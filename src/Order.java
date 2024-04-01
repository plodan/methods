public class Order {
    private int count = 0;
    private int totalCost;

    public void addProducts(int productsCount, int cost) {
        count = count + productsCount;
        totalCost = cost + totalCost;
    }

    public int getCount () {
        return count;
    }

    public int getTotalCost () {
        return totalCost;
    }
}
