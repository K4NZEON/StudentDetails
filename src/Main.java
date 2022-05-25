
public class Main {

    public static void main(String[] args) {
        Student[] list = new Student[3];
        Student one = new Student();
        one.setName("Jared");
        one.setAge(12);
        list[0] = one;
        
        Student two = new Student();
        two.setName("Howard");
        two.setAge(18);
        list[1] = two;
        
        Student three = new Student();
        three.setName("Timothy");
        three.setAge(16);
        list[2] = three;
        
        for(int count = 0; count <= 2; count++){
            System.out.println("Student "+(count+1)+"'s name is: "+list[count].getName()+" and they are "+list[count].getAge()+" years old");
        }
         
    }
    
}
