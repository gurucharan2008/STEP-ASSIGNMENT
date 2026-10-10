/**
 * Week 2 - Problem 4: Library ISBN Normalizer & Validator
 * Concepts: trim(), substring(), Character.isLetter/isDigit, StringBuilder
 */
public class P4_IsbnNormalizerValidator {

    // Normalize: trim spaces, uppercase first 3 characters
    public static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed; // will fail validation later
        }
        String publisher = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        return publisher + rest;
    }

    // Validate and format
    public static String validateAndFormat(String code) {
        // Check length
        if (code.length() != 13) {
            return "Invalid: wrong length (must be exactly 13 characters)";
        }

        // Check first 3 are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Check remaining 10 are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must be digits only";
            }
        }

        // Build formatted output with StringBuilder
        // Format: [PUBCODE] YEAR: 20XX | CATALOG: 123456
        // Positions: 0-2 = PUB, 3-6 = YEAR (4 digits), 7-12 = CATALOG (6 digits)
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(code.substring(0, 3));
        sb.append("] YEAR: ");
        sb.append(code.substring(3, 7));
        sb.append(" | CATALOG: ");
        sb.append(code.substring(7, 13));

        return sb.toString();
    }

    public static void main(String[] args) {
        // Sample 1
        String normalized1 = normalizeCode(" pen2026004251 ");
        System.out.println(validateAndFormat(normalized1));

        // Sample 2
        String normalized2 = normalizeCode("12N2026004251");
        System.out.println(validateAndFormat(normalized2));
    }
}
