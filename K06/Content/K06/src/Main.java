
class Main {
    public static void main(String[] args) {
        House house = new House();
        City city = new City();
        city.addHouse(house);
        Park park = new Park();
        city.addPark(park);
    }
}

