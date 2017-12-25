package com.urwinday.webapp.model;

import java.util.Collection;
import java.util.List;

/**
 * urwinday
 * 05.12.2017.
 */
public class Resume {
    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private List<Contact> contact;
    private List<Section> sections;

    public Resume(String fullName, String location) {
        this.fullName = fullName;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        return uuid.equals(resume.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
