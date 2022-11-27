package com.example.periodicals.repository;

import com.example.periodicals.model.Periodical;
import com.example.periodicals.model.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, Long> {

    Source getSourceByPeriodical (Periodical periodical);

}
