package jdbc.service;

import jdbc.model.Company;

public interface CompanyService {
    void addCompany(Company company);

    Company getCompany(long id);

    void updateCompany(Company company);

    void deleteCompany(long id);
}