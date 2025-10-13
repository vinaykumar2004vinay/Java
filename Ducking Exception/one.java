// Custom exception class
class VinayException extends RuntimeException {
    public VinayException(String str) {
        super(str);
    }
}

class one {
    public static void main(String[] args) {
        try {
            // Correct usage of Class.forName
            Class.forName("Calc");
        } catch (ClassNotFoundException e) {
            System.out.println("Not Able To Find The Class: " + e);
        }

        int i = 20;
        int j = 0;

        try {
            j = 18 / i; // Integer division: 18 / 20 = 0
            if (j == 0) {
                throw new VinayException("I Don't Want To Print Zero");
            }
        } catch (VinayException e) {
            j = 18 / 1; // Default fallback value
            System.out.println("That's The Default Output... " + e);
        } catch (Exception e) {
            System.out.println("Something Went Wrong... " + e);
        }

        System.out.println(j);
        System.out.println("Byeee....");
    }
}