package Patterns.Iterator;

public class Seller {
  Catalog geekyStoreCatalog;
  Catalog devStoreCatalog;

  public Seller(Catalog geekyStoreCatalog, Catalog devStoreCatalog) {
    this.geekyStoreCatalog = geekyStoreCatalog;
    this.devStoreCatalog = devStoreCatalog;
  }

  public void printCatalog() {
    Iterator geekyStoreIterator = geekyStoreCatalog.createIterator();
    Iterator devStoreIterator = devStoreCatalog.createIterator();

    System.out.println("Printing Geeky Catalog: ");
    printCatalog(geekyStoreIterator);

    System.out.println("Printing Dev Catalog: ");
    printCatalog(devStoreIterator);

  }

  private void printCatalog(Iterator iterator) {
    while (iterator.hasNext()) {
      Product product = (Product)iterator.next();
      System.out.print(product.getName() + ", ");
      System.out.print(product.getDescription() + " ");
      System.out.println(product.getPrice());
    }
  }
}
