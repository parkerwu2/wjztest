package test.domain;

public class SchoolInfo {
    private Integer schoolid;

    private String schoolname;

    private Integer schooltype;

    private Integer objecttype;

    private Integer schoollevel;

    private Integer districtId;

    private String address;

    private String characteristics;

    private String advantage;

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public Integer getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(Integer schooltype) {
        this.schooltype = schooltype;
    }

    public Integer getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(Integer objecttype) {
        this.objecttype = objecttype;
    }

    public Integer getSchoollevel() {
        return schoollevel;
    }

    public void setSchoollevel(Integer schoollevel) {
        this.schoollevel = schoollevel;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics == null ? null : characteristics.trim();
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }
}