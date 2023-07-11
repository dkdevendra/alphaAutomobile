package com.alphaautomobile.repository;

import com.alphaautomobile.dto.AutomobilePartsDTO;
import com.alphaautomobilebeans.AutomobileParts;
import com.alphaautomobilebeans.AutomobileService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
@Component
public interface AutomobilePartRepository extends JpaRepository<AutomobileParts, Integer> {
//    public List<AutomobileParts> findByName(String name);

    @Query(nativeQuery = true, value = "select * from automobile_parts")
    List<AutomobileParts> getAutomobilePartsList();
    @Query(nativeQuery = true, value ="select * from automobile_parts where part_id =:partsId" )
    Optional<AutomobileParts> getAutomobileParts(@Param("partsId")int partsId);
    @Query(nativeQuery = true,value ="delete from automobile_parts where inventory_Id =:inventoryId" )
    Optional<AutomobileParts> deleteAutomobileParts(@Param("inventoryId")String  inventoryId);

}
