package com.awesome.controller;

/**
 * Created by Anurag Mishra on 20-06-2017.
 */

import com.awesome.beans.ProductPriceStore;
import com.awesome.domain.ProductPriceByStore;
import com.awesome.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductPriceController {
@Autowired
    private ProductPriceService productPriceService;

    @RequestMapping(value = "/productPrice" , method = RequestMethod.POST)
    @ResponseBody
    public void createProductPrice(@RequestBody ProductPriceStore productPriceStore){
        productPriceService.createProductPrice(productPriceStore);

    }
}
