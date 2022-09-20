/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author j247487
 */
public class AnimalDAO extends DAO {
    private static AnimalDAO instance;
    
    private AnimalDAO() {
        getConnection();
        createTable();
    }
    
    public static AnimalDAO getInstance() {
        return (instance==null?(instance = new AnimalDAO()):instance);
    }
    
    public Animal create(String nome_anim, int idade_anim, String espc_anim, String raca_anim){
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO animal (nome_anim, idade_anim, espc_anim, raca_anim) VALUES (?,?,?,?)");
            stmt.setString(1, nome_anim);
            stmt.setInt(2, idade_anim);
            stmt.setString(3, espc_anim);
            stmt.setString(4, raca_anim);
            executeUpdate(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.retrieveById(lastId("animal","id"));
    }
    
}
