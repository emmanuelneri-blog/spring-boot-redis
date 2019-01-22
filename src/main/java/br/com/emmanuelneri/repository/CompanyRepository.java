package br.com.emmanuelneri.repository;

import br.com.emmanuelneri.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
