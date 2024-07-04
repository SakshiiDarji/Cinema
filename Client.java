public class Client {
    double balance;
    String name;
    int loyaltyPoints;
    Client(double balance){
        this.balance = balance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints += loyaltyPoints * 10;
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        System.out.println("Deducting balance: " + amount);
        balance -= amount;
    }
}
