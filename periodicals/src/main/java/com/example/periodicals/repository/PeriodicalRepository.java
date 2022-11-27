package com.example.periodicals.repository;

import com.example.periodicals.model.Periodical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicalRepository extends JpaRepository<Periodical, Long>

//        extends CrudRepository<Periodical, Integer>
{

    Periodical getPeriodicalById(long id);

    void deleteById(long id);



//    PeriodicalDto newPeriodical(String name, int price, String description);
//
//    PeriodicalDto updatePeriodical(PeriodicalDto periodicalDto);
//
//    ArrayList<PeriodicalDto> getUserPeriodicals(UserDto user);
//
//    ArrayList<PeriodicalDto> getSortedPeriodicals(String theme, int price_bound1, int price_bound2, String search, boolean rotation);
//
//    PeriodicalDto addTheme(PeriodicalDto periodicalDto, String theme);
//
//    PeriodicalDto deleteTheme(PeriodicalDto periodicalDto, String theme);
//
//    void deletePeriodical(PeriodicalDto periodicalDto);

}
