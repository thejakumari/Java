package xworkz.brand;

public class BrandRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BrandRunner");
		 Brand brand=new Brand();
		 LocalBrand brand1=new LocalBrand();
		 NationalBrand brand2=new NationalBrand();
		 InternationalBrand brand3=new InternationalBrand();
		 DuplicateBrand brand4=new DuplicateBrand();
		 BrandUtil.mark(brand4);
		 BrandUtil.mark(brand3);
		 BrandUtil.mark(brand2);
		 BrandUtil.mark(brand1);
		 BrandUtil.mark(brand);

	}

}
