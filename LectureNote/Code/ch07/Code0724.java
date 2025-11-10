package sec03;
class Student {
    private String name;
    private int eng;
    private int math;
    private int sci;
    public Student ( String name, int eng, int math, int sci){
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.sci = sci;
    }
    public void setName( String name) { this.name = name; }
    public String getName() { return this.name; }
    public void setEng(int eng) { this.eng = eng;}
    public int getEng(){ return this.eng ;}

    public void setMath(int math) { this.math = math;}
    public int getMath(){ return this.math ;}

    public void setSci(int sci) { this.sci = sci;}
    public int getSci(){ return this.sci ;}
    public int getTotalScore(){
        return eng + math + sci;
    }
}
public class Code0724 {
    public static void main(String[] args) {
        Student s1 = new Student("james",80,  90, 50);
        System.out.println(s1.getName() +" total score is " + s1.getTotalScore());

    }

}
