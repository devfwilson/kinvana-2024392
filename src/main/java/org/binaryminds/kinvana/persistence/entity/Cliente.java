package org.binaryminds.kinvana.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Clientes")
// Lombok
@Data // genera los Setter y Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode // código de autenticación de la entidad
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCliente; // permite usar null en vez de 0
    @Column
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String genero;
    private Integer edad;
}
