#include<iostream>
using namespace std;
#define MaxSize 100
typedef struct BiTNode//�����������ʾ�洢�ṹ
{
	int data;
	struct BiTNode *lchild,*rchild;
}BiTNode,*BiTree;
void Create(BiTree &T)//����������
{
	
	int a;;
	cin>>a;
	if(a==-1) T=NULL;
	else
	{
		if(!(T=new BiTNode))
			exit(0);
		T->data=a;
		Create(T->lchild);
		Create(T->rchild);
	}
}

void PreOrderTraverse(BiTree T)//�������������
{
	if(T)
	{
		cout<<T->data;
		PreOrderTraverse(T->lchild);
		PreOrderTraverse(T->rchild);
	}
}
void InOrderTraverse(BiTree T)//�������������
{
	if(T)
	{
		InOrderTraverse(T->lchild);
		cout<<T->data;
		InOrderTraverse(T->rchild);
	}
}
void PostOrderTraverse(BiTree T)//�������������
{
	if(T)
	{
		PostOrderTraverse(T->lchild);
		PostOrderTraverse(T->rchild);
		cout<<T->data;
	}
}  
//���ö���ʵ�ֲ������������
void TravLevel(BiTNode *b)//��α���������
{  BiTNode *Qu[MaxSize];  
   int front,rear;  
   front=rear=0;  
   if(b!=NULL)   
	  cout<<b->data;  
    rear++;   
      Qu[rear]=b;  
    while (rear!=front)  
	{   
		front=(front+1)%MaxSize;   
        b=Qu[front];  
        if(b->lchild!=NULL)   
        {
			cout<<b->lchild->data;
            rear=(rear+1)%MaxSize;
            Qu[rear]=b->lchild;
		} 
        if(b->rchild!=NULL)   
		{   
			cout<<b->rchild->data;
            rear=(rear+1)%MaxSize;
            Qu[rear]=b->rchild;  
		}  
	}  
	cout<<endl;
}
int main()
{
  int choice;
    BiTree T;
    cout<<"Input nodes of binary tree:"<<endl;
    Create(T);
    do {
	   cout<<endl;
   cout<<"*************************"<<endl;
   cout<<"*     1--preorder       *"<<endl;
   cout<<"*     2--inorder        *"<<endl;
   cout<<"*     3--postorder      *"<<endl;
   cout<<"*     4--travlevel      *"<<endl;
   cout<<"*************************"<<endl;
   cout<<"please input your choice:";
   cin>>choice;
   switch (choice) 
   {
   case 1: PreOrderTraverse(T);
           break;
   case 2: InOrderTraverse(T);
           break;
   case 3: PostOrderTraverse(T);
           break;
   case 4: TravLevel(T);
           break;
   }
   }while (choice!=0);
	return 0;
 }
	   

