    package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://datausers.cbc42gmgofpp.us-east-1.rds.amazonaws.com:5432/database_ad";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Anayolanda2024!";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error al cargar el driver de PostgreSQL", e);
        }
    }
}
