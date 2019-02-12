package jdbc.dao;

import jdbc.model.Developer;
import jdbc.model.Project;
import jdbc.model.Skill;

import java.util.Set;

public interface DeveloperDao {
    void addDeveloper(Developer developer);

    Developer getDeveloperById(long id);

    void updateDeveloper(Developer developer);

    void removeDeveloperById(long id);

    Set<Developer> findAllByTypeOfSkill(Skill.TypeOfSkill typeOfSkill);

    Set<Developer> findAllByLevelOfSkill(Skill.SkillLevel skillLevel);

    Set<Developer> findAllDevelopersByProject(Project project);
}