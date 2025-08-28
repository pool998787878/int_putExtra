package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

import pe.edu.upeu.asistencia.modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

public abstract class EstudianteRepository {
    public List<Estudiante> estudiantes=new ArrayList<>();


    public List<Estudiante> findALLEstudiantes() {
        estudiantes.add(new Estudiante(
                        new SimpleStringProperty("Juan"),
                        new SimpleBooleanProperty(true)
                )
        );

        return estudiantes;
    }

    public abstract List<Estudiante> findAllEstudiantes();

    public abstract Estudiante update(Estudiante estudiante, int index);
}