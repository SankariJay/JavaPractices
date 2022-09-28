public class Bank {
    private int amount = 0;

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
        if(amount>500){
            System.out.println("Welcome to savings account");

        }
        else{
            System.out.println("Welcome to current account");
        }
    }
    public static void main(String[] args) {
         Bank bank = new Bank();
         Bank bank2 = new Bank();
         bank.setAmount(555);
         bank2.setAmount(455);

    }
}



