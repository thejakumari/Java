package xworkz.brand;

public class BrandUtil {
	public static void mark(Brand brand)
	{
		System.out.println("Brand type:"+brand.type);
		brand.documents();
		
		if(brand instanceof LocalBrand)
		{
			LocalBrand brand1=(LocalBrand)brand;
			System.out.println("Name:"+brand1.name);
			brand1.sell();
		}
		if(brand instanceof NationalBrand)
		{
			NationalBrand brand2=(NationalBrand)brand;
			System.out.println("Cost:"+brand2.cost);
			brand2.quality();
		}
		if(brand instanceof InternationalBrand)
		{
			InternationalBrand brand3=(InternationalBrand)brand;
			System.out.println("Country:"+brand3.originCountry);
			brand3.service();
		}
		if(brand instanceof DuplicateBrand)
		{
			DuplicateBrand brand4=(DuplicateBrand)brand;
			System.out.println("Country:"+brand4.gst);
			brand4.cheat();
		}
	}

}
