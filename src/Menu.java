import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //class variables
    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //constructors
    public Menu() {
        this.lastUpdated = new Date();
    }
    //methods
    //getters and setters

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
