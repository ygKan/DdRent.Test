package rentDdCar;
//����
public class PersonCar extends DdCar {//�̳и���
	public PersonCar(int carNumber,String carName,int rent,int personCapacity){
		this.carNumber = carNumber;
		this.carName =carName;
		this.rent=rent;
		this.personCapacity =personCapacity;
		
	}
    public void show(){
    	System.out.println("���ţ�"+carNumber+" ����:"+carName+" ���ѣ�"+rent+" �ؿ�����"+personCapacity);
    }
}
