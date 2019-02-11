public class Main {	
    public static void main(String[] args) {
    	int sum = 1 + 2;
        boolean isEvenNumber = sum % 2 == 0;
    	if (isEvenNumber == true) {
    		System.out.println("Number " + sum + " является четным");
    	} else if (isEvenNumber == false) {
    		System.out.println("Number " + sum + " is we");
    	}

    	int sum1 = sum + 3;
        boolean isEvenNumber1 = sum1 % 2 == 0;
    	if (isEvenNumber == true) {
    		System.out.println("Number " + sum1 + " является четным");
    	} else if (isEvenNumber1 == false) {
    		System.out.println("Number " + sum1 + " is we");
    	}

    	int sum2 = sum1 + 4;
        boolean isEvenNumber2 = sum2 % 2 == 0;
    	if (isEvenNumber2 == true) {
    		System.out.println("Number " + sum2 + " is we");
    	} else if (isEvenNumber2 == false) {
    		System.out.println("Number " + sum2 + " is we");
    	}

    	int result = sum2 + 5;
    	boolean isEvenNumber3 = result % 2 == 0;
    	if (isEvenNumber3 == true) {
    		System.out.println("Number " + result + " является четным");
    	} else if (isEvenNumber3 == false) {
    		System.out.println("Number " + result + " is we");
    	}

        System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
    }
}