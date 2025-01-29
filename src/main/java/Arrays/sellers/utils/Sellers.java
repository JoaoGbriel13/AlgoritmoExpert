package Arrays.sellers.utils;

public class Sellers {
    String name;
    double amount;

    public Sellers(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public Sellers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Sellers{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
