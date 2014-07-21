package com.thoughtworks;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import java.sql.*;
/**
 * Created by fxie on 7/20/14.
 */
public class DataManager {
    private static EmbeddedDatabase db;

    static {
        db = new EmbeddedDatabaseBuilder().addDefaultScripts().build();
    }

    public static ResultSet getResultSet(String sql) throws SQLException {
        Connection conn = db.getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
}
