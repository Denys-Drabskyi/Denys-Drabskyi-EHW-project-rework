package com.example.periodicals.repository;

import com.example.periodicals.dto.SourceDto;
import com.example.periodicals.model.Periodical;
import com.example.periodicals.model.Source;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SourceRepository extends JpaRepository<Source, Long> {
    List<SourceDto> getSourcesByPeriodicalId(long periodicalId);

    Source getSourceByPeriodical (Periodical periodical);

}
