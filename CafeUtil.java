import java.util.ArrayList;
import java.util.Date;
public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    
    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i=0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu( ArrayList<String> menuItems ){
        for(int i=0; i < menuItems.size(); i++){
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }
    }

    public void addCustomer( ArrayList<String> customers ){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Welcome, " + userName);
        customers.add(userName);
        for(int i=0; i < customers.size(); i++){
            String payCustomer = customers.get(i);
            System.out.println(payCustomer);
        }

    }

}