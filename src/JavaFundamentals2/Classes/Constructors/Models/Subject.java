package Models;

public class Subject {
    
    private String name;
    private Material material;
    private double volume;

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public double getVolume() {
        return volume;
    }

    // Setter methods
    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public void setName(String name){
      this.name = name;
    }
    public double getMass() {
		//put your code here
		return material.getDensity() * volume;
	}

    public String toString() {
        
        return String.format("%s;%s;%.1f;%.2f %.2f", name, material, volume, getMass(), getMass());
    }
}
