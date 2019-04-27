package rentDdCar;
import java.util.*; //导入java工具
public class Test_carRent {

	public static <Car> void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎您来到Dd租车，租车请选1；退出请选0");
		Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if(number==0){
        	System.out.println("欢迎您再次使用，谢谢");
        	input.close();
        	return;
        }
        DdCar a = new PersonCar(1,"奥迪A4",500,4);  //变量赋值
        DdCar b = new PersonCar(2,"宝马3系",400,4);
        DdCar c = new PersonCar(3,"金龙",800,20);
        DdCar d = new Truck(4,"松花江",400,4);
        DdCar e = new Truck(5,"依维柯",1000,20);
        DdCar f = new Pika(6,"皮卡雪",450,4,2);
        System.out.println("可选车类相关信息如下所示：");
        a.show(); //对象名.方法名();   直接调用方法
        b.show();
        c.show();
        d.show();
        e.show();
        f.show();
        DdCar[] cars={a,b,c,d,e,f};
        System.out.println("请输入所需车类的数量："); 
        int Number2 =input.nextInt();//直接使用已定义的input,Number2是需求的数量
        //DdCar[] car=new DdCar[Number2];//以数量为长度建立一个DdCar为类型的新数组
        for(int i =0;i < Number2; i++){
        	System.out.println("请输入第" + (i+1)+"辆车号：");
        	int Num =input.nextInt();
        	cars[i]=cars[Num-1];	
        }
        System.out.println("请输入所需车类的天数：");
        int day =input.nextInt();//直接使用已定义的input
        System.out.println("请输入所需车类的天数：");
    	System.out.println("统计完成\n您的账单如下：");
    	System.out.println("可以载人的有：");
    	for(int n=0;n<Number2;n++) {//Number2为选车的数量
    	if(cars[n].personCapacity != 0) {
    	System.out.println(cars[n].carName);
    	}
    	}
    	System.out.println("可以载货的有：");
    	for(int m=0;m<Number2;m++) {
    	if(cars[m].freightVolume !=0) {
    	System.out.println(cars[m].carName);
    	}
    	}
    	//统计账单金额数目
    	int sumPerson = 0;
    	double sumFreight = 0;
    	double sumRent = 0;
    	for(int x=0;x<Number2;x++) {
    	sumPerson =cars[x].personCapacity+sumPerson;
    	sumFreight = cars[x].freightVolume+sumFreight;
    	sumRent = cars[x].rent+sumRent;
    	}
    	System.out.println("总载客量："+sumPerson);
    	System.out.println("总载货量："+sumFreight);
    	System.out.println("总价格："+sumRent*day);
    	}
	  
        
	}


