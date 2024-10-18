/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author karyjRegistroUsuario.csv
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String tipoDocumento;
    private String numeroDocumento;
    private String email;
    private String celular;
    private boolean estado;
    private String curso;
    private String evento;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String tipoDocumento, String numeroDocumento, String email, String celular, boolean estado, String curso, String evento) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.celular = celular;
        this.estado = estado;
        if(curso == "") {
            this.curso = null;
        } else {
            this.curso = curso;
        }
        if(evento == "") {
            this.evento = null;
        } else {
            this.evento = evento;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", email=" + email + ", celular=" + celular + ", estado=" + estado + ", curso=" + curso + ", evento=" + evento + '}';
    }
    
}
