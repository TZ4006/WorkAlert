/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author Marti
 */
public class Entrega {
 private int dia;
 private int mes;
 private int anio;
 private boolean Notificacion;
 private String Tipo;
 private String Asignatura;
 
 public Entrega(int dd, int mm, int aa, String type, String Asig){
    this.dia = dd;
    this.mes = mm;
    this.anio = aa;
    this.Tipo = type;
    this.Asignatura = Asig;
}
 
}
