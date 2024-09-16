package com.bankExample.microservicesDemo1_b.repository;

import com.bankExample.microservicesDemo1_b.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
    @Query(nativeQuery = true, value="select ca.add_id,ca.lane1,ca.lane2,ca.state,ca.zip from bankdb.address ca join bankdb.customer c on c.id=ca.cust_id where ca.cust_id=:customerId;")
    Address findAddressByCustomerId(@Param("customerId") int customerId);
}
