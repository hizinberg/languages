class queue
{
	int length;
	int queue[];
	int front=-1;
	int rear=-1;
	queue(int length)
	{
		this.length=length;
		queue= new int[this.length];
	}
	
	boolean enqueue(int a)
	{
		if(rear==this.length-1)
		{
			System.out.println("max capacity has reached");
			return false;
		}
		else
		{
			queue[++rear]=a;
			return true;
		}
		
	}
	int dequeue ()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
			return (Integer) null;
		}
		else
		{
			int a=queue[++front];
			return a;
		}
		
	}
	void display()
	{
		for(int i=front+1;i<=rear;i++)
	    	  System.out.println(queue[i]);
	}
	
    public static void main(String args[])
    {
      queue q = new queue(5);
      q.enqueue(0);
      q.enqueue(2);
      q.enqueue(3);
      q.enqueue(4);
      q.enqueue(5);

 
      q.dequeue();
//      q.dequeue();
//      q.dequeue();
      
      
      
      q.display();

      
    }
    
}