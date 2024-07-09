package modelo;

public enum Especialidades {
    linceciadoMedicina("Licenciado de medicina"),
    anestesiologia("Anestesiología"),
    cardiologia("Cardiología"),
    dermatologia("Dermatología"),
    endocrinologia("Endocrinología"),
    gastroenterologia("Gastroenterología"),
    geriatria("Geriatría"),
    ginecologia("Ginecología"),
    obstretricia("Obstetricia"),
    medicinaEmergencia("Medicina de emergencia"),
    medicinaFamiliar("Medicina de familiar"),
    medicinaInterna("Medicina Interna"),
    medicinaNuclear("Medicina Nuclear"),
    medicinaDeportiva("Medicina Deportiva"),
    nefrologia("Nefrología"),
    neumologia("Neumología"),
    neurologia("Neurología"),
    oftamologia("Oftalmología"),
    oncologia("Oncología"),
    ortopedia("Ortopedia"),
    otorrinolaringologia("Otorrinolaringología"),
    pediatria("Pediatría"),
    psiquiatria("Psiquiatría"),
    radiologia("Radiología"),
    traumatologia("Traumatología"),
    urologia("Urología");

    private Especialidades(String especialidad) {
        this.especialidad = especialidad;

    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    private final String especialidad;

}
