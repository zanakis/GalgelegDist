/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galgeleg.gui;

import com.galgeleg.logik.DBConnector;
import java.sql.SQLException;

/**
 *
 * @author zanakis
 */
public class Test {
    public static void main(String[] args) {
        DBConnector dbc = new DBConnector();
        dbc.createGameDB();
        dbc.createTables();
//        dbc.clearLeaderboard();
        dbc.updateLeaderBoard(400, "john oliver");
        System.out.print(dbc.loadBoardToArray().get(2));
    }
}
