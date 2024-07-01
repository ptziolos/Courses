package Patterns.Iterator;

public class IteratorPattern {

  public void runIteratorPattern(){
    Catalog devStoreCatalog = new DevStoreCatalog();
    Catalog geekyStoreCatalog = new GeekyStoreCatalog();

    Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
    seller.printCatalog();

  }

}
