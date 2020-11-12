package com.codeup.adlister.dao;
import com.mysql.cj.jdbc.Driver;
import com.codeup.adlister.models.User;
import com.codeup.adlister.models.Ad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLUsersDao implements Users {
    private final Connection connection = null;



    @Override
    public User findByUsername(String username) {
        String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
        try{
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        } catch (SQLException e) {
            throw new RuntimeException("Error", e);
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}
