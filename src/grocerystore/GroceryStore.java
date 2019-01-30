

package grocerystore;
import java.util.Scanner;
/**
 *
 * @author Bryce Pinder
 */
public class GroceryStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Food apple = new Food("Apple", 2.5); 
       Food orange = new Food("Orange", 3.5); 
       
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter a new price for Apple");
        
        String priceString = scan.nextLine();
        
        try {
        double price = Double.parseDouble(priceString);
        
        apple.setPrice(price); 
        }
        catch (NumberFormatException ex) {
            System.out.println("Please enter a number!");
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        String format = "Apple now has the price of $%.2f\n";
        
        System.out.printf(format, apple.getPrice());
       
    }
}
