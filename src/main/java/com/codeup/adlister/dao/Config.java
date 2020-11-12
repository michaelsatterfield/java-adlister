package com.codeup.adlister.dao;


public class Config {
        public String getURL() {
            return "jdbc:mysql://localhost/codeup_db?serverTimezone=UTC&useSSL=false";
        }
        public String getUser() {
            return "root";
        }
        public String getPassword() { return "codeup";
        }
    }
