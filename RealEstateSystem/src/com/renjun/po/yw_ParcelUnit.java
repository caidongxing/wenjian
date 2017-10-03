package com.renjun.po;

import java.math.BigDecimal;

public class yw_ParcelUnit {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelUnitId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private Integer parcelunitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.sit
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String sit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.realRstateUnitNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String realrstateunitnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.WarrantNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String warrantnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelCode
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String parcelcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String parcelarea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.boxOfficeId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private Integer boxofficeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.districtAndCounty
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String districtandcounty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.cadastralArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String cadastralarea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.cadastralSubArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String cadastralsubarea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.useId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private Integer useid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.rightSettingWayId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private Integer rightsettingwayid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.landGradeId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private Integer landgradeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.highBuildingLimit
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String highbuildinglimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.buildingDensity
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String buildingdensity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.plotRatio
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String plotratio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelEast
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String parceleast;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelSouth
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String parcelsouth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelWest
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String parcelwest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelNorth
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String parcelnorth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.parcelConditionCode
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String parcelconditioncode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.MapNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String mapnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_parcelunit.useRightArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    private String userightarea;
    private String registrationno;
    private String landtype;
    
    
    public String getLandtype() {
		return landtype;
	}

	public void setLandtype(String landtype) {
		this.landtype = landtype;
	}

	public String getRegistrationno() {
		return registrationno;
	}

	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yw_parcelunit
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
   
    public Integer getParcelunitid() {
        return parcelunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelUnitId
     *
     * @param parcelunitid the value for yw_parcelunit.parcelUnitId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParcelunitid(Integer parcelunitid) {
        this.parcelunitid = parcelunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.sit
     *
     * @return the value of yw_parcelunit.sit
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getSit() {
        return sit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.sit
     *
     * @param sit the value for yw_parcelunit.sit
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setSit(String sit) {
        this.sit = sit == null ? null : sit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.realRstateUnitNumber
     *
     * @return the value of yw_parcelunit.realRstateUnitNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
  

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.WarrantNumber
     *
     * @return the value of yw_parcelunit.WarrantNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getWarrantnumber() {
        return warrantnumber;
    }

    public String getRealrstateunitnumber() {
		return realrstateunitnumber;
	}

	public void setRealrstateunitnumber(String realrstateunitnumber) {
		this.realrstateunitnumber = realrstateunitnumber;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.WarrantNumber
     *
     * @param warrantnumber the value for yw_parcelunit.WarrantNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setWarrantnumber(String warrantnumber) {
        this.warrantnumber = warrantnumber == null ? null : warrantnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.parcelCode
     *
     * @return the value of yw_parcelunit.parcelCode
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getParcelcode() {
        return parcelcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelCode
     *
     * @param parcelcode the value for yw_parcelunit.parcelCode
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParcelcode(String parcelcode) {
        this.parcelcode = parcelcode == null ? null : parcelcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.parcelArea
     *
     * @return the value of yw_parcelunit.parcelArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getParcelarea() {
        return parcelarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelArea
     *
     * @param parcelarea the value for yw_parcelunit.parcelArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParcelarea(String parcelarea) {
        this.parcelarea = parcelarea == null ? null : parcelarea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.boxOfficeId
     *
     * @return the value of yw_parcelunit.boxOfficeId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public Integer getBoxofficeid() {
        return boxofficeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.boxOfficeId
     *
     * @param boxofficeid the value for yw_parcelunit.boxOfficeId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setBoxofficeid(Integer boxofficeid) {
        this.boxofficeid = boxofficeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.districtAndCounty
     *
     * @return the value of yw_parcelunit.districtAndCounty
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getDistrictandcounty() {
        return districtandcounty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.districtAndCounty
     *
     * @param districtandcounty the value for yw_parcelunit.districtAndCounty
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setDistrictandcounty(String districtandcounty) {
        this.districtandcounty = districtandcounty == null ? null : districtandcounty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.cadastralArea
     *
     * @return the value of yw_parcelunit.cadastralArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getCadastralarea() {
        return cadastralarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.cadastralArea
     *
     * @param cadastralarea the value for yw_parcelunit.cadastralArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setCadastralarea(String cadastralarea) {
        this.cadastralarea = cadastralarea == null ? null : cadastralarea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.cadastralSubArea
     *
     * @return the value of yw_parcelunit.cadastralSubArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getCadastralsubarea() {
        return cadastralsubarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.cadastralSubArea
     *
     * @param cadastralsubarea the value for yw_parcelunit.cadastralSubArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setCadastralsubarea(String cadastralsubarea) {
        this.cadastralsubarea = cadastralsubarea == null ? null : cadastralsubarea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.useId
     *
     * @return the value of yw_parcelunit.useId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public Integer getUseid() {
        return useid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.useId
     *
     * @param useid the value for yw_parcelunit.useId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setUseid(Integer useid) {
        this.useid = useid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.rightSettingWayId
     *
     * @return the value of yw_parcelunit.rightSettingWayId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public Integer getRightsettingwayid() {
        return rightsettingwayid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.rightSettingWayId
     *
     * @param rightsettingwayid the value for yw_parcelunit.rightSettingWayId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setRightsettingwayid(Integer rightsettingwayid) {
        this.rightsettingwayid = rightsettingwayid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.landGradeId
     *
     * @return the value of yw_parcelunit.landGradeId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public Integer getLandgradeid() {
        return landgradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.landGradeId
     *
     * @param landgradeid the value for yw_parcelunit.landGradeId
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setLandgradeid(Integer landgradeid) {
        this.landgradeid = landgradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.highBuildingLimit
     *
     * @return the value of yw_parcelunit.highBuildingLimit
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getHighbuildinglimit() {
        return highbuildinglimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.highBuildingLimit
     *
     * @param highbuildinglimit the value for yw_parcelunit.highBuildingLimit
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setHighbuildinglimit(String highbuildinglimit) {
        this.highbuildinglimit = highbuildinglimit == null ? null : highbuildinglimit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.buildingDensity
     *
     * @return the value of yw_parcelunit.buildingDensity
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getBuildingdensity() {
        return buildingdensity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.buildingDensity
     *
     * @param buildingdensity the value for yw_parcelunit.buildingDensity
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setBuildingdensity(String buildingdensity) {
        this.buildingdensity = buildingdensity == null ? null : buildingdensity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.plotRatio
     *
     * @return the value of yw_parcelunit.plotRatio
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getPlotratio() {
        return plotratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.plotRatio
     *
     * @param plotratio the value for yw_parcelunit.plotRatio
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setPlotratio(String plotratio) {
        this.plotratio = plotratio == null ? null : plotratio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.parcelEast
     *
     * @return the value of yw_parcelunit.parcelEast
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getParceleast() {
        return parceleast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelEast
     *
     * @param parceleast the value for yw_parcelunit.parcelEast
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParceleast(String parceleast) {
        this.parceleast = parceleast == null ? null : parceleast.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.parcelSouth
     *
     * @return the value of yw_parcelunit.parcelSouth
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getParcelsouth() {
        return parcelsouth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelSouth
     *
     * @param parcelsouth the value for yw_parcelunit.parcelSouth
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParcelsouth(String parcelsouth) {
        this.parcelsouth = parcelsouth == null ? null : parcelsouth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.parcelWest
     *
     * @return the value of yw_parcelunit.parcelWest
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getParcelwest() {
        return parcelwest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelWest
     *
     * @param parcelwest the value for yw_parcelunit.parcelWest
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParcelwest(String parcelwest) {
        this.parcelwest = parcelwest == null ? null : parcelwest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.parcelNorth
     *
     * @return the value of yw_parcelunit.parcelNorth
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getParcelnorth() {
        return parcelnorth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelNorth
     *
     * @param parcelnorth the value for yw_parcelunit.parcelNorth
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParcelnorth(String parcelnorth) {
        this.parcelnorth = parcelnorth == null ? null : parcelnorth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.parcelConditionCode
     *
     * @return the value of yw_parcelunit.parcelConditionCode
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getParcelconditioncode() {
        return parcelconditioncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.parcelConditionCode
     *
     * @param parcelconditioncode the value for yw_parcelunit.parcelConditionCode
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setParcelconditioncode(String parcelconditioncode) {
        this.parcelconditioncode = parcelconditioncode == null ? null : parcelconditioncode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.MapNumber
     *
     * @return the value of yw_parcelunit.MapNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getMapnumber() {
        return mapnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.MapNumber
     *
     * @param mapnumber the value for yw_parcelunit.MapNumber
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setMapnumber(String mapnumber) {
        this.mapnumber = mapnumber == null ? null : mapnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_parcelunit.useRightArea
     *
     * @return the value of yw_parcelunit.useRightArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public String getUserightarea() {
        return userightarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_parcelunit.useRightArea
     *
     * @param userightarea the value for yw_parcelunit.useRightArea
     *
     * @mbggenerated Thu Nov 24 16:14:02 CST 2016
     */
    public void setUserightarea(String userightarea) {
        this.userightarea = userightarea == null ? null : userightarea.trim();
    }
}