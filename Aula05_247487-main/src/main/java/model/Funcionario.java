/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author j247487
 */
public class Funcionario {
    private int rg_func;
    private String nome_func;
    private int tel_func;
    private int end_func;

    public Funcionario(int rg_func, String nome_func, int tel_func, int end_func) {
        this.rg_func = rg_func;
        this.nome_func = nome_func;
        this.tel_func = tel_func;
        this.end_func = end_func;
    }

    public int getRg_func() {
        return rg_func;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public int getTel_func() {
        return tel_func;
    }

    public void setTel_func(int tel_func) {
        this.tel_func = tel_func;
    }

    public int getEnd_func() {
        return end_func;
    }

    public void setEnd_func(int end_func) {
        this.end_func = end_func;
    }
    
    
}
