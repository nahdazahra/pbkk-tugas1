package farm.model.di;

public class Farm {
	String fname;
	Address faddress;
	Animal animals;

	public Farm() {
		
	}
	
	// injection from conf
	public Farm(Animal animals) {
		this.animals = animals;
	}
	
	public Farm(Address faddress) {
		this.faddress = faddress;
	}
	
	public Farm(String fname, Address faddress, Animal animals) {
		this.fname = fname;
		this.faddress = faddress;
		this.animals = animals;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Address getFaddress() {
		return faddress;
	}

	public void setFaddress(Address faddress) {
		this.faddress = faddress;
	}

	public Animal getAnimals() {
		return animals;
	}

	public void setAnimals(Animal animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		return "Farm [fname=" + fname + ", faddress=" + faddress + ", animals=" + animals + "]";
	}
	

}
