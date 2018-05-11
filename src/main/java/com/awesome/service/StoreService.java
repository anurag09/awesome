package com.awesome.service;

import com.awesome.beans.Store;
import com.awesome.domain.Stores;
import com.awesome.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Anurag Mishra on 14-04-2017.
 */
@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public void createStore(Store store) {
        Stores store1 = new Stores();
        store1.setId(store.getId());
        store1.setName(store.getName());
        storeRepository.save(store1);
    }

    public Store getStore(Long id) {
        Stores stores = storeRepository.findOne(id);
        Store store = new Store();
        store.setId(stores.getId());
        store.setName(stores.getName());
        return store;


    }

    public List<Store> getAllStores() {
        Iterable<Stores> stores = storeRepository.findAll();
        List<Store> store = new ArrayList<>();
        Iterator itr = stores.iterator();
        while (itr.hasNext()) {
            Stores storeDomain = (Stores) itr.next();
            Store storeBean = new Store();
            storeBean.setId(storeDomain.getId());
            storeBean.setName(storeDomain.getName());
            store.add(storeBean);
        }
        return store;
    }


}
