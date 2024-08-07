package Patterns.Iterator;

import java.util.ArrayList;

public class GeekyStoreIterator implements Iterator {
  ArrayList<Product> catalog;
  int position = 0;

  public GeekyStoreIterator(ArrayList<Product> catalog) {
    this.catalog = catalog;
  }

  @Override
  public boolean hasNext() {
    if (position >= catalog.size() || catalog.get(position) == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Object next() {
    Product product = catalog.get(position);
    position = position + 1;

    return product;
  }
}
