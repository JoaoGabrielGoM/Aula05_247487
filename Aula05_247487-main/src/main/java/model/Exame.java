/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author j247487
 */
public class Exame {
    private int pedido_exame;
    private String resultados_exame;

    public Exame(int pedido_exame, String resultados_exame) {
        this.pedido_exame = pedido_exame;
        this.resultados_exame = resultados_exame;
    }

    public int getPedido_exame() {
        return pedido_exame;
    }

    public String getResultados_exame() {
        return resultados_exame;
    }

    public void setResultados_exame(String resultados_exame) {
        this.resultados_exame = resultados_exame;
    }
    
    
}
