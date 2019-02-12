package jdbc.service.impl;

import jdbc.dao.CompanyDao;
import jdbc.model.Company;
import jdbc.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    private CompanyDao companyDao;

    public CompanyServiceImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public void addCompany(Company company) {
        companyDao.addCompany(company);
    }

    @Override
    public Company getCompany(long id) {
        return companyDao.getCompany(id);
    }

    @Override
    public void updateCompany(Company company) {
        companyDao.updateCompany(company);
    }

    @Override
    public void deleteCompany(long id) {
        companyDao.deleteCompany(id);
    }
}