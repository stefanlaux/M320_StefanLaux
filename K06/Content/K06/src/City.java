import java.util.ArrayList;
import java.util.List;

class City {
    private List<House> houses;
    private List<Park> parks;

    public City() {
        this.houses = new ArrayList<House>();
    }

    public void addHouse(House house) {
        houses.add(house);
        calculatePopulation();
    }

    public void addPark(Park park) {
        parks.add(park);
    }

    public void calculatePopulation() {
        int population = 0;
        for (House house : houses) {
            population += house.getNumberOfOccupants();
        }
        System.out.println("City population: " + population);
    }
}
