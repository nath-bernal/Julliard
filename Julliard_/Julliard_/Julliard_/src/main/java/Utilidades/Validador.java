/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;



/**
 *
 * @author karyj
 */
public class Validador {
    
    public static boolean noVacio(String valor) {
        return !valor.isEmpty(); // Verifica si los campos no están vacíos
    }

    public static boolean nombreValido(String nombre) {
        return nombre.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$"); // Verifica que solo contenga letras y espacios
    }

    public static boolean edadValida(int edad) {
        return edad >= 9 && edad <= 50;
    }
    public static boolean numDocumentoValido(String numDocumento) {
        return numDocumento.matches("\\d{10}"); 
    }

    public static boolean correoValido(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean celularValido(String celular) {
        return celular.matches("\\d{10}"); 

    }
}
