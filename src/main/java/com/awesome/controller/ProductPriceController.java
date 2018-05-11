package com.awesome.controller;

/**
 * Created by Anurag Mishra on 20-06-2017.
 */

import com.awesome.beans.Product;
import com.awesome.beans.ProductPriceStore;
import com.awesome.domain.Products;
import com.awesome.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ProductPriceController {
@Autowired
    private ProductPriceService productPriceService;

    @RequestMapping(value="/StoreProduct", method = RequestMethod.GET)
    public String storeProduct(){
        return "StoreProduct";
    }

    @RequestMapping(value = "/productPrice", method = RequestMethod.GET)
    @ResponseBody
    public Map<Long,List<Product>> getProductByStores(){
        Map<Long,List<Product>> productByStore = productPriceService.getProductListByStore();
        return  productByStore;
    }

    @RequestMapping(value = "/productPrice" , method = RequestMethod.POST)
    @ResponseBody
    public void createProductPrice(@RequestBody ProductPriceStore productPriceStore){
        productPriceService.createProductPrice(productPriceStore);
    }

    @RequestMapping(value = "/productPrice/{storeId}", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getProductsByStore(@PathVariable Long storeId){
        List<String> productDetail = productPriceService.getProductDetail(storeId);

        return productDetail;

    }



}
