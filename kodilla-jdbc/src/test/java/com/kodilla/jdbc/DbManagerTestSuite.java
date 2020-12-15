package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());

    }

    @Test
    void testSelectUser() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(5, counter);
    }

        @Test
        void testSelectUsersAndPosts() throws SQLException {
            //Given
            DbManager dbManager = DbManager.getInstance();

            //When
            String sqlQuery = "select u.lastname, u.firstname, p.user_id, count(*) as Post_Qty\n" +
                    "from users u join posts p on u.id = p.user_id\n" +
                    "group by p.user_id\n" +
                    "having count(*)>=2";
            Statement statement = dbManager.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            //Then
            int counter = 0;
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("FIRSTNAME") + ", " +
                        resultSet.getString("LASTNAME"));
                counter++;
            }

            Assertions.assertEquals(1, counter);
        }
    }
