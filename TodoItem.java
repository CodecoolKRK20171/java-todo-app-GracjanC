public class TodoItem{


    private String title;
    private boolean done;

    public ToDoItem(String title, boolean done){
        this.title = title;
        this.done = done;
    }

    public String getTitleAndStatus() {

        String status = this.checkStatus();
        String fullInfo = status + this.title;

        return (fullInfo);
    }
    public String checkStatus() {

        String status;
        if (this.done) {
            status = "[X]";
        } else {
            status = "[ ]";
        }
        return (status);
    }

    public void markAsDone() {
        this.done = true;
    }
}
