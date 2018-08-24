package ch.peters.daniel.example.filehandling.factory;

import java.util.stream.Stream;

/**
 * Abstract factory interface.
 *
 * @param <T>
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public interface Factory<T> {
  T findOneByName(Stream<String> stringStream, String name);
}
