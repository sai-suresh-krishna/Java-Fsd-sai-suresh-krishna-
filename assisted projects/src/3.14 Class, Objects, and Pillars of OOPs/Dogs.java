package classandobj;

public class Dogs {
	
	 
	    String name; 
	    String breed; 
	    int age; 
	    String color; 
	    public Dogs(String name, String breed, int age, String color) 
	    { 
	        this.name = name; 
	        this.breed = breed; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getBreed() 
	    { 
	        return breed; 
	    } 
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ ".\nMy breed is " + this.getBreed()+".\n My age is " + this.getAge()+ " .\nand my clour is "+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        Dogs scott = new Dogs("Leo","Husky", 5, "black"); 
	        System.out.println(scott.toString()); 
	    } 
	}



