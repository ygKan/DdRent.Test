package rentDdCar;
//����
public class Pika extends DdCar {
   public Pika(int carNumber,String carName,int rent,int personCapacity,int freightVolume){
	   this.carNumber =carNumber;
	   this.carName  =carName;
	   this.rent=rent;
	   this.personCapacity =personCapacity;
	   this.freightVolume =freightVolume;
   }
   public void show(){
	   System.out.println("���ţ�"+carNumber+" ����:"+carName+" ���ѣ�"+rent+" �ؿ�����"+personCapacity+" �ػ�����"+freightVolume);
   }
}
