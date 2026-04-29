package fr.insee.exemple_kube.service;

import fr.insee.exemple_kube.Application;
import fr.insee.exemple_kube.service.ExampleService;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleServiceTest {

    private final ExampleService service = new ExampleService();

    @Test
    void shouldCreateTask() {
        Application task = service.create("Test task");

        assertThat(task.getId()).isNotNull();
        assertThat(task.getTitle()).isEqualTo("Test task");
    }
}
