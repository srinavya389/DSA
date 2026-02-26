class Service {
    // Method that receives Task object
    void process(Task t) {
        System.out.println("Processing task: Task@"
                + Integer.toHexString(t.hashCode()));
    }
}

class Task {
    Service service;

    // Constructor to receive Service object
    Task(Service service) {
        this.service = service;
    }

    // start() method calls service.process(this)
    void start() {
        service.process(this);
    }
}

public class copy {
    public static void main(String[] args) {
        // Create Service and Task objects
        Service service = new Service();
        Task task = new Task(service);

        // Call start()
        task.start();
    }
}