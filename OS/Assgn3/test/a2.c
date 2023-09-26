#include<stdio.h>
#include<stdlib.h>
void main()
{
     int i,n;
     float avwt=0,avgtat=0;
     printf("Enter no. of process : \n");
     scanf("%d",&n);
     int p[n],at[n],bt[n],wt[n],tat[n];
     printf("enter process : \n");
     for (i=0;i<n;i++)
         scanf("%d",&p[i]);
     printf("enter arrival time : \n");
     for (i=0;i<n;i++)
         scanf("%d",&at[i]);
     printf("enter burst time : \n");
     for (i=0;i<n;i++)
         scanf("%d",&bt[i]);
     int temp,j;       
     for (i=1;i<n;i++)
        for (j=0;j<n;j++)
        {
          if(bt[j]>bt[j+1])
          {
             temp=bt[j];
             bt[j]=bt[j+1];
             bt[j+1]=temp;
             temp=p[j];
             p[j]=p[j+1];
             p[j+1]=temp;
          }
       }   
       int start[10];
       start[0]=0;
       for(i=0;i<n;i++)
          start[i]=start[i-1]+bt[i-1];
       for(i=0;i<n;i++)
       {
          wt[i]=start[i]-at[i];
          avwt=wt[i];
       }
      avwt/=n;
      for(i=0;i<n;i++)
      {
         tat[i]=wt[i]+bt[i];
         avgtat=tat[i];
      }
     avgtat/=n;
     printf("\nProcess At\tBt\twt\ttat\n");
     for (i=0;i<n;i++)
         printf("\nP%d\t%d\t%d\t%d\t%d\n",i+1,at[i],bt[i],wt[i],tat[i]);
     printf("Avg waiting time : %f\nAvg TurnAround time : %f\n",avwt,avgtat);    
}

