package cn.xjosiah.ssm.dto;

import cn.xjosiah.ssm.entity.Appointment;
import cn.xjosiah.ssm.enums.AppointStateEnum;

public class AppointExecution {
    private long boolId;
    private int state;
    private String stateInfo;
    private Appointment appointment;

    public AppointExecution() {
    }

    public AppointExecution(long boolId, AppointStateEnum stateEnum) {
        this.boolId = boolId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    public AppointExecution(long boolId, AppointStateEnum stateEnum, Appointment appointment) {
        this.boolId = boolId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBoolId() {
        return boolId;
    }

    public void setBoolId(long boolId) {
        this.boolId = boolId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "boolId=" + boolId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
