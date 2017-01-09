package test.domain;

import java.util.Date;

public class IwAgent {
    private Long id;

    private Long cityId;

    private Long bigAreaId;

    private String uname;

    private String employeeId;

    private Date joinDate;

    private String serialNumber;

    private String password;

    private String mobile;

    private String encrypterMobile;

    private String photoUrl;

    private Date updateTime;

    private Date createTime;

    private String memo;

    private Byte status;

    private Byte accountType;

    private Byte teamType;

    private Byte levelType;

    private Long uid;

    private Byte gender;

    private Byte bizType;

    private Byte weixinBindState;

    private Integer ifevercheat;

    private Byte tempclosed;

    private String leaveDate;

    private Date tempclosedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getBigAreaId() {
        return bigAreaId;
    }

    public void setBigAreaId(Long bigAreaId) {
        this.bigAreaId = bigAreaId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEncrypterMobile() {
        return encrypterMobile;
    }

    public void setEncrypterMobile(String encrypterMobile) {
        this.encrypterMobile = encrypterMobile == null ? null : encrypterMobile.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    public Byte getTeamType() {
        return teamType;
    }

    public void setTeamType(Byte teamType) {
        this.teamType = teamType;
    }

    public Byte getLevelType() {
        return levelType;
    }

    public void setLevelType(Byte levelType) {
        this.levelType = levelType;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Byte getBizType() {
        return bizType;
    }

    public void setBizType(Byte bizType) {
        this.bizType = bizType;
    }

    public Byte getWeixinBindState() {
        return weixinBindState;
    }

    public void setWeixinBindState(Byte weixinBindState) {
        this.weixinBindState = weixinBindState;
    }

    public Integer getIfevercheat() {
        return ifevercheat;
    }

    public void setIfevercheat(Integer ifevercheat) {
        this.ifevercheat = ifevercheat;
    }

    public Byte getTempclosed() {
        return tempclosed;
    }

    public void setTempclosed(Byte tempclosed) {
        this.tempclosed = tempclosed;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate == null ? null : leaveDate.trim();
    }

    public Date getTempclosedTime() {
        return tempclosedTime;
    }

    public void setTempclosedTime(Date tempclosedTime) {
        this.tempclosedTime = tempclosedTime;
    }
}