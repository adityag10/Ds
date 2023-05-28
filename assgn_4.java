import java.util.ArrayList;
public class BerkeleyClockSync {
public static void main(String[] args) {
// Initialize the system clocks
int[] systemClocks = { 10, 12, 13, 11, 14 };
int masterClock = 0;
// Print the initial system clocks
System.out.print("System clocks: ");
for (int clock : systemClocks) {
System.out.print(clock + " ");
}
System.out.println();
// Calculate the average system clock
int sum = 0;
for (int clock : systemClocks) {
sum += clock;
}
int averageClock = sum / systemClocks.length;
// Calculate the time difference for each system clock
ArrayList<Integer> timeDifferences = new ArrayList<>();
for (int clock : systemClocks) {
timeDifferences.add(averageClock - clock);
}
// Calculate the time adjustment for the master clock
int timeAdjustment = 0;
for (int difference : timeDifferences) {
timeAdjustment += difference;
}
timeAdjustment /= timeDifferences.size();
// Update the master clock
masterClock = averageClock - timeAdjustment;
// Print the updated system clocks and master clock
System.out.print("Updated system clocks: ");
for (int clock : systemClocks) {
System.out.print((clock - timeAdjustment) + " ");
}
System.out.println();
System.out.println("Master clock: " + masterClock);
}
}