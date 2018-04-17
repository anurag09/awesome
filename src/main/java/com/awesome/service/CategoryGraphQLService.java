package com.awesome.service;

import com.awesome.service.datafetcher.AllCategoryDataFetcher;
import com.awesome.service.datafetcher.CategoryDataFetcher;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Service
public class CategoryGraphQLService {

    @Value("classpath:category.graphql")
    Resource resource;

    private GraphQL graphQL;
    @Autowired
    private AllCategoryDataFetcher allCategoryDataFetcher;
    @Autowired
    private CategoryDataFetcher categoryDataFetcher;

    @PostConstruct
    private void loadSchema() throws IOException {
        File schemaFile = resource.getFile();
        TypeDefinitionRegistry registry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(registry, wiring);
        graphQL = GraphQL.newGraphQL(schema).build();
    }

    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring ->
                    typeWiring.dataFetcher("allCategories", allCategoryDataFetcher)
                            .dataFetcher("category", categoryDataFetcher))
                .build();
    }

    public GraphQL getGraphQL(){
        return graphQL;
    }
}
