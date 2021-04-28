
package kodlamaiohomework;


public class TaskManager {
    public void addToTask(Task task) {
	System.out.println("Siteye " + task.taskName + " isimli ödev eklendi");
    }
    public void DeleteToTask(Task task) {
	System.out.println("Siteden " + task.id + " id'li ödev silindi");
    }
}
