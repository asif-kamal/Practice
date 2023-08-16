#include <stdio.h>

int main(void)
{
    int a;
    int b = 5;

    printf("Input an integer: ");
    scanf("%d", &a);
    printf("%d-%d = %d\n",a,b,a-b);

}
