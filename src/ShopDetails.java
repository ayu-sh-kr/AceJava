import java.util.UUID;

class ShopDetails {
    private final String id;
    private String name;

    public ShopDetails(String id, String name){
        this.id = id;
        this.name = name;
    }

    public ShopDetails(String name){
        this.id = (UUID.randomUUID().toString());
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
