package com.app.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
@ToString
public class ComplainDto {
	
	@NotBlank(message = "complain topic must be reqire")
	private String complainTopic;

	@NotBlank(message = "description must be require")
	private String description;

	public String getComplainTopic() {
		return complainTopic;
	}

	public void setComplainTopic(String complainTopic) {
		this.complainTopic = complainTopic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
