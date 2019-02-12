package jdbc.service;

import jdbc.model.Developer;
import jdbc.model.Project;
import jdbc.model.Skill;

import java.util.Set;

public interface DeveloperService {
    void addDeveloper(Developer developer);

    Developer getDeveloperById(long id);

    void updateDeveloper(Developer developer);

    void removeDeveloperById(long id);

    Set<Developer> findAllByTypeOfSkill(Skill.TypeOfSkill typeOfSkill);

    Set<Developer> findAllByTypeOfSkill(String typeOfSkill);

    Set<Developer> findAllByLevelOfSkill(Skill.SkillLevel skillLevel);

    Set<Developer> findAllByLevelOfSkill(String skillLevel);

    Set<Developer> findAllDevelopersByProject(Project project);
}