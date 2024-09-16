package com.bankExample.microservicesDemo1_a.feignclient;

import com.bankExample.microservicesDemo1_a.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="demofeign", url="http://localhost:8081/microservicesDemo1_b/api")
public interface AddressClient {
    @GetMapping("/address/{id}")
    ResponseEntity<AddressResponse> getCustomerDetails(@PathVariable("id") int id);
}
