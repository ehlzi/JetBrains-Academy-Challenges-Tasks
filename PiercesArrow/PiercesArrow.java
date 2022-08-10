package PiercesArrow;

public class PiercesArrow {
    
    public static void main(String[] args) {

        /*
        In the boolean logic (not Java!), Peirce's arrow (also known as NOR) is a logical operator that produces a result that is the negation of logical or.
        This operator returns true, only if both arguments are false, otherwise, it returns false. But Java doesn't have this operator as built-in.
        Which combination of standard Java operators has the same effect as the Peirce's arrow? (b1 and b2 are boolean variables). Select one or more suitable cases.
        If you cannot solve this task, try to google De Morgan's laws.
        */


        boolean b1 = false;
        boolean b2 = false;

        boolean b3 = !b1 || b2; // NOT false AND false
        boolean b4 = b1 || !!b2; // false AND (double negation)false
        boolean b5 = !b1 && b2; // NOT false OR false
        boolean b6 = !b1 && !b2; // NOT false OR NOT false
        boolean b7 = !(b1 || b2); // NOT (false AND false)

        System.out.println(b3); // true
        System.out.println(b4); // false
        System.out.println(b5); // false
        System.out.println(b6); // true - Answer (De Morgan's Law)
        System.out.println(b7); // true - Answer (De Morgan's Law)

    }

}