package com.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.SpringJDBC.entity.EproductEntity;

public class EproductDao {
	@Autowired
	JdbcTemplate jdbcTemplate; 

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<EproductEntity> getProducts(){    
		return jdbcTemplate.query("select * from eproduct", new RowMapper<EproductEntity>() {
            public EproductEntity mapRow(ResultSet rs, int row) throws SQLException {    
            	EproductEntity e=new EproductEntity();    
                e.setID(rs.getInt(1));    
                e.setName(rs.getString(2));    
                e.setPrice(rs.getDouble(3));    
                    
                return e;    
            }    
        });    
    }    

}
