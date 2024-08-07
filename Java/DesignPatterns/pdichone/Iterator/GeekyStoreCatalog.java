package Patterns.Iterator;

import java.util.ArrayList;

public class GeekyStoreCatalog implements Catalog{
  private ArrayList<Product> catalog;

  public GeekyStoreCatalog() {
    catalog = new ArrayList<>();

    addItem("Superman Comic", "The best in town", 12.99);
    addItem("Batman Comic", "Okay, but still good", 11.99);
    addItem("Star Wars", "Can't live without it", 39.99);
    addItem("Jedi T-Shirt", "Gotta Have it", 29.99);
  }

  public void addItem(String name, String description, double price) {
    Product product = new Product(name, description, price);
    catalog.add(product);
  }

  public ArrayList<Product> getCatalog() {
    return catalog;
  }

  @Override
  public GeekyStoreIterator createIterator() {
    return new GeekyStoreIterator(catalog);
  }
}
