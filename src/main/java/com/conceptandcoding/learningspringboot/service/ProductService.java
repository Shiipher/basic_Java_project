package com.conceptandcoding.learningspringboot.service;

import com.conceptandcoding.learningspringboot.ProductRepo;
import com.conceptandcoding.learningspringboot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),
//                                            new Product(102,"canon Camera",70000),
//             new Product(103,"fan",3425) ));

    public List<Product> getProducts(){

//        return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter( p->p.getProdId()==prodId)
//                .findFirst().orElse(new Product(100,"No item",0));
        return repo.findById(prodId).orElse(new Product(100,"nothing",0));
    }
    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
  }

    public void updateProduct(Product prod) {
//        int ind=0;
//        for(int i=0; i<products.size();i++){
//            if(products.get(i).getProdId()==prod.getProdId()){
//                ind=i;
//            }
//        }
//        products.set(ind,prod);
        repo.save(prod);
    }

    public void deleteProductById(int prodId) {
//        int ind=0;
//        for(int i=0; i<products.size();i++) {
//            if (products.get(i).getProdId() == prodId) {
//                ind = i;
//            }
//        }
//            products.remove(ind);
//    }
        repo.deleteById(prodId);
    }
}
