package ch.peters.daniel.example.filehandling.finder;

/**
 * Entity finder interface.
 *
 * @param <T>
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public interface EntityFinder<T> {
  T findByName(String name);
}

