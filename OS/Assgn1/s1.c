#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void cp(void);
void pp(void);
int main()
{
    pid_t pid;
    pid=fork();
    if (pid == 0)
       cp();
    else
       pp();
    return 0;      
}
void cp()
{
     printf("\nI am Child Process:");
}
void pp()
{
     printf("\nI am parent process...\n");
}
