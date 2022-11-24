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
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
				
		}
		
			
		
	}

	@Override
	public void visit(Electronic e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Furniture e) {
		// TODO Auto-generated method stub
		
	}
	
	public double getMovingCost(HouseholdItem item)
	{
		double tmpMC = 0;
		item.accept(this);
		return tmpMC;
	}

}
