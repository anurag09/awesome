package com.awesome.repository;

import com.awesome.domain.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface StoreRepository extends CrudRepository<Store,Integer>{

}



