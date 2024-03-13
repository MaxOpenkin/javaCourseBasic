package lessons.lesson_39_functionalInterfaces.code.standartFunctionalInterfaces;

import java.util.function.Predicate;

public class CompareUserRole implements Predicate<UserRole> {
    @Override
    public boolean test(UserRole userRole) {
        return userRole.getRole().equals("admin");
    }
}
