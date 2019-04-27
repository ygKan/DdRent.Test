package rentDdCar;
//子类
public class Pika extends DdCar {
   public Pika(int carNumber,String carName,int rent,int personCapacity,int freightVolume){
	   this.carNumber =carNumber;
	   this.carName  =carName;
	   this.rent=rent;
	   this.personCapacity =personCapacity;
	   this.freightVolume =freightVolume;
   }
   public void show(){
	   System.out.println("车号："+carNumber+" 车名:"+carName+" 车费："+rent+" 载客量："+personCapacity+" 载货量："+freightVolume);
   }
}
