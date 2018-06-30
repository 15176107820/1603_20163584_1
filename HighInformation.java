//��1603 �����   20163584
import java.util.Scanner;
class ApplicantInterface
{
    String applicantname;//����������
    String applicantsex;//�Ա�
    String applicanttitle;//ְ��
    String applicantwork;//�е�����
    String company;//���ڵ�λ
    void showapplicant()//��ʾ�����˵Ļ�����Ϣ
    {
    	System.out.println("��������Ϣ��    ����"+applicantname+"\t"+"�Ա�"+applicantsex+"\t"+"ְ��"+applicanttitle+"\t"+"�е�����"+applicantwork+"\t"+"���ڵ�λ"+company+"\t");
    }
}
class NegativeAmountException extends Exception//�����׳��쳣
{
	NegativeAmountException(String s)
    {
   	 super(s);
    }
}
class HighInformation extends ApplicantInterface//����HighInformation��
{
	private String highnumber;
	private String highname;
	private String highcontent;
	private double highsum;
	private int highstate;
	private int highyear;
	private String highuser;
	public HighInformation(String highnumber,String newstitle,String highname,String highcontent,double highsum,int highstate,int highyear,String highuser)//���췽���Ա�������ֵ 
	{
		this.highnumber=highnumber;
		this.highname=highname;
		this.highcontent=highcontent;
		this.highsum=highsum;
		this.highstate=highstate;
		this.highyear=highyear;
		this.highuser=highuser;
	}
	public HighInformation() {
		// TODO Auto-generated constructor stub
	}
	//����ÿ��������set������get��������
	public void sethighnumber(String highnumber)
    {
              this.highnumber=highnumber;
    }
    public void sethighname(String highname)
    {
    	this.highname=highname;
    }
    public void sethighcontent(String highcontent)
    {
    	this.highcontent=highcontent;
    }
    public void sethighsum(double highsum)
    {
    	this.highsum=highsum;
    }
    public void sethighstate(String highcontent)
    {
    	this.highcontent=highcontent;
    }
    public void sethighstate(int highstate)
    {
    	this.highstate=highstate;
    }
    public void sethighyear(int  highyear)
    {
    	this.highyear=highyear;
    }
    public void sethighuser(String highuser)
    {
    	this.highuser=highuser;
    }
    public String gethighnumber()
    {
    	return highnumber;
    }
    public String highname()
    {
    	return highname;
    }
    public String gethighcontent()
    {
    	return highcontent;
    }
    public double gethighsum()
    {
    	return highsum;
    }
    public int gethighstate()
    {
    	return highstate;
    }
    public int gethighyear()
    {
    	return highyear;
    }
    public String gethighuser()
    {
    	return highuser;
    }

    public void Welcome()//��ӭ���� 
    {
	// TODO Auto-generated method stub
	   
		System.out.println("**********************************************");
		System.out.println("             ��ӭʹ�úӱ�ʡ���²�ҵ��Ϣ����ϵͳ                                       ");
		System.out.println("**********************************************");
		System.out.println(" ʯ��ׯ������ѧ��Ϣ��ѧ�뼼��ѧԺ�������ϵ�����ӢС������                           ");
		System.out.println("                   �汾��V1.0                   ");
		System.out.println("              С���Ա�� ָ����ʦ��������                                                 " );
		System.out.println("*****�����༶����1603   ѧ�ţ�20163584  �����������********");
		System.out.println("*****            �밴�������ת���� ��                                  ******");
		System.out.println("**********************************************");
		
     }
     public void denglu() throws NegativeAmountException//��¼����
     {   Scanner s = new Scanner(System.in);
          int i;
          for(i=1;i<4;i++)
          {
    	    System.out.println("�������û�����    ");
    	    String number=s.nextLine();
    	    if(highnumber==number)
    	    {
    	    System.out.println("�������û����룺");
    	    String passward=s.nextLine();
    	    break;
    	    }
          }
    	 if(i>3)
    	 {
    		 throw new NegativeAmountException("���û�����¼������ѱ�ϵͳ����");
    	 }
     }
     public void addHighInformation() throws NegativeAmountException //¼����¼�����Ϣ
     {
    	 int a=0;
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("���¼�����ţ�");
    	 String num=s.nextLine();
    	 System.out.println("���¼������ƣ�");
    	 String name=s.nextLine();
    	 System.out.println("���¼�������");
    	 String content=s.nextLine();
    	 {
    		 if(content.length()>20)
    		 {
    			 throw new NegativeAmountException("¼�����ݳ�������ַ�����");
    		 }
    		 
    	 }
    	 System.out.println("���¼���Ͷ�ʽ�");
    	 double sum=s.nextDouble();
    	 System.out.println("���¼�����ݣ�");
    	 int year=s.nextInt();
    	 if(year>2017)
    	 {
    		 throw new NegativeAmountException("���¼����걨��ݲ��ԣ�");
    	 }
    	
    	 System.out.println("���¼���״̬"+a);
    	 System.out.println("��¼����������Ϣ��");
    	 System.out.println("������������"+applicantname);
    	 String aname=s.nextLine();
    	 System.out.println("�������Ա�");
    	 String asex=s.nextLine();
    	 System.out.println("������ְ�ƣ�");
    	 String atitle=s.nextLine();
    	 System.out.println("�����˳е�������");
    	 String awork=s.nextLine();
    	 System.out.println("���������ڵ�λ��");
    	 String company=s.nextLine();
     }
     public void deleteHighInformation()//ɾ����Ϣ
     {
    	 System.out.println("������Ҫɾ�����û�����");
    	 Scanner s = new Scanner(System.in);
    	 String name=s.nextLine();
    	 if(highname==name)
    	 {
    		 System.out.println("���Ƿ�ɾ��������Ϣ��");
    		 char choice = 0;
    		if(choice=='Y')
    		{
    		}
    	 }
     }
     public void examHighInformation()//��˸��¼�����Ϣ
     {
    	 if(highnumber=="1")
    	 {
    		 System.out.println("����Ϣ��ͨ����ˣ��������±��000.����������");
    	 }
    	 else if(highnumber=="2")
    	 {
    		 System.out.println("����Ϣ�ѱ��˻� �������±��000.����������");
    	 }
    	 else if(highnumber=="0")
    	 {
    		 System.out.println("**********************************************");
    		 System.out.println("               ��˸��¼�����Ϣ                                                                         ");
    		 System.out.println("**********************************************");
    		 System.out.println("                1.����������                                                                          ");
    		 System.out.println("                2.ͨ�����                                                                               ");
    		 System.out.println("                3.�˻����                                                                                ");
    		 System.out.println("                ���¼�����ţ�                                                                         ");
    		 System.out.println("                ���¼�������                                                                             ");
    		 System.out.println("                ���¼������                                                                             ");
    		 System.out.println("                ���¼�Ͷ�ʽ��                                                                        ");
    		 System.out.println("                ���¼������                                                                            ");
    		 System.out.println("                ���                                                                                         ");
    		 System.out.println("                ����������                                                                                 ");
    		 System.out.println("                �������Ա�                                                                                 ");
    		 System.out.println("                ������ְ��                                                                                 ");
    		 System.out.println("                �����˳е���λ                                                                        ");
    		 System.out.println("                ���������ڵ�λ                                                                        ");
    		 System.out.println("**********************************************");
    		 
    	 }
     }
     public void showHighInformation()//��ʾ���и��¼�����Ϣ
     {
    	 ApplicantInterface a=new ApplicantInterface();
    	 System.out.println("���¼�����ţ�"+highnumber+"���¼�������"+highname+"���¼������"+highcontent+"���¼���Ͷ�ʽ��"+highsum+"���¼������"+highyear);
    	 a.showapplicant();
     }
     public void selsctHighramtion()//��ѯ���¼������
     {
    	 HighInformation a=new HighInformation();
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("��������¼�����Ϣ��ţ�");
    	 String number=s.nextLine();
    	 a.deleteHighInformation();
     }
     public void selectHighramtion()//��ѯ���¼���Ͷ��
     {
    	 ApplicantInterface a=new ApplicantInterface();
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("������Ͷ�ʽ�");
    	 double sum=s.nextDouble();
    	 if(highsum>sum)
    	 {
    		 a.showapplicant();
    	 }
     }
     public void countHighInformation()
     {
    	 System.out.println("δ��˵ļ�����Ϣ:");
    	 System.out.println("ͨ����˵ļ�����Ϣ:");
    	 System.out.println("δͨ����˵ļ�����Ϣ:");
     }
     public void countHighInformation(int year)
     {
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("�����ѯ���");
    	 int y=s.nextInt();
     }
     public static void main(String[] args) throws NegativeAmountException 
	{
			// TODO Auto-generated method stud
    	 

    	 HighInformation a=new HighInformation();
    	 int b = 0;
      do {//ϵͳ������
	  System.out.println("**********************************************");
	  System.out.println("              �ӱ�ʡ���²�ҵ��Ϣͳ�Ƶ���ϵͳ                                             ");
	  System.out.println("**********************************************");
	  System.out.println("                1.¼����¼�����Ϣ                                                              ");
	  System.out.println("                2.ɾ�����¼�����Ϣ                                                              ");
	  System.out.println("                3.��˸��¼�����Ϣ                                                               ");
	  System.out.println("                4.��ʾ���¼�����Ϣ                                                               ");
	  System.out.println("                5.��ѯ���¼�����Ϣ                                                              ");
	  System.out.println("                6.��ѯ���¼���Ͷ��                                                               ");
	  System.out.println("                7.ͳ�Ƹ��¼�����Ϣ                                                               ");
	  System.out.println("                8.���¼������ͳ��                                                               ");
	  System.out.println("                9.�˳�ϵͳ                                                                                 ");
	  System.out.println("**********************************************");
      }while(b>10);
      
	  switch(b)
	  {
	  case 1:a.addHighInformation();break;
	  case 2:a.deleteHighInformation();break;
	  case 3:a.examHighInformation();break;
	  case 4:a.showapplicant();break;
	  case 5:a.selsctHighramtion();break;
	  case 6:a.selsctHighramtion();break;
	  case 7:a.countHighInformation();break;
	  case 8:a.countHighInformation(2017);break;
	  default :break;
	  }
      }
	
    	 
}
