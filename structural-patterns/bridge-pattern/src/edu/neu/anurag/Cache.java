package edu.neu.anurag;

import java.util.List;

interface Cache {
    List<Product> get(String key);
    void put(String key, List<Product> value);
}
