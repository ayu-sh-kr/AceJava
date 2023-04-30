import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShopDetailTest {
    private List<ShopDetails> shopDetails = new ArrayList<>();

    public ShopDetailTest(){
       try {
           shopDetails.addAll(List.of(
                   new ShopDetails("Johns Grocery"),
                   new ShopDetails("Sarita general store"),
                   new ShopDetails("New Gen Med Store"),
                   new ShopDetails("Ayurvedic Pharma")
           ));
       }catch (NullPointerException e){
           System.out.println(e);
       }
    }

    // getting details "get method"
    Iterable<ShopDetails> getShopDetails(){
        return shopDetails;
    }

    // getting details by id "get method"
    Optional<ShopDetails> getShopDetailsById(String id){
        for (ShopDetails c: shopDetails){
            if (c.getId().equals(id)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    //posting details "post method"

    ShopDetails postShopDetails(ShopDetails shopDetail){
        shopDetails.add(shopDetail);
        return shopDetail;
    }

    ShopDetails putShopDetails(String id, ShopDetails shopDetail){
        int shopDetailidx = -1;

        for (ShopDetails c: shopDetails){
            if(c.getId().equals(id)){
                shopDetailidx = shopDetails.indexOf(c);
                shopDetails.set(shopDetailidx, shopDetail);
            }
        }

        return (shopDetailidx == -1) ? postShopDetails(shopDetail) : shopDetail;
    }

    // deleting shop details
    void deleteShopDetails(String id){
        shopDetails.removeIf(c -> c.getId().equals(id));
    }

    public static void main(String[] args) {
        ShopDetailTest object = new ShopDetailTest();
        ShopDetails details = new ShopDetails("Corona Med Store");
        System.out.println(object.postShopDetails(details).getName());
        object.postShopDetails(new ShopDetails("Amazon grocery"));
        List<ShopDetails> list = new ArrayList<>(object.shopDetails);

        for(ShopDetails c: list){
            System.out.println(c.getId() + "\t" + c.getName());
        }


    }
}
