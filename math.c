#include <stdio.h>

int main(void)
{
    float a;
    float b = 5.0;

    printf("Input an integer: ");
    scanf("%f", &a);
    printf("%f/%f = %.2f\n",a,b,a/b);

    return(0);

}
