public class PartyOrganizer{
    public static void main(String[] args){
	Student stu = new Student("ashok",5.5,60,101,"JFSD",30000);
	System.out.println(stu);

	System.out.println("*".repeat(50));
	
	Faculty fal = new Faculty("ahmed",5.6,55,2312,"SDE",60000);
	System.out.println(fal);
    }
}