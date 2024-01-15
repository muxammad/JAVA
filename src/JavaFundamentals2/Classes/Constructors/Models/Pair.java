package Models;

public class Pair {
    private final int a;
	private final int b;

	//declare and implement the private parameterized constructor

  private Pair(int a, int b){
    
    this.a = a;
    this.b = b;
    
  }

	//add modifiers to methods and implement them
	public static Pair newInstance(int a, int b) {
    return new Pair(a,b);
    
	}
	
	public Pair orderedCopy() {
	  return new Pair(Math.min(a,b), Math.max(a,b));

	}
	
	public Pair swappedCopy() {
    return new Pair(b,a);
    
	}

	//do not change the toString() code
	@Override
	public String toString() {
		return String.format("%d;%d", a, b);
	}
}
