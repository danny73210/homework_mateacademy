package jdbc.dao;

import jdbc.model.Developer;
import jdbc.model.Project;

import java.util.Set;

public interface ProjectDao {
    void addProject(Project project);

    void addDeveloperForProject(Project project, Developer developer);

    Project getProjectById(long id);

    void updateProject(Project project);

    void deleteProject(long id);

    void removeDeveloperFromProject(Project project, Developer developer);

    Set<Project> findAll();

    Double getAllSalaryByProject(Project project);
}