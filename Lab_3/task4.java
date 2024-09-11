class holiday {
    private String name;
    private String month;
    private int day;
    holiday (String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    void display (){
    System.out.println("Name: "+name);
    System.out.println("Day: "+day);
    System.out.println("Month: "+month);
    }
}
public class task4 {
    public static void main (String args[]){
        holiday n1 = new holiday("Aporna", 5,"May");
        n1.display();
    }
}

