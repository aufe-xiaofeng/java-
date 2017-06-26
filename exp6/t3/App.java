package exp6.t3;

interface DogState{
	public abstract void showState();
}
	
class Dog{
	public void show(DogState state){
		state.showState();
	}
}

class DogLying implements DogState{
	@Override
	public void showState() {
		System.out.println("我在躺着呢。。。");
	}
	
}

class DogPlaying implements DogState{
	@Override
	public void showState() {
		System.out.println("dog playing...");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.show(new DogLying());
		dog.show(new DogPlaying());
	}
}





