package mx.cetys.arambula.angel.micampus.model

import com.google.gson.annotations.SerializedName

data class Perfil(
        @SerializedName("id")
        val id: String,
        @SerializedName("matricula")
        val matricula: String,
        @SerializedName("contrasena")
        val password: String,
        @SerializedName("Nombre")
        val nombre: String,
        @SerializedName("Apellido")
        val apellido: String,
        @SerializedName("Carrera")
        val carrera: String,
        @SerializedName("Semestre")
        val semestre: Int,
        @SerializedName("materiasaprobadas")
        val materiasaprobadas: Int,
        @SerializedName("Padre")
        val padre: Tutor,
        @SerializedName("Madre")
        val madre: Tutor
)

