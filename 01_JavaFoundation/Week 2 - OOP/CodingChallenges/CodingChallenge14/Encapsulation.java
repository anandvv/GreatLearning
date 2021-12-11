public class Encapsulation {
    private String country;
    private String nationalAnthem;
    private String touristSpot;

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getNationalAnthem(){
        return this.nationalAnthem;
    }

    public void setNationalAnthem(String nationalAnthem){
        this.nationalAnthem = nationalAnthem;
    }

    public String getTouristSpot(){
        return this.touristSpot;
    }

    public void setTouristSpot(String touristSpot){
        this.touristSpot = touristSpot;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setCountry("India");
        obj.setNationalAnthem("Jana Gana Mana");
        obj.setTouristSpot("Jantar Mantar");

        System.out.println("Country: " + obj.getCountry());
        System.out.println("National Anthem: " + obj.getNationalAnthem());
        System.out.println("Tourist Spot: " + obj.getTouristSpot());
        
    }
}
