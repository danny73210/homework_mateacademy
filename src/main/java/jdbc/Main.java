package jdbc;

import jdbc.dao.impl.CompanyDaoImpl;
import jdbc.dao.impl.CustomerDaoImpl;
import jdbc.dao.impl.DeveloperDaoImpl;
import jdbc.dao.impl.ProjectDaoImpl;
import jdbc.model.Company;
import jdbc.model.Customer;
import jdbc.model.Developer;
import jdbc.model.Project;
import jdbc.model.Skill;
import jdbc.service.CompanyService;
import jdbc.service.CustomerService;
import jdbc.service.DeveloperService;
import jdbc.service.ProjectService;
import jdbc.service.impl.CompanyServiceImpl;
import jdbc.service.impl.CustomerServiceImpl;
import jdbc.service.impl.DeveloperServiceImpl;
import jdbc.service.impl.ProjectServiceImpl;
import jdbc.util.ConnectionUtil;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConnectionUtil.getConnection();
        CustomerService customerService = new CustomerServiceImpl(new CustomerDaoImpl(connection));
        CompanyService companyService = new CompanyServiceImpl(new CompanyDaoImpl(connection));
        ProjectService projectService = new ProjectServiceImpl(new ProjectDaoImpl(connection));
        DeveloperService developerService = new DeveloperServiceImpl(new DeveloperDaoImpl(connection));

        Customer customer = Customer
                .builder()
                .id(2)
                .name("FirstCustomer")
                .projects(new HashSet<>())
                .build();
        customerService.addCustomer(customer);

        Company company = Company
                .builder()
                .id(2)
                .name("FirstCompany")
                .projects(new HashSet<>())
                .build();
        companyService.addCompany(company);

        Project project = Project
                .builder()
                .name("FirstProject")
                .createDate(LocalDate.now())
                .cost(19999.00)
                .developers(new HashSet<>())
                .build();
        customer.addProject(project);
        company.addProject(project);
        projectService.addProject(project);

        Skill skill = Skill
                .builder()
                .typeOfSkill(Skill.TypeOfSkill.JAVA)
                .skillLevel(Skill.SkillLevel.MIDDLE)
                .build();

        Developer developer = Developer
                .builder()
                .name("FirstDeveloper")
                .age(25)
                .salary(1000)
                .skills(new HashSet<>())
                .projects(new HashSet<>())
                .build();
        developer.addSkill(skill);
        developerService.addDeveloper(developer);
        project = projectService.getProjectById(3);
        developer = developerService.getDeveloperById(10);
        projectService.addDeveloperForProject(project, developer);

        Project project1 = projectService.getProjectById(3);
        System.out.println(projectService.getAllSalaryByProject(project));
        developerService.findAllDevelopersByProject(project).forEach(System.out::println);
        developerService.findAllByTypeOfSkill("Java").forEach(System.out::println);
        developerService.findAllByLevelOfSkill("middle").forEach(System.out::println);
        projectService.findAll().forEach(p ->
                System.out.println("date: " + p.getCreateDate()
                        + " name: " + p.getName()
                        + " developers amount: " + p.getDevelopers().size()));
    }
}
