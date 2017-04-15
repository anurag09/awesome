package com.awesome.controller;

import com.awesome.beans.Store;
import com.awesome.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Anurag Mishra on 14-04-2017.
 */
@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "/store", method = RequestMethod.POST)
    @ResponseBody
    public void createStore(@RequestBody Store store){
       storeService.createStore(store);
    }

}
