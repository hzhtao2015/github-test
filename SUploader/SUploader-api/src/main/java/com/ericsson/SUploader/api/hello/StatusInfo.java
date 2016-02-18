package com.ericsson.SUploader.api.hello;

import java.io.Serializable;

public class StatusInfo implements Serializable {
	private String VIN;
	private String time;
	private byte status;
	private byte[] reserve;
	
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public byte[] getReserve() {
		return reserve;
	}
	public void setReserve(byte[] reserve) {
		this.reserve = reserve;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vin) {
		VIN = vin;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
