package Chegg;

public class BikeStore {
    private String name;
    // private Address obj;
    private Integer numofbike;

    public String getName() {
        return name;
        
    }
    public Integer getNumbers() {
        return numofbike;
        
    }
    // @Override
    public void main(){
        Address obj = new Address();
        obj.setAddress("Modipuram","Meerut","Uttar Pradesh","250110");
        String Streetname =obj.getStreetName();
        String city=obj.getCity();
        String state=obj.getstate();
        String zipCode =obj.getZipCode();
        System.out.println("The showroom is in the \nCity : "+city+
        "\nStreetName :"+Streetname+"\n State :"+state+"\n ZipCode : "+zipCode);

    }
    public void setBike(String name,int numofbike) {
        this.name = name;
        this.numofbike=numofbike;
    }

    
}
