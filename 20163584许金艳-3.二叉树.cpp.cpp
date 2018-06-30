#include<iostream>
using namespace std;
#define MaxSize 100
typedef struct BiTNode//二叉树链表表示存储结构
{
	int data;
	struct BiTNode *lchild,*rchild;
}BiTNode,*BiTree;
void Create(BiTree &T)//创建二叉树
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

void PreOrderTraverse(BiTree T)//先序遍历二叉树
{
	if(T)
	{
		cout<<T->data;
		PreOrderTraverse(T->lchild);
		PreOrderTraverse(T->rchild);
	}
}
void InOrderTraverse(BiTree T)//中序遍历二叉树
{
	if(T)
	{
		InOrderTraverse(T->lchild);
		cout<<T->data;
		InOrderTraverse(T->rchild);
	}
}
void PostOrderTraverse(BiTree T)//后序遍历二叉树
{
	if(T)
	{
		PostOrderTraverse(T->lchild);
		PostOrderTraverse(T->rchild);
		cout<<T->data;
	}
}  
//利用队列实现层序遍历二叉树
void TravLevel(BiTNode *b)//层次遍历二叉树
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
	   

