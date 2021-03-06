package pl.polsl.pum2.shoppingapp.database;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

@RealmClass
public class ShoppingList extends RealmObject implements CheckableRealmObjectWithName {
    @PrimaryKey
    private String name;
    private boolean checked;
    private MarketMap marketMap;

    private RealmList<ShoppingListItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealmList<ShoppingListItem> getItems() {
        return items;
    }

    public void setItems(RealmList<ShoppingListItem> items) {
        this.items = items;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public MarketMap getMarketMap() {
        return marketMap;
    }

    public void setMarketMap(MarketMap marketMap) {
        this.marketMap = marketMap;
    }
}
