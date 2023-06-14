public class Cat {
	// Private cat Variables
		private String petType;
		private String petName;
		private int petAge;
		private int catSpaces;
		private int catSpaceNumber;
		private int daysStay;
		// Cat Constructors
public Cat (String petName, String petType, int petAge, int catSpaces, int catSpaceNumber, int daysStay) {
//Cat Mutators
	setcatSpaces(12);
	}
    public int getCatSpaceNumber() {
        return catSpaceNumber;
    }
    public void setcatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }
    public int getcatSpaces() {
        return catSpaces;
    }
    public void setcatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }
    public int getPetAge() {
        return petAge;
    }
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getPetType() {
        return petType;
    }
    public void setPetType(String petType) {
        this.petType = petType;
    }
    public int getDaysStay() {
        return daysStay;
    }
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }
    
    }