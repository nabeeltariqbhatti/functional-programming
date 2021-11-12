package ch4;
class ElectricGuitar {

    private String brand;
    private Integer numOfPickups;

    private Boolean rockStartUsesIt;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(Integer numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public Boolean getRockStartUsesIt() {
        return rockStartUsesIt;
    }

    public void setRockStartUsesIt(Boolean rockStartUsesIt) {
        this.rockStartUsesIt = rockStartUsesIt;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "brand='" + brand + '\'' +
                ", numOfPickups=" + numOfPickups +
                ", rockStartUsesIt=" + rockStartUsesIt +
                '}';
    }
}
    public class EelectricGuitarTestDrive {



}
