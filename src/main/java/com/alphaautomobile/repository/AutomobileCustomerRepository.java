package com.alphaautomobile.repository;

import com.alphaautomobilebeans.AutomobileCustomerdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Component
@Repository
public interface AutomobileCustomerRepository extends JpaRepository<AutomobileCustomerdetail, Integer> {
//    public List<AutomobileParts> findByName(String name);

    @Query(nativeQuery = true, value = "select * from automobile_customerDetail")
    List<AutomobileCustomerdetail> getAllDetails();
    @Query(nativeQuery = true, value ="select * from automobile_customerDetail where customer_name =:customerName" )
    Optional<AutomobileCustomerdetail> getAutomobileCustomerdetail(@Param("customerName")String customerName);
}
