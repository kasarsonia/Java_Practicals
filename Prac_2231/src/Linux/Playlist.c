#include<stdio.h>
#include<stdlib.h>
#include<string.h>

//typedef struct node_ node_t;
struct node {
 char data[40];
 struct node * prev;
 struct node * next;
};

char temp[40];
struct node * head = NULL;
struct node * current_node = NULL;


void Add()
{
//	int ch=1;
//	while(ch==1)
//	{
		printf("enter song name : ");
		//while(getchar()=="\n");
		scanf("%s",&temp);
		//scanf("%[^\n]%*c",temp);
		printf("\n");
		
		struct node *new;
		new = (struct node*)malloc(sizeof(struct node));
		
		strcpy(new->data,temp);
		if(head==NULL)
		{
			new->next= new->prev = new; //in new node prev and next we put new node.
			head = current_node = new;
			return;
		}
		struct node *last = head-> prev;
		new->prev = last;
		last->next = new;
		new->next = head;
		head->prev = new;
		
//	}
}

void Remove()
{
	printf("Enter song name you want to remove \n");
	//while(getchar()=="\n");
	//scanf("%[^\n]%*c",temp);
	scanf("%s",&temp);
	printf("\n");
	
	struct node * ptr = head;
	do
	{
		if(ptr->next==ptr && strcmp(ptr->data,temp)==0)
		{
			printf("file deleted! \n");
			head=NULL;
			free(ptr);
			return;
		}
		else if(strcmp(ptr->data,temp)==0)
		{
			struct node *prev = ptr->prev;
			struct node *next = ptr->next;
			prev->next=next;
			next->prev=prev;
			head = next;
			free(ptr);
			printf("Music deleted\n");
			return;
		}
		ptr = ptr->next;
	}
	while(ptr!=head);
	printf("No music file\n");
}

void Show()
{
	int i=1;
	if(head==NULL)
	{
		printf("Playlist is empty! \n");
		return;
	}
	struct node *show_ptr = head;
	printf("\n");
	printf("Displaying playlist : \n");
	do
	{
		printf("Song %d : %s\n",i,show_ptr->data);
		i++;
		show_ptr = show_ptr->next;
	}
	while(show_ptr!=head);
}

void Next()
{
	if(current_node==NULL)
	{
		printf("No songs in playlist\n");
	}
	else
	{
		current_node = current_node-> next;
		printf("Playing next song : %s\n",current_node->data);
	}
}

void Previous()
{
	if(current_node==NULL)
	{
		printf("No songs in playlist\n");
	}
	else
	{
		current_node = current_node->prev;
		printf("Playing previous song : %s\n",current_node->data);
	}
}

void First()
{
	if(head==NULL)
	{
		printf("Playlist is Empty\n");
	}
	else
	{
		printf("Playing first music : %s\n",head->data);
	}
}

void Last()
{
	if(head==NULL)
	{
		printf("Playlist is Empty\n");
	}
	else
	{
		printf("Playing last music : %s\n",head->prev->data);
	}
}

void Specific()
{
	if(head==NULL)
	{
		printf("Playlist is Empty\n");
		return;
	}
	
	printf("Enter song name you want to play \n");
	//while(getchar()=="\n");
	//scanf("%[^\n]%*c",temp);
	scanf("%s",&temp);
	printf("\n");
	
	struct node *ptr = head;
	do
	{
		if(strcmp(ptr->data,temp)==0)
		{
			printf("Music : %s\n",ptr->data);
		}
		ptr->next=ptr;
	}
	while(ptr!=head);
	printf("file not found\n");
}

int main()
{
	int k,p=1;
	char res;
	printf("===== Menu ====== \n 1. Add Music\n 2. Remove Music\n 3. Show Playlist\n 4. Play next file\n 5. Play Previous file\n 6. Play First file \n 7. Play Last file\n 8. Play specific file\n 9.Exit\n ");
	while(p==1)
	{
		printf("Which Operation you want to perform?\n ");
		scanf("%d",&k);	
		//printf("\n");
		switch(k)
		{
			case 1: Add();
					break;
				
			case 2: Remove();
				break;
				
			case 3:	Show();
					break; 
				
			case 4: Next();
					break;
					
			case 5: Previous();
					break;
					
			case 6: First();
					break;
			
			case 7: Last();
					break;
					
			case 8: Specific();
					break;
								
			case 9: exit(0);
					break;
				
			default:printf("invalid case");
				break;
		}
		printf("Want to try more operation? 1/0\n");
		scanf("%d",&p);
		
	}
	
	return 0;
}
