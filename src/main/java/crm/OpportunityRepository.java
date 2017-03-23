package com.relleom.crm;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "opportunities", path = "opportunities")
public interface OpportunityRepository extends MongoRepository<Opportunity, String> {

	List<Opportunity> findByDescription(@Param("description") String description);

}