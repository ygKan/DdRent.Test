package rentDdCar;
//子类
public class PersonCar extends DdCar {//继承父类
	public PersonCar(int carNumber,String carName,int rent,int personCapacity){
		this.carNumber = carNumber;
		this.carName =carName;
		this.rent=rent;
		this.personCapacity =personCapacity;
		
	}
    public void show(){
    	System.out.println("车号："+carNumber+" 车名:"+carName+" 车费："+rent+" 载客量："+personCapacity);
    }
}
