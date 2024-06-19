package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        // given
        // when
        DbManager dbManager = DbManager.getInstance();

        // then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUser() throws SQLException {
        // given
        DbManager dbManager = DbManager.getInstance();

        // when
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        // then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(16, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        // given
        DbManager dbManager = DbManager.getInstance();

        // when
        String sqlQuery = """
                SELECT USERS.FIRSTNAME, USERS.LASTNAME, COUNT(*) AS POSTS_QUANTITY
                FROM USERS
                JOIN POSTS
                ON USERS.ID = POSTS.USER_ID
                GROUP BY USERS.FIRSTNAME, USERS.LASTNAME
                HAVING COUNT(*) > 1;
                """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        // then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }
}
