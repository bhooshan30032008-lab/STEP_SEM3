package STEP_SEM3.Practice_Problems;

public class Problems_3 {
    public static String validateFileExtension(String filename) {
        int lastDotIndex = filename.lastIndexOf('.');

        if (lastDotIndex != -1 && lastDotIndex < filename.length() - 1) {
            String ext = filename.substring(lastDotIndex + 1);
            if (ext.equalsIgnoreCase("pdf") || ext.equalsIgnoreCase("docx") || ext.equalsIgnoreCase("zip")) {
                return "Accepted";
            }
        }
        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {
        System.out.println(validateFileExtension("Assignment1.PDF"));
        System.out.println(validateFileExtension("notes.txt"));
    }
}