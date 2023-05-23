package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "form_data")
public class FormData {
    @Id
    @SequenceGenerator(
            name = "form_data_id_sequence",
            sequenceName = "form_data_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE

    )
    private Long id;
    private String name;
    private String email;
    private String message;

    public FormData() {
    }

    public FormData(Long id, String name, String email, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
    }
// Constructors, getters, and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
