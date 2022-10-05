package home_work_1;

public class TaskCreatePhoneNumber {

    public String createPhoneNumber(int[] number) {
        String result = "(###) ###-####";
        for (int i : number) {
            result = result.replaceFirst("#", i + "");
        }
        return result;

    }
}
