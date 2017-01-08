/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.placement.app;

import java.util.Date;

public class JobSeeker {

	private String userid;
	private String password;
	private String f_name;
	private String l_name;
	private Date dob;
	private String gender;
	private String address;
	private String cont_1;
	private String cont_2;
	private String email_id;
	private Boolean isShortlisted;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCont_1() {
		return cont_1;
	}

	public void setCont_1(String cont_1) {
		this.cont_1 = cont_1;
	}

	public String getCont_2() {
		return cont_2;
	}

	public void setCont_2(String cont_2) {
		this.cont_2 = cont_2;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Boolean getIsShortlisted() {
		return isShortlisted;
	}

	public void setIsShortlisted(Boolean isShortlisted) {
		this.isShortlisted = isShortlisted;
	}
}
