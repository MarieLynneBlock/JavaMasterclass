package OOP.Classes;

public class Car {
    // Fields - state components
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public String getModel() {
        return this.model;
    }

    // Getters and Setters
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
}
