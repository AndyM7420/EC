public class Address {
    private String houseNum;
    private String streetName;
    private String aptNum;
    private String city;
    private String state;
    private int zip;
    public Address(String houseNum, String streetName, String aptNum, String city,String state, int zip){
        this.houseNum=houseNum;
        this.streetName=streetName;
        this.aptNum=aptNum;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }
    public Address(Address and){
        houseNum=and.getHouseNum();
        streetName=and.getStreetName();
        aptNum=and.getAptNum();
        city=and.getCity();
        zip=and.getZip();
    }
    public Address(String full){
        houseNum=full.substring(0,full.indexOf(" "));
        full=full.substring(full.indexOf(" ")+1);
        streetName=full.substring(0,full.indexOf("Apt"));
        full=full.substring(full.indexOf("Apt")+4);
        aptNum=full.substring(0,full.indexOf(" ")-1);
        full=full.substring(full.indexOf(", ")+1);
        city=full.substring(0,full.indexOf(","));
        full=full.substring(full.indexOf(", ")+1);
        state=full.substring(0,full.indexOf(" ")+1);
        full=full.substring(full.indexOf(" ")+1);
        zip=Integer.parseInt(full.substring(full.indexOf(" ")+1));
    }


    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public String toString(){
        return getHouseNum()+" "+getStreetName()+" Apt"+getAptNum()+", "+getCity()+", "+getState()+", "+getZip();
    }
}
