

package grocerystore;

/**
 *
 * @author Bryce Pinder
 */
public class Food {

    //Data Fields
    private final String NAME;
    private double price;
    int count;
    
    public Food (String NAME, double price){
        this.price = price;
        this.NAME = NAME;
    }
    
    public String getName(){
        return NAME;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price) throws IllegalArgumentException{
        if (price < 0)
            throw new IllegalArgumentException("Price must be positive!");
        this.price = price;
    }
    
    
    
}
