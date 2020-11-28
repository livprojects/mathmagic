public class Magic {
	public static void main(String[] args) {
    // Original number you can change to impact the output //
    int myNumber = 7;

    // How the magic works //

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    // Try changing myNumber... Magic! Dark magic?!//

    System.out.println(stepSix);

		

	}
}