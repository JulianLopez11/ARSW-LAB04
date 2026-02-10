package edu.eci.arsw.blueprints.persistence;

import edu.eci.arsw.blueprints.model.Blueprint;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlueprintPersistence extends JpaRepository<Blueprint, Long> {

    void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException;

    Blueprint getBlueprint(String author, String name) throws BlueprintNotFoundException;

    Set<Blueprint> getBlueprintsByAuthor(String author) throws BlueprintNotFoundException;

    Set<Blueprint> getAllBlueprints();

    void addPoint(String author, String name, int x, int y) throws BlueprintNotFoundException;
}
