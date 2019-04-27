package rentDdCar;
//子类
public class Truck extends DdCar {//继承父类
	public Truck(int carNumber,String carName,int rent,int freightVolume){
		this.carNumber=carNumber;
		this.carName =carName;
		this.rent =rent;
		this.freightVolume =freightVolume;
		
	}
   public void show(){
	   System.out.println("车号："+carNumber+" 车名:"+carName+" 车费："+rent+" 载货量："+freightVolume);
   }
}
