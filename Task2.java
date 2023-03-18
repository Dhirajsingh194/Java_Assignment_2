package assignment2;

class Train
{
	String[] name={"Mukesh","Hitesh","Mukesh"};
	String[] department= {"Testing","Dev","DevOps"};
	String[] email= {"mukesh@gmail.com","mukesh@gmail.com","mukesh@gmail.com"};
	int[] id= {1,2,3};
	Train()
	{
		this.name=name;
		this.department=department;
		this.email=email;
		this.id=id;
	}
	void display()
	{
		for (int i=0;i<3;i++)
		{
		System.out.println("Trainer"+" " + id[i] + " "+ "can teach" + " "+department[i] );
		}
	}
}
public class Task2 {

	public static void main(String[] args) {
		Train t1=new Train();
		t1.display();
	}
}