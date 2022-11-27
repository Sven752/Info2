package softwaretechnik_uebung7_1;

public interface Visitor 
{
public void getCost(Glass e);
public void getCost(Electronic e);
public void getCost(Furniture e);

public void getPackaging(Glass e);
public void getPackaging(Electronic e);
public void getPackaging(Furniture e);
}
