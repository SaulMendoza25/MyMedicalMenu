package modelo;

import java.time.LocalDate;
public class Doctor extends Persona {
    public Doctor(String nombres, String apellidos, LocalDate fechaNacimiento) {
        super(nombres, apellidos, fechaNacimiento);
        this.especialidad = Enum.valueOf(Especialidades.class, "Licenciado de medicina");
        GananciaPromedio();
    }

    public Doctor(String nombres, String apellidos, LocalDate fechaNacimiento, String tipoEspecialidad) {
        super(nombres, apellidos, fechaNacimiento);
        this.especialidad = Enum.valueOf(Especialidades.class, tipoEspecialidad);
        GananciaPromedio();
    }

    private void GananciaPromedio() {
        switch (this.especialidad.getEspecialidad()) {
            case "Licenciado de medicina" -> this.gananciaPromedio = 2000;
            case "Anestesiología" -> this.gananciaPromedio = 4000;
            case "Obstetricia", "Oftalmología", "Ginecología", "Medicina Interna",
                 "Otorrinolaringología", "Gastroenterología", "Nefrología" -> this.gananciaPromedio = 4166;
            case "Ortopedia", "Cardiología", "Traumatología" -> this.gananciaPromedio = 5000;
            case "Oncología", "Radiología", "Medicina Nuclear", "Neurología", "Urología" ->
                    this.gananciaPromedio = 4583;
            case "Neumología", "Psiquiatría", "Endocrinología" -> this.gananciaPromedio = 3750;
            case "Medicina Deportiva", "Medicina de emergencia", "Pediatría" -> this.gananciaPromedio = 3333;
            case "Medicina de familiar" -> this.gananciaPromedio = 2500;
            case "Geriatría" -> this.gananciaPromedio = 2916;
            case "Dermatología" -> this.gananciaPromedio = 3500;
        }
    }

    public Especialidades getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String tipoEspecialidad) {
        this.especialidad = Enum.valueOf(Especialidades.class, tipoEspecialidad);
        GananciaPromedio();
    }

    public double getGananciaPromedio() {
        return this.gananciaPromedio;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "gananciaPromedio=" + gananciaPromedio +
                ", especialidad=" + especialidad +
                "} " + super.toString();
    }

    private double gananciaPromedio;
    private Especialidades especialidad;
}

