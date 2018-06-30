//信1603 许金艳   20163584
import java.util.Scanner;
class ApplicantInterface
{
    String applicantname;//申请人姓名
    String applicantsex;//性别
    String applicanttitle;//职称
    String applicantwork;//承担工作
    String company;//所在单位
    void showapplicant()//显示申请人的基本信息
    {
    	System.out.println("申请人信息：    姓名"+applicantname+"\t"+"性别"+applicantsex+"\t"+"职称"+applicanttitle+"\t"+"承担工作"+applicantwork+"\t"+"所在单位"+company+"\t");
    }
}
class NegativeAmountException extends Exception//定义抛出异常
{
	NegativeAmountException(String s)
    {
   	 super(s);
    }
}
class HighInformation extends ApplicantInterface//定义HighInformation类
{
	private String highnumber;
	private String highname;
	private String highcontent;
	private double highsum;
	private int highstate;
	private int highyear;
	private String highuser;
	public HighInformation(String highnumber,String newstitle,String highname,String highcontent,double highsum,int highstate,int highyear,String highuser)//构造方法对变量赋初值 
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
	//定义每个变量的set（）与get（）方法
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

    public void Welcome()//欢迎界面 
    {
	// TODO Auto-generated method stub
	   
		System.out.println("**********************************************");
		System.out.println("             欢迎使用河北省高新产业信息调查系统                                       ");
		System.out.println("**********************************************");
		System.out.println(" 石家庄铁道大学信息科学与技术学院软件工程系软件精英小组制作                           ");
		System.out.println("                   版本：V1.0                   ");
		System.out.println("              小组成员： 指导教师：王建民                                                 " );
		System.out.println("*****考生班级：信1603   学号：20163584  姓名：许金艳********");
		System.out.println("*****            请按任意键跳转界面 ：                                  ******");
		System.out.println("**********************************************");
		
     }
     public void denglu() throws NegativeAmountException//登录界面
     {   Scanner s = new Scanner(System.in);
          int i;
          for(i=1;i<4;i++)
          {
    	    System.out.println("请输入用户名：    ");
    	    String number=s.nextLine();
    	    if(highnumber==number)
    	    {
    	    System.out.println("请输入用户密码：");
    	    String passward=s.nextLine();
    	    break;
    	    }
          }
    	 if(i>3)
    	 {
    		 throw new NegativeAmountException("该用户三次录入错误，已被系统锁定");
    	 }
     }
     public void addHighInformation() throws NegativeAmountException //录入高新技术信息
     {
    	 int a=0;
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("高新技术编号：");
    	 String num=s.nextLine();
    	 System.out.println("高新技术名称：");
    	 String name=s.nextLine();
    	 System.out.println("高新技术内容");
    	 String content=s.nextLine();
    	 {
    		 if(content.length()>20)
    		 {
    			 throw new NegativeAmountException("录入内容超过最大字符限制");
    		 }
    		 
    	 }
    	 System.out.println("高新技术投资金额：");
    	 double sum=s.nextDouble();
    	 System.out.println("高新技术年份：");
    	 int year=s.nextInt();
    	 if(year>2017)
    	 {
    		 throw new NegativeAmountException("高新技术申报年份不对！");
    	 }
    	
    	 System.out.println("高新技术状态"+a);
    	 System.out.println("请录入申请人信息：");
    	 System.out.println("申请人姓名："+applicantname);
    	 String aname=s.nextLine();
    	 System.out.println("申请人性别：");
    	 String asex=s.nextLine();
    	 System.out.println("申请人职称：");
    	 String atitle=s.nextLine();
    	 System.out.println("申请人承担工作：");
    	 String awork=s.nextLine();
    	 System.out.println("申请人所在单位：");
    	 String company=s.nextLine();
     }
     public void deleteHighInformation()//删除信息
     {
    	 System.out.println("请输入要删除的用户名：");
    	 Scanner s = new Scanner(System.in);
    	 String name=s.nextLine();
    	 if(highname==name)
    	 {
    		 System.out.println("你是否删除该条信息：");
    		 char choice = 0;
    		if(choice=='Y')
    		{
    		}
    	 }
     }
     public void examHighInformation()//审核高新技术信息
     {
    	 if(highnumber=="1")
    	 {
    		 System.out.println("该信息已通过审核，请输入新编号000.返回主界面");
    	 }
    	 else if(highnumber=="2")
    	 {
    		 System.out.println("该信息已被退回 请输入新编号000.返回主界面");
    	 }
    	 else if(highnumber=="0")
    	 {
    		 System.out.println("**********************************************");
    		 System.out.println("               审核高新技术信息                                                                         ");
    		 System.out.println("**********************************************");
    		 System.out.println("                1.返回主界面                                                                          ");
    		 System.out.println("                2.通过审核                                                                               ");
    		 System.out.println("                3.退回审核                                                                                ");
    		 System.out.println("                高新技术编号：                                                                         ");
    		 System.out.println("                高新技术名称                                                                             ");
    		 System.out.println("                高新技术简介                                                                             ");
    		 System.out.println("                高新技投资金额                                                                        ");
    		 System.out.println("                高新技术年份                                                                            ");
    		 System.out.println("                填报人                                                                                         ");
    		 System.out.println("                申请人姓名                                                                                 ");
    		 System.out.println("                申请人性别                                                                                 ");
    		 System.out.println("                申请人职称                                                                                 ");
    		 System.out.println("                申请人承担单位                                                                        ");
    		 System.out.println("                申请人所在单位                                                                        ");
    		 System.out.println("**********************************************");
    		 
    	 }
     }
     public void showHighInformation()//显示所有高新技术信息
     {
    	 ApplicantInterface a=new ApplicantInterface();
    	 System.out.println("高新技术编号，"+highnumber+"高新技术名称"+highname+"高新技术简介"+highcontent+"高新技术投资金额"+highsum+"高新技术年份"+highyear);
    	 a.showapplicant();
     }
     public void selsctHighramtion()//查询高新技术编号
     {
    	 HighInformation a=new HighInformation();
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("请输入高新技术信息编号：");
    	 String number=s.nextLine();
    	 a.deleteHighInformation();
     }
     public void selectHighramtion()//查询高新技术投资
     {
    	 ApplicantInterface a=new ApplicantInterface();
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("请输入投资金额：");
    	 double sum=s.nextDouble();
    	 if(highsum>sum)
    	 {
    		 a.showapplicant();
    	 }
     }
     public void countHighInformation()
     {
    	 System.out.println("未审核的技术信息:");
    	 System.out.println("通过审核的技术信息:");
    	 System.out.println("未通过审核的技术信息:");
     }
     public void countHighInformation(int year)
     {
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("输入查询年份");
    	 int y=s.nextInt();
     }
     public static void main(String[] args) throws NegativeAmountException 
	{
			// TODO Auto-generated method stud
    	 

    	 HighInformation a=new HighInformation();
    	 int b = 0;
      do {//系统主界面
	  System.out.println("**********************************************");
	  System.out.println("              河北省高新产业信息统计调查系统                                             ");
	  System.out.println("**********************************************");
	  System.out.println("                1.录入高新技术信息                                                              ");
	  System.out.println("                2.删除高新技术信息                                                              ");
	  System.out.println("                3.审核高新技术信息                                                               ");
	  System.out.println("                4.显示高新技术信息                                                               ");
	  System.out.println("                5.查询高新技术信息                                                              ");
	  System.out.println("                6.查询高新技术投资                                                               ");
	  System.out.println("                7.统计高新技术信息                                                               ");
	  System.out.println("                8.高新技术年度统计                                                               ");
	  System.out.println("                9.退出系统                                                                                 ");
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
