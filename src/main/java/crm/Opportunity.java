package com.relleom.crm;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.hibernate.validator.constraints.NotEmpty;

public class Opportunity {
    @Id private String id;
    @NotEmpty private String description;
    @NotEmpty private String stage;
    
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}


}
