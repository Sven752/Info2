package softwaretechnik_uebung7;

public class ConcreteVisitor implements Visitor
{

	double movingCost;
	
	@Override
	public void visit(Glass e) 
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
		
			
		
	}

	@Override
	public void visit(Electronic e) {
		if (e.getFragile())
		{
			movingCost = e.getWeight()/2;
		}
		else
		{
			movingCost = e.getWeight()/15*5;
		}
		
	}

	@Override
	public void visit(Furniture e) {
		movingCost = e.getWeight()/20*5;
		
	}
	
	public double getMovingCost(HouseholdItem item)
	{
		double tmpMC = 0;
		item.accept(this);
		return tmpMC;
	}

}
