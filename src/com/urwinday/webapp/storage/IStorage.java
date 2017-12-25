package com.urwinday.webapp.storage;

import com.urwinday.webapp.model.Resume;

import java.util.Collection;

/**
 * urwinday
 * 25.12.2017.
 */
public interface IStorage {
    void clear();

    void save(Resume r);

    void update(Resume r);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();
}
