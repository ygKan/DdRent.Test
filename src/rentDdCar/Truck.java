package rentDdCar;
//����
public class Truck extends DdCar {//�̳и���
	public Truck(int carNumber,String carName,int rent,int freightVolume){
		this.carNumber=carNumber;
		this.carName =carName;
		this.rent =rent;
		this.freightVolume =freightVolume;
		
	}
   public void show(){
	   System.out.println("���ţ�"+carNumber+" ����:"+carName+" ���ѣ�"+rent+" �ػ�����"+freightVolume);
   }
}
