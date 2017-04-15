package com.awesome.service;

import com.awesome.beans.Store;
import com.awesome.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anurag Mishra on 14-04-2017.
 */
@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public void createStore(Store store)
    {
        com.awesome.domain.Store store1 = new com.awesome.domain.Store();
        store1.setId(store.getId());
        store1.setName(store.getName());
        storeRepository.save(store1);
    }

}
