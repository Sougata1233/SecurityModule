package com.sls.security.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class JuteEntryHeaderdDTO {

	private  long id;
	private  long chalanNo;
	private  long mrNo;
	private  String poNo;
	private  Date chalanDate ;
	private  String mukam ;
	private String brokerAddress;
	private String vehicleNo;
	private String driverName;
	private String brokerName;
	private String transporter;
	private Date inDate;
	private String updateBy;
	private String inTime;
	private Timestamp outTime;
	private Date outDate;
	private Timestamp updateDateTime;
	private String finYear;
	private String openClose;
	private long netWeight;
	private long grossWeight;
	private long actualWeight;
	private String supplierName;
	private String suppCode;
	private String suppAddress;
	private long brokerId;
	private String vehicleType;
	private long tareWeight;
	
	private List<JuteEntryDtlLineItemdDTO> polineitem;
	private  long challanWeight;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getChalanNo() {
		return chalanNo;
	}
	public void setChalanNo(long chalanNo) {
		this.chalanNo = chalanNo;
	}
	public long getMrNo() {
		return mrNo;
	}
	public void setMrNo(long mrNo) {
		this.mrNo = mrNo;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public Date getChalanDate() {
		return chalanDate;
	}
	public void setChalanDate(Date chalanDate) {
		this.chalanDate = chalanDate;
	}
	public String getMukam() {
		return mukam;
	}
	public void setMukam(String mukam) {
		this.mukam = mukam;
	}
	public String getBrokerAddress() {
		return brokerAddress;
	}
	public void setBrokerAddress(String brokerAddress) {
		this.brokerAddress = brokerAddress;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getBrokerName() {
		return brokerName;
	}
	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}
	public String getTransporter() {
		return transporter;
	}
	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public Timestamp getOutTime() {
		return outTime;
	}
	public void setOutTime(Timestamp outTime) {
		this.outTime = outTime;
	}
	public Date getOutDate() {
		return outDate;
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	public Timestamp getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Timestamp updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	public String getFinYear() {
		return finYear;
	}
	public void setFinYear(String finYear) {
		this.finYear = finYear;
	}
	public String getOpenClose() {
		return openClose;
	}
	public void setOpenClose(String openClose) {
		this.openClose = openClose;
	}
	public long getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(long netWeight) {
		this.netWeight = netWeight;
	}
	public long getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(long grossWeight) {
		this.grossWeight = grossWeight;
	}
	public long getActualWeight() {
		return actualWeight;
	}
	public void setActualWeight(long actualWeight) {
		this.actualWeight = actualWeight;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSuppCode() {
		return suppCode;
	}
	public void setSuppCode(String suppCode) {
		this.suppCode = suppCode;
	}
	public String getSuppAddress() {
		return suppAddress;
	}
	public void setSuppAddress(String suppAddress) {
		this.suppAddress = suppAddress;
	}
	public long getBrokerId() {
		return brokerId;
	}
	public void setBrokerId(long brokerId) {
		this.brokerId = brokerId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public long getTareWeight() {
		return tareWeight;
	}
	public void setTareWeight(long tareWeight) {
		this.tareWeight = tareWeight;
	}
	public List<JuteEntryDtlLineItemdDTO> getPolineitem() {
		return polineitem;
	}
	public void setPolineitem(List<JuteEntryDtlLineItemdDTO> polineitem) {
		this.polineitem = polineitem;
	}
	public long getChallanWeight() {
		return challanWeight;
	}
	public void setChallanWeight(long challanWeight) {
		this.challanWeight = challanWeight;
	}
	
	
	
}
