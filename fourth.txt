#include <stdio.h>

#include <stdlib.h>



typedef struct node

{
    
	int data;

	struct node *next;

}node;

node *initlist(node *head)

{

    head=NULL;

}

node* insert(node *head,int x)
{

    node *newnode;

    newnode=malloc(sizeof(node*));

    newnode->data=x;

    newnode->next=NULL;

    if(head==NULL)
    
{
        head=newnode;
    }
    
  else
    
	{
        
	node *temp=head;

                 while(temp->next!=NULL)
        
	{
            
	temp=temp->next;
	
        }
        
	temp->next=newnode;
 
	   }

    return head;

}

node *reverse (node* head)

{

    node* prev = NULL;
 
    node* current = head;
 
    node* next = NULL;
 
    while (current != NULL) {
 
        next = current->next;
  
        current->next = prev;
 
        prev = current;
 
        current = next;
 
    } 
    
head = prev; 
   
 return head;

}

void display(node *head)

{
    node *temp=head;

    while(temp!=NULL)
    {

        printf("%d -> ",temp->data);

        temp=temp->next;
    }

    printf("NULL\n");

}


int main()
{
    
node *head;
    
head=initlist(head);
    
head=insert(head,10);
    
head=insert(head,20);
    
head=insert(head,30);
    
display(head);
    
head=reverse(head);
    
display(head);
    
return 0;

}