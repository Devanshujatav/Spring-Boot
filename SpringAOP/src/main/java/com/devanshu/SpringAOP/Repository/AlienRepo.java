package com.devanshu.SpringREST.Repository;

import com.devanshu.SpringAOP.Model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlienRepo  extends JpaRepository<Alien, Integer> {
//    List<Alien> findByAnameOrderByDesc(String aname);  // QUERY DSL

    @Query("FROM ALIEN WHERE aname= :nanme")
    List<Alien> find(@Param("name") String aname); // QUERY ANNOTATION
}
