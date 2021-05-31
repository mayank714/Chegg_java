package Chegg;

public class Address {
    private String Streetname,city,state,zipCode;

    public String getStreetName() {
        return Streetname;
        
    }
    public String getCity() {
        return city;
        
    }
    public String getstate() {
        return state;
        
    }
    public String getZipCode() {
        return zipCode;
        
    }
    public void setAddress(String Streetname,String city,String state,String zipCode) {
        this.Streetname = Streetname;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }
    
}
