/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.*;

/**
 *
 * @author joaom
 */
public class Controller {
    
    public static Cliente addClient(int rg_cli, String nome_cli, int tel_cli, String end_cli) {
        return ClienteDAO.getInstance().create(rg_cli, nome_cli, tel_cli, end_cli);
    }
    
    public static List getAllClients(){
        return ClienteDAO.getInstance().retriveAll();
    }
}
