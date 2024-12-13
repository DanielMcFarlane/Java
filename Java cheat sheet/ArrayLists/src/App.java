public class App {

    public ArrayList<String> daysAchieved() {
        String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", " Saturday", "Sunday" };

        ArrayList<String> daysAchieved = new ArrayList<>();

        for (int i = 0; i < weeklySteps.length; i++) {
            if (weeklySteps[i].getStepCount() >= dailyStepTarget) {
                daysAchieved.add(weekDays[i]);
            }
        }

        if (daysAchieved.isEmpty()) {

            System.out.println("The goal was not achieved on any day.");
        } else {
            System.out.println("The goal was achieved on " + String.join(", ", daysAchieved));
        }
        return daysAchieved;
    }

    static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", " Saturday", "Sunday" };
        System.out.println("Original Array:");

        printArray(weekDays);

        daysAchieved(weekDays);

        System.out.println("Sorted Array:");
        printArray(weekDays);
    }
}