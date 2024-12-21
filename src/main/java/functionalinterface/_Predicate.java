package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("07000000001"));
        System.out.println(isPhoneNumberValid("099000000000"));

        // Using Predicate
        System.out.println(isPhoneNumberValid.test("07000000000"));
        System.out.println(isPhoneNumberValid.test("07000000001"));
        System.out.println(isPhoneNumberValid.test("099000000000"));
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
