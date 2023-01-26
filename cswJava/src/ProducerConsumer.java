import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
  private List<String> wishList = new ArrayList<String>();
  private List<String> shoppingCart = new ArrayList<String>();

  public void addToWishList(String product) {
    synchronized (this) {
      if (!wishList.contains(product)) {
        wishList.add(product);
      }
    }
  }

  /**
   * 
   * Now the code moves to add the next product to the shopping cart.
   * If there are no products left in the wish list, it returns Null.
   * 
   * It's basically similar to provider and change notifier in flutter where one part waits for another part to finish before accessing it.
   */
  public String addToShoppingCart() {
    if (wishList.size() == 0) {
      return null;
    }
    synchronized (this) {
      // Checking if any product is available in the wish list
      if (wishList.size() > 0) {
        String s = wishList.get(0);
        wishList.remove(0);
        shoppingCart.add(s);
        return s;
      }
      return null;
    }
  }
}

