package Models;

public class Material {
    
    private final String name;
    private final double density;
    
    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

	@Override
	public String toString() {
		return String.format("%s;%.1f", name, density);
	}
	

}
