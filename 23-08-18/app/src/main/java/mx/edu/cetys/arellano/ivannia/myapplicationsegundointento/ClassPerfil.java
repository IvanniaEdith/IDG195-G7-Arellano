package mx.edu.cetys.arellano.ivannia.myapplicationsegundointento;

import com.google.gson.annotations.SerializedName;

public class ClassPerfil {

    @SerializedName("id")
    private String id;
    @SerializedName("matricula")
    private String username;
    @SerializedName("contrasena")
    private String password;
    @SerializedName("Nombre")
    private String nombre;
    @SerializedName("Apellido")
    private String apellido;
    @SerializedName("Carrera")
    private String carrera;
    @SerializedName("Semestre")
    private Integer semestre;
    @SerializedName("materiasaprobadas")
    private Integer materiasaprobadas;
    @SerializedName ("Padre")
    private ClassTutor padre;
    @SerializedName("Madre")
    private ClassTutor madre;


    public Integer getMateriasaprobadas() {
        return materiasaprobadas;
    }

    public void setMateriasaprobadas(Integer materiasaprobadas) {
        this.materiasaprobadas = materiasaprobadas;
    }
    public ClassTutor getPadre() {
        return padre;
    }

    public void setPadre(ClassTutor padre) {
        this.padre = padre;
    }

    public ClassTutor getMadre() {
        return madre;
    }

    public void setMadre(ClassTutor madre) {
        this.madre = madre;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClassPerfil{");
        sb.append("id='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", carrera='").append(carrera).append('\'');
        sb.append(", semestre='").append(semestre).append('\'');
        sb.append(", padre='").append(padre);
        sb.append(", madre='").append(madre);
        sb.append(", materiasaprobadas='").append(materiasaprobadas).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
