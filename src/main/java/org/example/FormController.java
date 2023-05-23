package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class FormController {
    private final FormDataRepository formDataRepository;

    @Autowired
    public FormController(FormDataRepository formDataRepository) {
            this.formDataRepository = formDataRepository;
        }
   /* @PostMapping(path="",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )*/
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/api/form",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void submitForm(@RequestBody FormData formData) {
            System.out.println("POST REQUESTED !");
            formDataRepository.save(formData);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path="/api/form")
    public List<FormData> submitForm() {
        return formDataRepository.findAll();
    }

    }


