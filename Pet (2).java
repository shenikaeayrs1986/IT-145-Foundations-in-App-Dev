import java.util.Scanner;

public class Pet {

	// Pet Class Variables
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;
    private int catSpaceNumber;
    private int dogSpaceNumber;

 // Define the Pet Constructors and Mutators
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
        this.catSpaceNumber = catSpaceNumber;
        this.dogSpaceNumber = dogSpaceNumber;

}

	// Pet check-In 
    public void checkIn() {

        // Set Pet spaces
        setCatSpaces(12);

        setDogSpaces(30);
     // Determine if the pet is a dog or a cat and check for boarding space. 
        System.out.print("Thank you for choosing Pet BAG for your Pet Boarding and Grooming needs. Please confirm if you are checking in a Dog or a Cat?");
        
        Scanner input = new Scanner(System.in);
        String guestResponse = input.nextLine();

        if (guestResponse.equals("cat")) {
            System.out.println("PURRFECT thank you for confirming that your Pet is a Cat");
       // Verify Boarding Availability, collect the applicable account information. For returning pets, update the information if applicable
            
            if (getCatSpaces() >= 1) {
                System.out.println("We presently have rooms available for your Cat.");
                System.out.println("Has your cat boared with Pet BAG before? Y or N?");
        // Verify if  Pet is returning guest
                String catAcct = input.nextLine();
                if (catAcct.equals("N")) {
                    System.out.println("PURRFECT thank you for confirming that your Cat has not boarded with Pet BAG before.");
                    System.out.println("Lets create an account for your Pet");
                    System.out.println("Please confirm your Pet's Name?");
                    String nCName = input.nextLine();
                    setPetName(nCName);
                    System.out.println("How old is your Cat?");
                    int nCAge = input.nextInt();
                    setPetAge(nCAge);
                    
                    System.out.println("Please confirm how many days your cat will be staying with Pet BAG");
                    int cDur = input.nextInt();
                    // stay duration 
                    setDaysStay(cDur);

                    System.out.println("PURRFECT thank you for confiming your Cat's information");
                    // update Pet Spaces
                    int currcatSpaces= getCatSpaces();
                    setCatSpaces(currcatSpaces -1);

                } else if (catAcct.equals("Y")) {
                    System.out.println("PURRFECT thank you for confirming that your Cat has boarded with Pet BAG before.");
                    System.out.println("Please list any changes to your Pet's account?");        
                    System.out.println("Please confirm how many days your cat will be staying with Pet BAG");
                    int cDur = input.nextInt();
                    // Stay duration
                    setDaysStay(cDur);

                    //
                    int currcatSpaces= getCatSpaces();
                    setCatSpaces(currcatSpaces -1);
                    updatePet();

                }

            } else {
                System.out.println("We presently do not have any rooms available");

            }
        } else if (guestResponse.equals("dog")) {
            System.out.println("Welcome back, thank you for confirming that your Pet is a Dog");
            // Verify Boarding Availability, collect the applicable account information. For returning pets, update the information if applicable
            
            if (getDogSpaces() >= 1) {
                System.out.println("We presently have rooms available for your Dog.");
                System.out.println("Has your dog boared with Pet BAG before? Y or N?");
             // Verify if  Pet is returning guest
                String dogAcct = input.nextLine();
                if (dogAcct.equals("N")) {
                    System.out.println("GRREAT thank you for confirming that your Dog has not boarded with Pet BAG before.");
                    System.out.println("Lets create an account for your Pet");
                    System.out.println("Please confirm your Pet's Name?");
                    String nDName = input.nextLine();
                    setPetName(nDName);
                    System.out.println("How old is your dog?");
                    int nDAge = input.nextInt();
                    setPetAge(nDAge);

                    System.out.println("Please confirm how many days your dog will be staying with Pet BAG");
                    int dogdur = input.nextInt();
                    // check if grooming services for dogs are needed
                    if (dogdur >= 2){
                        System.out.println("Grooming services are avaialble for your dog!");
                    } else{
                        System.out.println("Grooming is not availalbe for your dog");
                    }

                    System.out.println("Thank you for the dog information!");

                    // decrease dog space by 1
                    int currdogSpaces = getDogSpaces();
                    setDogSpaces(currdogSpaces - 1);
                } else if (dogAcct.equals("Y")) {
                    System.out.println("It is good to see you again!");
                    System.out.println("Please allow us to update some of your dog information");

                    System.out.println("How many days will your dog be staying with us?");
                    int dogdur = input.nextInt();
                 //Verify if Pet should be groomed
                    
                    if(dogdur > 1){
                        System.out.println("Please be aware that Pet BAG offers grooming services for your pet. Please confirm if you would like your Pet Groomed, Y or N?");
                    } else{
                        System.out.println("Please be aware that Pet BAG does not offer grooming services for your pet.");
                    }

                    // update pet space
                    int currdogSpaces = getDogSpaces();
                    setDogSpaces(currdogSpaces - 1);
                    updatePet();
                }

            } else {
                System.out.println("We presently do not have any rooms available");
            }
        } else{
            System.out.println("An error occurred please confirm if you are checking in a Dog or a Cat?");
            checkIn();
        }

        
    }

    // get, set, and create methods
    public void checkOut() {

        checkOut();
    }

   
    public void getPet() {
        getPet();
    }

    // createPet method
    public void createPet() {
        createPet();
    }

    // updatePet method
    public void updatePet() {
        //updatePet();
    }

    

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
public int getcatSpaceNumber() {
	return catSpaceNumber;
}
public void setcatSpaceNumber(int catSpaceNumber) {
	this.catSpaceNumber = catSpaceNumber;
}
public int getdogSpaceNumber() {
	return dogSpaceNumber;
}
public void setdogSpaceNumber(int dogSpaceNumber) {
	this.dogSpaceNumber = dogSpaceNumber;
}
	
}

