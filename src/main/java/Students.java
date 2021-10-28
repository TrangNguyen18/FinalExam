import java.util.ArrayList;
import java.util.Comparator;

class Students{
    private String id, name, email;
    private float bonus,report,app, lt,gpa;
    //private float gpa = (float) (bonus * 0.1 + report * 0.3 * app * 0.15 + lt* 0.45);

    public Students() {
    }

    public Students(String id, String name, String email, float bonus, float report, float app, float lt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bonus = bonus;
        this.report = report;
        this.app = app;
        this.lt = lt;
        this.gpa = (float) (this.bonus * 0.1 + this.report * 0.3 * this.app * 0.15 + this.lt* 0.45);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public float getBonus() {
        return bonus;
    }

    public float getReport() {
        return report;
    }

    public float getApp() {
        return app;
    }

    public float getLt() {
        return lt;
    }

    public float getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public void setReport(float report) {
        this.report = report;
    }

    public void setApp(float app) {
        this.app = app;
    }

    public void setLt(float lt) {
        this.lt = lt;
    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bonus=" + bonus +
                ", report=" + report +
                ", app=" + app +
                ", lt=" + lt +
                ", gpa=" + gpa +
                '}';
    }
}
