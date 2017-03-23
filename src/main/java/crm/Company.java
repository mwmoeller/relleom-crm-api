package com.relleom.crm;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.hibernate.validator.constraints.NotEmpty;

// import com.relleom.crm.Opportunity;
// import com.relleom.crm.OpportunityRepository;

public class Company {
    @Id private String id;
    @NotEmpty private String name;
    @DBRef private Address address;
    @DBRef private List<Opportunity> opportunities;
    @DBRef private List<Person> people;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

    public List<Opportunity> getOpportunities() {
		return opportunities;
	}

	public void setOpportunities(List<Opportunity> opportunities) {
		this.opportunities = opportunities;
	}

    public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}


}
