package schedulingList;

public class CpuProcess {
    public static void main(String[] args) {

        CpuSchedule scheduler = new CpuSchedule();

        scheduler.addJob(new Job(15, 10, 1));
        scheduler.addJob(new Job(24, 15, 2));
        scheduler.addJob(new Job(40, 141, 4));

        scheduler.runScheduler();
    }

}