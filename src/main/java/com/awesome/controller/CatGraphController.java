package com.awesome.controller;

import com.awesome.service.CategoryGraphQLService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/graphQL/category")
public class CatGraphController {

    @Autowired
    private CategoryGraphQLService categoryGraphQLService;

    @PostMapping
    public ResponseEntity<ExecutionResult> getAllCategory(@RequestBody String query){
        return new ResponseEntity<>(categoryGraphQLService.getGraphQL().execute(query), HttpStatus.OK);
    }
}
