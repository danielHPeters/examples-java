package ch.peters.daniel.example.filehandling.finder;

import ch.peters.daniel.example.filehandling.factory.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class used to find entities from a file.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.1
 */
public class EntityFinderFromFile<T> implements EntityFinder<T> {
  private Factory<T> factory;
  private String fileName;

  public EntityFinderFromFile(Factory<T> factory, String fileName) {
    this.factory = factory;
    this.fileName = fileName;
  }

  public T findByName(String name) {
    T entity = null;

    try (var br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/" + fileName)))) {
      entity = factory.findOneByName(br.lines(), name);
    } catch (IOException e) {
      Logger.getLogger(getClass().getCanonicalName()).log(Level.SEVERE, "Failed to read file " + fileName);
    }

    return entity;
  }
}
