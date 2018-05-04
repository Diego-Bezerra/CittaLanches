package data;

import java.util.HashMap;

public class PurchaseDay {

    //private long date;
    private HashMap<String, String> storeItems = new HashMap<>();

    public PurchaseDay() {
    }

    public PurchaseDay(long date, HashMap<String, String> storeItems) {
      //  this.date = date;
        this.storeItems = storeItems;
    }

//    public long getDate() {
//        return date;
//    }
//
//    public void setDate(long date) {
//        this.date = date;
//    }


    public HashMap<String, String> getStoreItems() {
        return storeItems;
    }

    public void setStoreItems(HashMap<String, String> storeItems) {
        this.storeItems = storeItems;
    }
}
