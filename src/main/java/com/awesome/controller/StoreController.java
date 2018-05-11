package com.awesome.controller;

import com.awesome.beans.Store;
import com.awesome.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Anurag Mishra on 14-04-2017.
 */
@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "/store" , method = RequestMethod.GET)
    public String store(){
        return "store";
    }

   @RequestMapping(value = "/stores",  method = RequestMethod.GET)
    @ResponseBody
    public List<Store> getAllStore(){
        return storeService.getAllStores();
    }


    @RequestMapping(value = "/store", method = RequestMethod.POST)
    @ResponseBody
    public void createStore(@RequestBody Store store){
       storeService.createStore(store);
    }

    @RequestMapping(value = "/store/{id}" , method = RequestMethod.GET)
    @ResponseBody
    public Store getStore(@PathVariable Long id){
        Store store = storeService.getStore(id);
        return store;
    }

}
