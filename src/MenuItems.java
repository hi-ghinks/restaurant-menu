public class MenuItems {
//class variables or fields
   private String itemName;

   private String itemDescription;

   private int itemPrice;

   private String itemCategory;

   private Boolean isNew;

//
public MenuItems (String itemName, String itemDescription, int itemPrice) {
   this.itemName = itemName;
   this.itemDescription = itemDescription;
   this.itemPrice = itemPrice;

   this.itemCategory = "Not categorized";
   this.isNew = false;
}

public MenuItems (String itemName, String itemDescription, int itemPrice, String itemCategory, Boolean isNew) {
      this.itemName = itemName;
      this.itemDescription = itemDescription;
      this.itemPrice = itemPrice;

      this.itemCategory = itemCategory;
      this.isNew = isNew;
   }




   public String getItemName() {return this.itemName;}

   public void setItemName(String itemName) {this.itemName = itemName;}

    public String getItemDescription() {return this.itemDescription;}

    public void setItemDescription(String itemDescription) {this.itemDescription = itemDescription;}

    public int getItemPrice() {return this.itemPrice;}

    public void setItemPrice(int itemPrice) {this.itemPrice = itemPrice;}

    public String getItemCategory() {return this.itemCategory;}

    public void setItemCategory(String itemCategory) {this.itemCategory = itemCategory;}

    public Boolean getIsNew() {return this.isNew;}

    public void setIsNew(Boolean isNew) {this.isNew = isNew;}


}

