/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.placement.app;

import java.util.Date;

public class Job {

	private String job_id;
	private String comp_id;
	private String profile;
	private String description;
	private String stream;
	private Date interview;

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getComp_id() {
		return comp_id;
	}

	public void setComp_id(String comp_id) {
		this.comp_id = comp_id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Date getInterview() {
		return interview;
	}

	public void setInterview(Date interview) {
		this.interview = interview;
	}

}
