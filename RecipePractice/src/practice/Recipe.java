package practice;

public class Recipe {

	String name;
	String way_to_cook;
	static final int max_food = 15;
	Food food[] = new Food[max_food];
	
	int num_of_food;
	int equal_num_food;
	
	public Recipe() {
		// TODO Auto-generated constructor stub
		name = new String();
		way_to_cook = new String();
		num_of_food = 0;
		equal_num_food = 0;
		
		for(int i = 0; i < max_food; i ++){
			food[i] = new Food();
		}
	}
	
}
