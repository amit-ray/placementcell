/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.placement.types;


public enum StreamType {

    BCA("Bca"),
    BTECH("Btech"),
    MCA("Mca");

    private  String stream;

    private StreamType(String stream) {
        this.stream = stream;
    }

    @Override
	public String toString() {
		return stream;

    }

}
