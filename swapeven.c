#include <stdio.h>
#include <conio.h>
#include <string.h>
int main(){
     char str[20],tmp;
     int i;
     scanf("%s",str);
     printf("\n\nOriginal String     : %s",str);
     for(i=0;i<strlen(str);i=i+2)
     {
     tmp = str[i];
     str[i] = str[i+1];
     str[i+1] = tmp;
     }
     printf("\nAfter Swap String      : %s",str);
     return 0;
}