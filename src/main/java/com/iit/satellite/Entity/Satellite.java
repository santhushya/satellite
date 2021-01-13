package com.iit.satellite.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Satellite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sID;
    private String sName;
    private Date LaunchDate = new Date();
    private String status;

    public long getsID() {
        return sID;
    }
    public void setsID(long sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }

    public Date getLaunchDate() {
        return LaunchDate;
    }
    public void setLaunchDate(Date LaunchDate) {
        this.LaunchDate = LaunchDate;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
