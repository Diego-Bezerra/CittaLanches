package data;

import java.util.HashMap;

public class CittaLanchesData {

    private HashMap<String, User> users = new HashMap<>();
    private HashMap<String, StoreItem> storeItems = new HashMap<>();
    private HashMap<String, PurchaseDay> purchases = new HashMap<>();

    public CittaLanchesData() {
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public HashMap<String, StoreItem> getStoreItems() {
        return storeItems;
    }

    public void setStoreItems(HashMap<String, StoreItem> storeItems) {
        this.storeItems = storeItems;
    }

    public HashMap<String, PurchaseDay> getPurchases() {
        return purchases;
    }

    public void setPurchases(HashMap<String, PurchaseDay> purchases) {
        this.purchases = purchases;
    }
}
