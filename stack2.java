import java.util.*;
interface Stack1
{
	void push();
	void pop();
	void dis();
	
	
}
class Stack implements Stack1
{
	Scanner sc1=new Scanner(System.in);
	int a[]=new int[4];
	int top=-1,i;
	public void push()
	{
		if(top==4)
		{
			System.out.println("Stack is full");
		}
		else
		{
			System.out.println("enter the element");
			int ele=sc1.nextInt();
			top=top+1;
			a[top]=ele;
			
		}

	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("poped element is"+a[top]);
			top=top-1;
		}
	}
	public void dis()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{	
			System.out.println("elemennts are:");
			for( i=0;i<=top;i++)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main( String ar[])
	{
		Scanner sc=new Scanner(System.in);
		Stack s1=new Stack();
		int ch;
		do
		{
			System.out.println("1.push\n2.pop\n3.display\n4.exit");
			System.out.println("enter your choice");
			 ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				s1.push();
				break;
				case 2:
				s1.pop();
				break;
				case 3:
				s1.dis();
				break;
				case 4:
				break;
				default:
				System.out.println("you hav entered wrong choice");
				break;
				
			}
		}while(ch!=4);
	}
}