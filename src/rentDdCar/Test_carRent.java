package rentDdCar;
import java.util.*; //����java����
public class Test_carRent {

	public static <Car> void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ������Dd�⳵���⳵��ѡ1���˳���ѡ0");
		Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if(number==0){
        	System.out.println("��ӭ���ٴ�ʹ�ã�лл");
        	input.close();
        	return;
        }
        DdCar a = new PersonCar(1,"�µ�A4",500,4);  //������ֵ
        DdCar b = new PersonCar(2,"����3ϵ",400,4);
        DdCar c = new PersonCar(3,"����",800,20);
        DdCar d = new Truck(4,"�ɻ���",400,4);
        DdCar e = new Truck(5,"��ά��",1000,20);
        DdCar f = new Pika(6,"Ƥ��ѩ",450,4,2);
        System.out.println("��ѡ���������Ϣ������ʾ��");
        a.show(); //������.������();   ֱ�ӵ��÷���
        b.show();
        c.show();
        d.show();
        e.show();
        f.show();
        DdCar[] cars={a,b,c,d,e,f};
        System.out.println("���������賵���������"); 
        int Number2 =input.nextInt();//ֱ��ʹ���Ѷ����input,Number2�����������
        //DdCar[] car=new DdCar[Number2];//������Ϊ���Ƚ���һ��DdCarΪ���͵�������
        for(int i =0;i < Number2; i++){
        	System.out.println("�������" + (i+1)+"�����ţ�");
        	int Num =input.nextInt();
        	cars[i]=cars[Num-1];	
        }
        System.out.println("���������賵���������");
        int day =input.nextInt();//ֱ��ʹ���Ѷ����input
        System.out.println("���������賵���������");
    	System.out.println("ͳ�����\n�����˵����£�");
    	System.out.println("�������˵��У�");
    	for(int n=0;n<Number2;n++) {//Number2Ϊѡ��������
    	if(cars[n].personCapacity != 0) {
    	System.out.println(cars[n].carName);
    	}
    	}
    	System.out.println("�����ػ����У�");
    	for(int m=0;m<Number2;m++) {
    	if(cars[m].freightVolume !=0) {
    	System.out.println(cars[m].carName);
    	}
    	}
    	//ͳ���˵������Ŀ
    	int sumPerson = 0;
    	double sumFreight = 0;
    	double sumRent = 0;
    	for(int x=0;x<Number2;x++) {
    	sumPerson =cars[x].personCapacity+sumPerson;
    	sumFreight = cars[x].freightVolume+sumFreight;
    	sumRent = cars[x].rent+sumRent;
    	}
    	System.out.println("���ؿ�����"+sumPerson);
    	System.out.println("���ػ�����"+sumFreight);
    	System.out.println("�ܼ۸�"+sumRent*day);
    	}
	  
        
	}


