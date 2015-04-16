package testtest1;

import org.junit.Assert;
import org.junit.Test;

import test1.Aeroport;
import test1.Construction;
import test1.Gare;

public class ConstructionTest {
	
	Construction cons1 = new Construction();
	
	@Test
	public void construireAeroport() {
		
		Aeroport aeroport1 = new Aeroport(3);
		Assert.assertEquals(3, aeroport1.nbpiste);
				
	}
	
	@Test 
	public void construireGare(){
		
		Gare g1 = new Gare(5);
		Assert.assertEquals(5, g1.nbvoie);
		
	}

}
