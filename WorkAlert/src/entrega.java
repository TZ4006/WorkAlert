/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marti
 */
public class entrega {
    private int dia;
    private int mes;
    private int anio;
    private boolean nit;
    private String Asig;
    private String Text;
    
    public entrega(int dd, int mm, int aa, String asig, String Text){
        this.dia = dd;
        this.mes = mm;
        this.anio = aa;
        this.Asig = asig;
        this.Text = Text;
    }
}
