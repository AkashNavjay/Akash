#include<iostream.h>
#include<conio.h>
void dtob(int num)
{
 int dec[10];
 int rem,index=0;
 while(num>=1)
 {
  rem=num%2;
  num=num/2;
  dec[index++]=rem;
 }
 cout<<"\nThe Binary value is:";
 for(int i=index-1;i>=0;i--)
 {
  cout<<dec[i];
 }
}
void main()
{
 int num;
 cout<<"\nEnter the decimal no:";
 cin>>num;
 dtob(num);
 getch();
}
