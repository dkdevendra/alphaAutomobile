package com.alphaautomobile.repository;

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
public interface
AutomobileServiseRepository extends JpaRepository<AutomobileService, Integer> {

    @Query(nativeQuery = true, value = "select * from automobile_service")
    List<AutomobileService>getAutomobileServicsList();
    @Query(nativeQuery = true, value ="select * from automobile_service where service_id =:serviceId" )
    Optional<AutomobileService>getAutomobileService(@Param("serviceId")int serviceId);

}
