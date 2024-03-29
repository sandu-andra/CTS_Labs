package ro.ase.csie.cts.g1094.dp.composite;

public class NPC extends AbstractNode {

	String name;
	int power;
	
	public NPC(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}

	@Override
	public void attack(String playerName) {
	   System.out.println(String.format("%s is attacking %s",
			   name, playerName));		
	}

	@Override
	public void retreat() {
		System.out.println(String.format("%s is retreating",name));
		
	}

	@Override
	public void move() {
		System.out.println(String.format("%s is moving",name));		
	}

	
	//we can implement it in abstract node (as in course example)
	@Override
	public void addNewNode(AbstractNode node) {
	     throw new UnsupportedOperationException();  //no reason of doing this here		
	}

	@Override
	public void deleteNode(AbstractNode node) {
		 throw new UnsupportedOperationException();  //no reason of doing this here		
	}

	@Override
	public AbstractNode getNode(int index) {
	     throw new UnsupportedOperationException();  //no reason of doing this here		
	}

}
