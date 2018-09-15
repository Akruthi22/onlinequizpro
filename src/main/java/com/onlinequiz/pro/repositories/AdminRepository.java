package com.onlinequiz.pro.repositories;

import com.onlinequiz.pro.models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class AdminRepository{
@Autowired
    JdbcTemplate jdbcTemplate;


public AdminRepository(DataSource dataSource){
    jdbcTemplate=new JdbcTemplate(dataSource);
}

public Admin getAdminLoginDetails(Admin admin){
    String sql="select * from admin where adminusername = (?)";

    return jdbcTemplate.query(sql, new Object[]{admin.getAdminusername()}, new ResultSetExtractor<Admin>() {
        @Override
        public Admin extractData(ResultSet resultSet) throws SQLException, DataAccessException {
            Admin admin1=new Admin();
            while (resultSet.next()){
                admin1.setAdminusername(resultSet.getString("adminusername"));
                admin1.setAdminpassword(resultSet.getString("adminpassword"));

            }
            return admin1;
        }
    });
}
}

