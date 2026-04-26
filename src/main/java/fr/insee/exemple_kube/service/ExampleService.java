package fr.insee.exemple_kube.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String hello() {
        return "Hello";
    }
}