public class Main {
    public static void main(String[] args) {
        int moneyInAccount = 350;
        int depositMoney = 1500;


        if (depositMoney > 1000) {
            System.out.println((depositMoney / 100 * 1) + moneyInAccount + depositMoney + " итоговая сумма на вашем счете");

        } else {
            System.out.println(depositMoney + moneyInAccount + " итоговая сумма на вашем счете");

        }
    }
}