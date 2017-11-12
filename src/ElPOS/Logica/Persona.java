/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElPOS.Logica;

/**
 *
 * @author Phycas
 */
public class Persona {
    // usuario, contraseña
    private String user;
    private String pass;
    //Permisos
    private Permisos permisos;
    //nombre, apellido, rut
    private String nombre;
    private String apellido;
    private Rut rut;
    private String mail;
    //cargo en la empresa
     private String cargo;
  
    public Persona(Persona p){
      this.user = p.user;
      this.pass = p.pass;
      this.permisos = p.permisos;
      this.nombre = p.nombre;
      this.apellido = p.apellido;
      this.rut = p.rut;
      this.cargo = p.cargo;
      this.mail = p.mail;
    }
    
    //default constructor
    // Constructor por defecto
    public Persona(){
        try{
      this.user = "god";
      this.pass = "jesus0000";
      this.permisos = new Permisos(1,1,1,1,1);
      this.nombre = "Dios";
      this.apellido = "Todo Poderoso";
      this.rut = new Rut(77777777,"7");
      this.cargo = "Amo y señor del cielo y de la tierra";
      this.mail = "dios@godmail.god";
        } catch (Exception ex){
            
        }
    }
    
    // usuario, pass, nombre, apellido, mail, cargo, Rut, permisos
    public Persona(String u, String p, String n, String a, String m,
            String c, Rut r, Permisos permi){
      this.user = u;
      this.pass = p;
      this.permisos = permi;
      this.nombre = n;
      this.apellido = a;
      this.mail = m;
      this.rut = r;
      this.cargo = c;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Permisos getPermisos() {
        return permisos;
    }

    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
