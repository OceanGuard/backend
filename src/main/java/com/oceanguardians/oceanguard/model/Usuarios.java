package com.oceanguardians.oceanguard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.ArrayList;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usuarioId;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "apellido_usuario")
    private String apellidoUsuario;

    @Column(name = "correo_usuario")
    @Email(message = "el correo es invalido o ya está registrado")
    private String correoUsuario;

    @Column(name = "contrasenia_usuario")
    @Min(value = 6, message = "Su contraseña debe contener minimo 6 caracteres")
    private String contraseniaUsuario;

    @ManyToMany
    @JoinTable(
            name = "mis_vedas",//Se empieza definiendo el nombre de la tarea
            joinColumns = @JoinColumn(name = "usuario_id"), //Se indica columna que lleva llave foranea
            inverseJoinColumns = @JoinColumn(name = "veda_id")
    )
    private ArrayList<Veda> vedaGuardada;

}
