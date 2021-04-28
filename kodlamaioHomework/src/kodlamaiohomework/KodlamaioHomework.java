package kodlamaiohomework;

public class KodlamaioHomework {

    public static void main(String[] args) {

        //Course();
        Task();

    }

    public static void Course() {
        Course course1 = new Course(1, "Programlamaya giriş için temel kurs", "Engin Demiroğ");
        Course course2 = new Course(2, "Yazılım Geliştirici Kampı C#", "Engin Demiroğ");
        Course course3 = new Course(3, "Yazılım Geliştirici Kampı Java", "Engin Demiroğ");

        Course[] courses = {course1, course2, course3};
        for (Course course : courses) {
            System.err.println("--------------************------------------");
            System.err.println(course.id + " " + course.courseName + " " + course.courseTearcherName);
        }

        CourseManager courseManager = new CourseManager();
        //Ekleme Metodu
        courseManager.addToCourse(course1);
        courseManager.addToCourse(course2);
        courseManager.addToCourse(course3);
        //Silme metodu id ye göre
        courseManager.DeleteToCourse(course3);

    }

    public static void Task() {
        Task task1 = new Task(1, "ödev 1", "Kodlama.io sitesine gidiniz.\n"
                + "\n" + "Özellik nesnesi olarak tanımladığımızı düşündüğünüz iki örnek veriniz.\n"
                + "\n" + "Bunlara ait class, contructor yapılarını oluşturup diziye ekleyip listeleyiniz.\n"
                + "\n" + "İş sınıfı olarak tanımladığımızı düşündüğünüz bir class oluşturunuz. En az iki metot yazınız.");
        Task task2 = new Task(2, "ödev 2", "https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25\n"
                + "\n"
                + "Bu oynatma listesini 24-35 aralığında izleyiniz. (24-35 dahil)\n"
                + "\n"
                + "Bu dersler sizi sonraki derse hazır getirecek.\n"
                + "\n"
                + "Bu videoları siz de uygulayınız.");

        Task[] tasks = {task1, task2};
        for (Task task : tasks) {
            System.err.println("--------------************------------------");
            System.err.println(task.id + " " + task.taskName + " " + task.desctription);

        }

        TaskManager taskManager = new TaskManager();

        //Ekleme Metodu
        taskManager.addToTask(task1);
        taskManager.addToTask(task2);
        //Silme metodu id ye göre
        taskManager.DeleteToTask(task2);

    }

}
