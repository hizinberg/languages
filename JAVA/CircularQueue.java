
public class CircularQueue 
{
	int length;
	int front=-1,rear=-1;
	int queue[];
	CircularQueue(int len)
	{
		this.length=len;
		queue= new int[this.length];
	}
	boolean enqueue(int a)
	{
		if(front== (rear+1)%this.length)
		{
			System.out.println("queue is full");
			return false;
		}
		else
		{
			if(front==-1)
				front=rear=0;
			else
			rear=(rear+1)%this.length;
			
			queue[rear]=a;
			return true;
		}
	}
	int dequeue()
	{
		if(front==-1)
		{
			System.out.println("queue is empty");
			return (Integer) null;
		}
		else
		{
			int a = queue[front];
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%this.length;
			return a;
		}
	}
	void display()
	{
		if(front==-1)
		{
			System.out.println("queue is empty");
			return;
		}
		for(int i=front;i!=rear;i=(i+1)%this.length)
			System.out.println(queue[i]);
		System.out.println(queue[rear]);
		
	}
	public static void main(String args[])
	{
		CircularQueue q = new CircularQueue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.display();
		System.out.println("-------------------------");
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
//		q.dequeue();
		q.display();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.display();
		
		
	}
	

}
