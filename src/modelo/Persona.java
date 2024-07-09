package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    public Persona(String nombres, String apellidos, LocalDate fechaNacimiento) {
        this.id = aumentoId;
        aumentoId++;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        generarEdad();
    }

    public int getId() {
        return this.id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private void generarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period medirEdad = Period.between(this.fechaNacimiento, fechaActual);
        this.edad = medirEdad.getYears();
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "modelo.Persona{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                '}';
    }

    private static int aumentoId = 0;
    private final int id;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private int edad;
}
