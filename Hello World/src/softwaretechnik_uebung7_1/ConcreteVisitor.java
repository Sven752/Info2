package softwaretechnik_uebung7_1;

public class ConcreteVisitor implements Visitor
{

	double movingCost;
	
	public double getMovingCost(HouseholdItem item)
	{
		double tmpMC = 0;
		item.calculateCost(this);
		return tmpMC;
	}
	
	@Override
	public void getCost(Glass e) 
	{
		int thickness = e.getTickness();
		
		switch (thickness)
		{
			case 1:
				movingCost = e.getLenght()*2;
				break;
			case 2:
				movingCost = e.getLenght()*1.2;
				break;
			case 3:
				movingCost = e.getLenght()*0.7;
				break;
			default:
				System.out.println("Fucking moron, there is no glass with this thickness!");
				break;
		}
		
		System.out.println("Total cost for " + e.getName() + " is: "+ movingCost);
		
			
		
	}

	@Override
	public void getCost(Electronic e) {
		if (e.getFragile())
		{
			movingCost = e.getWeight()/2;
		}
		else
		{
			movingCost = e.getWeight()/15*5;
		}
		System.out.println("Total cost for " + e.getName() + " is: "+ movingCost);
		
	}

	@Override
	public void getCost(Furniture e) 
	{
		movingCost = e.getWeight()/20*5;
		System.out.println("Total cost for " + e.getName() + " is: "+ movingCost);
		
	}
	


	@Override
	public void getPackaging(Glass e) 
	{
		int length = e.getLenght()+1;
		int width = e.getWidth()+1;
		int height = e.getHeight()+1;
		System.out.println(e.getName());
		System.out.println("Should be wrapped with bubble wraps and packed in a box with dimensions: " + length + "x" + width + "x" + height);
		
	}

	@Override
	public void getPackaging(Electronic e) 
	{
		int length = e.getLenght()+1;
		int width = e.getWidth()+1;
		int height = e.getHeight()+1;
		System.out.println(e.getName());
		System.out.println("Should be covered with Polyethylene foam and packaged in a box with dimensions: " + length + "x" + width + "x" + height);
		
	}

	@Override
	public void getPackaging(Furniture e) 
	{
		System.out.println(e.getName());
		System.out.println("Should be covered with a waterproof cover with the size: " + e.getLenght() + "x"+ e.getWidth());
		
	}

}
