/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.placement.app;

import java.util.Date;

public class Company {

	private String cmp_id;
	private String cmp_name;
	private String cmp_url;
	private String cmp_detail;
	private Double xii_marks;
	private Double x_marks;
	private String stream;
	private Date interview;
	private String jobProfile;
	private String spec;

	public String getCmp_id() {
		return cmp_id;
	}

	public String getCmp_name() {
		return cmp_name;
	}

	public String getCmp_url() {
		return cmp_url;
	}

	public String getCmp_detail() {
		return cmp_detail;
	}

	public void setCmp_id(String cmp_id) {
		this.cmp_id = cmp_id;
	}

	public void setCmp_name(String cmp_name) {
		this.cmp_name = cmp_name;
	}

	public void setCmp_url(String cmp_url) {
		this.cmp_url = cmp_url;
	}

	public void setCmp_detail(String cmp_detail) {
		this.cmp_detail = cmp_detail;
	}

	public Double getXii_marks() {
		return xii_marks;
	}

	public void setXii_marks(Double xii_marks) {
		this.xii_marks = xii_marks;
	}

	public Double getX_marks() {
		return x_marks;
	}

	public void setX_marks(Double x_marks) {
		this.x_marks = x_marks;
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

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

}
