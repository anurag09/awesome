package com.awesome.repository;

import com.awesome.beans.Product;
import com.awesome.domain.Categories;
import com.awesome.domain.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anurag Mishra on 05-05-2018.
 */
@Repository
public class ProductJdbcRepository  {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Products gtProductById(Long id){
        return jdbcTemplate.queryForObject("select p.id,p.name,c.id,c.name from products as p join categories as c on p.category_id = c.id where p.id = ?", new Object[]{id}, new RowMapper<Products>() {
            @Override
            public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
                Products products = new Products();
                products.setId(rs.getLong("id"));
                products.setName(rs.getString("name"));
                Categories categories = new Categories();
                categories.setId(rs.getLong("id"));
                categories.setName(rs.getString("name"));
                products.setCategories(categories);
                return products;
            }
        });
    }

    public int insertProduct(Long id , String name){
        return jdbcTemplate.update("Insert into products(id, name)values(?,?)", id, name);
    }

    public  int updateCategory(Product product){
        return jdbcTemplate.update("update products set category_id = ? where id = ?", product.getId(),product.getCategoryId());
    }

    public List<Products> getAllProductBYId(){
        return jdbcTemplate.queryForList("Select * from products", new RowMapper<Products>(){

            @Override
            public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
                Products products = new Products();
                List<Products> list = new ArrayList<>();
                while (rs.next()){
                    products.setId(rs.getLong("id"));
                    products.setName(rs.getString("name"));
                    list.add(products);
                }
                return list;
            }
        });
    }
}
