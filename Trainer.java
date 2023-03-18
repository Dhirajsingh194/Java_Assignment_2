package assignment2;

class Trainee
{
	String name,department,email;
	int id;
	Trainee(String name,String department,String email,int id)
	{
		this.name=name;
		this.department=department;
		this.email=email;
		this.id=id;
	}
	void display()
	{
		for (int i=1;i<=3;i++)
		{
			//i=i+1;
		//Trainer 1 can teach Selenium
		System.out.println("Trainer"+" " + id + " "+ "can teach" + " "+department );
		break;
		}
	}
}
public class Trainer {

	public static void main(String[] args) {
		Trainee t1=new Trainee("Mukesh" ,"Testing","mukesh@gmail.com", 1);
		Trainee t2=new Trainee("Hitesh" ,"Dev","mukesh@gmail.com", 2);
		Trainee t3=new Trainee("Mukesh" ,"DevOps","mukesh@gmail.com", 3);
		t1.display();
		t2.display();
		t3.display();
		

	}

}
