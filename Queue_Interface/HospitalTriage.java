//Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.

package Queue_Interface;
import java.util.*;
class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {

    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (a, b) -> b.severity - a.severity   // higher severity first
        );

        pq.add(new Patient("Aarav", 4));
        pq.add(new Patient("Priya", 2));
        pq.add(new Patient("Rohan", 5));
        pq.add(new Patient("Kavita", 3));

        while (!pq.isEmpty()) {
            Patient p = pq.remove();
            System.out.println("Treating: " + p.name + " (Severity: " + p.severity + ")");
        }
    }
}


